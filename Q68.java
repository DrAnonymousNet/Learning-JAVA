//68. A simple way of encrypting a message is to rearrange its characters. One way to rearrange the characters is to pick out the characters at even indices, put them first in the encrypted string, and follow them by the odd characters. For example, the string message would be encrypted as msaeesg because the even characters are m, s, a, g (at indices 0, 2, 4, and 6) and the odd characters are e, s, g (at indices 1, 3, and 5). Write a program that asks the user for a string and uses this method to encrypt the string.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String text = scanner.nextLine();
		char[] x = text.toCharArray();
		String even = "";
		String odd = "";
		
		int i = 0;
		for (Character y : x  ){
			if (i % 2 == 0){
				even += y;
			}
			else if (i % 2== 1){
				odd += y;
			}
			i++;
		}
		System.out.print(even+odd);
		
				

	}
}