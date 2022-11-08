package algoritmalar;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz:");
		double number = scanner.nextInt();
		
		//5!=5*4*3*2*1
		double sonuc = number;
		for (double i = number - 1; i > 0; i--) {
			sonuc = sonuc * i;
			
		}

		System.out.println(sonuc);
	}

}
