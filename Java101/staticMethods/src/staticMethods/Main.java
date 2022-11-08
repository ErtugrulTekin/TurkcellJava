package staticMethods;

public class Main {

	public static void main(String[] args) {
		System.out.println(Math.PI);

		System.out.println(Math.pow(2, 3));// Üslü sayı değerini verir ilk alt ikinci üs
		System.out.println(Math.sqrt(9));// Kare kökünü verir
		System.out.println(Math.min(6, 3));// küçük olanı geri veriyor
		System.out.println(Math.max(6, 3));// büyük olanı geri veriyor

		float f = 1.50f;
		System.out.println(Math.ceil(f));// yukarı Yuvarlama
		System.out.println(Math.floor(f));// aşağı yuvarlama
		System.out.println(Math.round(f));// sayı 0,50 altı olursa aşağı yuvarlar üstü olursa yukarı yuvarlar
		System.out.println(Math.random() * 10);// 0 dahil 1 hariç arasında bir sayı üretir(çarpazsak o sayı hariç yine o
												// aralıkta sayı üretir bize)

	}

}
