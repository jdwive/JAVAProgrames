package basicProgrames;

import java.util.Scanner;

public class NumberIsInteger {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		try {
			int i=Integer.valueOf(str);
			System.out.println(i+" is Integer");
		}catch(Exception e){
			System.out.println(str+" is not Integer");
			System.out.println("please enter Integer number");
		}
	}
}
