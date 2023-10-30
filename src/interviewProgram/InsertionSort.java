package interviewProgram;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int cur=0;
		for(int i=1; i<arr.length;i++) {
			cur=arr[i];
			for(int j=i-1; j>=0;j--) {
				if(cur<arr[j]) {
					arr[j+1]=arr[j];
					arr[j]=cur;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {4, 2, 10, 5, 8, 34, 3};
		insertionSort(arr);
	}
}
