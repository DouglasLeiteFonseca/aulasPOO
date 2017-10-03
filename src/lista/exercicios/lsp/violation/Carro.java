package lista.exercicios.lsp.violation;

public class Carro {
	private Veiculo v;

	Carro(Marcha m){
		this.v = new Veiculo(m);
	}

    public Marcha getMarcha() {
        return v.getMarcha();
    }

    public void mudaMarcha(Marcha marcha) {
        if(Marcha.R.equals(marcha) && getMarcha().equals(Marcha.D)){
            throw new RuntimeException("N�o pode mudar para REVERSE quando " + getMarcha().toString() + " marcha est� engatada!");
        }else{
        	v.mudaMarcha(marcha);
        }
    }
}
