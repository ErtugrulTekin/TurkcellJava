package fileStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			int c = 0;
			while((c = fileInputStream.read()) != -1 ) {
				System.out.print((char)c);
			}
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
		
//		FileOutputStream fileOutputStream = null;
//		try {
//			fileOutputStream = new FileOutputStream(file);
//			fileOutputStream.write("Merhaba".getBytes());
//		}catch (IOException exception) {
//			System.out.println(exception.getMessage());
//		}finally {
//			if(fileOutputStream != null) {
//				try {
//					fileOutputStream.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}
