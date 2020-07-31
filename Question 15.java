import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//15. Consider the following sequence: 1, 1, 3, 7, 17, 41, 99, 239, 577, 1393, .... The first two terms are 1 and each term in the sequence is obtained from the previous two terms by taking twice the previous term and adding it to the term before that. For example, 3 = 2·1+1, 7 = 2·3+1, and 17=2·7+3. In equation form, each term an is given by an = 2an−1 +an−2. Write a program that asks the user for a value, n, and prints out the nth term of the sequence.

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		List<Integer> fib = new ArrayList<Integer>();
		Collections.addAll(fib, 0,1,1);
		for (int i = 3 ; i <= num;i++){
			fib.add(fib.get(i-2) + fib.get(i-1));
		}
		System.out.print(fib.get(num));
			
	}
}
