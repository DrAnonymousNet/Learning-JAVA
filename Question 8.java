import java.util.Scanner;

//8. This is a very simple billing program. Ask the user for a starting hour and ending hour, both given in 24-hour format (e.g., 1 pm is 13, 2 pm is 14, etc.). The charge to use the service is $5.50 per hour. Print out the user’s total bill. You can assume that the service will never be used for more than 24 hours. Be careful to take care of the case that the starting hour is before midnight and the ending time is after midnight.

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Starting hour: ");
		int starting_hour = scanner.nextInt();
		System.out.print("Enter ending Hour: ");
		int ending_hour = scanner.nextInt();
		

		double charges = 5.50 *(ending_hour-starting_hour);
		System.out.print("Your Service Charges is: $" + charges);

	}
}
