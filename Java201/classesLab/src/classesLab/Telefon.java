package classesLab;

public class Telefon {
	TelefonTipi tip;
	String marka;
	String model;
	boolean wifi;
	boolean mobilVeri;

	boolean aramaVarmi;

	void aramaYap(String telefonNumaras─▒) {
		System.out.println(telefonNumaras─▒);
		aramaVarmi = true;
	}

	void aramayiSonlandir() {
		if (aramaVarmi) {
			System.out.println("Arama sonlandirildi");
		}
	}

	void mesajGonder(String mesaj) {
		if (mobilVeri || wifi) {
			System.out.println("Mesaj gonderildi");
		}
	}
}
