package program;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int temp=num, n=0;
		
		while(num!=0) {
			int rem=num%10;
			num=num/10;
			n=n*10+rem;
		}
		if(temp==n) System.out.println(temp + " is palindrome");
		else System.out.println(temp +" is not palindrome");
	}
}
