package aula_03;

import java.util.Scanner;

public class josefh {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String mes;
		System.out.print("Informe o dia da semana: ");
		mes =ler.next();
		
		
		switch (mes) {
		case "Domingo":
			System.out.println("Dia 1");
			break;
		case "Segunda":
			System.out.println("Dia 2");
			break;
		case "Terça":
			System.out.println("Dia 3");
			break;
		case "Quarta":
			System.out.println("Dia 4");
			break;
		case "Quinta":
			System.out.println("Dia 5");
			break;
		case "Sexta":
			System.out.println("Dia 6");
			break;
		case "Sabado":
			System.out.println("Dia 7");
			break;
			
		default:
			System.out.println("Informe um dia válido");
		}
		ler.close();
		}
	
	}


