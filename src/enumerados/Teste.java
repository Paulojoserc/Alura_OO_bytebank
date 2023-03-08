package enumerados;

public class Teste {

	public static void main(String[] args) {
		Prioridade pMIn = Prioridade.NIN;
		Prioridade pMax = Prioridade.MAX;

		System.out.println(pMIn.name());
		System.out.println(pMax.name());

		System.out.println(pMIn.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMIn.getValor());
		System.out.println(pMax.getValor());
		
		
		
	}

}
