import java.util.Scanner;

public class Questao04 {
    public static boolean range(int x, int min, int max){
        return min <= x && x<=max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o codigo do protuto comprado?");
        int codigo = input.nextInt();
        System.out.printf("Quantos protudos de código %d foram comprados?\n", codigo);
        double quantidade = input.nextInt();
        if(range(codigo, 1, 10)){
            System.out.printf("O valor total será de R$%.2f\n", (quantidade*10));
        }else if(range(codigo, 11, 20)){
            System.out.printf("O valor total será de R$%.2f\n", (quantidade*15));
        }else if(range(codigo, 21, 30)){
            System.out.printf("O valor total será de R$%.2f\n", (quantidade*20));
        }else if(range(codigo, 31, 40)){
            System.out.printf("O valor total será de R$%.2f\n", (quantidade*40));
        }else{
            System.out.println("Este codigo de protudo nao existe");
        }
        input.close();
    }
}
