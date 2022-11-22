package polymorphism3;

public class Main {

	public static void main(String[] args) {
//		Calisan calisan = new Calisan("Ali Can", "IT Müdürü", 2200);
//		calisan.ozet();
//
//		Memur memur = new Memur("Tugrul Calıskan", "Yazılımcı", 3300);
//		memur.setBirim("E-Ticaret");
//		
//		memur.ozet();

		Calisan calisan = new Memur("Tugrul Calıskan", "Yazılımcı", 3300, "E-Ticaret");
		calisan.ozet();
	}

}
