package Ejercicios;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int i,j;
		
		System.out.println("Medio Triangulo de asteriscos");
		System.out.println("-----------------------");
		System.out.println();
		System.out.print("Número de filas a pintar: ");
		int n = t.nextInt();
		t.close();
		
		for(i=1; i<=n; i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}