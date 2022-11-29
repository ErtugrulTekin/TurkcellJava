package streamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Istanbul");
		arrayList.add("Ankara");
		arrayList.add("Bursa");
		arrayList.add("Adana");
		arrayList.add("Izmir");
		
		arrayList.stream()
		.filter((s) -> s.startsWith("A"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);

//		Stream<String> stream = arrayList.stream();
//		Stream<String> stream2 = stream.filter(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.startsWith("I");
//			}
//		});
//		Stream<String> stream3 = stream2.map(new Function<String, String>() {
//
//			@Override
//			public String apply(String t) {
//				return t.toUpperCase();
//			}
//		});
//
//		Stream<String> stream4 = stream3.sorted(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
//		stream4.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//
//			}
//		});
	}
}
