package Ejercicios;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int i,j;
		
		System.out.println("Triangulo de asteriscos");
		System.out.println("-----------------------");
		System.out.println();
		System.out.print("Número de filas a pintar: ");
		int n = t.nextInt();
		t.close();
		
		for(i=1; i<=n; i++) {	// CONTROL DE FILA
			for(j=0;j<(n-i);j++) {	// CONTROL DE ESPACIOS
				System.out.print(" ");
			}
			for(j=0;j<(i+(i-1));j++) {	// CONTROL DE ASTERISCOS
				System.out.print("*");
			}
			System.out.println();
		}

	}

}