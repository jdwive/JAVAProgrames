package basicProgrames;

import java.util.HashMap;

public class TestClass {
	public static void main(String[] args) {
		checkchar();
	}
	public static void checkchar() {
	String ss = "Jigyasa dwivedi";
	HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	for(char c :ss.toCharArray()) {
		if(hmap.get(c)==null)
			hmap.put(c, 1);
		else
			hmap.put(c, hmap.get(c)+1);
	}
	for(char ch:hmap.keySet()) {
		if(hmap.get(ch)>1) {
			System.out.println(ch+": "+ hmap.get(ch));
			break;
		}
			
	}
	}
}
