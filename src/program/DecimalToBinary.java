package program;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		int index=0;
		int arr[]=new int[25];
		while(num!=0) {
			arr[index++]=num%2;
			num=num/2;
		}
		for(int i=index-1;i>=0;i--)
			System.out.print(arr[i]);
	}
}
