package arrayProgrames;

import java.util.Arrays;

public class CheckTwoArrayEqual {
	public static void main(String args[]) {
		int a[]= {45,78,21};
		int b[]= {23,78,45};
		int c[]= {27,8,33,1};
		int d[]= {8,1,33,27};
		findArraysEquals(a,b);
		findArraysEqualsWithoutFunction(c,d);
	}

	private static void findArraysEqualsWithoutFunction(int[] a, int[] b) {
		// TODO Auto-generated method stub
		if(a.length==b.length) {
			sortArray(a);
			sortArray(b);
			equalArray(a,b);
		}
	}

	private static void equalArray(int[] a, int[] b) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				flag=false;
				break;
			}
			else flag=true;
		}
		if(flag==true)System.out.println("Arrays are equal check without inbuit function.");
		else System.out.println("Arrays are not equal check without inbuit function.");
	}

	private static void sortArray(int[] a) {
		// TODO Auto-generated method stub
		int temp=0;
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	private static void findArraysEquals(int[] a, int[] b) {
		// TODO Auto-generated method stub
		if(a.length==b.length) {
			Arrays.sort(a);
			Arrays.sort(b);
		}else
			System.out.println("Arrays are not equal");
		if(Arrays.equals(a, b)) System.out.println("Arrays are equal.");
		else System.out.println("Arrays are not equal.");
	}
}
