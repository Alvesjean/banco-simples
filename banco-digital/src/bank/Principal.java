package bank;

public class Principal extends Conta {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(150);
		cc.transferir(50, poupanca);
		
		System.out.println("saldo cc: " + cc.saldo);
		
		
		System.out.println("cpp saldo: " + poupanca.saldo);
	}

}
