package sorting_searching;

public class LastIndexOfElementInSortedIntegerArrayWithDuplicates {

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
			
						
			if(midValue==num &&  ((mid == end) || (arr[mid + 1] > num)))
			return mid;
								 
						
			if(num<midValue) {
				 end = mid-1;				 
				 
			}else
				start = mid+1;	
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
			
		  int array[] = {0, 1, 2, 2, 4, 5, 5, 5, 9};
		  	        int num = 5;
		  	        binarySearchTest(array,num);
		
			    }
			    
			    public static void binarySearchTest(int array[], int num) {
		        int index = findElementBinarySearch(array, num);
			        System.out.println("Element "  + num + (index >= 0 ? (" found at index "  + index) : " not found!" ));
			    }
}
