package aula_03;

import java.util.Scanner;

public class joi {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int dia;
	System.out.print("Informe o dia da semana: ");
	dia=ler.nextInt();
	
	switch (dia) {
	case 1:
		System.out.println("Domingo");
		break;
	case 2:
		System.out.println("Segunda");
		break;
	case 3:
		System.out.println("Terça");
		break;
	case 4:
		System.out.println("Quarta");
		break;
	case 5:
		System.out.println("Quinta");
		break;
	case 6:
		System.out.println("Sexta");
		break;
	case 7:
		System.out.println("Sabado");
		break;
		
	default:
		System.out.println("Informe um dia válido");
	}
	ler.close();
	}
}


