package Ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
	
	/* VARIABLES CONSTANTES O GLOBALES */
	final static double PI = 3.141592;
	
	/* M�TODO DE VALIDACI�N DE UN N�MERO DADO POR EL USUARIO */
	public static boolean validar(int opc){
		if((opc<1)||(opc>4)){
			System.out.println("La opci�n a elegir debe ser entre 1 y 4");
			return false;
		}
		else{
			return true;
		}
	}
	
	/* M�TODO QUE CALCULA EL �REA DEL RECT�NGULO */
	public static double rectangulo(double a, double b){
		return a*b;
	}
	
	/* M�TODO QUE CALCULA EL �REA DEL TRI�NGULO */
	public static double triangulo(double a, double b){
		return (a*b)/2;
	}
	
	/* M�TODO QUE CALCULA EL �REA DEL C�RCULO */
	public static double circulo(double a){
		return a*a*PI; 
	}
		
	/* M�TODO PRINCIPAL A EJECUTAR */
	public static void main(String[] args) {
		
		/* DECLARACI�N DE VARIABLES */
		Scanner t = new Scanner(System.in);
		int opc=0;
		double a = 0.0, b = 0.0;
		
		
		
		/* CABECERA DEL PROGRAMA */
		System.out.println("---------------------------------------");
		System.out.println("CALCULO DEL �REA DE DIFERENTES ESPACIOS");
		System.out.println("---------------------------------------");
		
		do{
			do{
				System.out.println();
				System.out.println("1.-�rea de un Rect�ngulo");
				System.out.println("2.-�rea de un Tri�ngulo");
				System.out.println("3.-�rea de un C�rculo");
				System.out.println("4.-Salir");
				System.out.println();
				System.out.print("Elegir una opci�n: ");
				opc = t.nextInt();				
			}while(validar(opc)==false);
			
			switch(opc){
				case 1:	// �rea de un rect�ngulo
					System.out.println();
					System.out.print("Introduce la base del rect�ngulo: ");
					b = t.nextDouble();
					System.out.print("Introduce la altura del rect�ngulo: ");
					a = t.nextDouble();
					
					System.out.println("El �rea del rect�ngulo es: " + rectangulo(a,b));
				break;
				
				case 2:	// �rea de un tri�ngulo
					System.out.println();
					System.out.print("Introduce la base del tri�ngulo: ");
					b = t.nextDouble();
					System.out.print("Introduce la altura del tri�ngulo: ");
					a = t.nextDouble();
					
					System.out.println("El �rea del tri�ngulo es: " + triangulo(a,b));
				break;
				
				case 3:	// �rea de un c�rculo
					System.out.println();
					System.out.print("Introduce el radio del c�rculo: ");
					a = t.nextDouble();
					
					System.out.println("El �rea del c�rculo es: " + circulo(a));
				break;
				
				case 4:	// Salir del programa
					System.out.println("Gracias por utilizar este programa.");
				break;
				
			}
		}while(opc!=4);		
		t.close();
	}

}
