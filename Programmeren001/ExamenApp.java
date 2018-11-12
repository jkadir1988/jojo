package Programmeren001;

import java.util.ArrayList;
import java.util.Scanner;

import Programmeren002.Leerling;

public class ExamenApp {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Leerling> leerlingen = new ArrayList<>();

	public static void main(String[] args) {
		ExamenApp ea = new ExamenApp();
		ea.starten();

	}

	void starten() {
		boolean stoppen = false;
		while (!stoppen) {
			System.out.println(printMenu());
			int keuze = scanner.nextInt();
			switch (keuze) {
			case 1:
				for(int i = 0; i < Leerling.geschiedenis.get(0).gegevenAntwoorden.size();i++) {
					System.out.println(Leerling.geschiedenis.get(0).gegevenAntwoorden.get(i).toString());
				}
				
				break;
			case 2:
				System.out.println("beginnen");
				String jenaam = scanner.next();
				Leerling leerling = new Leerling(jenaam);
				ExamenCommissie.examens.get(0).examenAfnemen(leerling);
				leerlingen.add(leerling);
				break;
			case 3:
				stoppen = true;
				break;
			default:
				System.out.println("kies jojo kneus");
			}
		}
	}

	String printMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("1. Invoeren Nakijken Overzicht examens\n");
		sb.append("2. Examen afnemen");
		return sb.toString();
	}

}
