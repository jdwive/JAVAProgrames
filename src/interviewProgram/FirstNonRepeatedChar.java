package interviewProgram;
import java.util.*;
public class FirstNonRepeatedChar {
	public static void firstNonRepeatedChar(String str) {
		HashMap<Character, Integer> hmap=new HashMap<>();
		for(int i=0;i<str.length();i++) {			
			if(hmap.get(str.charAt(i))==null)
				hmap.put(str.charAt(i), 1);
			else
				hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
		}
		for(char ch:str.toCharArray()) {
			if(hmap.get(ch)>1) {
				System.out.println(ch);
				break;
			}			
		}
	}
	public static void main(String[] args) {
		firstNonRepeatedChar("Jigyasa");
		firstNonRepeatedChar("anagram");
		firstNonRepeatedChar("pihupihu");
	}

}
