package functionalInterfaceLab2;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba");
		Scanner scanner = new Scanner(System.in);
		Thread kullaniciGirisiThread = new Thread(() -> {
			while (true) {
				System.out.print("Giris: ");
				String line = scanner.nextLine();
				System.out.println(line.toUpperCase());
			}
		});
		kullaniciGirisiThread.start();

		while (true) {
			System.out.println(new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
