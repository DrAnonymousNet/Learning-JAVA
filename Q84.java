//84. Write a program that creates a array of 1000 random integers from 0 to 49. Then have the program create a new array of 50 integers whose nth element is the number of times that n appears in the array of random integers.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[1000];
		for (int i = 0;i < 1000;i++){
			arr[i] = random.nextInt(49);
		}
		int [] arrs = new int[50];
		for (int j = 0; j < 50; j++){
			int count = 0;
			for (int k = 0; k < arr.length ;k++){
				if (arr[k] == j){
					count++;
				}
			}
			arrs[j] = count;
		}
		System.out.println(Arrays.toString(arrs));
		
	}
}