import java.util.Random;
//30.Write a program that generates and prints 100 random numbers from 50 to 60 , all on the same line,separated by spaces.

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i <= 100;i++){
			int num = random.nextInt(60-50+1)+50;
			System.out.print(num + " ");
		}
	}
}
