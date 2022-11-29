package mapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(34, "Istanbul");
		hashMap.put(35, "Izmir");
		hashMap.put(6, "Ankara");
		// hashMap.put(34, "Istanbul2");

		System.out.println(hashMap.size());

		String string = hashMap.get(10);
		System.out.println(string);

		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.print(key + " ");
			String value = hashMap.get(key);
			System.out.println(value);
		}
	}
}
