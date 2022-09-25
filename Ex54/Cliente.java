package ddd;

public class Cliente {
	int id;
	String nome;
	int idade;
	String email;
	ContaBancaria conta;
	
	Cliente()
	{
		
	}
	
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta)
	{
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	void atualizarEmail(String novoEmail)
	{
		this.email = novoEmail;
	}
	
	String exibirNomeIdade()
	{
		return "Nome: " + this.nome + "\nIdade:" + this.idade;
	}
	
	String exibirDadosConta()
	{
		return "Agencia " + this.conta.agencia + " \nConta " + this.conta.numero;
	}
}
