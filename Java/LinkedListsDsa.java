import java.util.LinkedList;

public class LinkedListsDsa {
    public static void main(String args[]){
        //if you hover over LinkedList it says it is a doubly linked list
        LinkedList<String> linkedListStack = new LinkedList<String>();
        LinkedList<String> linkedListQueue = new LinkedList<String>();

		// LinkedList as a Stack
		linkedListStack.push("A");
		linkedListStack.push("B");
		linkedListStack.push("C");
		linkedListStack.push("D");
		linkedListStack.push("F");
		linkedListStack.pop(); //remove last element
		System.out.println("Linked List as a Stack: " + linkedListStack);

		// LinkedList as a Queue
		linkedListQueue.offer("G");
		linkedListQueue.offer("H");
		linkedListQueue.offer("I");
		linkedListQueue.offer("J");
		linkedListQueue.offer("K");
		linkedListQueue.poll(); //remove first element
        System.out.println("Linked List as a Queue: " + linkedListQueue);

        // LinkedList Insert and Remove
		linkedListStack.add(0, "E");
        System.out.println("Insert E: " + linkedListStack);
		linkedListStack.remove("E");
        System.out.println("Delete E: " + linkedListStack);
		System.out.println("Index of C: " + linkedListStack.indexOf("C"));
		
		System.out.println("Peek first: " + linkedListStack.peekFirst());
		System.out.println("Peek last: " + linkedListStack.peekLast());
		linkedListStack.addFirst("0");
		linkedListStack.addLast("G");
        System.out.println("Add 0 and G: " + linkedListStack);

		String first = linkedListStack.removeFirst();
		String last = linkedListStack.removeLast();
		System.out.println("first element removed: "+first);
        System.out.println("last element removed: " + last);
    }
}