package cadastro;

public class Aparelho {

	long cliente_id;
	String tipoAparelho="";
	String marca="";
	String modelo="";
	String defeito="";
	
	public String getTipoAparelho() {
		return tipoAparelho;
	}
	public void setTipoAparelho(String tipoAparelho) {
		this.tipoAparelho = tipoAparelho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDefeito() {
		return defeito;
	}
	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}
	@Override
	public String toString() {
		return "Aparelho [ tipoAparelho=" + tipoAparelho + ", marca=" + marca + ", modelo=" + modelo
				+ ", defeito=" + defeito + "]";
	}
	
	
	
	
}
