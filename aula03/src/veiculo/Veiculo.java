package veiculo;

public class Veiculo {
  String modelo;
  String marca;
  Double valor;
  Double imposto;

  void calcImposto() {
    if (valor <= 5000.0) {
      imposto = valor * 2 / 100;
    } else if (valor <= 8000.0) {
      imposto = valor * 4 / 100;
    } else {
      imposto = valor * 6 / 100;
    }
  }
}