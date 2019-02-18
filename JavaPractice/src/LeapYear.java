import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year to check : ");
		int year = in.nextInt();
		
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					leap = true;
				}else
					leap = false;
			}else
				leap = true;			
		}else 
			leap =false;
		
		if(leap)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");
	}

}
