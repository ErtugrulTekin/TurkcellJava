package writeAnObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void oku() {
		File file = new File("ogrenci.bin");
		if (file.exists()) {
			FileInputStream fileInputStream = null;
			ObjectInputStream objectInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				objectInputStream = new ObjectInputStream(fileInputStream);
				Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();
				System.out.println(ogrenci);
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			} finally {
				try {
					if (objectInputStream != null) {
						objectInputStream.close();
					}
					if (fileInputStream != null) {
						fileInputStream.close();
					}
				} catch (Exception excepiton) {
					System.out.println(excepiton.getMessage());
				}
			}

		} else {
			System.out.println("Dosya bulunamadi");
		}
	}

	public static void yaz() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setNumara(1);
		ogrenci.setAd("Goktug");
		ogrenci.setSoyad("Caliskan");
		ogrenci.setSinif("1-A");
		System.out.println(ogrenci);

		File file = new File("ogrenci.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(ogrenci);

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
//		yaz();
		oku();
	}
}
