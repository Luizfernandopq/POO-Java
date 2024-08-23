package Polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Professor p = new Professor("Igor");
		Pessoa p2 = new Professor("Luiz");
		Aluno a1 = new Aluno("João");
		teste(p);
		teste(p2);
		teste(a1);
		
	}
	
	public static void teste(Object p) {
		if (p instanceof Pessoa) {
			Pessoa p2 = (Pessoa)p;
			p2.ola();
		}
			
	}

}
