package arrays;

import java.util.Arrays;

public class CyclicArrayRotation {
	
	public void rotate(int arr[], int d) {
		for(int i =0 ; i< d ; i++) {
			rotateOne(arr);
		}
	}
	
	 public void rotateOne(int arr[]) {		 
			
			int len = arr.length;
		     int temp = arr[len-1];
		     
			for(int i = len-1 ; i>0 ; i--) {
				 arr[i] = arr[i-1];
			}
			
			arr[0]=temp;
	 }

	public static void main(String[] args) {
		 
		CyclicArrayRotation rota = new CyclicArrayRotation();
		int[] arr = new int[]{1,2,3,4,5};
		
		rota.rotate(arr,12);
		
		System.out.println(Arrays.toString(arr));

	}

	
}
