import java.util.Scanner;

//17.Write a program that computes the factorial of a number. The factorial, n!, of a number n is the product of all the integers from 1 to n, including n. For instance, 5! = 1·2·3·4·5 = 120. [Hint: Try using the multiplicative equivalent of the counting statement count=count+1].

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int n= scanner.nextInt();
		int fact = 1;
		for (int i = n; i >= 1; i--){
			fact *= i;
		}
		System.out.print(fact);
	}
}
