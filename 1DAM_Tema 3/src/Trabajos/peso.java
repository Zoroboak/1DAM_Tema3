package Trabajos;

import java.util.Scanner;

/***
 * PROGRAMA: 
 * CLASE QUE DEFINE LA CONSTRUCCIÓN DE UN OBJETO 
 * SE SIGUE LAS INDICACIONES DEL PROFESOR "PESO"
 * 
 *           
 * AUTOR: PEDRO DANIEL PÉREZ SÁNCHEZ
 *
 * FECHA: 30/10/2018
 *
 * MATERIA: PROGRAMACIÓN
 *
 * CURSO: 1ºDAM
 *
 ***/ 

public class peso {
	
	/* ATRIBUTOS */
	String Medida;	// ATRIBUTO MEDIDA PARA EL CONSTRUCTOR
	double	P;	// ATRIBUTO PESO PARA EL CONTRUCTOR
	
	
	// DEVOLVER PESO GUARDADO
	public static double getP(peso Valorpeso) {
			return Valorpeso.P; 
			
		}
	// DEVOLVER MEDIDA GUARDADO
		public static String getMedida(peso Valormedida) {
				return Valormedida.Medida; 
				
		}

	// CONSTRUCTOR DE PESO POR DEFECTO
	public 	peso() {
			P = 0;
			Medida = "Kg";
		}
	
	// CONSTRUCTOR DE PESO CREADO POR EL USUARIO
	public 	peso(String m, double p) {
			P = p;
			Medida = m;
		}
		
	
	/* MÉTODO: VALIDAR QUE EL NUMERO INTRODUCIDO SEA VALIDO */
	public static boolean validar(double P){
		
		/*CONDICIONAL DE VALIDACIÓN*/
		if(P<0){
			return false;
		}
		else{
			return true;
		}
	}
	
	/* MÉTODO DE VALIDACIÓN DE OPCIÓN DEL MENU */
	public static boolean validaropc(int opc){
		if((opc<1)||(opc>4)){
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
		
		/*VARIABLES DEL PROGRAMA*/
		peso peso1 = null;
		int p; //PESO DADO POR EL USUARIO
		//String m = "Kg"; //MEDIDA DADA POR EL USUARIO
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|        CONVERTIDOR DE PESO          |");
		System.out.println("|                                     |");
		System.out.println("+-------------------------------------+");
		
		do{
			do{
				System.out.println();
				System.out.println("+-------------------------+");
				System.out.println("| 1.-Crear Nuevo Peso     |");
				System.out.println("| 2.-Peso Por Defecto     |");
				System.out.println("| 3.-Mostrar Peso Guardado|");
				System.out.println("| 4.-Salir                |");
				System.out.println("+-------------------------+");
				System.out.println();
				System.out.print("Elegir una opción: ");
				opc = t.nextInt();				
			}while(validaropc(opc)==false);
			
			switch(opc){
				case 1:	
					int termina = 0;
					do{  // **** OPCIÓN 1 - CREAR NUEVO OBJETO **** ##############	
						
												
						System.out.println();
						System.out.print("Introduce cantidad de peso: ");
						p = t.nextInt();
						System.out.print("Introduce Unidad de Medida: ");
						System.out.println("‘Lb’ para libras.");
						System.out.println("‘Li’ para lingotes.");
						System.out.println("‘Oz’ para onzas.");
						System.out.println("‘P’ para peniques.");
						System.out.println("‘K’ para kilos.");
						System.out.println("‘G’ para gramos.");
						System.out.println("‘Q’ para quintales.");
						String m = t.nextLine();
						termina = 0;
												
						if(validar(p)==true) {
							
							peso1 = new peso(m, p);
							
							termina = 0; // TERMINA EL PROGRAMA DE LA OPCIÓN 1 ##############
							System.out.println();
							System.out.println("--Fin del metodo--");
							
						}
						else {
							System.out.println("Los valores introducido no son validos");
							termina = 1;
						}
					}while((termina==1)==true);
					
				break;
				
				case 2:	//PROGRAMA PESO POR DEFECTO
					
					// **** OPCIÓN 2 - CREAR PESO POR DEFECTO**** ##############	
								
					peso1 = new peso();
					
					// TERMINA EL PROGRAMA DE LA OPCIÓN 1 ##############
					System.out.println();
					System.out.println("--Fin del metodo--");
							
				break;
				
				case 3:	//PROGRAMA MOSTRAR PESO GUARDADO
					double verp = getP(peso1);
					String verm = getMedida(peso1);
					System.out.println("El peso guardado es de "+verp+verm);
										
				break;
				
				case 4:	//SALIR
					System.out.println();
					System.out.println("Gracias por utilizar este programa. º/(^_^)/º");
				break;
				
			}
		}while(opc!=4);		
		t.close();
		
	}

	
	
}
