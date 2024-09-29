public class Gerente extends Funcionario{
  public Gerente(String nome, Double salario) {
    super(nome, salario);
  }

  @Override
  public Double calcularBonus() {
    return this.salario * 0.20;
  }
}
