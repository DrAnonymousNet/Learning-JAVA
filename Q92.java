//92.Writeaprogramthataskstheusertoenterastringoflowercaselettersandcreatesalistcontainingcountsofhowmanytimeseachletterappearsinthestring.Thefirstindexishowmanya’sareinthestring,thesecondishowmanyb’s,etc.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a lowercase Text: ");
		String arrs = scanner.nextLine();
		char[] arr = arrs.toCharArray();
		System.out.print(Arrays.toString(arr));
		Map <Character, Integer> maps = new HashMap<Character, Integer>();
		int count = 0;
		for (Character i : arr) {


			if (maps.containsKey(i)) {
				maps.put(i, maps.get(i) + 1);
			} else if (!maps.containsKey(i)) {
				maps.put(i, 1);

			}

		}
		System.out.print(maps);
	}
}