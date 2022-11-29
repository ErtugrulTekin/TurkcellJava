package hashSetExample;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
//		HashSet<String> hashSet = new HashSet<String>();
//		hashSet.add("Istanbul");
//		hashSet.add("Ankara");
//		hashSet.add("Bursa");
//		hashSet.add("Istanbul");
//		
//		System.out.println(hashSet.size());
//		
//		Iterator<String> iterator = hashSet.iterator();
//		while (iterator.hasNext()) {
//			String next = iterator.next();
//			System.out.println(next);
//		}
		
		HashSet<Calısan> hashSet = new HashSet<Calısan>();
		hashSet.add(new Calısan("1", "Ali"));
		hashSet.add(new Calısan("2", "Seyhan"));
		hashSet.add(new Calısan("1", "Ayse"));
		hashSet.add(new Calısan("1", "Ali"));
		
		Iterator<Calısan> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Calısan calısan = iterator.next();
			System.out.println(calısan.hashCode());
		}
	}
}
