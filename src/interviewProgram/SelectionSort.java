package interviewProgram;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int min_index = 0, temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			min_index = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min_index])
					min_index = j;
			}
			temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, 9, 5, 78, 12 };
		int arr1[] = { 5, 1, -8, -30, 30, 2 };
		selectionSort(arr);
		selectionSort(arr1);
	}

}
