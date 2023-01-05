import java.util.Queue;
import java.util.LinkedList;

public class QueueDsa{
	
	public static void main(String[] args) {
        //Queue in java is an interface and we use linked list to implement queue
		Queue<String> queue = new LinkedList<String>();
		
        System.out.print("Is queue empty? ");
		System.out.println(queue.isEmpty());
		System.out.print("Print Queue: ");
		System.out.println(queue);

        //Add item to the queue at the end of the line 
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");

        System.out.print("Is queue empty? ");
		System.out.println(queue.isEmpty());
		System.out.print("Print Queue: ");
		System.out.println(queue);
        System.out.print("Size Queue: ");
		System.out.println(queue.size());
        System.out.print("Queue containg Harold? ");
        System.out.println(queue.contains("Harold"));
        System.out.print("First in the Queue: ");
        //Check the first item in the queue without removing it
		System.out.println(queue.peek());
		
        //Remove first item from the queue
        queue.poll();
		queue.poll();
		System.out.print("Print Queue: ");
		System.out.println(queue);		
	}
}