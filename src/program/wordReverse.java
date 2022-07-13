package program;

public class wordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is Jigyasa";
		String arr[]=str.split(" ");
		String temp="";
		for(String s:arr) {
			for(int i=s.length()-1;i>=0;i--) {
				if(s.charAt(i)!='a')
					temp=temp+s.charAt(i);						
			}
			temp=temp+" ";
		}
		System.out.println(temp);

	}

}
