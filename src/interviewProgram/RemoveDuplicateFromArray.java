package interviewProgram;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	public static void removeDuplicate(int[] arr) {
		int newArr[]= new int[arr.length];
		int count=0;
		boolean flag=false;
		newArr[count]=arr[0];
		for(int i=1; i<arr.length;i++) {
			for(int j=0; j<=count;j++) {
				if(arr[i]!=newArr[j])
					flag=true;
				else {
					flag=false;
					break;}
					
			}
			if(flag==true) {
				newArr[++count]=arr[i];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
	public static void removeDuplicateString(String[] stringArr) {
		String newArr[]=new String[stringArr.length];
		int count=0;
		boolean flag =false;
		newArr[count]=stringArr[0];
		for(int i=1; i<stringArr.length;i++) {
			for(int j=0; j<=count;j++) {
				if(stringArr[i]!=newArr[j])
					flag=true;
				else {
					flag=false;
					break;
				}				
			}
			if(flag== true)
				newArr[++count]=stringArr[i];
		}
		System.out.println(Arrays.toString(newArr));		
	}
public static void main(String[] args) {
	int arr[]= {1, 4, 6, 2, 1, 4, 2};
	String[] stringArr= {"Jigyasa", "Kuhu", "Pihu", "My", "Kuhu", "Pihu"};
	removeDuplicate(arr);
	removeDuplicateString(stringArr);
}
}
