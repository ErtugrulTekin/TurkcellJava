package methodOverridingLab;

public class Main {

	public static void main(String[] args) {
		Kisi kisi1 = new Kisi("1", "Tugrul Caliskan");
		System.out.println(kisi1.toString());

		Kisi kisi2 = new Kisi("1", "Ertug Caliskan");
		System.out.println(kisi2.toString());
		
		System.out.println(kisi1 == kisi2);
		System.out.println(kisi1.equals(kisi2));
	}
}
