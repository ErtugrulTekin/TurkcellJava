package forEachLoop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		for (int i : numbers) {
//			System.out.println(i);
//		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("10 adet sayı giriniz:");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int i : numbers) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			if(i==5) {
				break;
			}
		}
	}

}
