package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Alteracao na linha. Teste commit
		System.out.print("Entre com a quantidade de minutos consumidos no plano:");
		int minutos = scanner.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2;
		}
		
		System.out.printf("Valor da conta: R$%.2f\n", conta);
		
		scanner.close();
	}
}
