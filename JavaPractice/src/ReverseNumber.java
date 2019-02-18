import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the num : ");
		int num = in.nextInt();
		
		int reversed = 0;
		
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;           
            num /= 10;
            
        }
		
		System.out.println("Reverse num : " + reversed);
		
		
	}

}
