package arrays;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SplitArray {

	public static void main(String[] args) {
		
		int[] arr = { 0,100,12,10,5,6,52,36};
		int n = arr.length;
		int k=3;

		int[] a = new int[k];
		int[] b = new int[n - a.length];
		
		
		System.arraycopy(arr, 0, a, 0, a.length);
		System.arraycopy(arr, a.length, b, 0, b.length);
		

		
		System.out.println(Arrays.toString(a) + Arrays.toString(b) );
			
		int length = a.length + b.length;
		int[] result = new int[length];
		System.arraycopy(b, 0, result, 0, b.length);
	    System.arraycopy(a, 0, result, b.length, a.length);
	    int[] concat = result;
		
	    System.out.println(Arrays.toString(concat));
	
		
	       
	    

	}

}
