package br.com.orientacao_a_objetos;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente newGerente01 = new Gerente();
		newGerente01.setSalarioFuncionario(3400.30);
		
		Gerente newGerente02 = new Gerente();
		newGerente02.setSalarioFuncionario(6023.21);
		
		newGerente01.setAumentoPadrao();
		newGerente02.setAumentoVariavel(9);
		
	}
}