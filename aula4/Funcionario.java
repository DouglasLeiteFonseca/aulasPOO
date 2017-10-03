package aula4;

public abstract class  Funcionario  {
	private double salarioBase;

	public double getSalarioBase(){
		return salarioBase;
	}
	public void setSalarioBase(double s){
		salarioBase = s;
	}
	
	Funcionario(){
		super();
	}
	
	public RegraDeCalculo getRegraCalculo() {
		//percentual padrao dos funcionarios
		return new DezOuVintePorCento();
	}
	
}
