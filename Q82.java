//81. Write a program that asks the user to enter in 10 quiz scores, drops the two lowest scores, and prints out the average of the rest of them. Use lists to do this problem.

//82. Do the problem above without lists

import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] arr = new int[10];
	int smallest = Integer.MAX_VALUE;
	int s_smallest = Integer.MAX_VALUE;
	double sum = 0.0;
	for (int i = 0; i < 10; i++){
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		if (n < smallest){
			s_smallest = smallest;
			smallest = n;
			}
			
		else if ( n < s_smallest){
			s_smallest = n;
			}
			sum += n;
			arr[i] = n;
	}
	
	sum = (sum - smallest -s_smallest)/8.0;
	
	int[] add= new int[10];
	int c = 0;
	for (int j : arr){
		if (j != smallest || j != s_smallest ){
			add[c] = j;
			c++;
		}
	}
		
	
	System.out.println(Arrays.toString(add));
	System.out.print(sum);
	
				
			
	}
}