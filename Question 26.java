//26.Use loops to generate the following output: 0123456789123456789023456789013456789012456789012356789012346789012345789012345689012345679012345678

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			for (int j= i; j < 10; j++ ){
			System.out.print(j);
			}
			for (int k = 0; k< i ;k++){
				
			System.out.print(k);
			}
			System.out.println();
		}
		
	}
}
