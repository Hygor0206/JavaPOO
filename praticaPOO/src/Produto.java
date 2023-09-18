public class Produto {
    String nome;
    double valor;
    int qtdEstoque;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return this.qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Produto(String nome, double valor, int quantidade){
        setNome(nome);
        setValor(valor);
        setQtdEstoque(quantidade);
    }

    String escreverDados(){
        return "Produto: "+this.getNome()+"\n"
                +"Valor: "+this.getValor()+"\n"
                +"Quantidade em Estoque: "+this.getQtdEstoque();
    }

    double calcValorTotal(){
        return this.getValor()*this.getQtdEstoque();
    }

    void alterarQuantidade(int quantidade){
        this.setQtdEstoque(this.getQtdEstoque()+quantidade);
    };
}