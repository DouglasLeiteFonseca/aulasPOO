package lista.exercicios.ocp.violation;

public class Teste {
	 public static void main(String[] args) {
			Veiculo v = new Veiculo();
			ManipuladorDeEventos m = new ManipuladorDeEventos(v);
			m.mudarModoDirecao(new ModoDirecaoDefault());
			System.out.println("Modo default");
			System.out.println("Potencia: "+ v.getPotencia());
			System.out.println("Suspencao: "+ v.getAlturaSuspencao());
			
			m.mudarModoDirecao(new ModoDirecaoEsporte());
			System.out.println("Modo esporte");
			System.out.println("Potencia: "+ v.getPotencia());
			System.out.println("Suspencao: "+ v.getAlturaSuspencao());
			
			m.mudarModoDirecao(new ModoDirecaoPasseio());
			System.out.println("Modo passeio");
			System.out.println("Potencia: "+ v.getPotencia());
			System.out.println("Suspencao: "+ v.getAlturaSuspencao());
		}
}
