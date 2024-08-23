package Polimorfismo;

public class Upcasting {
	public static void main(String[] args) {
		Forma f = new Quadrado(); // upcasting
		Circulo c = new Circulo();
		metodoPolimorfico(c); // upcasting
	}

	public static void metodoPolimorfico(Forma f) {
		f.desenhar();
	}
}

