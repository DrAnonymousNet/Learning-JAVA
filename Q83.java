//83. Write program that contains a list of 10 names. Then do the following: (a) Print out a random name from the list (the name should vary each time the program is run). The original list should not be changed or reordered. (b) Have the program reorder the list into alphabetical order. (c) Ask the user for an integer n. The program should reverse the first n things in the list and leave the others alone.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
	List <String> arr= new ArrayList<String>();
	Collections.addAll(arr, "Ahmad", "Habeeb", "Afees", "Afolabi", "Ibraheem","Hakeem", "Aliyu", "Idowu","Alaba","Abdul");
	System.out.println("A Random name is: "+ arr.get(rand.nextInt(arr.size())));
	Collections.sort(arr);
	System.out.println(arr);
	Scanner scanner= new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = scanner.nextInt();
	for (int i = n; i >= (int)n/2; i-- ){
		String temp = arr.get(n-i);
		arr.set(n-i, arr.get(i));
		arr.set(i, temp);
		
	}
	System.out.println(arr);
	
	
	}
}