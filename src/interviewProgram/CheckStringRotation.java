package interviewProgram;

public class CheckStringRotation {
	public static boolean checkStringRotation(String str1, String str2) {
		for(int i=0;i<str2.length();i++) {
			String temp=str1.substring(str1.length()-(i+1),str1.length());
			temp=temp+str1.substring(0,str1.length()-temp.length());
			System.out.println(temp);
			if(str2.equals(temp))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println("String 1 and String 2 are rotation?: " + checkStringRotation("abcd", "dabc"));
		System.out.println("String 1 and String 2 are rotation?: " + checkStringRotation("abcd", "cdab"));
		System.out.println("String 1 and String 2 are rotation?: " + checkStringRotation("abcd", "dbac"));
	}
}
