package fileIOLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	// 1.inputFile ile olan dosyayı okuduk console yazdırdık
	// 2.outputFile ie ayrı bir dosya oluşturup daha önce olan dosya içerisinde
	// metni hepsini toUpperCase kodu ile büyük harfe çevirdik
	public static void main(String[] args) {
		File inputFile = new File("C:\\Users\\Ertug\\Desktop\\lorem.txt");
		File outputFile = new File("C:\\Users\\Ertug\\Desktop\\lorem_output.txt");
		if (inputFile.exists()) {
			FileInputStream fileInputStream = null;
			FileOutputStream fileOutputStream = null;
			try {
				fileInputStream = new FileInputStream(inputFile);
				fileOutputStream = new FileOutputStream(outputFile);
				int c = 0;
				while ((c = fileInputStream.read()) != -1) {
					char ch = (char) c;
					fileOutputStream.write(Character.toUpperCase(ch));
				}
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			} finally {
				if (fileInputStream != null) {
					try {
						fileInputStream.close();
					} catch (IOException exception) {
						System.out.println(exception.getMessage());
					}
				}
				if (fileOutputStream != null) {
					try {
						fileOutputStream.close();
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
