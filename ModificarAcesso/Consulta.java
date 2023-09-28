package ModificadoresAcesso;

public class Consulta {
	private String data;
	private String nomePcnte;
	private String nomeDents;
	
	public Consulta() {
	}
	
	public Consulta(String data,String nomePcnte,String nomeDents) {
		this.data = data;
		this.nomePcnte = nomePcnte;
		this.nomeDents = nomeDents;
		}
	public String getData() {
		return data;
	}
	public void setData() {
		this.data = data;
	}
	
	public String getNomePcnte() {
		return nomePcnte;
	}
	public void setNomePcnte() {
		this.nomePcnte = nomePcnte;
	}
	
	public String getNomeDents() {
		return nomeDents;
	}
	public void setNomeDents() {
		this.nomeDents = nomeDents;
	}
}