package algoritmalar;

import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lüften yarıçapı giriniz:");
		int yariCap= scanner.nextInt();
		//alanı pi*r2
		//cevresi 2pir
		
		float alan = (float)(Math.PI * Math.pow(yariCap, 2));
		float cevre = (float)(2 * Math.PI * yariCap);
		
		System.out.println(alan);
		System.out.println(cevre);
		

	}

}
