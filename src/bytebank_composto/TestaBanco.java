package bytebank_composto;

public class TestaBanco {
public static void main(String[] args) {
	Cliente paulo = new Cliente();
	paulo.nome = "Paulo Costa";
	paulo.cpf = "222.222.222.22";
	paulo.profissao = "Estudante";
	
	Conta contaDoPaulo = new Conta();
	contaDoPaulo.deposita(100);
	//associa o cliente paulo a conta contaDoPaulo
	contaDoPaulo.setTitular(paulo);
	
	System.out.println(contaDoPaulo.getTitular().nome);
}
}
