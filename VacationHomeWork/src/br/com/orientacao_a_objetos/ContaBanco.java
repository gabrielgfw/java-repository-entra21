package br.com.orientacao_a_objetos;

public class ContaBanco {
		
	int numeroConta;
	double saldoConta;
	double limiteConta = 100.0; // limite inicial
	AgenciaBanco agenciaConta;
	
	public ContaBanco(int nrConta) {
		this.numeroConta = nrConta;
	}
	
	public void setDeposito(double valorDeposito) {
		this.saldoConta += valorDeposito;
	}
	
	public void setSaque(double valorSaque) {
		this.saldoConta -= valorSaque;
	}
	
	public double getSaldo() {
		return this.saldoConta;
	}

	public void getExtrato() {
		System.out.println("======================");
		System.out.println("Extrato Conta");
		System.out.println("----------------------");
		System.out.println("N�mero Conta: " + this.numeroConta);
		System.out.println("Saldo Conta: R$ " + this.saldoConta);
		System.out.println("Limite Conta: R$ " + this.limiteConta);
		System.out.println("Agencia Banco: " + this.agenciaConta.numeroAgencia);
		System.out.println("======================");
	}
	
	public void transferencia(double valor, ContaBanco contaB) {
		this.saldoConta -= valor;
		contaB.saldoConta += valor;
		System.out.println("Transfer�ncia bem sucedida!");
		System.out.println("Valor transferido: R$" + valor);
	}
}