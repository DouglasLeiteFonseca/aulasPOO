package lista.exercicios.lsp.violation;

public class Veiculo {
	
    private Marcha marcha;

    public Marcha getMarcha() {
        return marcha;
    }
    Veiculo(Marcha m){
    	marcha = m;
    }
    public void mudaMarcha(final Marcha marcha) {
        this.marcha = marcha;
    }

}