package curso_programacao;

import java.util.Scanner;

public class Ex3_while {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Combustivel desejado:\n1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Sair ");
		int item = scanner.nextInt();

		while (item != 4) {

			if (item == 1) {

				alcool += 1;

			} else if (item == 2) {

				gasolina += 1;

			} else if (item == 3) {

				diesel += 1;

			}

			System.out.println("Combustivel desejado:\n1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Sair ");
			item = scanner.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		scanner.close();
	}

}
