import java.util.Random;

public class SoldadoModificado{
    private int vida=10;
    private int arma;

    public SoldadoModificado(){
        Random r = new Random();
        this.arma = r.nextInt(10,51);
    }

    public int getArma() {
        return arma;
    }

    public int getVida() {
        return vida;
    }

    public void receberAtaque(){

    }
}