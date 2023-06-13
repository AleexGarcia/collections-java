package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<String, Double> carrosPopulares = new HashMap<>();
		carrosPopulares.put("Gol", 14.4);
		carrosPopulares.put("Uno", 14.6);
		carrosPopulares.put("Mobi", 15.1);
		carrosPopulares.put("Hb20", 16.3);
		carrosPopulares.put("Kwid", 17.8);
		
		System.out.println(carrosPopulares);
		
		carrosPopulares.put("Gol", 12.2);
		
		System.out.println(carrosPopulares);
		
		System.out.println("Existe a key Mobi: " + carrosPopulares.containsKey("Mobi"));
		
		System.out.println("Consumo do Uno" + carrosPopulares.get("Uno"));
		
		System.out.println("keys = " + carrosPopulares.keySet());
		
		System.out.println("values = " + carrosPopulares.values());
		
		Double melhorConsumo = Collections.max(carrosPopulares.values());
		
		System.out.println("Mais km/l " + melhorConsumo);
		
		Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
		String carroMelhorConsumo = "";
		for(Map.Entry<String,Double> entry : entries) {
			if(entry.getValue().equals(melhorConsumo)) {
				carroMelhorConsumo = entry.getKey();
			}
		}
		
		System.out.println("Carro com melhor consumo: " + carroMelhorConsumo);
		
		Double consumoMenosE = Collections.min(carrosPopulares.values());
		String carrosMenosE = "";

		for(Map.Entry<String,Double> entry : entries) {
			if(entry.getValue().equals(consumoMenosE)) {
				carrosMenosE = entry.getKey();
				System.out.println("Modelo: " + carrosMenosE);
			}
		}
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		
		while (iterator.hasNext()) {
			if(iterator.next().equals(15.1)) {
				iterator.remove();
			}
		}
		
		
	}
}
