import java.util.Scanner;

public class VerifyPrimeNum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter num  : ");
		
		int num = in.nextInt();
		
		boolean flag = false;
		
		for (int i=2 ; i<= num/2 ; i++) {
			
			if(num%i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Prime No.");
		}else {
			System.out.println("Not Prime");
		}
	}

}
