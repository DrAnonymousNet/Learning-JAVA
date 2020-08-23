//62. Write a censoring program. Allow the user to enter some text and your program should print out the text with all the curse words starred out. The number of stars should match the length of the curse word. For the purposes of this program, just use the “curse” words darn, dang, frickin, heck, and shoot. Sample output is below: Enter some text: Oh shoot, I thought I had the dang problem figured out. Darn it. Oh well, it was a heck of a frickin try. Oh *****, I thought I had the **** problem figured out. **** it. Oh well, it was a **** of a ******* try.
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> censoredWord = new ArrayList <String>();
		Collections.addAll(censoredWord, "darn", "dang", "frickin", "heck", "and", "shoot");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text: ");
		String[] text = scanner.nextLine().split(" ");
		String Build = "";
		String Sentence = "";
		int count = 0;
		for (String c : text){
			if (censoredWord.contains(c.toLowerCase())){
				for(int i =0; i <c.length();i++){
					Build += "*";
				}
				text[count] = Build;
				Build = "";
			}
			Sentence += text[count]+ " ";
			count++;
		}
		System.out.print(Sentence);
				
	}
}