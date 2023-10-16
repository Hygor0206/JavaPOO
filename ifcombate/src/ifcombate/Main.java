package ifcombate;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Exercito russia = new Exercito(0);
		Exercito ucrania = new Exercito(0);
		
		Batalha adeus = new Batalha(russia, ucrania);
		
		while(adeus.jogar()) {						
			System.out.println("=============");
			System.out.println("Rússia: " + russia);
			System.out.println("Ucrania: " + ucrania);
			Thread.sleep(10);
		}
		System.out.println("=============");
		System.out.println("Rússia: " + russia);
		System.out.println("Ucrania: " + ucrania);
		
	}

}
