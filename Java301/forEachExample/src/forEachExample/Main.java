package forEachExample;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);
		arrayList.add(9);
		arrayList.add(2);
		
//		Iterator<Integer> iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			Integer integer = iterator.next();
//			System.out.println(integer);
//		}
		
		for(Integer i:arrayList) {
			System.out.println(i);
		}
		
		
		
//		int[] numbers = {1,2,3,4,5};
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		System.out.println("--------------");
//		
//		int i = 0 ;
//		
//		while(i < numbers.length) {
//			System.out.println(numbers[i++]);
//		}
//		System.out.println("--------------");
//		
//		int x = 0;
//		do {
//			System.out.println(numbers[x++]);
//		}while(x < numbers.length);
	}
}
