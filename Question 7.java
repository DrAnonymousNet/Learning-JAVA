import java.util.Scanner;

//7.Write a program that uses a loop to ask the user to enter 10 numbers. Then the program should print the average of those 10 numbers.


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		for (int i = 1;i <= 10;i++){
			System.out.printf("Enter %d number: ",i);
			double num = scanner.nextDouble();
			sum += num;
			
		}
		double Average = sum/10.0;
		System.out.println("The average of the ten numbers is: " + Average);
	}
}
