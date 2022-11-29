package setLab;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void doldur(SortedSet<Integer> integers, int sutunSayisi) {
		integers.clear();
		Random random = new Random();
		while (integers.size() < sutunSayisi) {
			int sayi = random.nextInt(49) + 1;
			integers.add(sayi);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Satir Sayisi: ");
		int satirSayisi = scanner.nextInt();
		System.out.print("Sutun Sayisi: ");
		int sutunSayisi = scanner.nextInt();
		SortedSet<Integer> integers = new TreeSet<>();
		for (int i = 0; i < satirSayisi; i++) {
			doldur(integers, sutunSayisi);
			Iterator<Integer> iterator = integers.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + "\t");
			}
			System.out.println();
		}
		scanner.close();
	}
}
