package list;

import java.util.Comparator;

import list.model.Gato;

public class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato o1, Gato o2) {
		
		return o1.getCor().compareToIgnoreCase(o2.getCor());
		
	}

}
