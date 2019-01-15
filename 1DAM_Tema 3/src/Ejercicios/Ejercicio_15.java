package Ejercicios;

import java.util.Scanner;

/***
 * PROGRAMA: 
 * CREA UN PROGRAMA QUE DIGA SI UN AÑO ES BISIESTO O NO SIGUIENDO EL 
 * DIAGRAMA DE FLUJOS DE NUESTRO COMPAÑERO
 * 
 * (DIAGRAMA DE FLUJOS ERRONEO) = Miguel Carabias Gómes
 *          
 * AUTOR: PEDRO DANIEL PÉREZ SÁNCHEZ
 *
 * FECHA: 28/10/2018
 *
 * MATERIA: PROGRAMACIÓN
 *
 * CURSO: 1ºDAM
 *
 ***/ 

public class Ejercicio_15 {
	
	/* MÉTODO PARA COMPROBAR SI EL AÑO ES BISIESTO */
	public static boolean validarAño(int A){
		
		/*VARIABLES DEL METODO*/
		int imprimir = 0;
		
		/*VALIDAR SI ES BISIESTO SEGÚN EL DIAGRAMA DE FLUJOS*/
		if (A%4==0) {
			if (A%100==0) {
				if (A%400==0) {imprimir = 1; }
				else {imprimir = 0; }
			}
			else {imprimir = 1; }
		}
		else {imprimir = 0;}
		
		/*DEVOLVER RESULTADO DEL METODO*/
		if (imprimir==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* MÉTODO: VALIDAR QUE EL AÑO INTRODUCIDO SEA VALIDO */
	public static boolean validar(int num){
		
		/*CONDICIONAL DE VALIDACIÓN*/
		if(num<1){
			return false;
		}
		else{
			return true;
		}
	}
	
	/* MÉTODO DE VALIDACIÓN DE OPCIÓN DEL MENU */
	public static boolean validaropc(int opc){
		if((opc<1)||(opc>2)){
			System.out.println("Debe escoger una opción en el menu");
			return false;
		}
		else{
			return true;
		}
	}
	
	/* MÉTODO PRINCIPAL A EJECUTAR */
	public static void main(String[] args) {
		
		/* DECLARACIÓN DE VARIABLES DE CABECERA */
		Scanner t = new Scanner(System.in);
		int opc=0;
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|   DESCUBRE SI UN AÑO ES BISIESTO    |");
		System.out.println("|                                     |");
		System.out.println("+-------------------------------------+");
		
		do{
			do{
				System.out.println();
				System.out.println("+---------------------+");
				System.out.println("| 1.-Iniciar Programa |");
				System.out.println("| 2.-Salir            |");
				System.out.println("+---------------------+");
				System.out.println();
				System.out.print("Elegir una opción: ");
				opc = t.nextInt();				
			}while(validaropc(opc)==false);
			
			switch(opc){
				case 1:	
					int termina = 0;
					do{  // **** PROGRAMA PRINCIPAL **** ##############
						
						int A=0;
						System.out.println();
						System.out.print("Introduce un año valido: ");
						A = t.nextInt();
						termina = 0;
												
						if(validar(A)==true) {
							if(validarAño(A)==true) {
								System.out.println();
								System.out.println("*** El Año "+A+" Es Bisiesto ***");
							}
							else {
								System.out.println();
								System.out.println("XXXX El Año "+A+" NO es Bisiesto XXXX");
							}
							termina = 0; // TERMINA EL PROGRAMA PRINCIPAL ##############
							System.out.println();
							System.out.println("--Fin del programa--");
							
						}
						else {
							System.out.println("El año introducido no es valido");
							termina = 1;
						}
					}while((termina==1)==true);
					
				break;
				
				case 2:	// Salir del programa
					System.out.println();
					System.out.println("Gracias por utilizar este programa. º/(^_^)/º");
				break;
				
			}
		}while(opc!=2);		
		t.close();
		
	}
	
}
