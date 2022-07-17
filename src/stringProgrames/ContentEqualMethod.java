package stringProgrames;

public class ContentEqualMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Jigyasa";
		String str2= "Automation";
		StringBuffer str3=new StringBuffer("Jigyasa");
		StringBuffer str4=new StringBuffer("Test");
		System.out.println(str1.contentEquals(str3));
		System.out.println(str2.contentEquals(str4));
	}

}
