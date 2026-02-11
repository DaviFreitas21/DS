
public class SomaMatriz {

	public static void main(String[] args) {
		int matriz [] [] = new int [4] [4], elemento=1, somaIndice=0;

		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				matriz [i][j] = elemento++;
				somaIndice += matriz [i][j];
			}
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(matriz[i] [j]+" ");
			}
			System.out.println();
		}
		System.out.println("A soma de todos os elementos é: "+somaIndice);
	}
}
