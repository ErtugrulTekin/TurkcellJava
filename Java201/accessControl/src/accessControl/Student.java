package accessControl;

public class Student {

	public int number = 10;
	public String firstName;
	public String lastName;
	private int age;

	public void setAge(int y) {
		if (y > 0) {
			age = y;
		} else {
			System.out.println("Yas degeri 0'dan kucuk olamaz");
		}
	}

	public void bilgileriYazdir() {
		System.out.println("Numara: " + number);
		System.out.println("Ad: " + firstName);
		System.out.println("Soyad: " + lastName);
		System.out.println("Yas: " + age);
	}
}
