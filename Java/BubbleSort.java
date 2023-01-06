public class BubbleSort {
    	
	public static void main(String[] args) {
		
		int array[] =  {9, 1, 8, 2, 7, 3, 6, 4, 5};

        System.out.print("Array to be sorted:");
        for(int i : array) {
			System.out.print(i);
		}
        
        System.out.print("\n");
		bubbleSort(array);
		
        System.out.print("\nSorted array:");
		for(int i : array) {
			System.out.print(i);
		}
	}
	
	public static void bubbleSort(int array[]) {
		for(int i = 0; i < array.length - 1; i++) {
            System.out.print("\nAfter iteration " + i +": \n");
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) { //For descending order just swap > for <
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
                System.out.print(array[j]);
			}
		}
	}
}

