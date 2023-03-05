package bytebank_herdado;

public class TesteGerente {
public static void main(String[] args) {
	
	//Autenticavel referencia = new Gerente();
	
	Gerente g1 = new Gerente();
	g1.setNome("Paulo");
	g1.setCpf("235568423-4");
	g1.setSalario(5000.00);
	
	g1.getBonificacao();
	
	System.out.println(g1.getNome());
	System.out.println(g1.getCpf());
	System.out.println(g1.getSalario());
	System.out.println(g1.getBonificacao());
	
	g1.setSenha(2222);
	boolean autenticou = g1.autentica(2222);
	
	System.out.println(autenticou);
	
}
}
