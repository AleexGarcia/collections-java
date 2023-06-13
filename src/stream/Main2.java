package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main2 {
	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
		
		System.out.println("Imprima todos os elementos: ");
		 numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t);
			}
		 });
		 
		 System.out.println("\nforeach com lambda");
		 numerosAleatorios.forEach(s -> System.out.print(s));
		 System.out.println("\nforeach com reference method");
		 numerosAleatorios.forEach(System.out::print);
		 
		 System.out.println("\nPegue os 5 primeiros numeros e coloque dentro de um set: ");
		 
		 numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::print);
		 
		 System.out.println("\nTransforme esta lista de String em uma lista de números inteiros");
		 
		List<Integer> collectList = numerosAleatorios.stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList());
		
		collectList.forEach(System.out::print);
		
		System.out.println("\nNumeros pares maiores que 2");
		
		List<Integer> paresMaioresQueDois = numerosAleatorios.stream().map(e -> Integer.parseInt(e)).filter(e -> e % 2 == 0 && e > 2).collect(Collectors.toList());
		
		System.out.println(paresMaioresQueDois);
		
		System.out.println("Mostre a media dos numeros");
		
		numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out :: println);
		
		System.out.println("remova os numeros impares: ");
		System.out.println(collectList);
		collectList.removeIf(e -> e % 2 != 0);
		
		System.out.println(collectList);
		
		
		
	}
}
