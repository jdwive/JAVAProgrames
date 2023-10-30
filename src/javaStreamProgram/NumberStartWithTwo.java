package javaStreamProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWithTwo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22,89,234,78,45,200,27, -20);
		List<Integer> numbers= list.stream()
									.map(e-> String.valueOf(e))
										.filter(e -> e.startsWith("2") || e.startsWith("-2"))
											.map(Integer::valueOf)
												.collect(Collectors.toList());
		System.out.println("Numbers Starts with Two:"+ numbers);
												
	}

}
