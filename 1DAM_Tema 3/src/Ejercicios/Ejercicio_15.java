package Ejercicios;

import java.util.Scanner;

/***
 * PROGRAMA: 
 * CREA UN PROGRAMA QUE DIGA SI UN A�O ES BISIESTO O NO SIGUIENDO EL 
 * DIAGRAMA DE FLUJOS DE NUESTRO COMPA�ERO
 * 
 * (DIAGRAMA DE FLUJOS ERRONEO) = Miguel Carabias G�mes
 *          
 * AUTOR: PEDRO DANIEL P�REZ S�NCHEZ
 *
 * FECHA: 28/10/2018
 *
 * MATERIA: PROGRAMACI�N
 *
 * CURSO: 1�DAM
 *
 ***/ 

public class Ejercicio_15 {
	
	/* M�TODO PARA COMPROBAR SI EL A�O ES BISIESTO */
	public static boolean validarA�o(int A){
		
		/*VARIABLES DEL METODO*/
		int imprimir = 0;
		
		/*VALIDAR SI ES BISIESTO SEG�N EL DIAGRAMA DE FLUJOS*/
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
	
	/* M�TODO: VALIDAR QUE EL A�O INTRODUCIDO SEA VALIDO */
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
		
		/* DECLARACI�N DE VARIABLES DE CABECERA */
		Scanner t = new Scanner(System.in);
		int opc=0;
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|   DESCUBRE SI UN A�O ES BISIESTO    |");
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
				case 1:	
					int termina = 0;
					do{  // **** PROGRAMA PRINCIPAL **** ##############
						
						int A=0;
						System.out.println();
						System.out.print("Introduce un a�o valido: ");
						A = t.nextInt();
						termina = 0;
												
						if(validar(A)==true) {
							if(validarA�o(A)==true) {
								System.out.println();
								System.out.println("*** El A�o "+A+" Es Bisiesto ***");
							}
							else {
								System.out.println();
								System.out.println("XXXX El A�o "+A+" NO es Bisiesto XXXX");
							}
							termina = 0; // TERMINA EL PROGRAMA PRINCIPAL ##############
							System.out.println();
							System.out.println("--Fin del programa--");
							
						}
						else {
							System.out.println("El a�o introducido no es valido");
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
