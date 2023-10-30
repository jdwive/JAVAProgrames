package interviewProgram;

public class PowerOfNumber {
	public static int powerNumber(int num, int power) {
		int result=num;
		while(power>1) {
			result=result*num;
			power--;
		}		
		return result;
	}
	
public static void main(String args[]) {
	System.out.println(powerNumber(2,2));
	System.out.println(powerNumber(2,3));
	System.out.println(powerNumber(2,5));
	System.out.println(powerNumber(5,5));
}
}
