import java.util.Scanner;

//12. This problem is about finding the day of the week of any date since about 1583. Ask the user to enter the year y, month m, and day d separately. The following formulas give the day of the week: p =14−m /12 q = y−p r =q+q 4−q 100+q 400 s =m+12p−2 t =d+r+31s 12 mod7 The brackets indicate the floor function. In Java, you can do this simply by doing integer division. For instance, p can be calculated just by doing (14-m)/12, with m being an integer. The day of the week is given by t, with t =0 corresponding to Sunday, t = 1 corresponding to Monday, etc. Please output your answer as a day name and not as a number.

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Day of month: ");
		int day = scanner.nextInt();
		System.out.print("Enter Month of The year: ");
		int month = scanner.nextInt();
		System.out.print("Enter year: ");
		int year = scanner.nextInt();
		
		int p = (14-month)/12;
		int q = year - p ;
		int r = q + (q/4)-(q/100)+(q/400);
		int s = month + 12*p -2;
		int t = (day + r + (31*s/12))%7;
		
		String days= "";
		if (t == 1){
			days = "Monday";
		}
		else if (t == 2){
			days = "Tuesday";
		}
		else if (t == 3){
			days = "Wednesday";
		}
		else if (t==4){
			days = "Thursday";
		}
		else if (t == 5){
			days = "Friday";
		}
		else if (t == 6){
			days = "Saturday";
		}
		else if (t == 0){
			days = "Sunday";
		}
		
		System.out.print(t);
		System.out.print(days);
	}
}
