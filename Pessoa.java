public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	private String sexo;


	public Pessoa(String nome, String sobrenome, int idade, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.idade = idade;
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
