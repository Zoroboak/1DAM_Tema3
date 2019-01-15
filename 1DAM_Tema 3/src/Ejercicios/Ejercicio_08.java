package Ejercicios;

import java.util.Scanner;

public class Ejercicio_08 {

	public static double Factorial(double n) {
		
		if(n!=1)	n *= Factorial(n-1);
		
		return n;
	}
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		double n, fac;
		
		
		System.out.println("Calcular un Factorial");
		System.out.println("---------------------");
		System.out.println();
		do {
			System.out.print("Introduce un número mayor que 0: ");
			n = t.nextDouble();
			t.close();
		}while(n<1);
		
		fac = Factorial(n);
		
		System.out.println("El factorial de " + n +" es: " + fac);
	}

}
