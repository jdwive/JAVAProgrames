package javaStreamProgram;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,56,89,1, 55,9,12);
		double avg=list.stream()
						.map(e->e*e)
							.filter(e -> e >100)
						 		.mapToInt(e->e)
						 			.average()
						 				.getAsDouble();
		System.out.println("Average of square numbers: "+avg);
	}

}
