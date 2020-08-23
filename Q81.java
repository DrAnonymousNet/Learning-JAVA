//81. Write a program that asks the user to enter in 10 quiz scores, drops the two lowest scores, and prints out the average of the rest of them. Use lists to do this problem.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <Integer> scores = new ArrayList<Integer>();
		int smallest = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		double sum = 0.0;
		for (int i = 0;i <= 10;i++){
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			if (n < smallest){
				
				second_small = smallest;
				smallest = n;
				
			}
			else if (n < second_small ){
			second_small = n;
			
			}
					
			
			scores.add(n);
			sum += n;
		}
		sum = (sum - smallest - second_small)/8.0;
		scores.remove(scores.indexOf(smallest));
		scores.remove(scores.indexOf(second_small));
		System.out.println(sum);
		System.out.print(scores);
		
		
		
		
				
	}
}