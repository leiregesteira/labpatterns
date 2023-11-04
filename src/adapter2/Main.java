package adapter2;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient paciente=new Covid19Pacient("aitor",35, new SymptomFactory());
		paciente.addSymptomByName("disnea", 2);
		paciente.addSymptomByName("fiebre", 1);
		paciente.addSymptomByName("tos", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(paciente);
		gui.setVisible(true);
	}

}
