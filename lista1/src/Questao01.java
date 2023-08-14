import java.util.Scanner;

public class Questao01{
    
    public static double calcSalario(int horas, double vlrHoras){
        double salBruto=horas*vlrHoras;
        double salLiquido = salBruto-(salBruto*0.3);
        return salLiquido;
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas horas foram trabalhadas?");
        int horas=teclado.nextInt();
        System.out.println("Quanto voce ganha por hora?");
        double vlrHoras = teclado.nextDouble();
        double salLiquido=calcSalario(horas, vlrHoras);
        System.out.printf("O salario a receber será %.2f\n", salLiquido);
        teclado.close();
    }
}
