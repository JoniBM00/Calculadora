package com.viewnext;

import java.util.Scanner;

public class Calculadora {

	
	public static int pedirNum(String mens) {
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println(mens);
		num = teclado.nextInt();
		return num;
	}
	
	public static void main(String[] args) {
		
		Menus.mostrarMenuPrincipal();
		
		
	}
	
}
