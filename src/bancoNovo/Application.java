package bancoNovo;

public class Application {

	public static void main(String[] args) {
		
		Cliente andre = new Cliente();
		andre.setNome("André");

		Conta cc = new ContaCorrente(andre);
		Conta poupanca = new ContaPoupanca(andre);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		((ContaCorrente) cc).chequeEspecial(500);
		poupanca.imprimirExtrato();

	

	}

}
