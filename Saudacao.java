package prjListaMetodos2;

import java.util.Scanner;

public class Saudacao {
	
	public static String saudacaoPersonalizada(String nome) {
		return ("Olá, "+nome+", seja bem-vindo(a)!");
	}
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = ler.next();
		System.out.println(saudacaoPersonalizada(nome));
		ler.close();
	}
}
