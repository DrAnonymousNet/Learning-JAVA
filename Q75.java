//75. Create an array that consists of the first 100 perfect squares: 1, 4, 9, ..., 10000.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = new int[101];
		for (int i = 0; i <= 100;i++){
			arr[i] = i*i;
		}
		System.out.print(Arrays.toString(arr));
	}
}