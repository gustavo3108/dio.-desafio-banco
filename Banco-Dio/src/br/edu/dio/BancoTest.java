package br.edu.dio;

public class BancoTest {

	public static void main(String[] args) {
		Cliente gustavo = new Cliente("Gustavo","555-555-555.25");
		
		Conta cc = new ContaCorrente(gustavo);
		Conta poupanca = new ContaPoupanca(gustavo);

		cc.depositar(100);
		cc.setAtivo(false);;
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
