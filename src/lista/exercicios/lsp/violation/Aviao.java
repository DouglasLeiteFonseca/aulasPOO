package lista.exercicios.lsp.violation;

public class Aviao  {
    // Um avião pode reverter o motor enquanto se movimenta para frente
	private Veiculo v;
	Aviao(Marcha m){
		this.v = new Veiculo(m);
	}

    public Marcha getMarcha() {
        return v.getMarcha();
    }

    public void mudaMarcha(Marcha marcha) {
      v.mudaMarcha(marcha);
    }
	
}
