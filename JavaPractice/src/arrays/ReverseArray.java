package arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		in.nextInt();
		System.out.println("Enter integers : ");
			
		
		int x = in.nextInt();		
		char[] A = ("" + x).toCharArray();
		
		for(int i=A.length-1; i>=0;i--) {
			System.out.print(A[i]);
			
		}
				
				
		}
		
		
	
		

	}


