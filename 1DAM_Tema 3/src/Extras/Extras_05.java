package Extras;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  ELABORAR UN PROGRAMA JAVA QUE IMPLEMENTE LA 
 *  FUNCIÓN DE EULER RELATIVA A CUALQUIER NÚMERO ENTERO POSITIVO. 
 * 
 *           
 * AUTOR: PEDRO DANIEL PÉREZ SÁNCHEZ
 *
 * FECHA: 29/10/2018
 *
 * MATERIA: PROGRAMACIÓN
 *
 * CURSO: 1ºDAM
 *
 ***/ 

public class Extras_05 {
	
	/* MÉTODO QUE CALCULA LA FUNCIÓN DE EULER */
	public static int fEuler(int num){
		/*VARIABLES LOCALES DEL METODO*/
		int i=0;
		int E=0;
		
		/*BUCLES DEL METODO*/
		for (i=0;i<num;i++) {
			if (((i+1)*2)<num) {
				System.out.print(((i+1)*2)-1);
			}
			if (((i+1)*2!=0)&&(((i+1)*2)<num)) {
				E++;
								
			}
		}
		
		/*DEVOLVER RESULTADO DEL METODO*/
		System.out.println();
		return E; 
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
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|  FUNCIÓN DE EULER A NUMERO ENTERO + |");
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
						
						int num=0;

						System.out.println();
						System.out.print("Introduce un numero entero positivo: ");
						num = t.nextInt();
						termina = 0;
												
						if(validar(num)==true) {
							/* MÉTODO QUE REALIZA LA FUNCIÓN DE EULER */
							System.out.println();
							System.out.println(fEuler(num));
							System.out.println();
							
							
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
