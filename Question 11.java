import java.util.Scanner;

//11. It is possible to compute square roots using just multiplication, addition, and division. To estimate the square root of the number a to very high accuracy, start by setting x = 2.0. Then replace x with the average of x and a/x. Then replace this new x with the average of x and a/x (using the new x). Repeat this 50 times and print out the end result.

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		double x = 2.0;
		double sqrt = 0.0;
		int i = 1;
		while (i < 50){
			sqrt = number / x;
			
			x = (x + sqrt)/2.0;
			i++;
			
		}
		System.out.print("The Square root is: " +  sqrt);
	}
}
