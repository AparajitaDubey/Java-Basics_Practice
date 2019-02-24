package arrays;

public class ArrayRotationLessComplexity {

	  void leftRotate(int arr[], int d, int n) 
	    { 
	        int i, j, k, temp; 
	        for (i = 0; i < gcd(d, n); i++) { 
	           
	            temp = arr[i]; 
	            j = i; 
	            while (true) { 
	                k = j + d; 
	                if (k >= n) 
	                    k = k - n; 
	                if (k == i) 
	                    break; 
	                arr[j] = arr[k]; 
	                j = k; 
	            } 
	            arr[j] = temp; 
	        } 
	    } 
	  
	  void printArray(int arr[], int size) 
	    { 
	        int i; 
	        for (i = 0; i < size; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	  
	    /*Fuction to get gcd of a and b*/
	    int gcd(int a, int b) 
	    { 
	        if (b == 0) 
	            return a; 
	        else
	            return gcd(b, a % b); 
	    } 
	  
	public static void main(String[] args) {
		ArrayRotationLessComplexity rotate = new ArrayRotationLessComplexity(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 
        rotate.leftRotate(arr, 3, 12); 
        rotate.printArray(arr, 12); 
	}

}
