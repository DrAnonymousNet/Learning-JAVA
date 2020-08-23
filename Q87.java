//87. Write a program that generates a list of 100 random numbers from 1 to 50. Print out the list and then write some code that changes the first two occurrences of 50 to -999. If there is just one 50 in the list, then just change it. If there are no 50s in the list, then print a message saying so.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		int[] arr = new int[50];
		Random random = new Random();
		
		for (int i = 0; i < 50 ;i++){
			arr[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		for (int i = 0; i < 50;i++){
			if (arr[i]== 50){
				arr[i] = -999;
				count++;
			}
		}
		if (count >= 1){
			System.out.println(Arrays.toString(arr));
		}
		else{
			System.out.println("There is no 50 in the array");
		}
		
	}
}