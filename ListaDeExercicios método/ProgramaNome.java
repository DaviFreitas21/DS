package prjAtributos;

import java.util.Scanner;

public class ProgramaNome {

	public static void validacaoNome(String nome) {
		if(nome.length()<3) {
			System.out.println("Nome inválido");
		}
		else {
			System.out.println("Nome válido");
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite seu nome:");
		Scanner ler = new Scanner(System.in);
		String nome = ler.nextLine();
		validacaoNome(nome);
		ler.close();
	}

}
