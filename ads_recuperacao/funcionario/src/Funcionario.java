public class Funcionario {
  String nome;
  Double salario;

  public Funcionario(String nome, Double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public Double calcularBonus() {
    return this.salario * 0.1;
  }
}
