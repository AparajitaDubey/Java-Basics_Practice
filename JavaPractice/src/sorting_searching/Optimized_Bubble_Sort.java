package sorting_searching;

public class Optimized_Bubble_Sort{
	boolean swap;
	
	private void bubbleSortOne(int[] arr, int n) {
		
		for(int i=0 ; i<n-1; i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				swap = true;				
			}
		}
		
	}

	public void bubbleSort(int[] arr, int n) {
		swap = false;
		for(int i=0 ; i<n-1; i++) {
			
			bubbleSortOne(arr,n);
			
			if(swap == false) {
				break;
			}
		}		
	}
	
	
	public void printArray(int[] arr, int n) {

		for(int i =0 ; i<=n-1; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
	}	

	public static void main(String[] args) {
		
		Optimized_Bubble_Sort ob = new Optimized_Bubble_Sort();
		
		int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
		int n = arr.length;
		
		ob.bubbleSort(arr, n);
		System.out.println("Sorted array"); 
        ob.printArray(arr, n);		

	}

}
