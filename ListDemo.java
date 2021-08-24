package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	static void doListDemo() {
		
		System.out.println("In doListDemo");
		
		List<String> list = new LinkedList<String>();	
		list.add("Akshara");
		list.add("Ishu");
		list.add("Drishti");
		list.add("Divya");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
