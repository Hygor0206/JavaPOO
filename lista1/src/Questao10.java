import java.util.Scanner;

public class Questao10 {
    final static int EXECUCOES = 10;

    public static boolean primo(int num){
        if(num==2) return true;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdPrimos=0;

        for (int i = 0; i < EXECUCOES; i++) {
            System.out.printf("Digite o %dº numero inteiro\n", (i+1));
            int resposta = input.nextInt();
            if(primo(resposta)){
                System.out.printf("%d é primo\n", resposta);
                qtdPrimos++;
            }
        }
        if(qtdPrimos==1){
            System.out.printf("Dentre os números digitados, %d é primo\n", qtdPrimos);
        }else if(qtdPrimos>1){
            System.out.printf("Dentre os números digitados, %d são primos\n", qtdPrimos);
        }else{
            System.out.println("Nenhum numero digitado e primo");
        }
        input.close();
    }
}
