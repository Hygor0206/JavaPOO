package ifcombate;

import java.util.Random;

public class Batalha {
	private Exercito exercito1;
	private Exercito exercito2;
	private final int campoBatalha = 100;
	private final int raioBatalha = 20;

	public Batalha(Exercito ex1, Exercito ex2) {
		this.exercito1 = ex1;
		this.exercito2 = ex2;
	}

	public boolean jogar() {
		if (!verificarVitoria()){
			if (verificarDistancia()){
				
				Random r = new Random();
				int quemAtaca = r.nextInt(1, 3);
				if (quemAtaca == 1) {
					this.exercito1.atacar(exercito2);
					System.out.println("1 Ataca 2");
				}else {
					this.exercito2.atacar(exercito1);
					System.out.println("2 Ataca 1");					
				}
			}else {
				exercito1.movimentar();
				exercito2.movimentar();
			}
			return true;
		}else {
			System.out.println("Acabou!");
			return false;
		}
	}
	
	private boolean verificarVitoria() {
		if (this.exercito1.getVidaExercito() <= 0 || this.exercito2.getVidaExercito()<=0)
			return true;
		else
			return false;
	}
	//verificar se a diferença da soma das posições 
	//e 100 é menor ou igual a 20
	private boolean verificarDistancia() {
		return this.campoBatalha - 
		(this.exercito1.getPosicao() + this.exercito2.getPosicao()) <= this.raioBatalha;
	}

}
