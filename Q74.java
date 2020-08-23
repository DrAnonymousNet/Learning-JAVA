//74. Do the same as the problem above, but use a list instead of an array.

//Write a program that creates an array of 100 random integers that are either 0 or 1. Then print out the array and how many 1s are in the array.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		List <Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i <= 99; i++){
			arr.add(random.nextInt(2));
		}
		System.out.print(arr);
	}
}