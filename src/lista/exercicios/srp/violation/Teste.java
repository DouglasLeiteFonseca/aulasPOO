package lista.exercicios.srp.violation;

public class Teste {
	 public static void main(String[] args) {
		Veiculo v = new Veiculo(100);
		System.out.println("Nivel de combustivel do veiculo:"+v.getQuantidadeCombustivel());
		v.acelerar();
		System.out.println("Nivel de combustivel do veiculo:"+v.getQuantidadeCombustivel());
		v.acelerar();
		System.out.println("Nivel de combustivel do veiculo:"+v.getQuantidadeCombustivel());
		v.acelerar();
		System.out.println("Nivel de combustivel do veiculo:"+v.getQuantidadeCombustivel());
		v.acelerar();
		System.out.println("Nivel de combustivel do veiculo:"+v.getQuantidadeCombustivel());
		
		System.out.println("Completar tanque");
		Abastecimento a = new Abastecimento(v);
		a.reabastecimento();
		System.out.println("Novo nivel de combustivel do veiculo:"+v.getQuantidadeCombustivel());
		
	}
}
