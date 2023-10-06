package main;

import java.util.Scanner;

import entities.Client;
import entities.Journal;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite seu nome:> ");
		String nameC = in.next();
		System.out.print("Deposito inicial:> ");
		Double cashC = in.nextDouble();

		System.out.print("Digite o nome da revista:> ");
		String nameJ = in.next();
		System.out.print("Valor da revista:> ");
		Double priceJ = in.nextDouble();
		System.out.print("Digite a quantidade de revistas:> ");
		Integer quantityJ = in.nextInt();

		Client c1 = new Client(nameC, cashC);
		Journal j1 = new Journal(nameJ, priceJ, quantityJ);

		System.out.println(c1 + "\n" + j1);

		c1.comprar(j1);

		System.out.println("\n" + c1 + "\n" + j1);

		in.close();
	}

	public static void menu() {
		System.out.println("#################################");
		System.out.println("Bem vindo ao menu! Digite o número correspondente a sua função: ");
		System.out.println("1 - Cliente\n2 - Vendedor");
	}

	public static void menuCliente() {
		System.out.println("#################################");
		System.out.println("Bem vindo!");
		System.out.println("1 - Comprar\n2 - Depositar");
	}

	public static void menuVendedor() {
		System.out.println("#################################");
		System.out.println("Bem vindo ao menu do Vendedor!");
		System.out.println("1 - Cadastrar produto\n2 - Checar vendas");
	}

}
