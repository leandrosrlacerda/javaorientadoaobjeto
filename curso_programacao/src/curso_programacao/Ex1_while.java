package curso_programacao;

import java.util.Scanner;

public class Ex1_while {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com a senha: ");
		int senha = scanner.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");

			System.out.print("Entre com uma senha valida: ");
			senha = scanner.nextInt();
		}

		System.out.println("Acesso Permitido");

		scanner.close();
	}

}
