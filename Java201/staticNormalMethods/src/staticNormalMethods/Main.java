package staticNormalMethods;

import java.util.Arrays;

public class Main {

	private static int x = 20;

	public static void main(String[] args) {
//		Main main = new Main();
//		main.normalMethod();

		/*
		 * Main.staticMethod();
		 * 
		 * Math.sqrt(4);
		 * 
		 * int max = Main.max(1, 3, 5); System.out.println(max);
		 * 
		 * double max2 = Main.max(2.0, 5.0, 7.0); System.out.println(max2);
		 * 
		 * boolean majority = Main.majority(true, false, false);
		 * System.out.println(majority);
		 * 
		 * int[] x = { 1, 2, 3, 5 }; int[] y = { 1, 2, 3, 4 };
		 * System.out.println(Main.eq(x, y));
		 * 
		 * System.out.println(Main.cube(3));
		 * 
		 * int[] numbers = { 2, 4, 6, 8 }; System.out.println(toplam(numbers));
		 * 
		 * int[] sonucCiftSayilar = Main.ciftSayilar(new int[] { 1, 2, 3, 4, 5, 6, 7, 8,
		 * 9, 0 }); System.out.println(Arrays.toString(sonucCiftSayilar));
		 */

		int x2 = 10;
		int y2 = 20;
		
		int[]sayilar = {2,3};
		System.out.println(Arrays.toString(sayilar));
		Main.degistir(sayilar);
		System.out.println(Arrays.toString(sayilar));

		/*System.out.println(x2 + " " + y2);
		degistir(x2, y2);
		System.out.println(x2 + " " + y2);*/
	}

	public static void degistir(int[] sayilar) {
		int temp = sayilar[0];
		sayilar[0] = sayilar[1];
		sayilar[1] = temp;
	}

	public static int[] ciftSayilar(int[] sayilar) {
		int[] sonuc = null;
		int adet = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				adet++;
			}

		}
		sonuc = new int[adet];
		int index = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				sonuc[index++] = sayilar[i];
			}
		}
		return sonuc;
	}

	public static int toplam(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i];
		}

		return result;
	}

	public static int cube(int x) {
		return x * x * x;
	}

	public static boolean eq(int[] x, int[] y) {
		boolean result = true;
		if (x.length == y.length) {
			for (int i = 0; i < x.length; i++) {
				if (x[i] != y[i]) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	public void normalMethod() {
		System.out.println(x);
	}

	public static void staticMethod() {
		System.out.println(x);
	}

	public static int max(int x, int y, int z) {
		int max = x;
		if (y > max)
			max = y;
		if (z > max)
			max = z;
		return max;
	}

	public static double max(double x, double y, double z) {
		double max = x;
		if (y > max)
			max = y;
		if (z > max)
			max = z;
		return max;
	}

	public static boolean majority(boolean x, boolean y, boolean z) {
		return (x && y) || (x && z) || (y && z);
	}
}
