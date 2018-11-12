package Programmeren001;

import java.util.Scanner;

public class OpenVraag extends Vraag {
	String hint;

	OpenVraag(String vraagTekst, String hint, String juisteAntwoord) {
		super(vraagTekst, juisteAntwoord);
		this.hint = hint;

	}

	String getAntwoord() {
		return juisteAntwoord;
	}

	String beantwoorden(Scanner scanner) {
		System.out.println("Typ H voor een hint!");
		String gegevenAntwoord = scanner.nextLine();
		if (gegevenAntwoord.equalsIgnoreCase("h")) {
			System.out.println(hint);
			gegevenAntwoord = scanner.nextLine();
		}
		return gegevenAntwoord;
	}
}
