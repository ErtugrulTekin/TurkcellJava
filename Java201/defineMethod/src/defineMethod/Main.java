package defineMethod;

import java.util.Scanner;

public class Main {

	public static void merhaba() {
		System.out.println("Merhaba");
	}

	public int topla(int x, int y) {
		int toplam = x + y;
		return toplam;
	}

	public static void main(String[] args) {
		/*
		 * Main main = new Main(); main.merhaba();
		 */
		
		/*
		merhaba();

		Main main = new Main();

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int sonuc = main.topla(a, b);
		System.out.println(sonuc);
	*/
		
		Calculator calculator = new Calculator();
		float toplama = calculator.topla(4.0f, 6.0f);
		System.out.println(toplama);
		
		System.out.println(calculator.cıkar(6.0f, 2.0f));
		System.out.println(calculator.carp(5.0f, 7.0f));
		System.out.println(calculator.bol(9.0f, 2.0f));
		System.out.println(calculator.kare(6));
		System.out.println(calculator.karekok(9));
		
	}

}
