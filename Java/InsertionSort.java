public class InsertionSort{

	public static void main(String[] args) {
		
		int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        for(int i : array) {
			System.out.print(i + " ");
		}

		insertionSort(array);
        System.out.print("\n");

		for(int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) { //begins at index 1 because we compare to the left, compare to index 0 at first 
			int temp = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
	}
}