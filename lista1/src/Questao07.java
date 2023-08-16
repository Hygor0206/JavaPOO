import java.util.Scanner;

public class Questao07 {
    public static int fatorial(int num){
        if(num==0) return 1;
        int fatorial=1;
        for (int i = 1; i <= num; i++) {
            fatorial*=i;
        }
        return fatorial;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero do range: (Apenas numeros naturais (N))");
        int min = input.nextInt();
        if(min<0){
            System.out.println("Este numero nao pertence ao conjunto dos naturais (N)");
        }else{
            System.out.println("Digite o ultimo numero do range: (Apenas numeros naturais (N))");
            int max = input.nextInt();
            if(min>max){
                System.out.println("O ultimo numero precisa ser maior que ou igual ao maximo (MIN<=MAX). Por favor reinicie o programa.");
            }else{
                for (int i = min; i <= max; i++) {
                    System.out.printf("Fatorial de %d é: %d\n", i, fatorial(i));
                }
            }
        }
        input.close();
    }
}
