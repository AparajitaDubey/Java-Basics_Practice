package sorting_searching;

public class BinarySearch_FindNumberIndex {

	public static int findElementBinarySearch(int[] arr,int num)
	{
		
		 int end = arr.length-1;
		 int endValue = arr[end]; 
		 int start = 0;
		 int startValue = arr[0];
		 int count = 0;
		
		while(start<=end) {
			int mid = (start+end)/2;
			int midValue = arr[mid];
			
						
			if(midValue==num)
			return mid;
								 
						
			if(num<midValue) {
				 end = mid-1;				 
				 
			}else
				start = mid+1;	
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
			
		  int array[] = { 21, 32, 43, 74, 75, 86, 97, 108, 149 };
		  	        int num = 108;
		  	        binarySearchTest(array,num);
		
			    }
			    
			    public static void binarySearchTest(int array[], int num) {
		        int index = findElementBinarySearch(array, num);
			        System.out.println("Element "  + num + (index >= 0 ? (" found at index "  + index) : " not found!" ));
			    }
}