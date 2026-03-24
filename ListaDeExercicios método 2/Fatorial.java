package prjMetodos2;

import java.util.Scanner;

public class Fatorial {

	public static int calculoFatorial(int valor) {
		int fatorial = 1;
		for (int i=valor; i>1;i--) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um valor para receber o seu fatorial:");
		int valor = ler.nextInt();
		System.out.println("O fatorial de "+valor+" é: "+calculoFatorial(valor));
		ler.close();
	}
}
