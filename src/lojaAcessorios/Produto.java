package lojaAcessorios;

public class Produto {
	 private String descricao;
	 private double valor; 
	 private String marca;
	 
	 public Produto(String descricao, double valor, String marca){
	 this.descricao = descricao;
	 this.marca = marca;
	 this.valor = valor;
	 }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
