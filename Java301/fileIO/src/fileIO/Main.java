package fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya yolu : ");
		String filePath = scanner.nextLine();
		File file = new File(filePath);
		if (!file.exists()) {
			try {
				boolean fileCreated = file.createNewFile();
				if (fileCreated) {
					System.out.println("Dosya Olusturuldu");
				}
			} catch (IOException exception) {
				System.out.println(exception.getMessage());
			}
			// Bu satıra kadar Dosya yolunu ve dosya oluşturmak için gerekli kodlar yazıldı.

			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(file);
				String line = null;
				do {
					line = scanner.nextLine();
					fileWriter.write(line);
					fileWriter.write(System.lineSeparator()); // Dosya içine yazdırmada enter yaptığımızda boşluk
																// bırakır.
				} while (!line.equals("quit")); // "quit" kelimesini yazdığımız zaman dosya içine yazdırmayı
												// sonlandırıyor.Anahtar kelime oluşturmuş olduk.

			} catch (IOException exception) {
				System.out.println(exception.getMessage());
			} finally {
				if (fileWriter != null) {
					try {
						fileWriter.close();
					} catch (IOException excepiton) {
						System.out.println(excepiton.getMessage());
					}
				} // 26.satırdan 45.satıra kadar dosya içine yazma işlemleri için kodlar yazıldı.
			}
			scanner.close();
			System.out.println("Dosya yazdirma basarili");
			System.out.println("Dosya boyutu " + filePath.length() + " byte");
		}
	}
}
