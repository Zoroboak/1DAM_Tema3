package Extras;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  SE DEFINEN LOS N�MEROS TRIANGULARES COMO LOS 
 *  OBTENIDOS SUMANDO LOS N�MEROS NATURALES SUCESIVOS 1, 2, 3, .... 
 *  ES DECIR, LOS PRIMEROS N�MEROS TRIANGULARES SON 1, 3, 6, 10, ETC. 
 *  ESCRIBA UNA FUNCI�N JAVA QUE DEVUELVA EL N-�SIMO N�MERO
 *  TRIANGULAR, SIENDO N >= 1. 
 * 
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

public class Extras_03 {
	
	/* M�TODO MOSTRAR LOS PRIMEROS N NUMEROS TRIANGULARES */
	public static void nTriangulares(int num){
		
		/*METODO QUE MUESTRA LOS PRIMEROS N NUMEROS TRIANGULARES*/
		
		
		for(int i=1; i<=num; i++){
			int j = i*(i+1)/2;
			
			if (j<num) {
				System.out.print(+j+",");
			}
		  }
		}
	
	/* M�TODO: VALIDAR QUE EL NUMERO INTRODUCIDO SEA VALIDO */
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
				System.out.print("Elegir una opci�n: ");
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
					System.out.println("Gracias por utilizar este programa. �/(^_^)/�");
				break;
				
			}
		}while(opc!=2);		
		t.close();
		
	}
	
}
