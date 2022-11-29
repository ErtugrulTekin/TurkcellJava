package sortedMapExample;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		SortedMap<String, String> sortedMap = new TreeMap<>();
		
		sortedMap.put("Ev", "Home");
		sortedMap.put("Kalem", "Pencil");
		sortedMap.put("Araba", "Car");

		System.out.println(sortedMap.size());

		String value = sortedMap.get("Araba");
		System.out.println(value);

		Set<String> keySet = sortedMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Key: " + key + ",Value: " + sortedMap.get(key));
		}
	}
}
