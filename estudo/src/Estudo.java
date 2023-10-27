public class Estudo{
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Joao", 10);
        System.out.println(p1.verQtPessoa());
        Pessoa p2 = new Pessoa("Carla", 24);
        System.out.println(p2.verQtPessoa());
        Pessoa p3 = new Pessoa("Pedro", 30);
        System.out.println(p3.verQtPessoa());
        Pessoa p4 = new Pessoa("Paulo", 32);

        System.out.println(p4.verQtPessoa());
    }
}
