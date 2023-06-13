package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
		
		System.out.println(notas);
		
		System.out.println("Conferir se existe no conjunto: "+ notas.contains(5d));
		
		System.out.println("Menor valor: " + Collections.min(notas));
		
		System.out.println("Maior valor: "+ Collections.max(notas));
		
		
		Iterator<Double> iterator = notas.iterator();
		
		double soma = 0;
		while(iterator.hasNext()) {
			soma+= iterator.next();
		}
		
		System.out.println("Soma dos elementos : " + soma);
		
		System.out.println("Media: " + (soma / notas.size()));
		
		System.out.println("Remove key: "+ notas.remove(0d));
		
		System.out.println(notas);
		
		iterator = notas.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			if(next < 7) iterator.remove();
		}
		
		System.out.println("Removendo notas menores que 7: "+ notas);
		
		System.out.println("Exibindo na ordem de inserção");
		Set<Double> notas2 = new LinkedHashSet<>();

		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d); //Não duplica elementos de mesmo valor
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		
		Set<Double> notas3 = new TreeSet<>(notas2); //notas 2 é composto por doubles e possuem o comparable
		System.out.println(notas3);
		
		
	}
}
