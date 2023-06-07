package list;

import java.util.Comparator;

import list.model.Gato;

public class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato o1, Gato o2) {
		
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}

}
