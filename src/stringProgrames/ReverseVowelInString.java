package stringProgrames;

import java.util.Scanner;

public class ReverseVowelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String vowel = "aeiouAEIOU";
		char sarr[] = str.toCharArray();
		char temp[] = new char[10];
		int count = 0, index = 0;
		for (char c : sarr) {
			if (vowel.contains(String.valueOf(c))) {
				temp[count++] = c;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(sarr[i]).contains(String.valueOf(temp[index]))) {
				sarr[i] = temp[--count];
				index++;
			}
		}

		System.out.println(String.valueOf(sarr));

		reverseVowel(str);
	}

	private static void reverseVowel(String str) {
		// TODO Auto-generated method stub
		String temp = "", vowel = "aeiouAEIOU";
		int count = 0;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (vowel.contains(String.valueOf(arr[i]))) {
				temp = temp + arr[i];
			}
		}
		int index = temp.length();
		for (int i = 0; i < arr.length; i++) {
			if (String.valueOf(arr[i]).contains(String.valueOf(temp.charAt(count)))) {
				arr[i] = temp.charAt(--index);
				count++;
			}
		}
		System.out.println(String.valueOf(arr));

	}

}
