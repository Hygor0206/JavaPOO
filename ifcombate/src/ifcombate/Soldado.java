package ifcombate;

import java.util.Random;

public class Soldado {
	private int vida = 10;
	private int arma;	
	
	public Soldado() {
		Random r = new Random();
		//sorteia arma com dano de 0 a 5
		this.arma = r.nextInt(5, 11);
	}
	public int getArma() {
		return arma;
	}
	
	public int getVida() {
		return vida;
	}
	
//	private void tirarVida(int dano) {
//		this.vida -= dano;
//	}
	
	public void atacar(Soldado soldadoInimigo) {
		soldadoInimigo.vida -= this.arma;
		System.out.println("Dano " + this.arma);
		System.out.println("Vida inimigo " + soldadoInimigo.vida);		
		//soldadoInimigo.tirarVida(this.arma);
		//this.vida -= dano;
	}

}
