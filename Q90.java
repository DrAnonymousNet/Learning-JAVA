
//90.Createandprintalistthatcontains10randomnumbersfrom1through99,999.Thenprintoutthesumofthelengthsofthenumbers.Forinstance,ifthelistis[8,53,124,4,2,88423,1010,455,111,2],theprogramshouldoutput24,whichis1+2+3+1+1+5+4+3+3+1,addingupthehowmanydigitslongeachofthosenumbersare.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int sum = 0;
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++){
			arr[i] = random.nextInt(99999);
			
			sum += String.valueOf(arr[i]).length();
		}
		System.out.println(Arrays.toString(arr));
		System.out.print(sum);
		
	}
}