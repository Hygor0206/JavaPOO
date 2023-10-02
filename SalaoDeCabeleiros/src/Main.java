public class Main {
    public static void main(String[] args) {
        SalaoCabeleiros salao = new SalaoCabeleiros();

        salao.entrarFila("Lucas");
        salao.entrarFila("Gabriel");
        salao.entrarFila("Paulo");

        Cliente c = salao.atender();

        if(c!=null)
            System.out.println("Proximo Sr(a) "+c.getNome());
        else
            System.out.println("Salao Vazio");
    }
}
