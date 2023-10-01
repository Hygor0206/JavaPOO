public class ContaCorrente {
    private String nome;
    private String cpf;
    private double saldo;
    private int numConta;
    private int sequencial=0;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }    

    private int gerarNumConta(){
        return sequencial++;
    }
    
    public ContaCorrente(String nome,String cpf){
        setNome(nome);
        this.cpf=cpf;
        this.saldo=0;
        this.numConta = gerarNumConta();
    }

    public ContaCorrente(String nome, String cpf, double saldo){
        setNome(nome);
        this.cpf=cpf;
        this.saldo=saldo;
        this.numConta = gerarNumConta();
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor<=saldo){
            this.saldo-=valor;
            return true;
        }else
            return false;
    }

    public boolean deposito(double valor){
        if(valor>0){
            this.saldo+=valor;
            return true;
        }else
            return false;
    }

    public boolean transferir(double valor, ContaCorrente cc){
        if(valor>0&&valor<=getSaldo()){
            this.sacar(valor);
            cc.deposito(valor);
            return true;
        }else
            return false;
    }
}   