package desafio;

public class Tema {
	private long id;
	private String nome;
	private double ValorAluguel;
	private String cor;

	public Tema(long id, String nome, double valorAluguel, String cor) {
		this.id = id;
		this.nome = nome;
		this.ValorAluguel = valorAluguel;
		this.cor = cor;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorAluguel() {
		return ValorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		ValorAluguel = valorAluguel;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public void exibirTema (){
		System.out.println(id+" "+ nome+" "+ValorAluguel+" "+ cor);
	}
}