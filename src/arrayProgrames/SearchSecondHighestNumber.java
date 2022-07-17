package arrayProgrames;

public class SearchSecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 78, 34, 90, 45, 77, 11, 89, 23};
		int high=0, sHigh=0;
		for(int n:arr) {
			if(high<n) {
				sHigh=high;
				high=n;				
			}else if(sHigh<n)
				sHigh=n;
		}
		System.out.println(sHigh);
	}

}
