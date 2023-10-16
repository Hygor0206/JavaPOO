package ifcombate;

import java.util.Arrays;
import java.util.Random;

public class Exercito {
	private Soldado[] exercito;
	private int posicao;	
	
	public Exercito(int posicao) {
		Random r = new Random();
		int t = r.nextInt(50, 100);
		
		this.exercito = new Soldado[t];
		this.recrutarExercito();
		
		this.posicao = posicao;
	}
	
	private void recrutarExercito() {
		for (int i = 0; i < exercito.length; i++) {
			this.exercito[i] = new Soldado();
		}
	}
	
	public void movimentar() {
		Random r = new Random();
		int distancia = r.nextInt(5, 10);
		this.movimentar(distancia);
	}
	
	public void movimentar(int distancia) {
		this.posicao += distancia;
	}
	
	private void retirarSoldado(Exercito inimigo, int iSoldado) {
		Soldado[] exercitoTemp = new Soldado[inimigo.getTamanhoExercito()-1]; 
		for (int i = iSoldado; i < inimigo.getTamanhoExercito()-1; i++) {
			inimigo.exercito[i] = inimigo.exercito[i+1];			
		}
		
		exercitoTemp = Arrays.copyOfRange(inimigo.exercito, 0, inimigo.exercito.length-1);
		inimigo.exercito = exercitoTemp;
	}
	
	public void atacar(Exercito inimigo) {
		Random r = new Random();
		
		int iSoldadoAliado = this.exercito.length-1 == 0?0:r.nextInt(this.exercito.length-1);
		int iSoldadoInimigo = inimigo.exercito.length-1 == 0?0:r.nextInt(inimigo.exercito.length-1);
		Soldado soldadoAliado = this.exercito[iSoldadoAliado];
		Soldado soldadoInimigo = inimigo.exercito[iSoldadoInimigo];
		
		soldadoAliado.atacar(soldadoInimigo);
		
		if (soldadoInimigo.getVida() <= 0)
			retirarSoldado(inimigo, iSoldadoInimigo);
	}
	
	public int getVidaExercito() {
		int vidaExercito = 0;
		for (Soldado soldado : exercito) {
			vidaExercito += soldado.getVida();
		}
		
		return vidaExercito;
	}
	
	public int getPosicao() {
		return posicao;
	}
	

	public Soldado[] getExercito() {
		return exercito;
	}
	
	public int getTamanhoExercito() {
		return exercito.length;
	}
	
	@Override
	public String toString() {
		String exercito = "Tam " + this.getTamanhoExercito()
						+ "\n" + "Vida exército " + this.getVidaExercito();
		return exercito;
	}
	
}
