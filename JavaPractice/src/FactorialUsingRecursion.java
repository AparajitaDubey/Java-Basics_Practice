import java.util.Scanner;

public class FactorialUsingRecursion {
	
	static int fact(int num) {
		if(num<=1) 
		return 1;
		else 			
		return num * fact (num-1) ;
		
	}

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		
		System.out.println(fact(num));
		
	

	}

}
