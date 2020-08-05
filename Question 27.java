import java.util.Scanner;

//27.Write aprogramthat printsa triangle like the one below.The user should beallowed to specify the height.
/*
*
**
***
****
*/

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Star Height: ");
		int height = scanner.nextInt();
		for (int i = 1 ; i <= height; i++){
			for (int j= 1;j <= i;j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
