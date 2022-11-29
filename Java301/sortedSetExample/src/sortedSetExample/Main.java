package sortedSetExample;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
//		SortedSet<String> sortedSet = new TreeSet<>();
//		sortedSet.add("Ahmet");
//		sortedSet.add("Mehmet");
//		sortedSet.add("Ertug");
//		sortedSet.add("Goktug");
//		sortedSet.add("Tugrul");
//		
//		Iterator<String> iterator = sortedSet.iterator();
//		while(iterator.hasNext()) {
//			String next = iterator.next();
//			System.out.println(next);
//		}

		SortedSet<Ogrenci> sortedSet = new TreeSet<>();
		sortedSet.add(new Ogrenci(5, "Ayse"));
		sortedSet.add(new Ogrenci(2, "Ahmet"));
		sortedSet.add(new Ogrenci(3, "Emre"));
		sortedSet.add(new Ogrenci(4, "Ayse2"));

		System.out.println(sortedSet.size());
		Iterator<Ogrenci> iterator = sortedSet.iterator();
		while (iterator.hasNext()) {
			Ogrenci next = iterator.next();
			System.out.println(next);
		}

	}
}
