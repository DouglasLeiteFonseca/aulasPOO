package lista.exercicios.isp.violation;

public class Teste {
	public static void main(String[] args) {
		System.out.println("------ carro --------");
		Carro c  = new Carro();
		c.ligar();
		c.ligarRadio();
		System.out.println("Status do carro");
		System.out.println("Motor ligado?" +c.isMotorRodando());
		System.out.println("Radio ligado?" +c.isRadioOn());
		c.desligar();
		c.desligarRadio();
		System.out.println("Status do carro");
		System.out.println("Motor ligado?" +c.isMotorRodando());
		System.out.println("Radio ligado?" +c.isRadioOn());
		
		System.out.println("------ drone --------");
		
		Drone d  = new Drone();
		d.ligar();
		d.ligarCamera();
		System.out.println("Status do Drone");
		System.out.println("Motor ligado?" +d.isMotorRodando());
		System.out.println("Camera ligada?" +d.isCameraOn());
		d.desligar();
		d.desligarCamera();
		System.out.println("Status do Drone");
		System.out.println("Motor ligado?" +d.isMotorRodando());
		System.out.println("Camera ligada?" +d.isCameraOn());
	}
}
