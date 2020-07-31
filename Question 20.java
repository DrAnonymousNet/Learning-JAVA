import java.util.Scanner;

//20.Write a program that asks the user to enter numbers from one to 10 .The program should stop when the user enters a 5. After the loop is done , the program should printouts count of how many numbers were entered and printout yes or no ,depending on whether the user entered any numbers less than 3.

public class Main {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1-10: ");
		int num = scanner.nextInt();
		int count = 1;
		while (num != 5){
			if (num < 3){
				flag = false;
			}
			System.out.print("Enter a number: ");
			num = scanner.nextInt();
			count += 1;
		}
		System.out.print("You entered "+ count+ " numbers and");
		if (flag == false){
			System.out.print(" yes There was a number less than 3");
		}
		else{
			System.out.print(" No there was no number less than 3 ");
		}
			
			
		
		
		
	}
}
