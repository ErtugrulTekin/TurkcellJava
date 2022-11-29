package sortedMapExample;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class KisiMain {

	public static void main(String[] args) {
		SortedMap<Integer, Kisi> sortedMap = new TreeMap<>();
		sortedMap.put(3, new Kisi("345", "Ahmet", "Guler", Cinsiyet.ERKEK));
		sortedMap.put(1, new Kisi("123", "Ali", "Can", Cinsiyet.ERKEK));
		sortedMap.put(2, new Kisi("234", "Zeynep", "Caliskan", Cinsiyet.KADIN));
		
		
		System.out.println(sortedMap.size());
	
		Set<Entry<Integer,Kisi>> entrySet = sortedMap.entrySet();
		Iterator<Entry<Integer, Kisi>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer,Kisi> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
	}
}
