package basicProgrames;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=0, b=1, c=0;
		System.out.print("0"+ " ");
		for(int i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" ");
		}
	}

}
