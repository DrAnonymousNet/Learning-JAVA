//77. Write a program that generates an array of 50 random integers from 1 to 100. Once you have generated the array, replace each integer in the array with its square.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		List <Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(100));
		}
		System.out.println(list);

		for (int i = 0; i < 50; i++) {
			list.set(i, (int)Math.pow(list.get(i),2));
		}
		System.out.print(list);
	}

}