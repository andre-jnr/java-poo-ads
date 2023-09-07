package veiculo;

public class Motocicleta extends Veiculo {
  Integer cilindradas;

  void calcImposto() {
    if (cilindradas < 160) {
      imposto = valor * 0.02;
    } else if (cilindradas < 300) {
      imposto = valor * 0.03;
    } else {
      imposto = valor * 3 / 100;
    }
  }
}
