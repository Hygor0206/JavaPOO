import java.util.Scanner;

public class Questao01{
    
    public static double calcSalario(int horas, double vlrHoras){
        double salBruto=horas*vlrHoras;
        return salBruto-(salBruto*0.3);
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas horas foram trabalhadas?");
        int horas=input.nextInt();
        System.out.println("Quanto voce ganha por hora?");
        double vlrHoras = input.nextDouble();
        System.out.printf("O salario a receber será %.2f\n", calcSalario(horas, vlrHoras));
        input.close();
    }
}
