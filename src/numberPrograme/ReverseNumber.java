package numberPrograme;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1057;
		int rev=0, temp=0;
		while(num!=0) {
			rev=num%10;
			num=num/10;
			temp=temp*10+rev;			
		}
		System.out.println(temp);
	}

}
