package Ejercicios;

import java.util.Scanner;

/***
 * PROGRAMA: VALIDAR NUMERO DE 3 CIFRAS Y DECIR SI ES CAPICÚA 
 *          
 * AUTOR: PEDRO DANIEL PÉREZ SÁNCHEZ
 *
 * FECHA: 27/10/2018
 *
 * Materia: PROG
 *
 * CURSO: 1ºDAM
 *
 ***/ 

public class Ejercicio_12 {
	
	/* MÉTODO PARA COMPROBAR SI UN NUMERO ES CAPICUA */
	public static boolean capicua(int num){
		
		/*VARIABLES DEL METODO*/
		int faltante;
		int numeroInvertido;
		int restante;
		
		/*COMPROBAR SI ES CAPICUA*/
		faltante = num;
		numeroInvertido = 0;
		restante = 0;
		
		while(faltante!=0){
		    restante=faltante%10;
	        numeroInvertido=numeroInvertido*10+restante;
	        faltante=faltante/10;
		}
		
		/*DEVOLVER RESULTADO DEL METODO*/
		if(numeroInvertido != num){
			return false;
		}
		else{
			return true;
		}
	}
	
	/* MÉTODO DE VALIDACIÓN DE UN NÚMERO DADO POR EL USUARIO */
	public static boolean validar(int num){
		
		/*VARIABLE QUE CONTIENE LOS DIGITOS*/
		int digitos=0;
		
		/*CONTADOR DE DIGITOS*/
		while(num !=0){
		   num = num/10;
		   digitos++;
		 }
		
		/*CONDICIONAL DE VALIDACIÓN*/
		if((digitos<3)||(digitos>3)){
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
		
		/* DECLARACIÓN DE VARIABLES */
		Scanner t = new Scanner(System.in);
		int num=0;
		int opc=0;
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("| VALIDACIÓN NUMERO CAPICÚA 3 DIGITOS |");
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
				case 1:	// PROGRAMA PRINCIPAL
					int termina = 0;
					do{
						System.out.println();
						System.out.print("Introduce un numero de 3 Digitos: ");
						num = t.nextInt();
						termina = 0;
												
						if(validar(num)==true) {
						
							if(capicua(num)==true) {
								System.out.println();
								System.out.println("****El Numero es Capicúa****");
							}
							else{
								System.out.println();
								System.out.println("XXXX El Numero NO es Capicúa XXXX");
							}
							termina = 0;
						}
						else {
							System.out.println("El numero introducido no es de 3 digitos");
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
