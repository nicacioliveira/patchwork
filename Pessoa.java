public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;	

	public Pessoa(String nome, String sobrenome, int idade) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.idade = idade;
	}

	public void setNome(String nome) throws IllegalArgumentException {
		if (nome.isEmpty)
			throw new IllegalArgumentException("Entrada vazia!!!");
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) throws IllegalArgumentException{
		if (sobrenome.isEmpty)
			throw new IllegalArgumentException("Entrada vazia!!!");
		this.sobrenome = sobrenome;
	}
	
	public void setIdade(ind idade) {
		this.idade = idade;
	}


}
