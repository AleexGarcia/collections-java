package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
ArrayList(Arrays Dinamicos) deve ser usado onde mais operações de pesquisa são necessárias, e LinkedList (Duplamente encadeada)
deve ser usado onde mais operações de inserção e exclusão são necessarias. 
*/
public class Lista {
	public static void main(String[] args) {		
		List<Double> notas = new ArrayList<>();
		
		double i = 0;
		while(i < 10) {
			notas.add(++i + 0.2*i);
		}
		
		System.out.println(notas.toString());
		
		System.out.println("Exiba o posição da nota 7.2: "+ notas.indexOf(7.2));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4");
		
		notas.add(4,8.0);
		
		System.out.println(notas.toString());
		
		System.out.println("Substituir a nota 7.2 pela nota 10.0");
		
		notas.set(notas.indexOf(7.2), 10.0);
		
		System.out.println(notas.toString());
		
		System.out.println("Conferir se exibe a nota 7.2 na lista: "+ notas.contains(7.2));
		
		//for(double nota : notas) System.out.println(nota);
		
		System.out.println("Exiba o terceira nota add: " + notas.get(2));
		
		System.out.println("Exiba Menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba Maior nota: " + Collections.max(notas));
		
		double soma = 0d;
		Iterator<Double> iterator = notas.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma+= next;
		}
		
		System.out.println("Exiba a soma dos valores: " + soma );
		
		System.out.printf("Exiba a média das somas: %.2f",(soma/notas.size()));
		
		System.out.println("Remova a nota na posicao 0: ");
		notas.remove(0);
		System.out.println(notas.toString());
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		
		iterator = notas.iterator();
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			if(next < 7) iterator.remove();
		}
		
		System.out.println(notas);
		
		System.out.println("Apagar toda a lista: " );
		notas.clear();
		System.out.println(notas);
		System.out.println("Checar se a lista está vazia: " + notas.isEmpty());
		
	} 
	
}
