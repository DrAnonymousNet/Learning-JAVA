//85. Write a program that generates an array of 50 random integers from 1 to 100. Then rotate the elements of the array so that the element in the first position moves to the second index, the element in the second position moves to the third position, etc., and the element in the last position moves to the first position.

import java.util.*;


public class Main {
	public static void main(String[] args) {
		int[] arr = new int[50];
		Random random = new Random();
		for (int i = 0; i < 50 ;i++){
			arr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		int temp = arr[0];
		int prev;
		int last = arr[49];
		arr[0] = last;
		for (int i  = 1; i < 50;i++){
			prev = arr[i];
			arr[i] = temp;
			temp = prev;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}