import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor do salario minimo?");
        double vlrSalarioMinimo = input.nextDouble();
        System.out.println("Quantos quilowatt foi consumido na residencia?");
        double quantidadekW = input.nextDouble();
        System.out.printf("Conforme o salario minimo informado, cada kW custa em torno de: %.2f\n", (vlrSalarioMinimo*0.01));
        System.out.printf("A residencia deve pagar um total de %.2f pela quantidade de kW utilizada", ((vlrSalarioMinimo*0.01)*quantidadekW)); 
    }
}
