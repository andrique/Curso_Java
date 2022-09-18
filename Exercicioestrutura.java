import java.util.Locale;
import java.util.Scanner;

public class Exercicioestrutura {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double SALARIO = sc.nextDouble();
		
		double IMPOSTO;
		if (SALARIO <= 2000.00) {
			IMPOSTO = 0;
		}
		else if (SALARIO <= 3000.00) {
			IMPOSTO = (SALARIO - 2000.0) * 0.08;
		}
		else if (SALARIO <= 4500.0) {
			IMPOSTO = (SALARIO - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			IMPOSTO = (SALARIO - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (IMPOSTO == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", IMPOSTO);
		}
		
		sc.close();
		
	}

}
