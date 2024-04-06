import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite a quantidade de linha e quantidade de coluna:  ");

        Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][]mat = new int[M][N];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
				
			}
		}
		int x = sc.nextInt();
		
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[i].length; j++) {
				
				if(mat[i][j]==x) {
					System.out.println(" Positivos " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
				if(i > 0) {
					System.out.println("Acima: " + mat[i-1][j]);
				}
				if(j < mat[i].length-1) {
					System.out.println("Direita: "+ mat[i][j+1] );
				}
				if(i< mat.length-1) {
					System.out.println("Baixo: " + mat[i+1][j]);
				}
		     }
			}	
		}
        sc.close();
	}

}
    

