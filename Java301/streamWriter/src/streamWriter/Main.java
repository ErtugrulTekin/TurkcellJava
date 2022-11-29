package streamWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		oku();
	}

	public static void oku() {
		File file = new File("test.txt");
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileInputStream = new FileInputStream(file);
			inputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException exception) {
					System.out.println(exception.getMessage());
				}
			}
			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
				} catch (IOException exception) {
					System.out.println(exception.getMessage());
				}
			}
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException exception) {
					System.out.println(exception.getMessage());
				}
			}
		}

	}

	public static void yaz() {
		File file = new File("test.txt");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			outputStreamWriter.write("Merhaba, Dünya");
			outputStreamWriter.close();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException exception) {
					System.out.println(exception.getMessage());
				}
			}
		}
	}
}
