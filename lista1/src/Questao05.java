import java.util.Scanner;

public class Questao05 {
    static final int TIME=1;
    static final int JOGADORES=2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int menoresIdade = 0;
        double mediaIdade=0, mediaAltura=0, porcentagemPeso=0;

        for (int i = 0; i < TIME; i++) {
            for (int j = 0; j < JOGADORES; j++) {
                System.out.printf("Qual a idade do %dº jogador do %dº time:\n", (j+1), (i+1));
                int idade=input.nextInt();
                System.out.printf("Qual o peso do %dº jogador do %dº time: (Em kg)\n", (j+1), (i+1));
                double peso=input.nextDouble();
                System.out.printf("Qual a altura do %dº jogador do %dº time: (Em cm)\n", (j+1), (i+1));
                double altura=input.nextDouble();

                if(idade<18){
                    menoresIdade++;
                }
                if(peso>80){
                    porcentagemPeso++;
                }
                mediaIdade+=idade;
                mediaAltura+=altura;
            }
        }
        mediaIdade/=JOGADORES;
        mediaAltura/=JOGADORES;
        porcentagemPeso=(porcentagemPeso/JOGADORES)*100;

        System.out.printf("O campeonato é composto por %d time(s), segue um relatorio de informacoes\n", (int)TIME);
        System.out.printf("Jogadores Menores de Idade: %d\n", menoresIdade);
        System.out.printf("Media das Idades de Todos os Participantes: %.2f\n", mediaIdade);
        System.out.printf("Media das Alturas de Todos os Participantes: %.2f\n", mediaAltura);
        System.out.printf("Porcentagem de Jogadores Acima de 80kg: %.2f%%\n", porcentagemPeso);
        input.close();
    }
}
