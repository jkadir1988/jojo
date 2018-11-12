package Programmeren001;

public abstract class Vraag {
	String vraagTekst;

	// String gegevenAntwoord;
	private String juisteAntwoord;

	Vraag(String vraagTekst, String juisteAntwoord) {
		this.vraagTekst = vraagTekst;
		this.juisteAntwoord = juisteAntwoord;
	}

	Vraag(String vraagTekst, String[] antwoordOpties, String juisteAntwoord) {
		this.vraagTekst = vraagTekst;
		this.juisteAntwoord = juisteAntwoord;

	}

	boolean checkAntwoord(String gegevenAntwoord) {
		if (gegevenAntwoord.equals(juisteAntwoord)) {
			System.out.println("Goed geantwoord!");
			return true;
		} else {
			System.out.println("Helaas, het goede antwoord is " + juisteAntwoord);
			return false;
		}
	}

	String getAntwoord() {
		return juisteAntwoord;
	}

}
