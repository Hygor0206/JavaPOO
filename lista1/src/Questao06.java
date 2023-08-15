import java.util.Scanner;

public class Questao06 {
    public static int fatoria(int num){
        if(num==0) return 1;
        int fatorial=1;
        for (int i = 1; i <= num; i++) {
            fatorial*=i;
        }
        return fatorial;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual número você quer o fatorial?");
        int numFatorial= input.nextInt();
        if(numFatorial<0){
            System.out.println("Apenas nummeros positivos sao aceitos. Reinicie o programa");
        }else{
            System.err.printf("Fatorial %d", fatoria(numFatorial));
        }
    }
}
