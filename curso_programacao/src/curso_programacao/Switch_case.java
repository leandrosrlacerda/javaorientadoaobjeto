package curso_programacao;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("----- DIAS DA SEMANA ----- \n\nEntre com um numero: ");
		int x = scanner.nextInt();

		String diaDaSemana;

		switch (x) {
		case 1: 
			diaDaSemana = "Domingo";
			break;
	
		case 2: 
			diaDaSemana = "Segunda";
			break;
		
		case 3: 
			diaDaSemana = "Terça";
			break;
		
		case 4: 
			diaDaSemana = "Quarta";
			break;
		
		case 5: 
			diaDaSemana = "Quinta";
			break;
		
		case 6: 
			diaDaSemana = "Sexta";
			break;
		
		case 7: 
			diaDaSemana = "Sabado";
			break;

		default:
			diaDaSemana = "valor inválido";
			break;
		}
		
		System.out.println("O dia da semana é " + diaDaSemana);
		
		scanner.close();
	}
	
}
