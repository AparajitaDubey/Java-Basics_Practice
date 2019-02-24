package arrays;

public class CountZeros {

	public static void main(String[] args) {
		int count=0;
				
		int[] arr = new int[] {0,1,0,2,0,9};
		int len = arr.length;
		
		for(int i=0; i<len-1;i++) {
			
			if(arr[i]==0) {
				count++;
			}			
		}
		
		System.out.print(count);
	}

}
