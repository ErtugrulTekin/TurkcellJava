package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("1. sayı giriniz: ");
			int x = scanner.nextInt();
			System.out.print("2. sayı giriniz: ");
			int y = scanner.nextInt();
			int sonuc = x / y;
			System.out.println("Sonuc: " + sonuc);
		} catch (ArithmeticException exception) {
			System.out.println(exception.getLocalizedMessage());
			System.out.println(exception.getMessage());
			exception.printStackTrace();
			
			System.out.println("0'a bölünemez");
		}catch (InputMismatchException exception) {
			System.out.println("Lüften bir sayı giriniz");
		}finally {
			scanner.close();
			System.out.println("Finally");
		}
		System.out.println("Uygulama kapandı");
	}
}
