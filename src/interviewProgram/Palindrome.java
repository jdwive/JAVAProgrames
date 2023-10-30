package interviewProgram;

public class Palindrome {
	public static void palindromString(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse))
			System.out.println(str+" is palindrom.");
		else
			System.out.println(str+" is not palindrom.");		
	}
	public static void palindromInteger(int num) {
		int reverse=0, temp=num;
		while(num!=0) {
			reverse=reverse*10+(num%10);
			num=num/10;			
		}
		if(temp==reverse)
			System.out.println(temp+" is palindrome.");
		else
			System.out.println(temp+" is not palindrome");
	}
	public static void main(String args[]) {
		palindromString("pomop");
		palindromInteger(1001);
	}

}
