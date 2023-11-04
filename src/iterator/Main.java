package iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.InvertedIterator;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;
import domain.SymptomFactory;

import adapter.InvertedIterator;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29, new SymptomFactory());
			p.addSymptom(new Symptom("s1", 10, 8), 1);
			p.addSymptom(new Symptom("s2", 10, 10), 2);
			p.addSymptom(new Symptom("s3", 10, 5), 3);
			p.addSymptom(new Symptom("s4", 10, 10), 4);
			p.addSymptom(new Symptom("s5", 10, 10), 5);
			
			 List<Symptom> symptoms = new ArrayList<>();
			 
			symptoms.add(p.getSymptomByName("s1"));
			symptoms.add(p.getSymptomByName("s2"));
			symptoms.add(p.getSymptomByName("s3"));
			symptoms.add(p.getSymptomByName("s4"));
			symptoms.add(p.getSymptomByName("s5"));
			
			 InvertedIterator invIterator = new SymptomInvertedIterator(symptoms);
			 
			 
			 Comparator<Object> comparator = Comparator.comparing(o -> ((Symptom) o).getName());
		       

		        // Get the sorted iterator
		        Iterator<Object> sortedIterator = Sorting.sortedIterator(invIterator, comparator);

			 int count = 0;
		        while (sortedIterator.hasNext() && count < 5) {
		            Symptom symptom = (Symptom) sortedIterator.next();
		            System.out.println("Síntoma: " + symptom.getName() + ", Índice de gravedad: " + symptom.getSeverityIndex());
		            count++;
		        }
		        System.out.println("\n");
		        Comparator<Object> comparator2 = Comparator.comparing(o -> ((Symptom) o).getSeverityIndex());
		        sortedIterator = Sorting.sortedIterator(invIterator, comparator2);

				 count = 0;
			        while (sortedIterator.hasNext() && count < 5) {
			            Symptom symptom = (Symptom) sortedIterator.next();
			            System.out.println("Síntoma: " + symptom.getName() + ", Índice de gravedad: " + symptom.getSeverityIndex());
			            count++;
			        }


		}

	}