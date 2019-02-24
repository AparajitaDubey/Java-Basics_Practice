package arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
//		int len = arr.length;
//		
//		for(int i=0; i<=len-1; i++) {
//			for(int j=0; j<=arr[i].length-1;j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//		}
		
		
		int maxX = 3; 
	   int maxY = 3; 
	   int total = -64;  
	   int sum = 0;
	   for(int x=0; x<=maxX; x++) {
		   for(int y=0; y<=maxY;y++) {
			   
			  sum = arr[x][y]+arr[x][y+1]+arr[x][y+2];
			  
			  sum += arr[x+1][y+1];
			  
			  
			  sum += arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];
			  
			  System.out.print(sum + " ");
		   }
		   
		   
	   }
	   
	   
		
		
		}
	}


