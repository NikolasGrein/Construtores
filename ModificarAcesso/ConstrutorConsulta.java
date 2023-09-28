package ModificadoresAcesso;

public class ConstrutorConsulta {
	
public static void main(String[] args) {
		
		Consulta consulta1 = new Consulta("02/11/2023", "André", "Reginaldo");
		
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());
	}

}
