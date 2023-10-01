import java.util.Scanner;

public class TesteCC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente("Luiz", "241.124.241-34", 500);
        if (cc.sacar(24))
            System.out.println("Transação Concluida");
        else
            System.out.println("Falha");

        input.close();
    }
}
