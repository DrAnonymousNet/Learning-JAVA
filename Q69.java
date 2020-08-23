//69. In algebraic expressions, the symbol for multiplication is often left out, as in 3x+4y or 3(x+5). Computers prefer those expressions to include the multiplication symbol, like 3*x+4*y or 3*(x+5). Write a program that asks the user for an algebraic expression and then inserts multiplication symbols any time a number is followed by a letter or an open parenthesis. [Hint: Character.isDigit(c) can be used to check if the character c is a digit.]

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Expression: ");
		String words = scanner.nextLine();
		char[] ch = words.toCharArray();
		int i = 0;
		for (Character x : ch){
			if (Character.isDigit(x) && (Character.isLetter(ch[i+1]) || ch[i+1] == '(' )){
				System.out.print(ch[i] +"*");
			}
			else{
			System.out.print(ch[i]);
			}
			i++;
		
		}
	}
}