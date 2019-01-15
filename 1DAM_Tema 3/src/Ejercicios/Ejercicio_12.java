package Ejercicios;

import java.util.Scanner;

/***
 * PROGRAMA: VALIDAR NUMERO DE 3 CIFRAS Y DECIR SI ES CAPIC�A 
 *          
 * AUTOR: PEDRO DANIEL P�REZ S�NCHEZ
 *
 * FECHA: 27/10/2018
 *
 * Materia: PROG
 *
 * CURSO: 1�DAM
 *
 ***/ 

public class Ejercicio_12 {
	
	/* M�TODO PARA COMPROBAR SI UN NUMERO ES CAPICUA */
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
	
	/* M�TODO DE VALIDACI�N DE UN N�MERO DADO POR EL USUARIO */
	public static boolean validar(int num){
		
		/*VARIABLE QUE CONTIENE LOS DIGITOS*/
		int digitos=0;
		
		/*CONTADOR DE DIGITOS*/
		while(num !=0){
		   num = num/10;
		   digitos++;
		 }
		
		/*CONDICIONAL DE VALIDACI�N*/
		if((digitos<3)||(digitos>3)){
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
		System.out.println("| VALIDACI�N NUMERO CAPIC�A 3 DIGITOS |");
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
						System.out.print("Introduce un numero de 3 Digitos: ");
						num = t.nextInt();
						termina = 0;
												
						if(validar(num)==true) {
						
							if(capicua(num)==true) {
								System.out.println();
								System.out.println("****El Numero es Capic�a****");
							}
							else{
								System.out.println();
								System.out.println("XXXX El Numero NO es Capic�a XXXX");
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
					System.out.println("Gracias por utilizar este programa. �/(^_^)/�");
				break;
				
			}
		}while(opc!=2);		
		t.close();
		
		
	}
	
	
}
