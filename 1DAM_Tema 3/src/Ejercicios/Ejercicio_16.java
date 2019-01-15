package Ejercicios;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  ELABORAR UN PROGRAMA JAVA QUE IMPLEMENTE LA 
 *  FUNCIÓN DE EULER RELATIVA A CUALQUIER NÚMERO ENTERO POSITIVO. 
 * 
 *           
 * AUTOR: PEDRO DANIEL PÉREZ SÁNCHEZ
 *
 * FECHA: 31/10/2018
 *
 * MATERIA: PROGRAMACIÓN
 *
 * CURSO: 1ºDAM
 *
 ***/ 

public class Ejercicio_16 {
	
   	
	/* MÉTODO OBTENER SUMA */
	public static int getSuma(int a, int b){
		
		return (a+b); 
	}
	
	/* MÉTODO OBTENER RESTA */
	public static int getResta(int a, int b){
		
		return (a-b); 
	}
	
	/* MÉTODO OBTENER DIVISIÓN */
	public static double getDiv(int a, int b){
		int c = 0;
		
		if (b!=0) {
			c = a/b;
		}
		
		return c; 
	}
	
	/* MÉTODO OBTENER MULTIPLICACIÓN */
	public static long getMult(int a, int b){
		
		return (a*b); 
	}
	
	/* MÉTODO OBTENER ENTRADA DEL USUARIO*/
	public static int getDato(){
		
		Scanner t = new Scanner(System.in);
		int sc = t.nextInt();
		
		
		return sc; 
	}
	
	/* MÉTODO MOSTRAR EN PANTALLA*/
	public static void show(String d){
		System.out.println(d);
		
		return; 
	}
	/* MÉTODO MOSTRAR EN PANTALLA SIN DATOS DE ENTRADA*/
	public static void show(){
		System.out.println();
		
		return; 
	}
	
	/* MÉTODO: VALIDAR QUE EL NUMERO INTRODUCIDO SEA VALIDO */
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
		if((opc<0)||(opc>4)){
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
		
		int opc=0;
		
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|        UTILIZACIÓN DE METODOS       |");
		System.out.println("|                                     |");
		System.out.println("+-------------------------------------+");
		
		do{
			do{
				System.out.println();
				System.out.println("+---------------------+");
				System.out.println("| 0.- Salir           |");
				System.out.println("| 1.- Sumar           |");
				System.out.println("| 2.- Restar          |");
				System.out.println("| 3.- Dividir         |");
				System.out.println("| 4.- Multiplicar     |");
				System.out.println("+---------------------+");
				System.out.println();
				System.out.print("Elegir una opción: ");
				opc = getDato();
						
			}while(validaropc(opc)==false);
			
			switch(opc){
				case 1:	// 1.- SUMAR
					
					int termina = 0;
					do{ 
						
						int numa=0;
						int numb=0;

						System.out.println();
						System.out.println("Introduce un numero entero positivo: ");
						numa = getDato();
						System.out.println("Introduce otro numero entero positivo: ");
						numb = getDato();
						
						
						termina = 1;
												
						if((validar(numa)&&validar(numb))==true) {
							/* MÉTODO QUE REALIZA LA SUMA */
							System.out.println("El resultado es "+getSuma(numa, numb));
							
							termina = 0; // TERMINA EL PROGRAMA SUMA ##############
							System.out.println();
							System.out.println("--Fin del programa--");
							
						}
						else {
							System.out.println("El numero introducido no es valido");
							termina = 1;
						}
					}while((termina==1)==true);
					
				break;
				
				case 2:	// 2. - RESTAR

					termina = 0;
					do{  
						
						int numa=0;
						int numb=0;

						System.out.println();
						System.out.println("Introduce un numero entero positivo: ");
						numa = getDato();
						System.out.println("Introduce otro numero entero positivo: ");
						numb = getDato();
						
						
						termina = 1;
												
						if((validar(numa)&&validar(numb))==true) {
							/* MÉTODO QUE REALIZA LA SUMA */
							System.out.println("El resultado es "+getResta(numa, numb));
							
							termina = 0; // TERMINA EL PROGRAMA SUMA ##############
							System.out.println();
							System.out.println("--Fin del programa--");
							
						}
						else {
							System.out.println("El numero introducido no es valido");
							termina = 1;
						}
					}while((termina==1)==true);
					
				break;
				
				case 3:	// 3 - DIVIDIR

					termina = 0;
					do{  
						
						int numa=0;
						int numb=0;

						System.out.println();
						System.out.println("Introduce un numero entero positivo: ");
						numa = getDato();
						System.out.println("Introduce otro numero entero positivo: ");
						numb = getDato();
						
						
						termina = 1;
												
						if((validar(numa)&&validar(numb))==true) {
							/* MÉTODO QUE REALIZA LA SUMA */
							System.out.println("El resultado es "+getDiv(numa, numb));
							
							termina = 0; // TERMINA EL PROGRAMA SUMA ##############
							System.out.println();
							System.out.println("--Fin del programa--");
							
						}
						else {
							System.out.println("El numero introducido no es valido");
							termina = 1;
						}
					}while((termina==1)==true);
					
				break;
				
				case 4:	// 4 - MULTIPLICAR 

					termina = 0;
					do{  
						
						int numa=0;
						int numb=0;

						System.out.println();
						System.out.println("Introduce un numero entero positivo: ");
						numa = getDato();
						System.out.println("Introduce otro numero entero positivo: ");
						numb = getDato();
						
						
						termina = 1;
												
						if((validar(numa)&&validar(numb))==true) {
							/* MÉTODO QUE REALIZA LA SUMA */
							System.out.println("El resultado es "+getMult(numa, numb));
							
							termina = 0; // TERMINA EL PROGRAMA SUMA ##############
							System.out.println();
							System.out.println("--Fin del programa--");
							
						}
						else {
							System.out.println("El numero introducido no es valido");
							termina = 1;
						}
					}while((termina==1)==true);
					
				break;
				
				case 0:	// SALIR DEL PROGRAMA
					System.out.println();
					System.out.println("Gracias por utilizar este programa. º/(^_^)/º");
					
				break;
				
			} 
		
		}while(opc!=0);		
		
		
	}
	
}
