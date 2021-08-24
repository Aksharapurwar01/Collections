package Collections;

import java.util.LinkedHashSet;

public class Set {
	
	public static void doSetDemo() {
		
		System.out.println("\nIn doSetDemo");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("kk");
		set.add("Akshara");
		set.add("ee");
		for (String str :set) {
			System.out.println(str);	
		}
		
	}

}
