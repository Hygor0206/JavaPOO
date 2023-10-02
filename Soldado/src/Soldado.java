public class Soldado {
    private static int numSoldados = 0;
    private final String armaPadrao = "fuzil";
    private final int distanciaPadrao = 10;
    private String arma;

    public Soldado() {
        numSoldados++;
    }

    public void mover(int distancia) {
        if (distancia > 0) {
            System.out.println("O soldado se moveu " + distancia + " metros.");
        } else if(distancia==0){
            System.out.println("O soldado se moveu " + distanciaPadrao + " metros.");
        }else{
            System.out.println("Distância inválida.");
        }
    }

    public void atacar(String arma) {
        if (numSoldados >= 10) {
            if (arma == null) {
                this.arma = armaPadrao;
            } else {
                this.arma = arma;
            }
            System.out.println("O soldado atacou com " + this.arma + ".");
        } else {
            System.out.println("Ainda não, esperando o exército ficar maior.");
        }
    }
}