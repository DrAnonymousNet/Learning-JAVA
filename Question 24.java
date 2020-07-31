//24.Write a program that funds and prints out all the solutions to the equation x2−2y2=1, where x And y are integers from 1 to 99.
public class Main {
	public static void main(String[] args) {
		for (int x = 0; x <= 99; x++){
			for (int y = 0; y <= 99; y++){
				if (Math.pow(x,2) - 2*Math.pow(y,2) == 1){
					System.out.println(x +" " +y);
				}
			}
		}
	}
}
