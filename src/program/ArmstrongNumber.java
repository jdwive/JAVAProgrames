package program;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();
		int temp=num, sum=0;
		int n=String.valueOf(num).length();
		while(num!=0) {
			int rem=num%10;
			num=num/10;
			sum=sum+(int) Math.pow(rem, n);			
		}
		if(temp==sum)System.out.println("number is armstrong");
		else System.out.println("number is not armstrong");
	}
}
