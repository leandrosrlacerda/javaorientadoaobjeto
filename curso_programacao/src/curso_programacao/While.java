package curso_programacao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = scanner.nextInt();
		}

		System.out.println(soma);
		
		scanner.close();
	}
}
