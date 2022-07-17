package arrayProgrames;

public class CopyArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = {'S','o','f','t','w','a','r','e','T','e','s','t','i','n','g','B','l','o','g'};
		String str=String.copyValueOf(ch,4,10);
		
		System.out.println(str);
	}

}