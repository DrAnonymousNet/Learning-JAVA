//88.Create a list that contains the numbers 1 through 20 in order.Then have the program randomly pick three pairs of elements in the list and swap them.Print out the resultinglist.An element maybe swapped more than once.A possible output is [7,2,3,4,5,6,1,8,12,10,11,9,13,14,15,18,17,16,19,20].The swaps in this example are 1,7,then 9,12,and finally 16,18.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = new int[20];
		Random random = new Random();
		for (int i = 1;i <= 20;i++) {
			arr[i - 1] = i;
		}
		int temp = 0;
		for (int i = 0; i < 3 ; i++) {
			int j = random.nextInt(20);
			int k = random.nextInt(20);
			temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
			System.out.println("Swaping element at Index " + j + " " + k);
		}
		System.out.print(Arrays.toString(arr));
	}
}