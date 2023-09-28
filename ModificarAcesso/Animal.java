package ModificadoresAcesso;

public class Animal {
	private int tamanho;
	private String cor;
	
	public Animal() {
	}
	
	public Animal(String cor, int tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
		}

	public String getCor() {
		return cor;
	}
	public void setCor() {
		this.cor = cor;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho() {
		this.tamanho = tamanho;
	}
}
