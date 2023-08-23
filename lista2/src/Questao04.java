import java.util.Scanner;

class Questao04 {
  static int n = 10;
  static int[] codigos = new int[n];
  static double[] saldos = new double[n];

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    for(int i = 0; i < n; i++){
      System.out.format("Digite o código da conta %d: ", (i+1));
      codigos[i] = input.nextInt();
      System.out.format("Digite o saldo da conta %d: R$", (i+1));
      saldos[i] = input.nextDouble();
    }

    while(true){
      System.out.println("\nEscolha uma ação:\n(1) Efetuar depósito.\n(2) Efetuar saque.\n(3) Consultar o ativo bancário.\n(4) Finalizar.");
      int op = input.nextInt();

      if(op == 1 || op == 2){
        System.out.print("Digite o código da conta: ");
        int cd = input.nextInt();
        System.out.print("Digite a quantia: ");
        double qt = input.nextDouble();

        if(op == 1) depositar(cd, qt);
        else sacar(cd, qt);
      }else if(op == 3){
        consultarAtivo();
      }else if(op == 4){
        return;
      }else{
        System.out.println("Código inválido.");
        input.close();
      }
    }
  }

  static void depositar(int cd, double qt){
    int index = indexOf(codigos, cd);
    saldos[index] += qt;
    System.out.format("Saldo atual: R$%.2f.\n", saldos[index]);
  }

  static void sacar(int cd, double qt){
    int index = indexOf(codigos, cd);
    if(saldos[index] < qt){
      System.out.format("Saldo insuficiente (R$%.2f).\n", saldos[index]);
    }else{
      saldos[index] -= qt;
      System.out.format("Saldo atual: R$%.2f.\n", saldos[index]);
    }
  }

  static void consultarAtivo(){
    double total = 0.0;
    for(double s : saldos) total += s;
    System.out.format("Ativo bancário: R$%.2f.\n", total);
  }

  static int indexOf(int arr[], int num){
    for(int i = 0; i < arr.length; i++)
      if(arr[i] == num) return i;
    return -1;
  }
}
