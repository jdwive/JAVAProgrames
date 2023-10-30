package javaStreamProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,4,5,6,3,2,1,5, 4,8,90,78,56,4,67,78,98,90,8);
		Set duplicate = list.stream()
								.filter(e->Collections.frequency(list, e)>1)
									.collect(Collectors.toSet());
		System.out.print(duplicate);
	}

}
