package bancoifc;

public class MainCC {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("Zé Zinho", "023.345.456-54", 500);
		ContaCorrente cc2 = new ContaCorrente("Gustavo Rodrigues", "111.222.333-44", 0.01);
		ContaCorrente cc3 = new ContaCorrente("Guilherme", "010.020.030-99", 50000);
		
//		System.out.println("Nome: " + cc1.getNome());
//		System.out.println("R$ " + cc1.getSaldo());
//		System.out.println("CC " + cc1.getNumeroConta());
//		
		
		System.out.println("Saldo do " + cc1.getNome() + ": R$ " + cc1.getSaldo());
		System.out.println("Saldo do " + cc2.getNome() + ": R$ " + cc2.getSaldo());
		System.out.println("Saldo do " + cc3.getNome() + ": R$ " + cc3.getSaldo());
				
		
		if (cc3.transferir(150, cc1))
			System.out.println("Transferência ok");
		else
			System.out.println("Erro na transferência");
		
		System.out.println("Saldo do " + cc1.getNome() + ": R$ " + cc1.getSaldo());
		System.out.println("Saldo do " + cc2.getNome() + ": R$ " + cc2.getSaldo());
		System.out.println("Saldo do " + cc3.getNome() + ": R$ " + cc3.getSaldo());
				
		/*
		if (cc1.sacar(100))
			System.out.println("Saque afetuado com sucesso");
		else
			System.out.println("Saldo insuficiente");
		
		System.out.println("Saldo atual: R$ " + cc1.getSaldo());
		
		
		if (cc1.depositar(1000))
			System.out.println("Depósito ok");
		else
			System.out.println("Erro no depósito");
		
		if (cc1.sacar(100))
			System.out.println("Saque afetuado com sucesso");
		else
			System.out.println("Saldo insuficiente");
		
		System.out.println("Saldo atual: R$ " + cc1.getSaldo());
		*/
			
	}
}
