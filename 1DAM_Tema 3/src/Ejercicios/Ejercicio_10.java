package Ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {


	public static int validar(int d, int n) {
		if(n==d)	return 0;		// 0 cuando acierto
		else {
			if(n > d)	return 1;	// 1 d es menor que n
			else		return 2;	// 2 d es mayor que n
		}
	}
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int d;
		
		System.out.println("Adivina un n�mero del 1 al 100");
		System.out.println("------------------------------");
		System.out.println();
		
		int n = (int) ((Math.random()*100)+1);
		System.out.println("n�mero: " + n);
		
		do {
			do {
				System.out.print("Introduce un n�mero entre 1 y 100: ");
				d = t.nextInt();
			}while((d<1)||(d>100));
			
			switch(validar(d,n)) {
				case 0:
					System.out.println("Has acertado, el n�mero era: " + n);
				break;
				
				case 1:
					System.out.println("El n�mero es mayor");
				break;
				
				case 2:
					System.out.println("El n�mero es menor");
				break;
			}
			
			
		}while(validar(d,n)!=0);
		t.close();
	}

}
