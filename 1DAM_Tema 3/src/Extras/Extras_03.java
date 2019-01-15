package Extras;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  SE DEFINEN LOS NÚMEROS TRIANGULARES COMO LOS 
 *  OBTENIDOS SUMANDO LOS NÚMEROS NATURALES SUCESIVOS 1, 2, 3, .... 
 *  ES DECIR, LOS PRIMEROS NÚMEROS TRIANGULARES SON 1, 3, 6, 10, ETC. 
 *  ESCRIBA UNA FUNCIÓN JAVA QUE DEVUELVA EL N-ÉSIMO NÚMERO
 *  TRIANGULAR, SIENDO N >= 1. 
 * 
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

public class Extras_03 {
	
	/* MÉTODO MOSTRAR LOS PRIMEROS N NUMEROS TRIANGULARES */
	public static void nTriangulares(int num){
		
		/*METODO QUE MUESTRA LOS PRIMEROS N NUMEROS TRIANGULARES*/
		
		
		for(int i=1; i<=num; i++){
			int j = i*(i+1)/2;
			
			if (j<num) {
				System.out.print(+j+",");
			}
		  }
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
		System.out.println("+---------------------------------------------+");
		System.out.println("|                                             |");
		System.out.println("| MOSTRAR LOS PRIMEROS N NUMEROS TRIANGULARES |");
		System.out.println("|                                             |");
		System.out.println("+---------------------------------------------+");
		
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
						
						int num=0;
						System.out.println();
						System.out.print("Introduce el maximo numero triangular que quieras ver: ");
						num = t.nextInt();
						termina = 0;
												
						if(validar(num)==true) {
							//METODO QUE MUESTRA LOS PRIMEROS N NUMEROS TRIANGULARES
							nTriangulares(num);
							
							termina = 0; // TERMINA EL PROGRAMA PRINCIPAL ##############
							System.out.println();
							System.out.println("--Fin del programa--");
							
						}
						else {
							System.out.println("El numero introducido no es valido");
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
