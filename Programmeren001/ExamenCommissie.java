package Programmeren001;

import java.util.ArrayList;

public class ExamenCommissie {
	public static ArrayList<Examen> examens = new ArrayList();

	static {
		Examen examen1 = new Examen();
		examen1.vragen.add(
				new MeerkeuzeVraag("Is de konijn een dier?", new String[] { "ja", "nee", "misschien", "soms" }, "ja"));
		examen1.vragen.add(new MeerkeuzeVraag("Wie was de zanger van Nirvana?",
				new String[] { "lil Kleine", "Dave Grohl", "Kurt Cobain", "Murth Mossel" }, "Kurt Cobain"));
		examen1.vragen.add(new MeerkeuzeVraag("Hoeveel dagen zitten er in een week?",
				new String[] { "Dat ligt eraan", "5", "6", "7", "8" }, "7"));
		examen1.vragen
				.add(new OpenVraag("Wat is de hoofdstad van Overijsel?\n ", "Hint. Klinkt als Twello.", "Zwello"));
		examens.add(examen1);
	}

}
