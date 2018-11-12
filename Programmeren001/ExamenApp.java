package Programmeren001;

import java.util.Scanner;

import Programmeren002.Leerling;

public class ExamenApp {
	Scanner scanner = new Scanner(System.in); 
	Examen examen = new Examen();
	Leerling leerling = new Leerling();
	public static void main(String[] args) {
		
		ExamenApp ea = new ExamenApp();
		
		ea.starten();
	}
	void starten() {
		System.out.println(printMenu());
		int keuze = scanner.nextInt();
		switch(keuze) {
		case 1:
			System.out.println("jojo 1");
			break;
		case 2:
			System.out.println("jojo 2");
			examen.examenAfnemen(leerling);
			break;
		default:
			System.out.println("kies jojo kneus");
		}
	}
	String printMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("1. Invoeren Nakijken Overzicht examens\n");
		sb.append("2. Examen afnemen");
		
		return sb.toString();
	}

}

