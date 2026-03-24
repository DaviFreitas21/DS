package prjMetodos2;

import java.util.Scanner;

public class VerificacaoSorteio {
	public static int[] leituraNumeros() {
		int[] valores = new int[2];
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro:");
		valores[0] = ler.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		valores[1] = ler.nextInt();
		ler.close();
		return valores;
	}
	
	public static int[] sorteioNumero() {
		int[] valoresAleatorios = new int[2];
		valoresAleatorios[0] = (int)(Math.random() * 100);
		valoresAleatorios[1] = (int)(Math.random() * 100);
		return valoresAleatorios;
	}
	
	public static boolean testeNumeros(int[] valores, int[] valoresAleatorios) {
		boolean teste;
		if (valores == valoresAleatorios) {
			teste=true;
		}
		else {
			teste=false;
		}
		return teste;
	}
	
	public static void main (String[] args) {
		leituraNumeros();
		int[] sorteados = sorteioNumero();
		System.out.println("Numeros sorteados:"+sorteados[0]+" e "+sorteados[1]);
	}
}