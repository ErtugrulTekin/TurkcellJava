package setLab3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SortedSet<Ogrenci> sortedSet = new TreeSet<>();
		System.out.println("Ogrenci eklemek icin (E), uygulamadan cikmak icin (X)");

		String line = null;
		while ((line = scanner.nextLine()).equals("E")) {
			System.out.print("Numara: ");
			int numara = Integer.parseInt(scanner.nextLine());
			System.out.print("Ad: ");
			String ad = scanner.nextLine();
			System.out.print("Soyad: ");
			String soyad = scanner.nextLine();
			System.out.print("Sinif: ");
			String sinif = scanner.nextLine();

			sortedSet.add(new Ogrenci(numara, ad, soyad, sinif));
			System.out.println("Ogrenci eklemek icin (E), uygulamadan cikmak icin (X)");
		}

		System.out.println("Toplam Ogrenci Sayisi: " + sortedSet.size());
		Iterator<Ogrenci> iterator = sortedSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
