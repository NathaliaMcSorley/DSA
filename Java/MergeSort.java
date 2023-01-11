public class MergeSort {
    public static void main(String args[])
    {   	    	
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        
        mergeSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

	private static void mergeSort(int[] array) {
		
		int length = array.length;
		if (length <= 1) return; //base - divides array until it gets to one and then return 
		
		int middle = length / 2;
		int[] leftArray = new int[middle]; //size middle
		int[] rightArray = new int[length - middle]; //size length - middle
		
		int i = 0; //left array
		int j = 0; //right array
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i]; //copy element from array to left array
			}
			else {
				rightArray[j] = array[i]; 
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; //indices
		
		//check the conditions for merging
		while(l < leftSize && r < rightSize) { //while there are element within the left array and right array
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l]; //copy the last element over
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r]; //copy the last element over 
			i++;
			r++;
		}
	}
}
