package Ejercicios;

import java.util.Scanner;

public class Ejercicio_07 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n, i, j;
		
		
		System.out.println("Números Primos");
		System.out.println("--------------");
		System.out.println();
		do {
			System.out.print("Introduce un número mayor que 0: ");
			n = t.nextInt();
			t.close();
		}while(n<1);
		
		for(i=1;i<=n;i++) {
			j=2;
			while(((i%j)!=0)&&(j<i)) {
				j++;
			}
			if(j==i)	System.out.println(i);	
		}
	}
}
