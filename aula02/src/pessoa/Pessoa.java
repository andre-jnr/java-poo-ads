package pessoa;

public class Pessoa {
  String nome;
  String rg;
  Integer idade;
  Double renda;
  String status;

  void atualizarStatus() {
    if ((idade >= 18) && (renda >= 2600.0)) {
      status = "BOM";
    } else {
      status = "RUIM";
    }
  }
}