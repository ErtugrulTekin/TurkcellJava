package inputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		File file = new File("output.dat");
//		FileOutputStream fileOutputStream = null;
//		Scanner scanner = new Scanner(System.in);
//		try {
//			fileOutputStream = new FileOutputStream(file);
//			String line = null;
//			while (!(line = scanner.nextLine()).equals("quit")) {
//				fileOutputStream.write(line.getBytes());
//			}
//		} catch (Exception exception) {
//			exception.printStackTrace();
//		} finally {
//			if (fileOutputStream != null) {
//				try {
//					fileOutputStream.close();
//				} catch (IOException exception) {
//					exception.printStackTrace();
//				}
//			}
//			scanner.close();
//		}
		
		oku();
	}

	public static void oku() {
		File file = new File("output.dat");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			int c = 0;
			while ((c = fileInputStream.read()) != -1) {
				System.out.println(c);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException excepiton) {
					excepiton.printStackTrace();
				}
			}
		}
	}
}
