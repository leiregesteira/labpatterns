package iterator;

import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class SymptomInvertedIterator implements InvertedIterator {
	
	private List<Symptom> symptoms;
    private int position;

    public SymptomInvertedIterator(List<Symptom> symptoms) {
        this.symptoms = symptoms;
        this.position = symptoms.size() - 1; // Start from the last element
    }
	@Override
	public Object previous() {
		if (hasPrevious()) {
            return symptoms.get(position--);
        } else {
            return null; // Or handle the case when there are no more elements
        }
	}

	@Override
	public boolean hasPrevious() {
		return position >= 0;
	}

	@Override
	public void goLast() {
		position = symptoms.size() - 1;

	}

}