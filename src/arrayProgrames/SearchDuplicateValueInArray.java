package arrayProgrames;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchDuplicateValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {12, 78, 45, 89, 34, 12, 45, 71,12};
		String fruits[]= {"Mango", "Banana", "Kiwi", "Banana", "Cherry", "Kiwi", "Banana", "BlueBerry"};
		
		searchDuplicateElement(num);
		searchDuplicateElement(fruits);
	}

	private static void searchDuplicateElement(String[] fruits) {
		// TODO Auto-generated method stub
		//Method1
		ArrayList<String> lst=new ArrayList<>();
		for(String s:fruits) {
			if(lst.contains(s))
				System.out.println(s+" Element is duplicate");
			else
				lst.add(s);
		}
		System.out.println("-----------------------------");
		
		//Method2
		HashMap<String, Integer> hmap=new HashMap<>();
		for(String s:fruits) {
			if(hmap.get(s)==null)
				hmap.put(s, 1);
			else
				hmap.put(s, (hmap.get(s)+1));
		}
		for(String s:hmap.keySet()) {
			if(hmap.get(s)>1)
				System.out.println(s+" is duplicate.");
		}
		System.out.println("-----------------------------");
	}

	private static void searchDuplicateElement(int[] num) {
		// TODO Auto-generated method stub
		//Method1:
		ArrayList<Integer> lst=new ArrayList<>();
		for(int i:num) {
			if(lst.contains(i))
				System.out.println(i+" Element is duplicate.");
			else
				lst.add(i);
		}
		System.out.println("-----------------------------");
		//Method2:
		HashMap<Integer, Integer> hmap=new HashMap<>();
		for(int i:num) {
			if(hmap.get(i)==null)
				hmap.put(i, 1);
			else
				hmap.put(i,(hmap.get(i)+1));
		}
		for(int i: hmap.keySet()) {
			if(hmap.get(i)>1)
				System.out.println(i+" is duplicate.");
		}
		System.out.println("-----------------------------");
	}

}
