package Programmeren001;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ExamenPoging {
	Examen examen;
	LocalDateTime startTijd;
	LocalDateTime eindTijd;
	public static ArrayList<String> gegevenAntwoorden = new ArrayList<>();

	public ExamenPoging(Examen ex) {
		examen = ex;
		startTijd = LocalDateTime.now();
	}
}
