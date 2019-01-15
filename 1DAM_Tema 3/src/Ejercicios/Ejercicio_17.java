package Ejercicios;

import java.util.Scanner;

/***
 * PROGRAMA: 
 * CREA UN PROGRAMA QUE PIDA DOS NUMEROS, LOS GUARDE EN UNA SOLA VARIABLE
 * Y LUEGO LOS SEPARE 
 *          
 * AUTOR: PEDRO DANIEL PÉREZ SÁNCHEZ
 *
 * FECHA: 11/11/2018
 *
 * MATERIA: PROGRAMACIÓN
 *
 * CURSO: 1ºDAM
 *
 ***/ 

public class Ejercicio_17{
	
	
	
	/*SEPARAR NUMEROS*/
	public static int getA(int num) {
	int a = (num & 0x0000FFFF); // RECOJO A
	return a;
	
	}
	public static int getB(int num){
		int b = (num & 0xFFFF0000); // RECOJO B
		return b;
	}
	
	/*JUNTAR NUMEROS EN LA MISMA VARIABLE*/
	public static int getAB(int num) {
		int ab = 0;
		int a = (num & 0x0000FFFF);
		int b = (num & 0x0000FFFF);
		
		System.out.println(a+" "+b);
		ab = a+b;
		return ab;
	}	
	
	
	/*JUNTAR NUMEROS EN LA MISMA VARIABLE*/
	public static int setAB(int num1, int num2) {
		int ab = ((num1<<16) & 0xFFFF0000);
		ab = (num2 & 0x0000FFFF);
		return ab;
	}
	
	/*ESTABLECER VALOR NUMEROS INDIVIDUALMENTE*/
	public static int setA(int num) {
		int a = ((num<<16) & 0xFFFF0000);
		return a;
	}
	
	public static int setB(int num) {
		int b = (num & 0x0000FFFF);
		return b;
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
		System.out.println("|  GUARDAR 2 NUMEROS EN UNA VARIABLE  |");
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
					// **** PROGRAMA PRINCIPAL **** ##############
					int a, b, ab;
					
					do {
						System.out.println("Introduce el numero a [0-32000]");
						a = t.nextInt();
					}while((a<0)||(a>32000));
					
					do {
						System.out.println("Introduce otro numero a guardar [0-32000]");
						b = t.nextInt();
						
					}while((b<0)||(b>32000));
					
					ab = setA(a);
					ab = setB(b);
					getAB(ab);
					
					
					
					
					
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
