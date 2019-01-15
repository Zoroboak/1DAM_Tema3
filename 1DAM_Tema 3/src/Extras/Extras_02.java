package Extras;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  ESCRIBIR UN PROGRAMA JAVA QUE ESCRIBA EN PANTALLA LOS FACTORES
 *  PRIMOS DE UN N�MERO ENTERO ESTRICTAMENTE POSITIVO DADO COMO ENTRADA. 
 *          
 * AUTOR: PEDRO DANIEL P�REZ S�NCHE
 *
 * FECHA: 28/10/2018
 *
 * MATERIA: PROGRAMACI�N
 *
 * CURSO: 1�DAM
 *
 ***/ 

public class Extras_02 {
	
	/* M�TODO PARA SACAR LOS FACTORES PRIMOS DEL NUMERO */
	public static void factor(int num){
				
		/*VARIABLE LOCAL*/
		int numero = 2;
		
		/*METODO PARA SACAR LOS FACTORES PRIMOS*/
	    while(num!=1){
	   	while(num%numero==0){
	   		System.out.print(numero+"  ");
	   		num /= numero;
	        }
	   	numero++;
	    }
	}
				
	/* M�TODO: VALIDAR QUE EL NUMERO INTRODUCIDO SEA UN ENTERO ESTRICTAMENTE POSITIVO */
	public static boolean validar(int num){
		
		/*CONDICIONAL DE VALIDACI�N*/
		if(num<1){
			return false;
		}
		else{
			return true;
		}
	}
	
	/* M�TODO DE VALIDACI�N DE OPCI�N DEL MENU */
	public static boolean validaropc(int opc){
		if((opc<1)||(opc>2)){
			System.out.println("Debe escoger una opci�n en el menu");
			return false;
		}
		else{
			return true;
		}
	}
	
	/* M�TODO PRINCIPAL A EJECUTAR */
	public static void main(String[] args) {
		
		/* DECLARACI�N DE VARIABLES */
		Scanner t = new Scanner(System.in);
		int num=0;
		int opc=0;
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|     OBTEN LOS FACTORES PRIMOS       |");
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
				System.out.print("Elegir una opci�n: ");
				opc = t.nextInt();				
			}while(validaropc(opc)==false);
			
			switch(opc){
				case 1:	// PROGRAMA PRINCIPAL
					int termina = 0;
					do{
						System.out.println();
						System.out.print("Introduce un numero entero positivo: ");
						num = t.nextInt();
						termina = 0;
												
						if(validar(num)==true) {
							System.out.println();
							System.out.print("** Los factores primos del numero "+num+" son ");
							factor(num);
							System.out.print("**");
							System.out.println();
							
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
					System.out.println("Gracias por utilizar este programa. �/(^_^)/�");
				break;
				
			}
		}while(opc!=2);		
		t.close();
		
	}
	
}
