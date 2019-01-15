package Ejemplos;

import java.util.Scanner;

public class Peso {

	double peso;

	public Peso(double peso, String unidad) {

		peso = conversor(peso, unidad);

	}


	private static double conversor(double peso, String unidad) {

		double pes = 0;
		switch (unidad) {
		case "lb":
			pes = peso * 0.453;
			break;
		case "li":
			pes = peso * 14.59;
			break;
		case "oz":
			pes = peso * 28.35;
			break;
		case "p":
			pes = peso * 0.00155;
			break;
		case "k":
			pes = peso * 1;
			break;
		case "g":
			pes = peso * 0.001;
			break;
		case "q":
			pes = peso * 43.3;
			break;
		}
		return pes;
	}


	public static double getLibras(double peso) {
		peso = conversor(peso, "lb");
		return peso;
	}


	public static double getLingotes(double peso) {
		peso = conversor(peso, "li");
		return peso;
	}


	public static double getPeso(double peso, String unidad) {
		double pes;
		pes = Peso.conversor(peso, unidad);
		return pes;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Peso camb = null;
		int opc;
		System.out.println("----------------------------");
		System.out.println("Testeo de la clase Peso.");
		System.out.println("----------------------------");
		System.out.println();
		System.out.print("Introduzca cantidad en Kg: ");
		double peso = sc.nextDouble();
		System.out.print("Introduzca tipo de unidad a cambiar: ");
		String unidad = sc.next();
		camb = new Peso(peso, unidad);

		do {
			do {
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("Menu para testear que funcionan todo correcto.");
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("0.- Salir");
				System.out.println("1.- Devuelve el peso introducido en la medida pasada por parametro.");
				System.out.println("2.-Devuelve el peso en Libras");
				System.out.println("3.- Devuelve el peso en Lingotes");
				System.out.print("Opción: ");
				opc = sc.nextInt();
			} while ((opc < 0) || (opc > 4));
			switch (opc) {
			case 0:
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("Gracias por probar la clase");
				System.out.println("---------------------------------------------------------------------------");
				break;

			case 1:
				double pes;
				pes = getPeso(peso, unidad);
				System.out.println(pes);
				break;
			case 2:
				double pesi;
				pesi = getLibras(peso);
				System.out.println("El peso en libras es: " + pesi);
				break;
			case 3:
				double pess;
				pess = getLingotes(peso);
				System.out.println("El peso en lingotes es: " + pess);
				break;
			}
		} while (opc != 0);

	}

}