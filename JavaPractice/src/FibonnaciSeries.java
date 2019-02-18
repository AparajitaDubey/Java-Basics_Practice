import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter num ");
		int num = in.nextInt();
		 
		int i = 0, j = 1;
		
			
		for(int x=0; x<num ; x++) {
			
			System.out.print(i + " ");
			
			int sum = i + j;
			
			i = j;
			j = sum;
			

		}		
		
	}

}
