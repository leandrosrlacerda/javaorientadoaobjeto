package curso_programacao;

import java.util.Scanner;

public class Ex2_while {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com o X: ");
		int x = scanner.nextInt();
		System.out.print("Entre com o Y: ");
		int y = scanner.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			System.out.print("Entre com o X: ");
			x = scanner.nextInt();
			System.out.print("Entre com o Y: ");
			y = scanner.nextInt();
		}

		scanner.close();
	}

}
