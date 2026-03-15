package prjMetodos;

import java.util.Scanner;

public class ProgramaCep {
	
	public static void formatacaoCep() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu CEP:");
		String cep = ler.nextLine();
		String cepFormatado = cep.substring(0,5) + "-" + cep.substring(5);
		System.out.println(cepFormatado);
		ler.close();
	}
	public static void main(String[] args) {
		formatacaoCep();
	}
}
