package Programmeren001;



public class Vraag {
	String vraagTekst;
	String[] antwoorden;
	String gegevenAntwoord;
	private String juisteAntwoord;

	Vraag(String vraagTekst, String[] antwoordOpties, String juisteAntwoord) {
		this.vraagTekst = vraagTekst;
		antwoorden = antwoordOpties;
		this.juisteAntwoord = juisteAntwoord;

	}

	boolean checkAntwoord(String gegevenAntwoord) {
		if (gegevenAntwoord.equals(juisteAntwoord)) {
			System.out.println("Goed geantwoord!");
			return true;
		}else {
			System.out.println("Helaas, het goede antwoord is " + juisteAntwoord);
			return false;
		}	
	}

	String getAntwoord() {
		return juisteAntwoord;
	}

	void toonAntwoorden() {
		for (int a = 0; a < antwoorden.length; a++) {
			System.out.println(antwoorden[a]);
		}
	}

}
