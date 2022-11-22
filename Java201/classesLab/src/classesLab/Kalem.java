package classesLab;

public class Kalem {
	
	String marka;
	String tip;
	boolean doldurabilir;
	boolean silinebilir;
	
	void yaz(String metin) {
		System.out.println(metin);
	}
	
	void tekrarDoldur() {
		if(doldurabilir) {
			System.out.println("Kalem dolduruldu");
		}else {
			System.out.println("Bu kalem doldurulamaz");
		}
	}
	
	void sil() {
		if(silinebilir) {
			System.out.println("Yazi silindi");
		}else {
			System.out.println("Bu yazi silinemez");
		}
	}
}
