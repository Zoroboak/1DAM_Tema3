package Extras;

import java.util.Scanner;

/***
 * PROGRAMA: 
 *  ELABORAR UN PROGRAMA JAVA QUE IMPLEMENTE LA 
 *  FUNCI�N DE EULER RELATIVA A CUALQUIER N�MERO ENTERO POSITIVO. 
 * 
 *           
 * AUTOR: PEDRO DANIEL P�REZ S�NCHEZ
 *
 * FECHA: 29/10/2018
 *
 * MATERIA: PROGRAMACI�N
 *
 * CURSO: 1�DAM
 *
 ***/ 

public class Extras_05 {
	
	/* M�TODO QUE CALCULA LA FUNCI�N DE EULER */
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
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|  FUNCI�N DE EULER A NUMERO ENTERO + |");
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
						
						int num=0;

						System.out.println();
						System.out.print("Introduce un numero entero positivo: ");
						num = t.nextInt();
						termina = 0;
												
						if(validar(num)==true) {
							/* M�TODO QUE REALIZA LA FUNCI�N DE EULER */
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
					System.out.println("Gracias por utilizar este programa. �/(^_^)/�");
				break;
				
			}
		}while(opc!=2);		
		t.close();
		
	}
	
}
