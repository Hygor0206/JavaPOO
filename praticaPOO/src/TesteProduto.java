import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Caneta", 0.75, 45);

        String lerProduto = prod1.escreverDados();
        JOptionPane.showMessageDialog(null, lerProduto);
        JOptionPane.showMessageDialog(null, "Valor total de "+prod1.nome+" em estoque: "+prod1.calcValorTotal());
        prod1.alterarQuantidade(-20);
        lerProduto = prod1.escreverDados();
        JOptionPane.showMessageDialog(null, lerProduto);
    }
}
