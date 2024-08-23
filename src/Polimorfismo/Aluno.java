package Polimorfismo;

public class Aluno extends Pessoa {

	public Aluno(String nome) {
		super(nome);
	}
	
	public void ola() {
		System.out.println("Olá, aluno!");
	}
	
	public void fazerMatricula() {
		System.out.println("Fazer matricula");
	}

}
