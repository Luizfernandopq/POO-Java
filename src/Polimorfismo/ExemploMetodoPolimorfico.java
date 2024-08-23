package Polimorfismo;

public class ExemploMetodoPolimorfico {	
	public static void main(String[] args) {
		Forma[] fs = new Forma[] {
			new Circulo(), new Quadrado(),
			new Triangulo(), new Forma()
		};
		metodoPolimorfico(fs);
	}
	public static void metodoPolimorfico(Forma[] fs) {
		for (Forma f: fs) {
			f.desenhar();
		}
	}
}

