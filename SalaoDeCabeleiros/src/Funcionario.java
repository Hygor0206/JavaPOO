public class Funcionario {
    private String nome;
    private int uuid;
    private int contador;

    public Funcionario(String nome){
        this.nome=nome;
        this.uuid=(int)Math.random()*100;
        this.contador=0;
    }

    public String getNome() {
        return nome;
    }

    public int getUuid() {
        return uuid;
    }

    public int getContador() {
        return contador;
    }

    public void incrementarContador(){
        this.contador++;
    }
}