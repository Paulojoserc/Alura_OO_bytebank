package bytebank_herdado;

public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		System.out.println("Editor de V�deo");
		return super.getBonificacao() + 100;
	}
}
