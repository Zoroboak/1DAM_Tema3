package Extras;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  ELABORAR UN PROGRAMA JAVA QUE, DADO UN NÚMERO POSITIVO,
 *  ESCRIBA EN PANTALLA EL DOBLE NÚMERO ENTERO RESULTANTE DE INVERTIR
 *  SUS CIFRAS. POR EJEMPLO, SI LA ENTRADA FUESE 123 DEBERÍA ESCRIBIR 
 *  EN PANTALLA 642 (EL DOBLE DE 321)
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

public class Extras_01 {
	
	/* MÉTODO PARA INVERTIR NUMERO */
	public static int numInverso(int num){
		
		/*VARIABLES DEL METODO*/
		int faltante;
		int numeroInvertido;
		int restante;
		
		/*INVERTIR NUMERO*/
		faltante = num;
		numeroInvertido = 0;
		restante = 0;
		
		while(faltante!=0){
		    restante=faltante%10;
	        numeroInvertido=numeroInvertido*10+restante;
	        faltante=faltante/10;
		}
		
		/*DEVOLVER RESULTADO DEL METODO*/
		
		//System.out.println(numeroInvertido);
		
		return numeroInvertido;
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
		
		/* DECLARACIÓN DE VARIABLES */
		Scanner t = new Scanner(System.in);
		int num=0;
		int opc=0;
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|     DOBLE DEL NUMERO INVERSO        |");
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
						System.out.print("Introduce un numero entero: ");
						num = t.nextInt();
						termina = 0;
												
						if(validar(num)==true) {
							System.out.println();
							System.out.println("** El doble del inverso de "+num+" es "+(numInverso(num)*2)+" **");
							
							termina = 0;
							System.out.println();
							System.out.println("--Fin del programa--");
						}
						else {
							System.out.println("El numero introducido no es un entero");
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
