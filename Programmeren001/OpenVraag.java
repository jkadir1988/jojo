package Programmeren001;

public class OpenVraag extends Vraag {
	String hint;

	OpenVraag(String vraagTekst, String hint, String juisteAntwoord) {
		super(vraagTekst, juisteAntwoord);
		this.hint = hint;
	}

}
