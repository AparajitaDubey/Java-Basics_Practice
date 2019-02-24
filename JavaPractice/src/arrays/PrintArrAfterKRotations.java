package arrays;

public class PrintArrAfterKRotations {
	
	void rotate(int arr[], int n, int k) {
		
		for(int i = k ; i < k+n;i++) {
			
			System.out.print(arr[i % n] + " ");
		}
		
	}

	public static void main(String[] args) {
		
		PrintArrAfterKRotations printArr = new PrintArrAfterKRotations();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int n = arr.length;		
		
		printArr.rotate(arr, n, 3);
		
		System.out.println("");
		
//		printArr.rotate(arr, n, 4);
		

	}

}
