package ModificadoresAcesso;

public class ConstrutorCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("ENZ 7808", 87);
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());
	}

}
