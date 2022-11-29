package linkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class OgrenciMain {

	public static void main(String[] args) {
		LinkedList<Ogrenci> linkedList = new LinkedList<>();
		linkedList.add(new Ogrenci(1, "Ali", "Can"));
		linkedList.add(new Ogrenci(2, "Tugrul", "Caliskan"));
		linkedList.add(new Ogrenci(3, "Ertug", "Caliskan"));
		
		Iterator<Ogrenci> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Ogrenci next =  iterator.next();
			System.out.println(next);
		}
		
		linkedList.remove(2);
		
		iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Ogrenci next =  iterator.next();
			System.out.println(next);
		}
	}
}
