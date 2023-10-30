package interviewProgram;
import java.util.*;

public class PrintRepeatCharInString {
	public static void printRepeatChar(String str) {
		String temp="";
		for(int i=0; i<str.length();i++) {
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)) {
					if(!temp.contains(String.valueOf(str.charAt(i))))
						temp=temp+str.charAt(i);
				break;
				}
			}
		}
		System.out.println(temp);
	}
	public static void printRepeatChar_HMap(String str) {
		HashMap<Character, Integer> hmap= new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(hmap.get(str.charAt(i))==null)
				hmap.put(str.charAt(i),1);
			else hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
		}
		for(char ch:hmap.keySet()) {
			if(hmap.get(ch)>1)
				System.out.print(ch);
		}
		System.out.println("\n"+hmap);
	}
	public static void main(String[] args) {
		printRepeatChar("Kuhu Kuhu Kuhu");
		printRepeatChar_HMap("Kuhu Kuhu Kuhu");
	}

}
