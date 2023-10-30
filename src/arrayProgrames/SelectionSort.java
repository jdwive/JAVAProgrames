package ArrayProgramm;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int min_index=0, temp=0;
		for(int i=0; i<arr.length;i++) {
			min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_index]>arr[j]) {
					min_index=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 8, 4, 10, 2, 5, 4, 1 };
		int arr1[] = { 2, 7, 8, 1, 3 };
		int arr2[] = { 2, 7, 8, -1, 5, 3, -67 };
		int arr3[] = { 2, 7, 8, 2, 1, 3, -3 };
		int arr4[] = {10,12, 16, 11, 13, 14};
		selectionSort(arr);
		selectionSort(arr1);
		selectionSort(arr2);
		selectionSort(arr3);
		selectionSort(arr4);
		
	}
}
