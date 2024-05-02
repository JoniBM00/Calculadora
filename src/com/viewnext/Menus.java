package com.viewnext;

import java.util.logging.Logger;

public class Menus {

	private Menus() {
		
	}
	
	static Logger logger = Logger.getLogger(Menus.class.getName());
	
	/**
	 * Method to show the menu 
	 */
	public static void mostrarMenuPrincipal() {
		
		logger.info("------------------");
		logger.info("-------Menu-------");
		logger.info("------------------");
		logger.info("1- Sumar.");
		logger.info("2- Restar.");
		logger.info("3- Multiplicar.");
		logger.info("4- Dividir.");
		logger.info("5- Salir.");
	}
	
}
