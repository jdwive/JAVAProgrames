package basicProgrames;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		if(year%100==0 && year%400==0)
			System.out.println(year+" is leap Year");
		else if(year%100!=0 && year%4==0)
			System.out.println(year+" is leap Year");
		else
			System.out.println(year+" is not leap Year");
	}

}
