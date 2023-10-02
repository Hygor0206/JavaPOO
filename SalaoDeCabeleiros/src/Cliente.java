public class Cliente {
    private String nome;
    private int uuid;
    
    public Cliente(String nome){
        this.nome=nome;
        this.uuid = (int)Math.random()*100;
    }

    public String getNome() {
        return nome;
    }
    
    public int getUuid() {
        return uuid;
    }
}   
