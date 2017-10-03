package aula4;

public class Programa {
	public static void main(String[] args) {
		/* A solucao do exerciod de calculo de salarios foi feita baseada em heranca e polimorfismo.
		 * Foi feita a implementacao de classes especialistas em cada cargo e nestas classes especialistas
		 * contem um metodo que retorna a classe que deve ser usada para o calculo do salario.
		 * Dessa Forma ao criar um novo cargo na empresa, basta criar uma nova classe no sistema deste novo cargo
		 * Não sendo necessario a alteracao de nenhuma outra classe.
		 * */
		Funcionario f = new FuncionarioDBA(3000);
		CaculadoraDeSalario c = new CaculadoraDeSalario();
		System.out.println(c.calcula(f));
		
		Funcionario f1 = new FuncionarioDesenvolvedor(3000);
		CaculadoraDeSalario c1 = new CaculadoraDeSalario();
		System.out.println(c1.calcula(f1));
		
		Funcionario f2 = new FuncionarioDBA(3000);
		CaculadoraDeSalario c2 = new CaculadoraDeSalario();
		System.out.println(c2.calcula(f2));
	}
}
