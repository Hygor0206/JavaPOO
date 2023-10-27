package bancoifc;

public class ContaCorrente {
	
	private Cliente cliente;
	private double saldo;
	private String numeroConta;
	private String agencia;
	
	public ContaCorrente(Cliente cliente) {
		this.cliente = cliente;
		this.saldo = 0;
		this.numeroConta = gerarNumeroConta();
		this.agencia = "123";
		
	}
	
	public ContaCorrente(Cliente cliente, double valorInicial) {
		this.cliente = cliente;
		this.saldo = valorInicial;
		this.numeroConta = gerarNumeroConta();
		this.agencia = "123";
		
	}
	
	private String gerarNumeroConta() {
		return "919191";
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNumeroConta() {
		return this.numeroConta;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	//debitar()
	public boolean sacar(double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}else
			return false;
	}
	
	//creditar
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo +=valor;
			return true;
		}else
			return false;
	}
	
	public boolean transferir(double valor, ContaCorrente cc) {
		if (valor > 0 && valor <= this.saldo) {
			this.sacar(valor);
			cc.depositar(valor);
			return true;
		}else
			return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
