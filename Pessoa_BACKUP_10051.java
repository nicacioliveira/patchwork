public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	private String sexo;

<<<<<<< HEAD
	public Pessoa(String nome, String sobrenome, int idade, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.idade = idade;
=======
	public Pessoa(String nome, String sobrenome) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
>>>>>>> 4c49ca16719172d03b66a250496f76539d850bf9
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
