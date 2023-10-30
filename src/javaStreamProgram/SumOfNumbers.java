package javaStreamProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	public static void main(String args[]) {
		List<Integer> list= Arrays.asList(1, 4, 67, 89, 23,89,0,56,43,8,4,93,99);
		System.out.println(sumOfNumbers(list));
		sumUsingStream(list);
	}
	public static int sumOfNumbers(List<Integer> list) {
		int sum=0;
		for(int num: list) {
			sum=sum+num;
		}
		return sum;
	}
	public static void sumUsingStream(List<Integer> list) {
		Optional<Integer> sum= list.stream().reduce((a,b)->a+b);
		System.out.println("Sum of Integers:"+ sum.get());
	}
}
