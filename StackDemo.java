package Collections;

import java.util.Iterator;
import java.util.Stack;


public class StackDemo {
	
	static void doStackDemo() {
		
		System.out.println("\nIn doStackDemo");
		Stack<String> stack = new Stack<String>();
		stack.push("Akshara");
		stack.push("Ishu");
		stack.push("Drishti");
		stack.push("Palak");
		stack.push("Divya");
		stack.push("Jojo");
		stack.pop();
	
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}