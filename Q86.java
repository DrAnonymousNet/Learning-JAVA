//86. Write a program that asks the user to enter a sentence and returns a count of how many 5-letter words are in the sentence. For this, you should be careful of punctuation. Assume punctuation consists of the following characters: . ! ? ( ) , ; :

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.print("Enter a sentence: ");
		Scanner scanner = new Scanner(System.in);
		String[] text = scanner.nextLine().split("[ .!?(), ;:]");
		System.out.println(Arrays.toString(text));
		int count = 0;
		for (String c: text){
			if (c.length() == 5){
				count++;
			}
		}
		System.out.print(count);
	}
}