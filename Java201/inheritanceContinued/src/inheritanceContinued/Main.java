package inheritanceContinued;

public class Main {
	
	public static void main(String[] args) {
		NakliyeAracı nakliyeAracı = new NakliyeAracı();
		nakliyeAracı.setUretici("X Marka");
		nakliyeAracı.setYukKapasitesi(1000);
		
		Tir tir = new Tir();
		tir.setUretici("Y Marka");
		tir.setYukKapasitesi(2000);
		tir.setKonteynirSayisi(20);
		
		
	}
}
