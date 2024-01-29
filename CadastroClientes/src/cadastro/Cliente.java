package cadastro;

public class Cliente {

	long id;
	String nome = "";
	String cpf = "";
	String celuar="";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCeluar() {
		return celuar;
	}
	public void setCeluar(String celuar) {
		this.celuar = celuar;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", celuar=" + celuar + "]";
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
