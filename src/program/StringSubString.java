package program;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="COMBINATION";
		char flag='R';
		System.out.println(str);
		while(str.length()>1) {
			if(flag=='R') {
				str=str.substring(0,str.length()-1);
				flag='L';
			}
			else if(flag=='L') {
				str=str.substring(1,str.length());
				flag='R';
			}
			System.out.println(str);
		}
	}

}
