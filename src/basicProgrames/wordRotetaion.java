package basicProgrames;

public class wordRotetaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is jigyasa";
		String arr[]=str.split(" ");
		for(int i=0; i<=arr.length;i++) {
			String tempArr[]=str.split(" ");
			str=tempArr[tempArr.length-1];
			for(int j=0;j<tempArr.length-1;j++) {
				str=str+" "+tempArr[j];
			}
			System.out.println(str);
		}
	}

}
