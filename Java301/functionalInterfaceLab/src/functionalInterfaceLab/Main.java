package functionalInterfaceLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(new Ogrenci(1, "Ali Can", 80));
		ogrenciler.add(new Ogrenci(2, "Seyhan Caliskan", 90));
		ogrenciler.add(new Ogrenci(3, "Ertug Yilmaz", 50));
		ogrenciler.add(new Ogrenci(0, "Goktug Sancak", 70));

		ogrenciler.forEach((o) -> System.out.println(o));

//		Collections.sort(ogrenciler, new Comparator<Ogrenci>() {
//
//			@Override
//			public int compare(Ogrenci o1, Ogrenci o2) {
//				return o1.getNotOrtalamasi() - o2.getNotOrtalamasi();
//			}
//		});

		Collections.sort(ogrenciler, (a, b) -> b.getAd().compareTo(a.getAd()));

		System.out.println("-------------------------------");
		ogrenciler.forEach((o) -> System.out.println(o));
	}
}
