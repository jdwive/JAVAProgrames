package program;

import java.util.Arrays;

public class CheckTwoArrayEqual {
	public static void main(String args[]) {
		int a[]= {45,78,23};
		int b[]= {23,78,45};
		if(a.length==b.length) {
			Arrays.sort(a);
			Arrays.sort(b);
		}else
			System.out.println("Arrays are not equal");
		if(Arrays.equals(a, b)) System.out.println("Arrays are equal.");
		else System.out.println("Arrays are not equal.");
		
	}
}
