package bytebank_composto;

public class TestaContaSemCliente {
public static void main(String[] args) {
	Conta contaDaMarcela = new Conta();
	System.out.println(contaDaMarcela.getSaldo());
	
	contaDaMarcela.setTitular(new Cliente());
	System.out.println(contaDaMarcela.getTitular());
	
	contaDaMarcela.getTitular().nome = "Marcela";
	System.out.println(contaDaMarcela.getTitular().nome);
	
}
}
