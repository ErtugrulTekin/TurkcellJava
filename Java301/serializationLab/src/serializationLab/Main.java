package serializationLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
//		yaz();
		oku();
		
	}

	public static void oku() {
		File file = new File("araba.bin");
		if (file.exists()) {
			FileInputStream fileInputStream = null;
			ObjectInputStream objectInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				objectInputStream = new ObjectInputStream(fileInputStream);
				Araba araba = (Araba) objectInputStream.readObject();
				System.out.println(araba);

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
				} catch (Exception exception) {
					System.out.println(exception.getMessage());
				}
			}

		} else {
			System.out.println("Dosya bulunamadi!");
		}
	}

	public static void yaz() {
		Araba araba = new Araba();
		araba.setPlaka("34 AA 0123");
		araba.setMarka("X Marka");
		araba.setModel("Y Model");
		araba.setYil(2020);

		Motor motor = new Motor();
		motor.setHacim(1600);
		araba.setMotor(motor);

		System.out.println(araba);

		File file = new File("araba.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(araba);

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}
		}
	}
}
