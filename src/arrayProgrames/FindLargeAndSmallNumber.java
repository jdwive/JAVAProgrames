package arrayProgrames;

public class FindLargeAndSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,78,34,2,39,100,45,10};
		int max=0,min=arr[0];
		for(int i:arr) {
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
