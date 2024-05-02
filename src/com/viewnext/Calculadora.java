package com.viewnext;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculadora {

	static final String PRIMER_NUMERO = "Introduzca el primer número: ";
	static final String SEGUNDO_NUMERO = "Introduzca el segundo número: ";

	static Logger logger = Logger.getLogger(Calculadora.class.getName());

	public static double pedirDoble(String mens) throws InputMismatchException {
		double num;
		Scanner teclado = new Scanner(System.in);

		logger.info(mens);
		num = teclado.nextDouble();

		return num;
	}

	public static int pedirNum(String mens) throws InputMismatchException {
		int num;
		Scanner teclado = new Scanner(System.in);

		logger.info(mens);
		num = teclado.nextInt();

		return num;
	}

	public static void main(String[] args) {
		int key;
		double resultado = 0;

		do {
			try {
				Menus.mostrarMenuPrincipal();
				key = pedirNum("Introduzca una opción: ");

				switch (key) {
				case 1:
					resultado = Util.sumar(pedirDoble(PRIMER_NUMERO), pedirDoble(SEGUNDO_NUMERO));
					break;
				case 2:
					resultado = Util.restar(pedirDoble(PRIMER_NUMERO), pedirDoble(SEGUNDO_NUMERO));
					break;
				case 3:
					resultado = Util.multiplicar(pedirDoble(PRIMER_NUMERO), pedirDoble(SEGUNDO_NUMERO));
					break;
				case 4:
					resultado = Util.dividir(pedirDoble(PRIMER_NUMERO), pedirDoble(SEGUNDO_NUMERO));
					break;
				case 5:
					logger.info("Saliendo.");
					break;

				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				}
				if (logger.isLoggable(Level.INFO)) {
					logger.info("El resultado es: " + resultado);
				}

			} catch (InputMismatchException e) {
				logger.warning("Error, no ha introduccido un número.");
				key = 0;
			}
		} while (key != 5);

	}

}
