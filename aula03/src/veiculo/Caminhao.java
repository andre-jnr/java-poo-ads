package veiculo;

public class Caminhao extends Veiculo {
  Double capacidadeCarga;

  void calcImposto() {
    if (capacidadeCarga <= 2000.0)
      imposto = valor * 4 / 100;
    else if (capacidadeCarga <= 3000.0)
      imposto = valor * 6 / 100;
    else
      imposto = valor * 8 / 100;
  }
}
