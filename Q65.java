//65. Write a program that asks the user to enter a string and then prints out the first letter, then the first two letters, then the first three letters, etc., all on the same line. For instance, if the user enters abcde, the program would print out a ab abc abcd abcde.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		
		for (int i = 0; i <= word.length(); i++){
			System.out.print(word.substring(0,i)+ " ");
		}
	}
}