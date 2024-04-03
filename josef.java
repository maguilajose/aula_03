package aula_03;

import java.util.Scanner;

public class josef {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade = 18;
		
	    System.out.print("Qual a sua idade? ");
		idade = ler.nextInt();
		String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem); // imprime "Maior de idade"

	}

}
