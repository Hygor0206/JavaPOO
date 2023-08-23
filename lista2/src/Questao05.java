import java.util.Scanner;

class Questao05 {
  public static void main(String[] args) {
    int n = 7;
    Scanner input = new Scanner(System.in);

    double[][] mat = new double[n][n];
    double[] maiores = new double[n];
    double[] menores = new double[n];

    System.out.format("Digite uma matriz %dx%d:\n", n, n);
    for(int i = 0; i < n; i++)
      for(int j = 0; j < n; j++)
        mat[i][j] = input.nextDouble();

    for(int i = 0; i < n; i++){
      double maior = Double.NEGATIVE_INFINITY;
      double menor = Double.POSITIVE_INFINITY;
      for(int j = 0; j < n; j++){
        maior = Math.max(maior, mat[i][j]);
        menor = Math.min(menor, mat[j][i]);
      }
      maiores[i] = maior;
      menores[i] = menor;
    }

    System.out.println("Matriz:");
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.format("%2.2f ", mat[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Maiores:");
    for(int i = 0; i < n; i++){
      System.out.format("%2.2f ", maiores[i]);
    }
    System.out.println();

    System.out.println("Menores:");
    for(int i = 0; i < n; i++){
      System.out.format("%2.2f ", menores[i]);
    }
    System.out.println();
    input.close();
  }
}
