public class Pessoa {
    private static int qtPessoa=0;
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
        qtPessoa++;
    }

    public static int verQtPessoa(){
        return qtPessoa;
    }
}
