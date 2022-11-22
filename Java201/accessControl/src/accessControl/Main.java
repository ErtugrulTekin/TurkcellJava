package accessControl;

public class Main {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.firstName = "Göktug";
//		student.lastName = "Caliskan";
//		student.number = 1;

//		student.numarayiYazdir();
	
//		Araba araba = new Araba();
//		araba.marka = "Honda";
		
		Student student = new Student();
		student.number = 1;
		student.firstName="Ali";
		student.lastName="CAN";
		
		student.setAge(12);
		
		student.bilgileriYazdir();
	}

}
