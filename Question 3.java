import java.util.Scanner;

//3. The Body Mass Index, BMI, is calculated as BMI= 7
03w h2 , where w is the person’s weight in pounds and h is the person’s height in inches. Write a program that asks the user for their height their weight and prints out their BMI.

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your Weight in pounds: ");
	
	double weight = scanner.nextDouble();
	
	System.out.print("Enter your height in m: ");
	
	double height = scanner.nextDouble();
	
	double BMI = (703*weight)/Math.pow(height, 2);
	
	
	System.out.print("You BMI is: " + BMI);
	

	
	}
}
