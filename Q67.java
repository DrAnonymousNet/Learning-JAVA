//67. Write a program that asks the user to enter a sentence that contains some positive integers. Then write a program that reads through the string and replaces each number n in the sentence with n+1. For instance: input: I bought 4 apples and 17 oranges. output: I bought 5 apples and 18 oranges. input: My favorite number is 8. output: My favorite number is 9.
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a text consisting of a number: ");
		String[] text = scanner.nextLine().split(" ");
		int i = 0;

		for (String x : text) {
			if (x.length() <= 2) {
				char y = x.charAt(0);
				if (Character.isDigit(y)) {
					text[i] = String.valueOf(Integer.parseInt(x) + 1);
				}
			}
			i++;
		}


		for (String y : text)
			System.out.print(y + " ");

	}

}