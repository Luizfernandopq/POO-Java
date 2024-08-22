package Polimorfismo;

public class Teste {

	public static void aumentar(Forma f) {
		f.aumentar(10);
	}

	public static void main(String[] args) {
		Linha l = new Linha();
		aumentar(l); // Forma.aumentar() e não Linha.aumentar()
	}
}
