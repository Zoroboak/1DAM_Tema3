package Ejercicios;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int mayor, menor;
		
		System.out.println("PROGRAMA DE EVALUACIÓN DE MAYOR Y MENOR");
		System.out.println("---------------------------------------");
		System.out.println("Introduce 3 enteros y se mostrará el mayor y el menor");
		System.out.println();
		System.out.print("Primer número: ");
		int a = t.nextInt();
		System.out.print("Segundo número: ");
		int b = t.nextInt();
		System.out.print("Tercer número: ");
		int c = t.nextInt();
		t.close();
		if(a<b) {
			if(b<c) {
				mayor = c;
				menor = a;
			}
			else {
				mayor = b;
				if(a<c)	menor = a;
				else	menor = c;
			}
		}
		else {
			if(a<c) {
				mayor = c;
				menor = b;
			}
			else {
				mayor = a;
				if(b<c)	menor = b;
				else	menor = c;
			}
		}
		
		System.out.println("El número menor es: " + menor);
		System.out.println("El número mayor es: " + mayor);
	}

}
