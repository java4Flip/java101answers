package edu.itdc.training.exer.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		int intArray[] = {4,5,34,64,3,2,54,3,1,65,53,656,1,2,32};

		Integer newArray[] = IntStream.of(intArray).boxed().toArray(Integer[]::new);
		Arrays.stream(newArray).sorted(Collections.reverseOrder()).limit(5).forEach(System.out::println);

	}

}
