package Polimorfismo;

public class Professor extends Pessoa {

	public Professor(String nome) {
		super(nome);
	}
	
	public void corrigirProvas() {
		System.out.println("Corrigir provas");
	}
	
	public void ola() {
		System.out.println("Olá, professor!");
	}

}
