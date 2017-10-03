package aula4;

public class FuncionarioDesenvolvedor extends Funcionario  {
	FuncionarioDesenvolvedor(double s){
		this.setSalarioBase(s);
	}
	public RegraDeCalculo getRegraCalculo(){
		return new DezOuVintePorCento();
	}
}
