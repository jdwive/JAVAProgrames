package interviewProgram;

public class LeapYear {
	public static void findLeapYear(int year) {
		if(year%400==0 || year%100!=0 && year%4==0)
			System.out.println(year+" is leap year.");
		else
			System.out.println(year+" is not leap year.");
	}
	public static void main(String[] args) {
		findLeapYear(2000);
		findLeapYear(1900);
		findLeapYear(2020);
		findLeapYear(1840);
		findLeapYear(2012);
		findLeapYear(2001);
	}

}
