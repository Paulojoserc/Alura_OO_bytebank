package bytebank_herdado;

//Gerente eh um FuncionarioAutenticavel, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends Funcionario {

	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
		// return this.getSalario();
		return super.getSalario();
	}

}
