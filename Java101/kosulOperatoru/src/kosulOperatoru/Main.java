package kosulOperatoru;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yasiniz: ");
		int age = scanner.nextInt();
		System.out.println(age >= 19 ? "Ehliyet alabilirsiniz" : "Ehliyet alamazsiniz!");
		

	}

}
