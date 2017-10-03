package lista.exercicios.dip.violation;

public class Piloto {

    private Carro veiculo;

    public Piloto(Carro veiculo){
        this.veiculo = veiculo;
    }

    public void aumentaVelocidade(){
        veiculo.acelerar();
    }
    
}
