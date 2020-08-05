//32. Write a program that generates and prints 100 random numbers such that the first number comes from the range from 1 to 2, the second comes from 1 to 3, the third comes from 1 and 4, etc.

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0 ; i <= 100;i++){
			int num = random.nextInt((i+2)-1+1)+1;
			System.out.print(num + " ");
		}
	}
}
