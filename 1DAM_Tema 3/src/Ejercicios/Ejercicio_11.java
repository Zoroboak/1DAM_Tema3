package Ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
	
	/* VARIABLES CONSTANTES O GLOBALES */
	final static double PI = 3.141592;
	
	/* MÉTODO DE VALIDACIÓN DE UN NÚMERO DADO POR EL USUARIO */
	public static boolean validar(int opc){
		if((opc<1)||(opc>4)){
			System.out.println("La opción a elegir debe ser entre 1 y 4");
			return false;
		}
		else{
			return true;
		}
	}
	
	/* MÉTODO QUE CALCULA EL ÁREA DEL RECTÁNGULO */
	public static double rectangulo(double a, double b){
		return a*b;
	}
	
	/* MÉTODO QUE CALCULA EL ÁREA DEL TRIÁNGULO */
	public static double triangulo(double a, double b){
		return (a*b)/2;
	}
	
	/* MÉTODO QUE CALCULA EL ÁREA DEL CÍRCULO */
	public static double circulo(double a){
		return a*a*PI; 
	}
		
	/* MÉTODO PRINCIPAL A EJECUTAR */
	public static void main(String[] args) {
		
		/* DECLARACIÓN DE VARIABLES */
		Scanner t = new Scanner(System.in);
		int opc=0;
		double a = 0.0, b = 0.0;
		
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("---------------------------------------");
		System.out.println("CALCULO DEL ÁREA DE DIFERENTES ESPACIOS");
		System.out.println("---------------------------------------");
		
		do{
			do{
				System.out.println();
				System.out.println("1.-Área de un Rectángulo");
				System.out.println("2.-Área de un Triángulo");
				System.out.println("3.-Área de un Círculo");
				System.out.println("4.-Salir");
				System.out.println();
				System.out.print("Elegir una opción: ");
				opc = t.nextInt();				
			}while(validar(opc)==false);
			
			switch(opc){
				case 1:	// Área de un rectángulo
					System.out.println();
					System.out.print("Introduce la base del rectángulo: ");
					b = t.nextDouble();
					System.out.print("Introduce la altura del rectángulo: ");
					a = t.nextDouble();
					
					System.out.println("El área del rectángulo es: " + rectangulo(a,b));
				break;
				
				case 2:	// Área de un triángulo
					System.out.println();
					System.out.print("Introduce la base del triángulo: ");
					b = t.nextDouble();
					System.out.print("Introduce la altura del triángulo: ");
					a = t.nextDouble();
					
					System.out.println("El área del triángulo es: " + triangulo(a,b));
				break;
				
				case 3:	// Área de un círculo
					System.out.println();
					System.out.print("Introduce el radio del círculo: ");
					a = t.nextDouble();
					
					System.out.println("El área del círculo es: " + circulo(a));
				break;
				
				case 4:	// Salir del programa
					System.out.println("Gracias por utilizar este programa.");
				break;
				
			}
		}while(opc!=4);		
		t.close();
	}

}
