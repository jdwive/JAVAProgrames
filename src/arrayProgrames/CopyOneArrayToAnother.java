package arrayProgrames;

import java.util.Arrays;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {23,45,67,8,12,90,34,2};
		int arr2[]=new int[arr1.length];
		copyArray(arr1,arr2);
	}

	private static void copyArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		//Method1
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		
		//Method2
		int arr[]=Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr));
	}

}
