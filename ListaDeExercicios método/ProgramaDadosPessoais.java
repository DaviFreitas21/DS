package prjMetodos;

import java.util.Scanner;

public class ProgramaDadosPessoais {

	public static String nomeMaiusculo(String nome) {
		return nome.toUpperCase();
	}
	
	public static String emailMinusculo(String email) {
		return email.toLowerCase();
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = ler.nextLine();	
		nomeMaiusculo(nome);
		
		System.out.println("Digite sua idade:");
		int idade = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Digite seu email:");
		String email = ler.nextLine();
		emailMinusculo(email);
		
		System.out.println("Digite seu peso (em quilos):");
		double peso = ler.nextDouble();
		
		System.out.println("Nome: "+nomeMaiusculo(nome));
		System.out.println("Idade: "+idade+" anos");
		System.out.println("E-mail: "+emailMinusculo(email));
		System.out.printf("Peso: %.2f", peso);
		ler.close();
	}
}
