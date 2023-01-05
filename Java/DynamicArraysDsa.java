//For this example we are creating a simple dynamic array but we can use ArrayList in java that is a dynamic array that is already coded 
public class DynamicArraysDsa{
	
	public static void main(String[] args) {

		DynamicArray dynamicArray = new DynamicArray(5);
		
        System.out.println("Empty: " + dynamicArray.isEmpty());
        System.out.println("Dynamic Array: " + dynamicArray); //this uses the toString method

		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
        System.out.println("\nDynamic Array: " + dynamicArray); //this uses the toString method
        System.out.println("Empty: " + dynamicArray.isEmpty());
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);

        dynamicArray.insert(0, "X");
        System.out.println("\nInsert: " + dynamicArray); //this uses the toString method
		
        dynamicArray.delete("A");
        System.out.println("\nDelete: " + dynamicArray); //this uses the toString method

        System.out.println("\nIndex of C: "+dynamicArray.search("C"));

		dynamicArray.add("D");
		dynamicArray.add("E");
        dynamicArray.add("F");
        System.out.println("\nDynamic Array: " + dynamicArray); //this uses the toString method
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);

        dynamicArray.delete("D");
		dynamicArray.delete("E");
        dynamicArray.delete("F");
        System.out.println("\nDynamic Array: " + dynamicArray); //this uses the toString method
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println(dynamicArray.get(0));
	}
}
