import java.util.Random;

//29.Write a programthat generates a random number,x,from 1 and 50;generates a random number,y,from 2 and 5;and computes x^y.

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(50);
		int y = rand.nextInt(4)+2;

		System.out.println(Math.pow(x,y));
		
	}
}
