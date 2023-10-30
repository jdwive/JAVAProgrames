package interviewProgram;

public class Fibonacci {
	public static void fibonacci(int num) {
		int a=0, b=0, c=1;
		System.out.print(a);
		for(int i=1;i<=num; i++) {
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;			
		}
	}
	public static void main(String args[]) {
		fibonacci(6);
	}

}
