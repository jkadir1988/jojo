package Programmeren001;

import java.util.ArrayList;

public class ExamenCommissie {
	static ArrayList<Examen> examens = new ArrayList();

	static {
		Examen examen1 = new Examen();
		examen1.vragen
				.add(new Vraag("Is de konijn een dier?", new String[] { "ja", "nee", "misschien", "soms" }, "ja"));
		examen1.vragen.add(new Vraag("Wie was de zanger van Nirvana?",
				new String[] { "lil Kleine", "Dave Grohl", "Kurt Cobain", "Murth Mossel" }, "Kurt Cobain"));
		examen1.vragen.add(new Vraag("Hoeveel dagen zitten er in een week?",
				new String[] { "Dat ligt eraan", "5", "6", "7", "8" }, "7"));
		examens.add(examen1);
	}

}
