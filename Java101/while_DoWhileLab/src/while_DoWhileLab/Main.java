package while_DoWhileLab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int starCount = scanner.nextInt();
//		int i = 1;
//		while(i <= starCount) {
//			int j = 0;
//			while(j < i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//		long total = 0;
//		while(true) {
//			int x = scanner.nextInt();
//			if(x == 0) {
//				break;
//			}
//			total += x;
//		}
//		System.out.println(total);

		Scanner scanner = new Scanner(System.in);
		// 0 ila 100 arası olan çift sayıları yazdırma
//		int x = 0;
//		int y = 100;
//		while (x < y) {
//			if (x % 2 == 0) {
//				System.out.println(x);
//			}
//			x++;
//		}

		/*int x = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (x < 10) {
			int input = scanner.nextInt();
			if (input < min)
				min = input;
			if (input > max)
				max = input;
			x++;
		}
		
		System.out.println("Min:" + min);
		System.out.println("Max:" + max);*/
		
		/*float average = 0.0f;
		int count = 0;
		while(true) {
			int number = scanner.nextInt();
			if(number == 0) break;
			count++;
			average += number;
		}
		System.out.println(average / count);*/
		
		int positiveCount = 0;
		int negativeCount = 0;
		
		while(true) {
			int x = scanner.nextInt();
			if(x == 0) break;
			if(x > 0) {
				positiveCount++;
			}else if(x<0) {
				negativeCount++;
			}else {
				break;	
			}
		}
		System.out.println("Pos : " + positiveCount);
		System.out.println("Neg : " + negativeCount);
		
		
	}
}
