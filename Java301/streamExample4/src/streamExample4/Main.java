package streamExample4;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<Ogrenci> arrayList = new ArrayList<>();
		arrayList.add(new Ogrenci(1, "Ali Can", 16));
		arrayList.add(new Ogrenci(3, "Tugrul Caliskan", 7));
		arrayList.add(new Ogrenci(2, "Zeynep Guler", 14));
		arrayList.add(new Ogrenci(4, "Seyhan Kosar", 7));
		
//		List<Ogrenci> collect = arrayList.stream()
//		.filter((o)-> o.getYas() > 8)
//		.collect(Collectors.toList());
//		
//		collect.forEach(System.out::println);
		
//		Map<Integer, List<Ogrenci>> gruplama = arrayList
//				.stream()
//				.collect(Collectors.groupingBy(o->o.getYas()));
//		
//		Set<Integer> keySet = gruplama.keySet();
//		Iterator<Integer> iterator = keySet.iterator();
//		while (iterator.hasNext()) {
//			Integer key = iterator.next();
//			System.out.println(key + " " + gruplama.get(key));
//		}
		
//		double yasOrtalamasi = arrayList.stream()
//			.collect(Collectors.averagingInt(o->o.getYas()));
//		System.out.println(yasOrtalamasi);
		
		IntSummaryStatistics statistics = arrayList.stream()
		.collect(Collectors.summarizingInt(o->o.getYas()));
		System.out.println(statistics);
		
		
		
	}
}
