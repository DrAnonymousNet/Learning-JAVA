//79. Write a program that asks the user to enter 10 numbers and stores them in a list. Then print out the smallest number the user entered.

import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	List <Integer> list = new ArrayList<Integer>();
	int smallest = Integer.MAX_VALUE;
	for (int i =0 ; i <= 10;i++){
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		list.add(n);
		if (smallest > n){
			smallest = n;
		}
	}
	System.out.print(smallest + " "+ list);
		
		
	}
}