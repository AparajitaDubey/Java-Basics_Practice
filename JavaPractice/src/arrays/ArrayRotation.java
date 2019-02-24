package arrays;

public class ArrayRotation {
	
	 void leftRotate(int arr[], int d, int n) {
		 for(int i=0; i<d; i++) {
			 leftRotateOne(arr,n);
		 }
	 }
	

	 void leftRotateOne(int[] arr, int n) {
		int temp = arr[0]; int i;
		for(i=0 ; i< n-1; i++) {
			
			arr[i]=arr[i+1];
					
		}
		
		arr[i]= temp;	
		
	}

	 void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } 


	public static void main(String[] args) {
		ArrayRotation rotate = new ArrayRotation();
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		 rotate.leftRotate(arr, 2, n); 
	     rotate.printArray(arr, n); 
		
	}

}
