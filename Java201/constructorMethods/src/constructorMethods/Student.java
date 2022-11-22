package constructorMethods;

public class Student {

	String firstName;
	String lastName;
	int age;

	Student() {
		firstName = "Bilinmeyen";
		lastName = "Bilinmeyen";
		age = -1;
	}

	Student(String a, String b, int y) {
		firstName = a;
		lastName = b;
		age = y;
	}
}
