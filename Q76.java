/*76. Generate and print out a list of 10 random integers from 1 to 50.
 Then do the following:
 (a) Print out how many even numbers are in the list.
 (b) Print out yes or no, depending on whether or not the list contains any numbers greater than 45.
  (c) Create a new list that consists of the elements of the original list in reverse order.
   (d) Ask the user for an integer n. The program should reverse the first n things in the list and leave the others alone.
    For instance, if the list is ["A","B","C","D","E","F","G","H","I","J"] and the user chooses 6, we get ["F","E","D","C","B","A","G","H","I","J"].*/

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in) ;
		List <Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(50));
		}
		System.out.println(list);
		int count = 0;
		boolean flag = false;
		for (int c : list) {
			if (c % 2 == 0) {
				count++;
				if (c > 45) {
					flag = true;
				}
			}
		}
			System.out.println(count);
			if (flag)
				System.out.println("Yes");
			else if (!flag)
				System.out.println("No");
			List <Integer> copy = new ArrayList<Integer>(list);
			
			Collections.reverse(copy);
			System.out.println(copy);
			List <Integer> newList = new ArrayList<Integer>();
			
			
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			int j = n-1;
			while (j != list.size()){
				newList.add(list.get(j));
				
				if (j == 0){
					j = n;
				}
				
				if (j < n){
					j--;
				}
				else{
					j++;
				}
			}
			System.out.println(newList);
	
					



		}
	}