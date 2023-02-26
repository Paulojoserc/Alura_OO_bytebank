package bytebank_herdado;

public class Designer extends Funcionario{
	public double getBonificacao() {
		System.out.println("Chamando o métado de Bonificacao Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
}
