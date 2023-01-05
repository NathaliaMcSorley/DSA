import java.util.*;

public class PriorityQueueDsa{
	
    public static void main(String args[])
    {    	
    	//Strings in default order
    	Queue<String> queue = new PriorityQueue<>();
    	queue.offer("B");
    	queue.offer("C");
    	queue.offer("A");
    	queue.offer("F");
    	queue.offer("D");
    	
    	while(!queue.isEmpty()) {
    		System.out.println(queue.poll()); //display and remove each element 
    	}

        System.out.println("\n");

        //Doubles in reverse order
    	Queue<Double> reversed_queue = new PriorityQueue<>(Collections.reverseOrder());
        reversed_queue.offer(3.0);
    	reversed_queue.offer(1.5);
    	reversed_queue.offer(4.0);
    	reversed_queue.offer(2.5);
    	reversed_queue.offer(3.5);

        while(!reversed_queue.isEmpty()) {
    		System.out.println(reversed_queue.poll()); //display and remove each element 
    	}
    }
}