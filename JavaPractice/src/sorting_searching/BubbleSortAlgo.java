package sorting_searching;

public class BubbleSortAlgo {
	
	private void bubbleSortOne(int[] arr, int n) {
		
		for(int i=0 ; i<n-1; i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;				
			}
		}		
	}

	public void bubbleSort(int[] arr, int n) {		
		for(int i=0 ; i<n-1; i++) {
			bubbleSortOne(arr,n);
		}
	}	
	
	private void printArray(int[] arr, int n) {

		for(int i =0 ; i<=n-1; i++) {
			System.out.print(arr[i] + " ");
			
		}		
	}	

	public static void main(String[] args) {
		
		BubbleSortAlgo bsort = new BubbleSortAlgo();
		
		int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
		int n = arr.length;
		
		bsort.bubbleSort(arr, n);
		System.out.println("Sorted array"); 
        bsort.printArray(arr, n); 
	}
}
