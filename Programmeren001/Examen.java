package Programmeren001;

import java.util.ArrayList;
import java.util.Scanner;

import Programmeren002.Leerling;

public class Examen {
	Scanner sc = new Scanner(System.in);
	ArrayList<Vraag> vragen = new ArrayList();

	void examenAfnemen(Leerling leerling) {
		System.out.println("Welkom bij dit geweldige examen!");
		for (int i = 0; i < vragen.size(); i++) {
			System.out.println(vragen.get(i).vraagTekst);
			if (vragen.get(i) instanceof MeerkeuzeVraag) {
				((MeerkeuzeVraag)vragen.get(i)).toonAntwoorden();
			} else {
				System.out.println("Toets h voor een hint!");
			}
			String gegevenAntwoord = sc.nextLine();
			
			boolean score = vragen.get(i).checkAntwoord(gegevenAntwoord);
			if (score) {
				leerling.uitslag++;
			}
		}
		System.out.println(leerling.uitslag + " van de " + vragen.size() + " goed!" + ((leerling.uitslag * 100) / vragen.size()) + "%");
		
	}
}
