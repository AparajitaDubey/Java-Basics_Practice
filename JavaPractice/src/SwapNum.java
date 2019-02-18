import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a to swap : ");
		int a = in.nextInt();
		
		System.out.println("Enter b to swap");
		int b = in.nextInt();
		
		int temp = a;
		a = b;
		b = temp; 
		
		System.out.println("Value of a after swap is : " + a);
		System.out.println("Value of b after swap is : " + b);
		
	}

}
