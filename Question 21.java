import java.util.Scanner;

//21.The3x+1problemis one of the most famous unsolved problems in math.  You start with an integer x. If x is even,divide it by 2and if it is odd,compute 3x+1.Then do the same to this number, dividing it by 2 if it is even,and multiplying it by 3 and adding 1 if it is odd. Continue this process until you get a 1.Forinstance,x=11givesthesequence 11,34,17,52,26,13,40,20,10,5,16,8,4,2,1.It is conjectured that no matter what value of you start with,you always end up with 1,but no one can prove it. Ask the user to enter a starting value ,and printout the entire sequence on one line until the first 1.

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		while (num != 1){
			
			if (num % 2== 0){
				num = num/2;
			}
			else if (num % 2== 1){
				num = 3*num + 1;
			}
			
			System.out.print(num + " ");
		}
		
	}
}
