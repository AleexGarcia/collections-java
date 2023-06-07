package list.exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Double> temperaturas = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int i = 0;
		while(i < 6) {
			try {				
				System.out.println("Informe a temperatura do mes "+ (i + 1));
				double n = input.nextDouble();
				temperaturas.add(n);
				i++;
			}catch(InputMismatchException err) {
				System.out.println("O valor fornecido deve ser do tipo double");
				input.nextLine();
			}
		}
		double soma = 0;
		Iterator<Double> iterator = temperaturas.iterator();
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma+= next;
		}
		double mediaSemestral = soma/temperaturas.size();
		 i = 0;
		for(Double temperatura: temperaturas) {
			List<String> meses = new ArrayList<>();
			meses = List.of("Janeiro","Fevereiro","Março","Abril", "Maio","Junho");

			if(temperatura > mediaSemestral) System.out.println((i + 1) + " - " + meses.get(i));
			i++;
		}
		input.close();
	}
}
