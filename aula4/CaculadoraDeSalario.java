package aula4;

public class CaculadoraDeSalario implements RegraDeCalculo{
	public double calcula(Funcionario funcionario) {
		return funcionario.getRegraCalculo().calcula(funcionario);
	}
}
