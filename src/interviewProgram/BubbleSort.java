package interviewProgram;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
public static void main(String[] args) {
	int arr[]= {5,3,9,5,78,12};
	int arr1[]= {5, 1, -8, -30, 30, 2};
	bubbleSort(arr);
	bubbleSort(arr1);
}
}
