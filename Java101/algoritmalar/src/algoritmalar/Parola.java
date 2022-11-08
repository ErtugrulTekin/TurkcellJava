package algoritmalar;

import java.util.Scanner;

public class Parola {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String parola = "";
		do {
			System.out.print("Parola:");
			parola = scanner.nextLine();
		}while(!parola.equals("1234"));
		System.out.println("Hoşgeldiniz");
	}
	

}
