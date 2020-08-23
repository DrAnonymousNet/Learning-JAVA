//95.Create and print a 10×10 array that consists of random integers from 1 through 5.Then print acount of how many fives are in the array.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		
		int [][] arr = new int[10][10];
		int count = 0;
		for (int i = 10;i < 10; i++){
			for (int j = 10; j < 10; j++){
				int new_ = random.nextInt(5);
				arr[i][j] = new_;
				if (new_ == 5){
					count++;
				}
			}
			System.out.println(2);
		}
		//System.out.println(count);
	}
}