package observer;

import java.util.Observable;

import observer.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		observer.Covid19Pacient	pacient=new	Covid19Pacient("aitor",	35);
		new	PacientObserverGUI	(pacient);
		new	PacientSymptomGUI	((Covid19Pacient)pacient);
	}


}
