package classesAndObjects;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.x = 10.0;
		circle.y = 20.0;
		circle.r = 3.0;

		System.out.println(circle.x);
		System.out.println(circle.y);
		System.out.println(circle.r);

		double alan = circle.alanHesapla();
		double cevre = circle.cevreHesapla();

		System.out.println(alan);
		System.out.println(cevre);

		Circle circle2 = new Circle();
		circle2.r = 30;
		System.out.println(circle2.alanHesapla());
		System.out.println(circle2.cevreHesapla());

		Circle circle3 = circle2;
		circle3.r = 40;

	}

}
