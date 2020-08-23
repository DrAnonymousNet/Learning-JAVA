//73. Write a program that creates an array of 100 random integers that are either 0 or 1. Then print out the array and how many 1s are in the array.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[100];
		for (int i = 0; i <= 99; i++){
			arr[i] = random.nextInt(2);
		}
		System.out.print(Arrays.toString(arr));
	}
}