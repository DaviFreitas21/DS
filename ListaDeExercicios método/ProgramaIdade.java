package prjMetodos;

import java.util.Scanner;

public class ProgramaIdade {
	
	public static void verificaIdade(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = ler.nextInt();
		if(idade>17) {
			System.out.println("Maior de idade");
		}
		else {
			System.out.println("Menor de idade");
		}
		ler.close();
	}
	
	public static void main (String[] args) {
		verificaIdade();
	}
}
