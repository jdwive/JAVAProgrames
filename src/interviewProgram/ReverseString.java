package interviewProgram;

public class ReverseString {
	public static void reverseString(String str) {
		String stringArray[]=str.split(" ");
		String reverse="";
		for(String word:stringArray) {
			for(int i=word.length()-1;i>=0;i--) {
				reverse=reverse+word.charAt(i);
			}
			if(!word.equals(stringArray[stringArray.length-1]))
				reverse=reverse+" ";
		}
		System.out.println("reverse of "+str+" is: "+reverse);
	}
	public static void main(String[] args) {
		reverseString("Name");
		reverseString("My Name is Jigyasa");
	}

}
