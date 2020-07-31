//18. Write a while loop that produces the exact same output as the for loop below. for (int i=2; i<50; i++) System.out.print(i + " ");

public class Main {
	public static void main(String[] args) {
		int i = 0;
		while (i < 50){
			System.out.print(i + " ");
			i++;
		}
		
	}
}
