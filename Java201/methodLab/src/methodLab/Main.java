package methodLab;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Tugrul";
		student.age = 8;
		
		Main main = new Main();
		main.studentInformation(student);
		
		System.out.println(student.name);
		System.out.println(student.age);
	}

	public void studentInformation(final Student student) {
		
		student.name = "Ertug";
		
		System.out.println(student.name);
		System.out.println(student.age);
	}
}
