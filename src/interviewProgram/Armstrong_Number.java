package interviewProgram;

public class Armstrong_Number {
	public static void armstrongNumber(int num) {
		int temp=0, cube=0, armstrong=num;
		while(num!=0) {
			temp=num%10;
			cube=cube+(temp*temp*temp);
			num=num/10;
		}
		if(cube==armstrong)
			System.out.println(armstrong+" is armstrong;");
		else
			System.out.println(armstrong+" is not armstrong.");
	}
	public static void main(String []args) {
		armstrongNumber(10);
	}

}
