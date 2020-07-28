//10. Write a program that prints out on separate lines the following 1000 items: file0.jpg, file1.jpg, ..., file999.jpg, except that it should not print anything when the number ends in 8, like file8.jpg, file18.jpg, etc. [Hint: if i % 10 is not 8, then i doesn’t end in 8.]

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000;i++){
			if (i % 10 != 8){
				System.out.printf("file%d.jpg\n", i);
			}
		}
	}
}
