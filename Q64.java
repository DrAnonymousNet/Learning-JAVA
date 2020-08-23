import java.util.*;

//64. Write a program that determines whether a word is a palindrome or not. A palindrome is a word that reads the same backwards as forwards.
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text = scanner.nextLine();
		char[] tex = text.toCharArray();
		String rev = "";
		
		int i ;
		for ( i = text.length()-1; i >= 0; i--){
			rev += tex[i];
		}
		
		if (text.equalsIgnoreCase(rev)){
			System.out.println(true);
		}
		else{
			System.out.print(false);
		}
	}
}