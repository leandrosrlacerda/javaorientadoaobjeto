package curso_programacao;

import java.util.Scanner;

public class Ex3_for {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com numero de iteracoes que desejar: ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {

			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
		
			System.out.printf("%.1f%n", media);
			
		}
		
		scanner.close();
	}
}
