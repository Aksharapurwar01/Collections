package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queuee {
	
	static void doQueueDemo() {
		
		System.out.println("In doQueueDemo");
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("rff");
		queue.add("ff");
		queue.add("fhfd");
		queue.add("fdfdf");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("Iterating the queue elements");
		
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("After Removing Two Elments");
		Iterator itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
				
	}

}
