package Trabajos;

import java.util.Scanner;

/** PROGRAMA DE CONVERSIONES A OCTAL Y A COMPLEMENTO A2
 ** AUTOR: PEDRO DANIEL PÉREZ SÁNCHEZ
 **FECHA: 16/11/2018
 **DESCRIPCIÓN: PROGRAMA PARA CONVERTIR A OCTAL Y A COMPLEMENTO A2
 **
 ** */


public class trabajoexa {
	
	/*METODO QUE RECOGE DATOS Y LOS VALIDA PARA LUEGO DEVOLVER LOS VALORES NECESARIOS*/
	public static void datos() {
		/*
		 * METODO: Metodo que será usado para todas las entradas que se le pediran al usuario
		 * VARIABLE DE ENTRADA: NINGUNA
		 * VARIABLE QUE DEVUELVE: NO DEVUELVE
		 * DESCRIPCIÓN: SE MANTIENE EN EL WHILE HASTA QUE EXIT SEA 1
		 * 
		 */
		/*DECLARACIÓN DE VARIABLES*/
		Scanner t = new Scanner(System.in);
		int exit=0;
		
		
		do {
			System.out.println("+------------------------------------------+");
			System.out.println("|0 - Salir del programa                    |");
			System.out.println("|1 - Pasar de octal a binario              |");
			System.out.println("|2 - Mostrar el binario de un número en C2 |");
			System.out.println("+------------------------------------------+");
			
			int opc = t.nextInt();
			switch(opc) {
			case 1: //Opción 1: Pasar de octal a binario 
				System.out.println("Introduce un número en Octal de 2 símbolos: ");
				int octBin = t.nextInt();
				
				/*Validar Octal entre 000 y 077*/
				
				if((octBin<000)||(octBin>077)) {
					octalToBin(octBin);
				}else {
					System.out.println("El Numero no es Valido");
				}
							
				break;
			case 2: //Opción 2: Mostrar el binario de un número en C2
				System.out.println("Introduce un número en C2 de 6 bits: ");
				int c2Bin = t.nextInt();
				
				/*Validar binario 6 bits*/
				
				/*int dec=Integer.parseInt(c2Bin, 2);
				if(5=5) {
					
				}else {
					System.out.println("El Numero no es Valido");
				}*/
				
				c2ToBin(c2Bin);
							
				
				break;
			case 0: //Opción 0: SALIR DEL PROGRAMA
				System.out.println();
				System.out.println("Espero que hayas aprendido");
				exit=1;
				break;
				
			}
			
		}while(exit==0);
			
		
	}
	
	/*METODO ENCARGADO DE PASAR EL NUMERO EN OCTAL A BINARIO*/
	public static void octalToBin(int valor) {
		/*
		 * METODO: METODO ENCARGADO DE PASAR EL NUMERO EN OCTAL A BINARIO
		 * VARIABLE DE ENTRADA: NUMERO EN OCTAL [ENTRE 000 Y 077]
		 * VARIABLE QUE DEVUELVE: NO DEVUELVE VARIABLE, SOLO LO SACA EN PANTALLA
		 * 		 
		 */
		
		
		
		
	}

	/*METODO QUE RECOGE DATOS Y LOS VALIDA PARA LUEGO DEVOLVER LOS VALORES NECESARIOS*/
	public static void c2ToBin(int valor) {
		/*
		 * METODO: METODO ENCARGADO DE PASAR EL NUMERO EN C2 A BINARIO
		 * VARIABLE DE ENTRADA: NUMERO EN BINARIO DE 6 BITS 
		 * VARIABLE QUE DEVUELVE: NO DEVUELVE VARIABLE, SOLO LO SACA EN PANTALLA
		 * 		 
		 */
		
	}


	/*MAIN PRINCIPAL A EJECUTAR*/
	public static void main(String[]args) {
		
		/*
		 * METODO PRINCIPAL A EJECUTAR
		 * DECIDE EL FLUJO DEL PROGRAMA
		 * 
		 * CONTIENE CABECERA Y LA LLAMADA A LOS METODOS QUE HÁRAN EL PROGRAMA
		 *  
		 */
			
		/*CABECERA DEL PROGRAMA*/
		System.out.println("----------------------------");
		System.out.println("| DOBLE DEL NUMERO INVERSO |");
		System.out.println("----------------------------");
		
		datos();
				

		}

}
