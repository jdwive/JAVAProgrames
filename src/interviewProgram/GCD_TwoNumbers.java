package interviewProgram;

public class GCD_TwoNumbers {
	public static void gcd_2Numbers(int num1, int num2) {
		if(num1>num2) {
			if(num1%num2==0)
				System.out.println("GCD of "+num1+" and "+num2+": "+num2);
			else
				System.out.println("GCD of "+num1+" and "+num2+": "+gcd(num1,num2));				
		}
		else if(num2>num1) {
			if(num2%num1==0)
				System.out.println("GCD of "+num1+" and "+num2+": "+num1);
			else
				System.out.println("GCD of "+num1+" and "+num2+": "+gcd(num2,num1));
		}
	}
	public static int gcd(int a, int b) {
		for(int i=b/2;i>=2;i--) {
			if(a%i==0 && b%i==0)
				return i;
		}
		return b;
	}
	public static int findGCD(int x, int y) {
		if(y==0)
			return x;
		else
			return findGCD(y,x%y);
	}
	public static void main (String[] args) {
		gcd_2Numbers(10,5);
		gcd_2Numbers(10,20);
		gcd_2Numbers(27,9);
		gcd_2Numbers(21,9);
		System.out.println(findGCD(10,5));
		System.out.println(findGCD(10,20));
		System.out.println(findGCD(27,9));
		System.out.println(findGCD(21,9));
	}

}
