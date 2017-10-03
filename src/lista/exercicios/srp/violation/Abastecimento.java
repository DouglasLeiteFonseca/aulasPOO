package lista.exercicios.srp.violation;

public class Abastecimento {
	Veiculo veiculo;
	Abastecimento(Veiculo v){
		this.veiculo = v;
	}
	 public void reabastecimento(){
        veiculo.setQuantidadeCombustivel(veiculo.getCapacidadeTanqueCombustivel());
    }
}
