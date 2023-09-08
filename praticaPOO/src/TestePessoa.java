import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Hygor", 'M', 2002);

        String mensagem = p1.cumprimentar();
        int idade = p1.calcIdade();
        JOptionPane.showMessageDialog(null, mensagem);
        JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos");
    }
}
