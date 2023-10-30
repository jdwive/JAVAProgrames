package StringPrograme;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Jigyasa";
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println();
		reverse("My Name is Jigyasa");
		
	}

	private static void reverse(String string) {
		// TODO Auto-generated method stub
		String[] word=string.split(" ");
		for(int i=0; i<word.length;i++) {
			for(int j=word[i].length()-1;j>=0;j--)
				System.out.print(word[i].charAt(j));
			System.out.print(" ");
		}
	}

}
