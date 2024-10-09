package robos;

public class Molde {

	private String robo;
	private int complexidade;
	private int velocidade;
	private String estilo;
	

	protected Molde() {

	}
	protected  Molde(String robo, int complexidade, int velocidade,String estilo) {
		this.robo = robo;
		this.complexidade = complexidade;
		this.velocidade = velocidade;
		this.estilo = estilo;
		
	}
	public String getRobo() {
		return robo;
	}
	public void setRobo(String robo) {
		this.robo = robo;
	}
	public int getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(int complexidade) {
		this.complexidade = complexidade;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
}
