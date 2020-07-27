//2. Write a program that uses a for loop to obtain the output below on the left. Then write a program using a for loop to obtain the output on the right. A A A A A 1. A 2. A 3. A 4. A 5. A
public class Main {
	public static void main(String[] args) {
	
	for (int i = 1; i <6; i++){
		System.out.println('A');
	}
	
	for (int i = 1; i <6; i++){
		System.out.println(i + ". A");
	}
	}
}
