package tryCatch;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int[] numbers = {0,1,2,3,4};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Index degeriniz giriniz: ");
		int index = scanner.nextInt();
		if(index <= numbers.length) {
			System.out.println(numbers[index]);
		}else {
			System.out.println("Yanlis index numarasi");
		}
		
		
//		try {
//			System.out.println(numbers[index]);
//		} catch (Exception e) {
//			System.out.println("Yanlis index numarasi");
//		}finally {
//			scanner.close();
//		}
		
		
	}
}
