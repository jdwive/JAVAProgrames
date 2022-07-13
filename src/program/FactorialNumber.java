package program;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=1;
		for(int i=n;i>0;i--)
			temp=temp*i;
		System.out.println(temp);
	}

}
