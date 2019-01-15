package Ejercicios;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int i,j,k;
		
		System.out.println("Rombo vacio");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.print("Número de filas a pintar (debe ser impar): ");
		int n = t.nextInt();
		t.close();
		
		k = n/2;
		
		for(i=1; i<=(k+1); i++) {	// CONTROL DE FILA
			for(j=0;j<((k+1)-i);j++) {	// CONTROL DE ESPACIOS
				System.out.print(" ");
			}
			for(j=0;j<(i+(i-1));j++) {	// CONTROL DE ASTERISCOS
				if((j==0)||(j==(2*i-2)))	System.out.print("*");
				else						System.out.print(" ");
			}
			System.out.println();
		}
		
		for(i=k; i>0; i--) {	// CONTROL DE FILA
			for(j=((k+1)-i);j>0;j--) {	// CONTROL DE ESPACIOS
				System.out.print(" ");
			}
			
			for(j=(i+(i-1));j>0;j--) {	// CONTROL DE ASTERISCOS
				if((j==1)||(j==(2*i-1)))	System.out.print("*");
				else						System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
