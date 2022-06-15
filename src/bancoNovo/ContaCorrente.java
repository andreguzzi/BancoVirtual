package bancoNovo;

public class ContaCorrente extends Conta {
	
	public double chequeEspecial;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		
	}
	
	public void chequeEspecial(double limite) {
		chequeEspecial += limite;
		System.out.println(String.format("Cheque Especial: %.2f", this.chequeEspecial));
		
	}

}
