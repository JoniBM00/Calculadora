package com.viewnext;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculadora {

	static final String PRIMER_NUMERO = "Introduzca el primer número: ";
	static final String SEGUNDO_NUMERO = "Introduzca el segundo número: ";

	/**
	 * Logger
	 */
	static Logger logger = Logger.getLogger(Calculadora.class.getName());

	/**
	 * Method to take a double from the keyboard
	 * @param mens
	 * @return double from keyboard
	 * @throws InputMismatchException
	 */
	public static double pedirDoble(String mens) throws InputMismatchException {
		Scanner teclado = new Scanner(System.in);

		logger.info(mens);

		return teclado.nextDouble();
	}

	/**
	 * Method to take a double from the keyboard
	 * @param mens
	 * @return double from keyboard
	 * @throws InputMismatchException
	 */
	public static int pedirNum(String mens) throws InputMismatchException {
		Scanner teclado = new Scanner(System.in);

		logger.info(mens);

		return teclado.nextInt();
	}

	public static void main(String[] args) {
		int key;
		double resultado = 0;

		do {
			try {
				Menus.mostrarMenuPrincipal();
				key = pedirNum("Introduzca una opción: ");
				
				//Use the key option for use the menu
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
					logger.warning("Error. Opción incorrecta.");
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
