package comissao;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nomeVendedor;
		double anosTrabalho, totalVendas, comissao; 
		
	
		System.out.println("**************************");
		System.out.println("      C O M I S S Ã O     ");
		System.out.println("**************************");
		System.out.println();
		
		System.out.print("Qual o nome do(a) vendedor(a)?");
		nomeVendedor = leitor.next();
		
		System.out.print("Quantos anos de trabalho tem o(a) vendedor(a) " + nomeVendedor + "?");
		anosTrabalho = leitor.nextDouble();
		
		System.out.print("Qual foi o valor total de vendas?");
		totalVendas = leitor.nextDouble();
		
		leitor.close();
		
		System.out.println();
		
		if (totalVendas >= 20000 && anosTrabalho >= 1) {
			comissao = totalVendas * 10 / 100;
		} else if (totalVendas >= 10000 && anosTrabalho >= 1) {
			comissao = totalVendas * 5 / 100;
		} else {
			comissao = totalVendas * 3 / 100;
		}
		
		System.out.println("A comissão para o(a) vendedor(a) " + nomeVendedor + " será de " + comissao);

	}

}
