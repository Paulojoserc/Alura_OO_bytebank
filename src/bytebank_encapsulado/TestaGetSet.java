 package bytebank_encapsulado;

public class TestaGetSet {
public static void main(String[] args) {
	Conta conta = new Conta(0, 0);
	//conta.numero = 1337;
	conta.setNumero(1337);
	System.out.println(conta.getNumero());
	
	Cliente paulo = new Cliente();
	//conta.titular = paulo;
	paulo.setNome("Paulo Silveira");
	
	conta.setTitular(paulo);
	
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programador");
	//O cod�go acima em duas linhas:
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
	
	System.out.println(titularDaConta);
	System.out.println(paulo);
	System.out.println(conta.getTitular());
}
}
