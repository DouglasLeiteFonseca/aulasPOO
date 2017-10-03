package lista.exercicios.lsp.violation;

public class Teste {
	public static void main(String[] args) {
		Aviao a = new Aviao(Marcha.D);
		a.mudaMarcha(Marcha.R);
		System.out.println(a.getMarcha());
		
		Carro c = new Carro(Marcha.D);
		c.mudaMarcha(Marcha.P);
		System.out.println(c.getMarcha());
		
		c.mudaMarcha(Marcha.R);
		System.out.println(c.getMarcha());
		
		c.mudaMarcha(Marcha.D);
		System.out.println(c.getMarcha());
		
		c.mudaMarcha(Marcha.R);
		System.out.println(c.getMarcha());
		
	}
}
