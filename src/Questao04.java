import java.util.Scanner;

public class Questao04 {
    public static boolean range(int x, int min, int max){
        return min <= x && x<=max;
    }

    public static double calcValor(int quantidade, double valor){
        double produto=quantidade*valor;
        if(produto<250){
            return (produto)-((produto)*0.05);
        }else if(produto<500){
            return (produto)-((produto)*0.10);
        }else{
            return (produto)-((produto)*0.15);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o codigo do produto comprado?");
        int codigo = input.nextInt();
        System.out.printf("Quantos produtos de codigo %d foram comprados?\n", codigo);
        int quantidade = input.nextInt();
        if(range(codigo, 1, 10)){
            System.out.printf("O valor total sera de R$%.2f\n", calcValor(quantidade, 10));
        }else if(range(codigo, 11, 20)){
            System.out.printf("O valor total sera de R$%.2f\n", calcValor(quantidade, 15));
        }else if(range(codigo, 21, 30)){
            System.out.printf("O valor total sera de R$%.2f\n", calcValor(quantidade, 20));
        }else if(range(codigo, 31, 40)){
            System.out.printf("O valor total sera de R$%.2f\n", calcValor(quantidade, 40));
        }else{
            System.out.println("Este codigo de produto nao existe");
        }
        input.close();
    }
}
