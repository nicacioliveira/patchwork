public class Pessoa {

	private String nome;
	private String sobrenome;

	public Pessoa(String nome, String sobrenome) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}

	public void setNome(String nome) throws IllegalArgumentException {
		if (nome.isEmpty)
			throw new IllegalArgumentException("Nome vazio");	
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) throws IllegalArgumentException {
		if (sobrenome.isEmpty)
			throw new IllegalArgumentException("Sobrenome vazio");
		this.nome = nome;
	}
}
