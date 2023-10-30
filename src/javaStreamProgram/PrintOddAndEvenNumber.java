package javaStreamProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddAndEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(7,8,45,34,12,10);
		List<Integer> even= list.stream()
									.filter(e->e%2==0)
										.collect(Collectors.toList());
		List<Integer> odd = list.stream()
								.filter(e-> e%2!=0)
									.collect(Collectors.toList());
		System.out.println("List of Even Numbers:"+ even);
		System.out.println("List of Odd Numbers: "+ odd);
	}

}
