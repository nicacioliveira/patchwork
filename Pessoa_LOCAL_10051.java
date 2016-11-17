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

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.nome = nome;
	}
}
