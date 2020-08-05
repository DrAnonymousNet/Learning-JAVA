import java.util.Random;
//31. Write a program that generates and prints 50 random zeroes and ones, all on the same line, with no spaces separating them.


public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		for (int i = 0; i <= 50; i++){
			int rand = random.nextInt(1-0+1)+0;
			System.out.print(rand);
		}
	}
}
