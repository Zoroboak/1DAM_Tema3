package Ejemplos;

import java.util.Scanner;

public class pajaros {
/* ATRIBUTOS */
	String color;	// Define el color del pájaro
	boolean	volar;	// Define el vuelo: true = vuela; false = NO vuela;
	
	
	/* MÉTODOS */
	
	// Constructor por defecto: pajaro blanco y no vuela
	public pajaros() {
		color = "blanco";
		volar = false;
	}
	
	// Constructor con características del usuario
	public pajaros(String col, boolean vol) {
		color = col;
		volar = vol;
	}
	
	// Devolver color de los pajaros
	public static String getColor(pajaros name) {
		return name.color;
	}
	
	// Devolver vuelo de los pajaros
	public static boolean getVolar(pajaros name) {
		return name.volar;
	}
	
	
	/* METODO MAIN PARA TESTEAR LA CLASE */
	public static void main(String[] args) {
		
		/* VARIABLES */
		Scanner t = new Scanner(System.in);
		int opc = 0;
		pajaros piolin = null, pardal = null;
		
		System.out.println("--------------------------");
		System.out.println("Testeo de la clase pajaros");
		System.out.println("--------------------------");
		System.out.println();
		
		do {
			do {
				System.out.println("0.-Salir");
				System.out.println("1.-Crear pájaro por defecto");
				System.out.println("2.-Crear pájaro propio");
				System.out.println("3.-Mostrar color de pájaro");
				System.out.println("4.-Mostrar si vuela el pájaro");
				System.out.print("Opción: ");
				opc = t.nextInt();
			}while((opc<0)||(opc>4));
			
			switch(opc) {
				case 0:		// OPCIÓN SALIR
					System.out.println("Gracias por probar la clase");
				break;
				
				case 1:		// OPCIÓN CREAR POR DEFECTO
					piolin = new pajaros();
				break;
				
				case 2:		// OPCIÓN CREAR TU PROPIO PÁJARO
					System.out.print("Dame el color: ");
					String col = t.next();
					System.out.print("Volar (false=no, true=si): ");
					boolean vol = t.nextBoolean();
					pardal = new pajaros(col, vol);
				break;
				
				case 3:		// OPCIÓN MOSTRAR COLOR
					String ver = getColor(piolin);
					System.out.println("Color de piolin: " + ver);
					ver = getColor(pardal);
					System.out.println("Color de pardal: " + ver);
				break;
				
				case 4:		// OPCIÓN MOSTRAR VOLAR
					boolean vuelo = getVolar(piolin);
					System.out.println("Vuela piolin: " + vuelo);
					vuelo = getVolar(pardal);
					System.out.println("Vuela pardal: " + vuelo);
				break;
			}
		}while(opc!=0);
		t.close();
	}
	
}
