package consoleWriteAndRead;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba, Dunya");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println(line);
		
		String parola = scanner.nextLine();
	}
}
