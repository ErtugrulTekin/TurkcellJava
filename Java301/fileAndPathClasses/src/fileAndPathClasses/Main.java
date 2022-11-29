package fileAndPathClasses;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		File file = new File("C:\\Users\\ertug\\Desktop\\sample.txt");
//		System.out.println(file.exists()); // dosyanın olup olmadığını söyler
//		System.out.println(file.canRead()); // okuma izninin olup olmadığı
//		System.out.println(file.canWrite()); // yazma izninin olup olmadığı
//		System.out.println(file.isDirectory()); // Bu kaynağınn dosya olup olmadıüı kontrol edilir
//		System.out.println(file.getAbsolutePath()); // dosyanın bulunduğu tam konumu verir
//		System.out.println(file.getParent()); // bir üst klasörünü gösterir
//		System.out.println(file.length()); // dosyanın içerindekki byte sayısını verir
//		System.out.println(new Date(file.lastModified())); // dosyanın üzerinde ne zaman işlem yapıldığını verir
//
//		File file2 = new File("C:\\Users\\ertug\\Desktop\\ornek.txt");
//		if(!file2.exists()) {
//			try {
//				file2.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		if (file2.exists()) {
//			boolean silindimi = file2.delete();
//			System.out.println(silindimi);
//		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya Yolu : ");
		String path = scanner.nextLine();

		File file = new File(path);
		String[] icerik = file.list();
		for (int i = 0; i < icerik.length; i++) {
			System.out.println(icerik[i]);
		}
		scanner.close();
	}
}
