package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir yazı giriniz:");
		String str = scanner.nextLine();
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.substring(3));
		System.out.println(str.isEmpty());
		System.out.println(str.replace("ha", "ah"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf("ya"));
		System.out.println(str.trim());

		/*
		 * String[][] ogrenciler = new String [3][3]; ogrenciler[0][0] ="Ali";
		 * ogrenciler[0][1] ="Mehmet"; ogrenciler[0][2] ="Sinan";
		 * 
		 * ogrenciler[1][0] ="Zeynep"; ogrenciler[1][1] ="Sena"; ogrenciler[1][2]
		 * ="Ayse";
		 * 
		 * ogrenciler[2][0] ="Ahmet"; ogrenciler[2][1] ="Semih"; ogrenciler[2][2]
		 * ="Berfin";
		 * 
		 * for (int i = 0; i < ogrenciler.length; i++) { for (int j = 0; j <
		 * ogrenciler[i].length; j++) { System.out.println(i + " " + j + ":");
		 * System.out.println(ogrenciler[i][j]); } }
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Dizi uzunluğu :"); int lenght = scanner.nextInt(); int[]
		 * numbers = new int[lenght]; for (int i = 0; i < numbers.length; i++) {
		 * System.out.print((i+1) + ". Sayi:"); numbers[i] = scanner.nextInt(); }
		 * System.out.println(Arrays.toString(numbers));
		 * 
		 * int total = 0;
		 * 
		 * for (int i = 0; i < numbers.length; i++) { total = total + numbers[i]; }
		 * System.out.println(total); System.out.println(total / numbers.length);
		 */

//		int total = 0;
//		int[] numbers = { 1, 5, -5, 9, 2, 8, 9 };
//		int[] numbers2 = new int[numbers.length];
//		for (int i = 0; i < numbers2.length; i++) {
//			numbers2[i] = numbers[i];
//		}
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(numbers2));

//		for (int i = 0; i < numbers.length; i++) {
//			total = total + numbers[i];
//		}
//		System.out.println(total);

//		String[] names = new String[3];
//		names[0] = "Ali";
//		names[1] = "Ahmet";
//		names[2] = "Mehmet";
//
//		System.out.println(Arrays.toString(names));
//
//		for (int i = names.length - 1; i >= 0; i--) {
//			System.out.println(names[i]);
//		}

//		int[] numbers1 = { 1, 2, 3 };
//		System.out.println(Arrays.toString(numbers1));
//		int[] numbers2 = numbers1;
//		System.out.println(Arrays.toString(numbers2));
//
//		numbers1[0] = 5;
//		System.out.println(Arrays.toString(numbers2));

//		int[] numbers = {20,32,12,46,4};
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.binarySearch(numbers, 12));
//		
//		int[] copyOf = Arrays.copyOf(numbers, 10);
//		System.out.println(Arrays.toString(copyOf));
//		
//		int[] copyOfRange = Arrays.copyOfRange(numbers, 2, 4);
//		System.out.println(Arrays.toString(copyOfRange));
//		
////		Arrays.fill(numbers, 44);
////		System.out.println(Arrays.toString(numbers));
//		
//		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));
//		
	}

}
