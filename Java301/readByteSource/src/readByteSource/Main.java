package readByteSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	//Dosyayı byte şeklinde okuma gerçekleştirildi
	public static void main(String[] args) {
		File file = new File("C:\\Users\\ertug\\Desktop\\duke.png");
		if (file.exists()) {
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				byte[] buffer = new byte[1024];
				int lenght = 0;
				while ((lenght = fileInputStream.read(buffer)) != -1) {
					System.out.println(Arrays.toString(buffer));
				}
			} catch (IOException exception) {
				System.out.println(exception.getMessage());
			} finally {
				if (fileInputStream != null) {
					try {
						fileInputStream.close();
					} catch (IOException exception) {
						System.out.println(exception.getMessage());
					}
				}
			}
		}
	}
}
