import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//22. Write a program that let the user play Rock-papers scissors against the computer. There should be five rounds,and after those five rounds,your program should printout who won and lost or that there is a tie.

public class Main {
	public static void main(String[] args) {
		
		List<String> rps = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int count = 0, me = 0, computer = 0;
		Collections.addAll(rps , "Rock", "Papper", "Scissors");
		
		while (count <= 5){
			System.out.print("Enter your choice: ");
			String mine = scanner.nextLine();
			String comp = rps.get(random.nextInt(3)).toLowerCase();
			Collections.shuffle(rps);
			System.out.println(comp);
			if (mine.toLowerCase().equals( "rock") && comp.toLowerCase().equals( "papper")){
				computer += 1;
				System.out.println( "Computer Won !!!");
			}
			
			else if (comp.toLowerCase().equals("rock") && mine.toLowerCase().equals( "papper")){
				me += 1;
				System.out.println( "you Won !!!");	
			}
			
			else if (mine.toLowerCase().equals( "scissors") && comp.toLowerCase().equals( "papper")){
				me += 1;
				System.out.println( "you Won !!!");
			}
			
			else if (comp.toLowerCase().equals("scissors") && mine.toLowerCase().equals( "papper")){
				computer += 1;
				System.out.println( "Computer Won !!!");
			}
			
			else if (mine.toLowerCase().equals("scissors") && comp.toLowerCase().equals( "rock")){
				computer += 1;
				System.out.println( "Computer Won !!!");
			}
			
			else if (comp.toLowerCase().equals("scissors") && mine.toLowerCase().equals( "rock")){
				me += 1;
				System.out.println( "you Won !!!");
			}
			else if (comp.toLowerCase().equals( mine.toLowerCase())){
				System.out.println("Tie");
			}
			count += 1;
		}
		
		System.out.println("Final scores you- " + me + ", Computer- "+computer);
		if (me > computer){
			System.out.print("You won");
			}
		else if (me < computer){
			System.out.println("Computer won");
		}
			
		else{
			System.out.print("Its a Tie");
		}
			
		
	}
}
