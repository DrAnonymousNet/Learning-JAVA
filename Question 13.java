import java.util.Scanner;

//13. Generally, a year is a leap year if it is divisible by 4. However, if it is also divisible by 100, then it is not a leap year, except in the case that it is actually divisible by 400, in which case it is a leap year. Write a program that asks the user for a year and prints out whether it is a leap year or not.

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0)|| (year % 400== 0)){
			System.out.print("True");
		}
		else{
			System.out.print("False");
		}
		
	}
}
