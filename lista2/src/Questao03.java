import java.util.Scanner;

class Questao03{
  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 5;
    Scanner input = new Scanner(System.in);

    int[] v1 = new int[n1];
    int[] v2 = new int[n2];
    int[] resultado1 = new int[n1];
    int[] resultado2 = new int[n1];
    int[] impares = new int[n1];

    int totalPares = 0;
    int totalImpares = 0;
    System.out.println("Digite os " + n1 + " valores do primeiro vetor;");
    for(int i = 0; i < n1; i++){
      v1[i] = input.nextInt();
      resultado2[i] = 0;

      if(v1[i] % 2 == 0){
        resultado1[totalPares] = v1[i];
        totalPares++;
      }else{
        impares[totalImpares] = v1[i];
        totalImpares++;
      }
    }

    int soma2 = 0;
    System.out.println("Digite os " + n2 + " valores do segundo vetor;");
    for(int i = 0; i < n2; i++){
      v2[i] = input.nextInt();
      soma2 += v2[i];

      for(int j = 0; j < totalImpares; j++){
        if(impares[j] % v2[i] == 0) resultado2[j]++;
      }
    }

    for(int i = 0; i < totalPares; i++)
      resultado1[i] += soma2;

    System.out.println("Resultado 1:");
    for(int i = 0; i < totalPares; i++)
      System.out.format("%d ", resultado1[i]);
    System.out.println();

    System.out.println("Resultado 2:");
    for(int i = 0; i < totalImpares; i++)
      System.out.format("%d ", resultado2[i]);
    System.out.println();
    input.close();
    }
}
