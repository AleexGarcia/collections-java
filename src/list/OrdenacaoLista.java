package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.model.Gato;

public class OrdenacaoLista {
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>();
		
		meusGatos.add(new Gato("Jon",18,"preto"));
		meusGatos.add(new Gato("Simba",6,"tigrado"));
		meusGatos.add(new Gato("Jon",12,"amarelo"));
		
		System.out.println("Ordem de inserção: ");
		System.out.println(meusGatos);
		
		System.out.println("Ordem aleatoria: ");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordenar natural: ");
		Collections.sort(meusGatos);;
		System.out.println(meusGatos);

		System.out.println("Ordenar por idade: ");
		//Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordenar por Cor: ");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("Ordenar por NomeCorIdade: ");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
}
