package lista.exercicios.dip.violation;

public class Teste {
	 public static void main(String[] args) {
		 Carro c = new CarroDeCorrida(100);
		 Piloto p = new Piloto(c);
		System.out.println("Potencia: "+ c.getPotencia());
		System.out.println("Combustivel: "+ c.getQuantidadeCombustivel());
		
		p.aumentaVelocidade();
		System.out.println("Potencia: "+ c.getPotencia());
		System.out.println("Combustivel: "+ c.getQuantidadeCombustivel());
		
		p.aumentaVelocidade();
		System.out.println("Potencia: "+ c.getPotencia());
		System.out.println("Combustivel: "+ c.getQuantidadeCombustivel());
		
		p.aumentaVelocidade();
		System.out.println("Potencia: "+ c.getPotencia());
		System.out.println("Combustivel: "+ c.getQuantidadeCombustivel());
	}
}
