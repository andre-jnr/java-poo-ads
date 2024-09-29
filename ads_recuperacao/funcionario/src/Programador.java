public class Programador extends Funcionario{

  public Programador(String nome, double salario) {
    super(nome, salario);
  }
  @Override
  public Double calcularBonus() {
    return this.salario * 0.15;
  }
}
