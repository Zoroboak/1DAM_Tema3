package Extras;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  ELABORAR UN PROGRAMA EN JAVA QUE MULTIPLIQUE MEDIANTE 
 *  EL MÉTODO "A LA RUSA" DOS NÚMEROS ENTEROS POSITIVOS INTRODUCIDOS
 *  POR TECLADO, MOSTRANDO EL PROCESO. 
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

public class Extras_04 {
	
	/* MÉTODO QUE MULTIPLICA "A LA RUSA" */
	public static int mRusa(int num, int num2){
		
		System.out.println("---------");
		
		/*VARIABLES LOCALES DEL METODO*/
	    int resultado=0;	    
	    
	    /*BUCLE QUE REALIZA LA MULTIPLICACIÓN*/
	    while(num!=0){
	        if(num%2!=0){
	        	//System.out.println(resultado);
	        	resultado = resultado + num2;
	        	}
	        System.out.print(num+" ,");
	        System.out.println(num2);
	        num = num / 2;
	        num2 = num2 * 2;
	    	}
	    System.out.println("---------");
	    
	    /*DEVOLVER RESULTADO FINAL DEL METODO*/
	    return resultado;
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
		System.out.println("|  MULTIPLICAR NUMEROS ''A LA RUSA''  |");
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
						int num2=0;
						System.out.println();
						System.out.print("Introduce un numero a multiplicar: ");
						num = t.nextInt();
						System.out.print("Introduce un segundo numero a multiplicar: ");
						num2 = t.nextInt();
						termina = 0;
												
						if(validar(num)&&validar(num2)==true) {
							/* MÉTODO QUE MULTIPLICA "A LA RUSA" */
							System.out.println();
							System.out.println(mRusa(num, num2));
							
							
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
