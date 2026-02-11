public class DiagonalMatriz {

	public static void main(String[] args) {
		int matriz [] [] = new int [4] [4], elemento=1, somaDiagonal=0;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				matriz [i][j] = elemento++;
			}
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				if (i==j) {
					somaDiagonal += matriz [i][j];
				}
			}
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(matriz [i] [j]+" ");
			}
			System.out.println();
		}
		System.out.println("A soma dos elementos da diagonal é: "+somaDiagonal);
	}
}