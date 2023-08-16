import java.util.Scanner;

public class Questao09 {
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

        System.out.println("Digite um número:");
        int resposta = input.nextInt();
        if(primo(resposta)){
            System.out.println("E primo");
        }else{
            System.out.println("Nao e primo");
        }
        input.close();
    }
}
