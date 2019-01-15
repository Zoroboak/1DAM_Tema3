package Ejercicios;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int d,m,a,ln,M,C,D,U;
		
		
		System.out.println("Lucky Number");
		System.out.println("-------------");
		System.out.println();
		do {
			System.out.print("Introduce tu día de nacimiento: ");
			d = t.nextInt();
		}while((d<1)||(d>31));
		
		do {
			System.out.print("Introduce tu mes de nacimiento: ");
			m = t.nextInt();
			if((d>29)&&(m==2))	m=0;
			if((d>30)&&((m==4)||(m==6)||(m==9)||(m==11)))	m=0;
		}while((m<1)||(m>12));		
		
		do {
			System.out.print("Introduce tu año de nacimiento: ");
			a = t.nextInt();
		}while((a<1)||(a>2018));	
		
		ln = d+m+a;
		
		while(ln>9){
			M=ln/1000;
			C=(ln%1000)/100;
			D=(ln%100)/10;
			U=(ln%10);
			ln=M+C+D+U;
		}
		t.close();
		System.out.println("El número de la suerte de la fecha: "+ d + "-" + m + "-" + a + " es: " + ln);

	}

}
