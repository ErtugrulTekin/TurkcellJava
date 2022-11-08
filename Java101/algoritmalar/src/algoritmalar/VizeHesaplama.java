package algoritmalar;

import java.util.Scanner;

public class VizeHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vize Notu:");
		int vizeNotu = scanner.nextInt();
		System.out.print("Final Notu:");
		int finalNotu = scanner.nextInt();

		float ortalama = (vizeNotu * 0.4f) + (finalNotu * 0.6f);
		if(ortalama >= 50 && finalNotu >=50) {
			System.out.println("Tebrikler, Geçtiniz");
		}else {
			System.out.println("Üzgünüm, Kaldınız");
		}
	}
}
