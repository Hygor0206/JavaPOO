import java.util.Scanner;
import java.lang.Math;

public class Questao01 {
    public static final int TAMANHO_TABELA=20;

    public static void printarTabela(double[] numeros){
        System.out.printf("|------------------------|%n");
        System.out.printf("| Number Cube and Square |%n");
        System.out.printf("|------------------------|%n");
        System.out.printf("| %-5s | %-5s | %s |%n", "VALUE", "CUBE", "SQUARE");
        System.out.printf("|------------------------|%n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("| %-5d | %-5d | -3%.2f |%n", (int)numeros[i], (int)(Math.pow(numeros[i], (double)3)), (Math.sqrt(numeros[i])));
        }
        System.out.printf("|------------------------|%n");
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[(TAMANHO_TABELA)];
        int printarTabela=0;
        for(;;){
            System.out.printf("Digite o %dº número ou 0 para finalizar o programa (Numero pertencente ao conjunto dos naturais)%n", (printarTabela+1));
            int resposta=input.nextInt();

            if(resposta<=0){
                System.out.println("Finalizando programa");
                if(resposta<0) System.out.println("Numeros Negativos sao Invalidos");
                input.close();
                break;
            }
            numeros[printarTabela]=resposta;

            if((printarTabela+1)==TAMANHO_TABELA){
                printarTabela=0;
                printarTabela(numeros);
            }else{
                printarTabela++;
            }
        }
    }
}
