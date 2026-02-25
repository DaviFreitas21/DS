package prjAula02;

public class DiagonalSecundaria {
	public static void main (String[] args) {
	int matriz [][] = new int [10] [10], num=1;
	
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				matriz [i] [j] = num;
				num++;
			}
		}
		
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz [i] [matriz.length - 1 - i]+ " ");
		}
	}
}
