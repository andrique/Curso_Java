import java.util.Scanner;

public class Exercisefor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int i = 0;	
		for (i = 1; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		sc.close();

	}

}
