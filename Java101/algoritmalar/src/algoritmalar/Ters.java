package algoritmalar;

import java.util.Scanner;

public class Ters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lüften bir yazı giriniz:");
		String text = scanner.nextLine();
		
		for (int i = text.length() - 1; i >=0; i--) {
			System.out.print(text.charAt(i));
		}
		//döngü kaç sefer tekrarlanacağı belliyse for,
		//eğer belli değil ve bir koşula bağlı ise while veya do-while kullanılır.
		
		
	}

}
