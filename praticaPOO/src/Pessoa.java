public class Pessoa {
    String nome;
    char sexo;
    int anoNascimento;

    public Pessoa(String nome, char sexo, int anoNascimento){
        setNome(nome);
        setSexo(sexo);
        setAnoNascimento(anoNascimento);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    String cumprimentar(){
        if(this.sexo=='M'){
            return "Bom dia, Sr. "+this.nome;
        }else if(this.sexo=='F'){
            return "Bom dia, Sra. "+this.nome;
        }else{
            return "Bom dia, "+this.nome;
        }
    }

    int calcIdade(){
        return 2023-this.anoNascimento;
    }
}