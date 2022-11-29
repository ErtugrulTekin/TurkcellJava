package readCharArray;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Ertug\\Desktop\\lorem.txt");
		if (file.exists()) {
			FileReader fileReader = null;
			try {
				// 1.Bu yöntem ile file dosyası içeriğini okuyabiliyoruz fakat daha okuma süresi
				// daha uzun sürüyor.
				fileReader = new FileReader(file);
				int c = 0;
				long now = System.currentTimeMillis();
//				while((c = fileReader.read()) != -1) {
//					System.out.print((char)c);
//				}
//				System.out.println();
//				System.out.println(System.currentTimeMillis() - now);

				// 2.Bu yöntem ile file dosyası içeriğini okuyabiliyoruz ve bu yöntem ile daha
				// kısa sürede ve bellekte ne kadar alan kullanabileceğini sınırlamış oluyoruz.

				char[] buffer = new char[1024];
				int lenght = 0;
				StringBuilder builder = new StringBuilder();
				while ((lenght = fileReader.read(buffer)) != -1) {
					builder.append(Arrays.copyOfRange(buffer, 0, lenght));
				}
				System.out.println(builder.toString());
				System.out.println(System.currentTimeMillis() - now); //dosyanın ne kadar sürede okunduğunu bize söylüyor
			} catch (Exception exception) {
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
		} else {
			System.out.println("Dosya bulunamadi!");
		}
	}
}
