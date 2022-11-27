package curso_programacao;

import java.util.Scanner;

public class Ex2_for {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o numero de valores inteiros que deseja testar:  ");
		int n = scanner.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com o valor inteiro: ");
			int x = scanner.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		scanner.close();
	}
}
