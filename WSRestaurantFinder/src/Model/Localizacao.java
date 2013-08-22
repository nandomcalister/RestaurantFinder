package Model;

public class Localizacao {
	private int idLocalizacao;
	private double x,y;
	private String endereco;
	
	//CONSTRUTOR
	public Localizacao() {
	}
	
	//GET'S E SET'S
	public int getIdLocalizacao() {
		return idLocalizacao;
	}
	public void setIdLocalizacao(int idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
