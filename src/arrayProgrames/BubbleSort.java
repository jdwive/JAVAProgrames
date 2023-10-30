package ArrayProgramm;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int temp=0;
		for (int i=0;i<arr.length;i++) {
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
		int arr[]= {5, 2, 6, 1, 3};
		int arr1[] = { 2, 7, 8, 1, 3 };
		int arr2[] = { 2, 7, 8, -1, 5, 3, -67 };
		int arr3[] = { 2, 7, 8, 2, 1, 3, -3 };
		int arr4[] = {10,12, 16, 11, 13, 14};
		bubbleSort(arr);
		bubbleSort(arr1);
		bubbleSort(arr2);
		bubbleSort(arr3);
		bubbleSort(arr4);
		
		
	}

}
