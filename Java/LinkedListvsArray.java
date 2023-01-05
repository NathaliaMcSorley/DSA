import java.util.ArrayList; //Can be used for dynamic array
import java.util.LinkedList;

public class LinkedListvsArray {
	
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
        //keep track of time to compare adding elements to a linked list and array list  
		long startTime;
		long endTime;
		long elapsedTime;
		
		for(int i = 0; i < 1000000; i++){
			linkedList.add(i);
			arrayList.add(i);
		}
					
		// ****************LinkedList****************
		startTime = System.nanoTime(); //get current time when it starts
		//linkedList.get(0);
		//linkedList.get(500000);
		//linkedList.get(999999);
		//linkedList.remove(0); //faster than array list because array needs to shift all elements to the left 
		//linkedList.remove(500000);
		linkedList.remove(999999);
		
		endTime = System.nanoTime(); //get time when it ends
		elapsedTime = endTime - startTime;
		System.out.println("LinkedList:\t" + elapsedTime +" ns");
		
		// ****************ArrayList****************	
		startTime = System.nanoTime();
		
		//arrayList.get(0); //arrays are faster when getting the first element
		//arrayList.get(500000); //arrays are faster when getting a given element 
		//arrayList.get(999999); //arrays are faster 
		//arrayList.remove(0);
		//arrayList.remove(500000); //arrays are faster
		arrayList.remove(999999); //arrays are faster
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("ArrayList:\t" + elapsedTime +" ns");
	}
}