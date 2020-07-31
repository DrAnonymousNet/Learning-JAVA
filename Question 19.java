import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//19. Write a program that allows the user to enter any number of test scores. The user indicates they are done by entering in a negative number. Print how many of the scores are A’s (90 or above). Also print out the average.
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int nums = scanner.nextInt();
		List<Integer> grades = new ArrayList<Integer>();
		while (nums > 0){
			grades.add(nums);
			System.out.print("Enter a number: ");
			nums = scanner.nextInt();
		}
		
		int count = 0;
		for (int c: grades){
			if (c >= 90){
				count += 1;
				System.out.println(c);
			}
		}
		
		System.out.print(count);
		
	}
}
