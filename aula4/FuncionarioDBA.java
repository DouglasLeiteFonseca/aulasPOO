package aula4;

public class FuncionarioDBA extends Funcionario  {
	FuncionarioDBA(double s){
		this.setSalarioBase(s);
	}
	public RegraDeCalculo getRegraCalculo(){
		return new QuinzeOuVinteCincoPorCento();
	}
}
