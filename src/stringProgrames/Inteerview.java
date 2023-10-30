package stringProgrames;

import java.util.Arrays;

public class Inteerview {
	public static void main(String args[]) {
	int [] arr= {13,5,10,7,1};
	int min=arr[0]-arr[1];
	for(int i=0; i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				if(min >arr[i]-arr[j]) {
				min=arr[i]-arr[j];
			}
			}
				else {
					if(min >arr[j]-arr[i]) {
						min=arr[j]-arr[i];
				}
				}
		}
	}
	System.out.println(min);
}
}