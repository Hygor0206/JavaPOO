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
            if(quantidade*10<250){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*10)-((quantidade*10)*0.05)));
            }else if(quantidade*10<500){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*10)-((quantidade*10)*0.10)));
            }else{
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*10)-((quantidade*10)*0.15)));
            }
        }else if(range(codigo, 11, 20)){
            if(quantidade*15<250){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*15)-((quantidade*15)*0.05)));
            }else if(quantidade*15<500){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*15)-((quantidade*15)*0.10)));
            }else{
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*15)-((quantidade*15)*0.15)));
            }
        }else if(range(codigo, 21, 30)){
            if(quantidade*20<250){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*20)-((quantidade*20)*0.05)));
            }else if(quantidade*20<500){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*20)-((quantidade*20)*0.10)));
            }else{
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*20)-((quantidade*20)*0.15)));
            }
        }else if(range(codigo, 31, 40)){
            if(quantidade*40<250){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*40)-((quantidade*40)*0.05)));
            }else if(quantidade*40<500){
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*40)-((quantidade*40)*0.10)));
            }else{
                System.out.printf("O valor total será de R$%.2f\n", ((quantidade*40)-((quantidade*40)*0.15)));
            }
        }else{
            System.out.println("Este codigo de protudo nao existe");
        }
        input.close();
    }
}
