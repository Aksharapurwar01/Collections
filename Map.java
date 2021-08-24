package Collections;

import java.util.HashMap;

public class Map {
	
	public static void doMapDemo() {
		
		System.out.println("\nIn doMapDemo");
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"Krati");
		map.put(101,"Nishu");
		map.put(102,"Akshara");
		
		System.out.println(map.entrySet());
		
		
	}

}
