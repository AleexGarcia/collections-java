package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ordenacao {
	public static void main(String[] args) {
		System.out.println("Ordem Aleatoria!");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma breve historia do tempo",45));
			put("Duhigg, Charles", new Livro("O poder do habito",245));
			put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21",98));
		}};
		
		for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().toString());
		}
		
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma breve historia do tempo",45));
			put("Duhigg, Charles", new Livro("O poder do habito",245));
			put("Harari, Yuval Noah", new Livro("21 lições para o seculo 21",98));
		}};
		
		System.out.println("\n\nOrdem  inserção ");
		
		for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().toString());
		}
		
		System.out.println("\n\nOrdem alfabética dos autores");
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
		
		for(Map.Entry<String, Livro> livro : meusLivros3.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().toString());
		}
		
		System.out.println("\n\n Ordem alfabéeticas dos nomes dos livros");
		
		Set<Map.Entry<String,Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
		meusLivros4.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros4) {
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


class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}
	
}
