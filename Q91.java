//91.Createandprintalistthatcontains100random0s,1s,and2s.Thenwritesomecodetheprintsoutalltheindicesiinthelistwheretheelementatindexiisdifferentfromtheelementatindexi−1.Forinstance,ifthelistis[0,0,1,1,1,1,0,2,2,2,0,...],thentheprogramshouldprintout2,6,7,and10sincethoseareindicesatwhichtheelementsofthelistchange.

import java.util.*;


public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[100];
		for (int i = 0 ; i < 100;i++){
			arr[i]= random.nextInt(3);
			if (i > 0){
				if (arr[i] != arr[i-1]){
					System.out.print(i + " ");
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}