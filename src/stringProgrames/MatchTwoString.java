package stringProgrames;

public class MatchTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Automation", str2="Automation";
		
		//Method1
		boolean flag=false;
		if(str1.equals(str2)) {
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)==str2.charAt(i))
					flag=true;
				else
					flag=false;
			}
		}
		if(flag==true) System.out.println("String is equal");
		else System.out.println("String is not equal");
		
		//Method2
		if(str1.equals(str2))
			System.out.println("String is equal.");
		else System.out.println("String is not equal.");
	}

}
