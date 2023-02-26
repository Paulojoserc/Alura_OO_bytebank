package bytebank_herdado;

public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		System.out.println("Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
}
