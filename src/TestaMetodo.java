
public class TestaMetodo {
public static void main(String[] args) {
	Conta contaDoPaulo = new Conta();
	
	contaDoPaulo.saldo = 100;
	contaDoPaulo.deposita(50);
	
	System.out.println(contaDoPaulo.saldo);
	
	boolean conseguiuSaca = contaDoPaulo.saca(20);
	System.out.println(conseguiuSaca);
	System.out.println(contaDoPaulo.saldo);
	
	Conta contaDaMarcela = new Conta();
	
	contaDaMarcela.deposita(1000);
	
	if(contaDaMarcela.transfere(300, contaDoPaulo)) {
		System.out.println("Transferencia conclida com suecesso");
	}else {
		System.out.println("Não foi possivel transferir o valor ");
	}
	
	System.out.println(contaDoPaulo.saldo);
	System.out.println(contaDaMarcela.saldo);
	
	contaDoPaulo.titular = "Paulo Costa";
	System.out.println(contaDoPaulo.titular);
}
}
