package arrayProgrames;

public class FindPairElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPairElement(new int[] {8, 7, 6, 4, 5, 2,3},10);
		findPairElement(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
	}

	private static void findPairElement(int[] arr, int num) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==num)
					System.out.println(arr[i]+" + "+arr[j]+" = "+num);
			}
		}
		System.out.println("---------------------------------");
	}

}
