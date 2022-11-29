package vectorExample;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(4);
		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Kaplan");
		vector.add("At");
		vector.add("Tavsan");

		for (int i = 0; i < vector.size(); i++) {
			String string = vector.get(i);
			System.out.println((i) + " " + string);
		}
		
		System.out.println(vector.capacity());
		
		System.out.println(vector.contains("Kedi2"));
		
		int indexOf = vector.indexOf("Kaplan2");
		System.out.println(indexOf);
		
		vector.clear();
		System.out.println(vector.size()); 
		 System.out.println(vector.capacity()); 
	}
}
