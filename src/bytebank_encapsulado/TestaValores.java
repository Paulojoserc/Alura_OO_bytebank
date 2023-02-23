package bytebank_encapsulado;

public class TestaValores {
public static void main(String[] args) {
	Conta conta = new Conta(1337, 24226);
	System.out.println(conta.getAgencia());
	conta.setAgencia(1232123);
	
	Conta conta2 = new Conta(1337, 24226);
	Conta conta3 = new Conta(0001, 13241);
	
	System.out.println(conta2.getTotal());
}
}
