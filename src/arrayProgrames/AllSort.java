package ArrayProgramm;

import java.util.Arrays;

public class AllSort {
	public static void bubbleSort(int[] arr) {
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}			
		}
		System.out.println("Bubble Sort: "+Arrays.toString(arr));
	}
	public static void selectionSort(int[] arr) {
		int min_index =0, temp=0;
		for(int i=0;i<arr.length;i++) {
			min_index =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_index]>arr[j])
					min_index=j;
			}
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		System.out.println("Selection Sort: "+Arrays.toString(arr));
	}
	public static void insertionSort(int[] arr) {
		int cur =0;
		for(int i=1;i<arr.length;i++) {
			for(int j=i-1; j>=0;j--) {
				if(arr[i]<arr[j]) {
					cur=arr[i];
					arr[i]=arr[j];
					arr[j]=cur;
				}
			}
		}
		System.out.println("Insertion Sort: "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {45, 23, 54, 12, 8, 5};
		//bubbleSort(arr);
		selectionSort(arr);
		//insertionSort(arr);
	}

}
