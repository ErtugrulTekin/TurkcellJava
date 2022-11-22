package superFinalThisLab;

public class Main {

	public static void main(String[] args) {
		Arac arac = new Arac("34 TT 12345", "X Marka");
		arac.yazdir();
		System.out.println("---------------");
		Araba araba = new Araba("34 EE 12345", "Y Marka", 4, 5);
		araba.yazdir();
	}
}
