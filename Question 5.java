import java.util.Scanner;

//5. The power in Watts across part of an electrical circuit is given by P = V^2/ R , where V is the voltage and R is the resistance. Write a program that asks the user to enter the voltage and resistance. The program should then print out what the corresponding power is. It should also print out a warning if the power turns out to be greater than 1000 watts.

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Input Voltage: ");
	double V = scanner.nextDouble();
	System.out.print("Input Resistance: ");
	double R = scanner.nextDouble();
	
	double P = Math.pow(V,2)/R;
	System.out.println("The Power Rating is : " + P + " Watts");
	
	if (P > 1000){
		System.out.print("Warning!!! Power rating is greater than 1000 watts");
	}
	}
}
