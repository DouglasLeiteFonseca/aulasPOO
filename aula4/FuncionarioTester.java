package aula4;

public class FuncionarioTester extends Funcionario {
	FuncionarioTester(double s){
		this.setSalarioBase(s);
	}
	public RegraDeCalculo getRegraCalculo(){
		return new QuinzeOuVinteCincoPorCento();
	}
}
