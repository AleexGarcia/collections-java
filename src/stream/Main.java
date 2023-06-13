package stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 45));
				put("Duhigg, Charles", new Livro("O poder do habito", 245));
				put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21", 98));
			}
		};

		Set<Map.Entry<String, Livro>> setLivros = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() {
			@Override
			public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
				return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
			}
		});

		setLivros.addAll(meusLivros2.entrySet());
		System.out.println("\n\n Ordenado pelo numero de paginas usando class anonima");
		for (Map.Entry<String, Livro> livro : setLivros) {
			System.out.println(livro.getKey() + " - " + livro.getValue().toString());
		}

		Set<Map.Entry<String, Livro>> setLivros2 = new TreeSet<>(
				Comparator.comparing(new Function<Map.Entry<String, Livro>, String>() {
					@Override
					public String apply(Entry<String, Livro> nomeLivro) {
						return nomeLivro.getValue().getNome();
					}
				}));

		setLivros2.addAll(meusLivros2.entrySet());
		System.out.println("\n\n Ordenado pelo nome usando function");
		for (Map.Entry<String, Livro> livro : setLivros2) {
			System.out.println(livro.getKey() + " - " + livro.getValue().toString());
		}

		Set<Map.Entry<String, Livro>> setLivros3 = new TreeSet<>(
				Comparator.comparing(livro -> livro.getValue().getNome()
				));
		
		setLivros3.addAll(meusLivros2.entrySet());
		System.out.println("\n\n Ordenado pelo nome usando lambda");
		for (Map.Entry<String, Livro> livro : setLivros3) {
			System.out.println(livro.getKey() + " - " + livro.getValue().toString());
		}
		
	}

}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}

}