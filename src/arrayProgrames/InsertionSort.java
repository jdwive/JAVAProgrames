package ArrayProgramm;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (cur < arr[j]) {
					arr[j+1]=arr[j];
					arr[j] = cur;
				} else
					break;
			}

		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 7, 1, 9, 5 };
		insertionSort(arr);
		int arr1[] = { 2, 7, 8, 1, 3 };
		int arr2[] = { 2, 7, 8, -1, 5, 3, -67 };
		int arr3[] = { 2, 7, 8, 2, 1, 3, -3 };
		int arr4[] = {5, 4, 8, 2, 9, 5, 5};
		insertionSort(arr4);
		insertionSort(arr1);
		insertionSort(arr2);
		insertionSort(arr3);

	}

}
