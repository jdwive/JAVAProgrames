package program;

public class PrimeNumber {
	public static void main(String args[]) {
		primeNumberSearch(97);
		primeNumberList(100);
	}

	private static void primeNumberList(int n) {
		// TODO Auto-generated method stub
		//System.out.println("1 is prime number");
		for(int i=1;i<n;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}else
					flag=true;
			}
			if(flag==true)System.out.println(i+" is prime number");
		}
	}

	private static void primeNumberSearch(int n) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
			else flag=true;
		}
		if(flag==true)System.out.println(n+" Number is prime");
		else System.out.println(n+" Number is not prime");
	}

}
