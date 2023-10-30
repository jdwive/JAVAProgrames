package interviewProgram;
import java.util.*;
public class Anagram {
	public static boolean anagramString(String str1, String str2) {
		boolean flag=false;
		if(str1.equalsIgnoreCase(str2) || str1.length()!=str2.length())
			return false;
		else {
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0; i <arr1.length;i++) {
				if(arr1[i]!=arr2[i])
					return false;
				else
					flag=true;
			}
		}
		return flag;
	}
	public static boolean anagramNumber(int num1, int num2) {
		int arr1[]=numberToArray(num1);
		int arr2[]=numberToArray(num2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length==arr2.length && isValueEqual(arr1, arr2))
			return true;
		else
			return false;		
	}
	public static boolean isValueEqual(int []arr1, int []arr2) {
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
	public static int[] numberToArray(int number) {
		int temp=number, count=0, i=0;
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		int arr[]=new int[count];
		count=0;
		while(number!=0) {
			arr[count]=number%10;
			number=number/10;
			count++;
		}
		return arr;
	}
	public static void main(String args[]) {
		System.out.println("test and sett is anagram: "+anagramString("test", "sett"));
		System.out.println("kuh and huk is anagram: "+anagramString("kuh","huk"));
		System.out.println("mope and Tope is anagram: "+anagramString("mope", "Tope"));
		System.out.println("100 and 001 is anagram: "+anagramNumber(100,101));
		System.out.println("5876 and 6875 is anagram: "+anagramNumber(5876,6875));
	}

}
