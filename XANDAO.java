package aula_03;

import java.util.Scanner;

public class XANDAO {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Informe o salário do funcionário: ");
	        double salario = scanner.nextDouble();
	        
	        System.out.print("Informe há quantos anos o funcionário trabalha na empresa: ");
	        int anosNaEmpresa = scanner.nextInt();
	        
	        double bonus;
	        if (anosNaEmpresa <= 3) {
	            bonus = salario * 0.05; // 5% de bônus
	        } else {
	            bonus = salario * 0.07; // 7% de bônus
	        }
	        
	        System.out.println("O bônus a ser recebido é: R$" + bonus);
	        
	        scanner.close();

	}

}
