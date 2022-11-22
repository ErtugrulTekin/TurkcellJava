package memberVariables;

public class Main {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.hiz = 10;
		bike.vites = 18;
		Bike.bisikletSayisi =1;
		bike.bilgileriYazdir();

		System.out.println("--------------");
		
		Bike bike2 = new Bike();
		bike2.hiz = 20;
		bike2.vites = 12;
		Bike.bisikletSayisi=2;
		bike2.bilgileriYazdir();

//		System.out.println(bike.hiz);
//		System.out.println(bike.vites);
	}

}
