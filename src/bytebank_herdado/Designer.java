package bytebank_herdado;

public class Designer extends Funcionario{
	public double getBonificacao() {
		System.out.println("Chamando o m�tado de Bonificacao Editor de V�deo");
		return super.getBonificacao() + 100;
	}
}
