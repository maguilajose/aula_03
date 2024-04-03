package aula_03;

import java.util.Scanner;

public class ze {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota1,nota2,nota3,nota4,media;
		
		System.out.print("informe primeira nota ");
		nota1 = ler.nextDouble();
		
		System.out.print("informe segunda nota ");
		nota2 = ler.nextDouble();
		
		System.out.print("informe terceira nota ");
		nota3 = ler.nextDouble();
		
		System.out.print("informe quarta nota ");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		String mensagem = media >= 6 ? "Aprovado" : "Reprovado";
		System.out.println(mensagem); 

	}
	
}