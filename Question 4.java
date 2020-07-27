import java.util.Scanner;

//4. Write a program that asks the user how many credits they have taken and prints their class standing. The credit ranges are 0-23 for freshmen, 24-53 for sophomores, 54-83 for juniors, and 84 and over for seniors.

public class Main {
	public static void main(String[] args) {
	
	Scanner scanner  = new Scanner(System.in);
	
	System.out.print("How Many Courses have you Taken: ");
	int no_courses = scanner.nextInt();
	
	if (no_courses <= 23){
		System.out.print("Fresh Man");
	}
	else if (no_courses <= 53){
		System.out.print("Sophomores");
	}
	else if (no_courses <= 83){
		System.out.print("Juniors");
	}
	else {
		System.out.print("Seniors");
	}
	}
}
