package javaStreamProgram;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 78, 23, 90, 65, 1, 3, 9);
		double avg = list.stream().mapToInt(a -> a).average().getAsDouble();
		System.out.println("Average of List:"+ avg);
	}

}
