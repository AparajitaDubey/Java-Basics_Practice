
public class ArmstrongNumInterval {

	public static void main(String[] args) {
		int low = 20, high = 50, result = 0;
		
		while(low<high) {
			 int remainder = low % 10;
			 result +=  Math.pow(remainder, 3);
			 low/=10;			 
			 low--;
			 
			 if(low==result) {
				 System.out.println("Number is Armstrong" + low);
			 }else {
				 System.out.println("Number is not Armstrong" + low);
			 }
						
		}
			

	}

}
