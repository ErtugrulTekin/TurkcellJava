package pojoClasses;

public class Main {

	public static void main(String[] args) {
//		Calisan calisan = new Calisan();
//		calisan.setIsim("Ali Can");
//		calisan.setMaas(2200);
//		calisan.setIseGirisTarihi(new Date());
//		
//		System.out.println(calisan.getIsim());
//		System.out.println(calisan.getMaas());
//		System.out.println(calisan.getIseGirisTarihi());
		
		Kare kare = new Kare();
		kare.setX(10);
		kare.setY(-5);
		kare.setUzunluk(100);
		kare.ekranaBastir();
		
		System.out.println(kare.getX());
	}

}
