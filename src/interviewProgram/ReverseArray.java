package interviewProgram;

import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int arr[]) {
		int newArr[]=new int[arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--){
			newArr[count]=arr[i];
			count++;
		}
		System.out.println(Arrays.toString(newArr));		
	}
	public static void reverseArray_WithoutBuffer(int[] arr) {
		int temp=0,count=0;
		for(int i=0;i<arr.length;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-(i+1)];
			arr[arr.length-(i+1)]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {2, 5, 7, 9, 10};
		reverseArray(arr);
		reverseArray_WithoutBuffer(arr);
	}

}
