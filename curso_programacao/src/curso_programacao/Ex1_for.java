package curso_programacao;

import java.util.Scanner;

public class Ex1_for {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com um número inteiro: ");
		int x = scanner.nextInt();

		while (x < 0 || x > 1000) {
			System.out.println("O valor digitado deve estar entre 0 e 1000!");
			System.out.print("Entre com um número inteiro: ");
			x = scanner.nextInt();
		}
		
		
		for (int i = 1; i <= x; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		scanner.close();

	}

}
