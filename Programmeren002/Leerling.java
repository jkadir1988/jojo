package Programmeren002;

import java.util.ArrayList;

import Programmeren001.ExamenCommissie;
import Programmeren001.ExamenPoging;

public class Leerling {
	String naam;
	public int uitslag;
	public static ArrayList<ExamenPoging> geschiedenis = new ArrayList<>();

	public Leerling(String naam) {
		this.naam = naam;
	}

	public void examenMaken() {
		System.out.println("Veel succes " + naam);

		geschiedenis.add(new ExamenPoging(ExamenCommissie.examens.get(0)));
	}
}
