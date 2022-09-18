import java.util.Locale;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO, TRAPEZIO2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		TRIANGULO = A * C /2;
		CIRCULO = 3.14159 * C * C;
		TRAPEZIO = (A + B) * C /2;
		QUADRADO = B * B;
		RETANGULO = A * B;
		TRAPEZIO2 = TRIANGULO*2 + RETANGULO;
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);
		System.out.printf("TRAPEZIO2: %.3f%n", TRAPEZIO2);

			
		
		sc.close();

 

	}

}
