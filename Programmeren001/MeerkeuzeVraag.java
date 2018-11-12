package Programmeren001;

public class MeerkeuzeVraag extends Vraag {
	String[] antwoorden;

	MeerkeuzeVraag(String vraagTekst, String[] antwoordOpties, String juisteAntwoord) {
		super(vraagTekst, juisteAntwoord);
		this.antwoorden = antwoordOpties;
	}
	void toonAntwoorden() {
		for (int a = 0; a < antwoorden.length; a++) {
			System.out.println(antwoorden[a]);
		}
	}
}
