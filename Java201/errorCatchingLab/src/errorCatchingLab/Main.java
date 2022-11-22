package errorCatchingLab;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		yaz();
		oku();
	}

	public static void oku() {
		File file = new File("read.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int c = 0;
			while ((c = fileReader.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException exception) {
					System.out.println(exception.getMessage());
				}
			}
		}
	}

	public static void yaz() {
		File file = new File("read.me");
		FileWriter fileWriter = null;
		Scanner scanner = new Scanner(System.in);

		try {
			fileWriter = new FileWriter(file);
			System.out.println("Lüften yazı giriniz: ");
			fileWriter.write(scanner.nextLine());
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				fileWriter.close();
			} catch (IOException exception) {
				System.out.println(exception.getMessage());
			}
			scanner.close();
		}
	}
}
