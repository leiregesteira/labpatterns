package adapter2;



import javax.swing.JFrame;

import domain.*;
//import jframeAdapter.Covid19PacientModelAdapter;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient paciente=new Covid19Pacient("aitor",35, new SymptomFactory());
		paciente.addSymptomByName("disnea", 2);
		paciente.addSymptomByName("fiebre", 1);
		paciente.addSymptomByName("nauseas", 3);
		
		Covid19Pacient paciente2=new Covid19Pacient("maria",30, new SymptomFactory());
		paciente2.addSymptomByName("diarrea", 2);
		paciente2.addSymptomByName("fiebre", 1);
		paciente2.addSymptomByName("mialgia", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(paciente);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 gui.pack();
		gui.setVisible(true);
		

		ShowPacientTableGUI gui2=new ShowPacientTableGUI(paciente2);
		gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 gui2.pack();
		gui2.setVisible(true);
	}
	
	
}
