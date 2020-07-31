import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//16. Consider the following sequence: 1, 2, 3, 2.0, 2.333, 2.444, 2.259, 2.345, .... The first three terms are 1, 2, 3 and each additional term in the sequence is obtained from the average of the previous three terms. For example, the fourth term is (1+2+3)/3 = 2, and the fifth term is (2+3+2)/3 =2.333. In equation form, each term an is given by an = (an−1 +an−2 +an−3)/3. Write a program that asks the user for a value, n, and prints out the nth term of the sequence.

public class Main {
	public static void main(String[] args) {
	List <Double> num = new ArrayList <Double>();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = scanner.nextInt();
	Collections.addAll(num, 1.0,2.0,3.0);
	
	for (int i = 3; i <= n; i++){
			double avg = (num.get(i-1) + num.get(i-2) + num.get(i-3))/3.0;
			num.add(avg);
			}
			
		System.out.print(num);		
	}
}
