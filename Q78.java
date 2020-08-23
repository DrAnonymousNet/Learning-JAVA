//78. Write a program that creates a list containing the first 100 triangular numbers. The triangular numbers are the numbers 1, 1+2=3, 1+2+3=6, 1+2+3+4=10, etc.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i <= 100;i++){
			list.add(sum);
			sum += i;
		}
		System.out.print(list);
	}
}