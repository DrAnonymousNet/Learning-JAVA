import java.util.Scanner;

//14. Write a program that asks the user to enter a value n, and then computes (1+ 1 ln function is Math.log in Java.

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= num;i++){
			sum += 1/i;
		}
		sum -= Math.log(num);
		System.out.print(sum);
	}

}
