package setLab2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cikmak icin -1 giriniz");
		LinkedHashSet<Integer> integers = new LinkedHashSet<>();
		int i = 0;
		while ((i = scanner.nextInt()) != -1) {
			integers.add(i);
		}
		System.out.println("Sayi Adedi: " + integers.size());
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		scanner.close();
	}
}
