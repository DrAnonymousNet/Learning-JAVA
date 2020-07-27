//6. Write a program that uses a for loop to print out the numbers 8, 11, 14, 17, 20, ..., 83, 86, 89.

public class Main {
	public static void main(String[] args) {
	for (int i = 8; i < 89;i += 3){
		System.out.print(i+", ");
	}
	System.out.print(89);
	}
}
