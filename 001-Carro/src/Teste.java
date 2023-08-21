public class Teste {

  public static void main(String[] args) {

    Carro c = new Carro();
    Carro car = new Carro();
    Carro carro = new Carro();

    c.modelo = "Gol";
    c.ano = 2019;
    c.valor = 40000.0;
    c.CalcIpva();

    System.out.println("Modelo: " + c.modelo);
    System.out.println("Ano: " + c.ano);
    System.out.println("Valor: R$" + c.valor);
    System.out.println("IPVA: R$" + c.ipva + "\n");

    car.modelo = "Civic";
    car.ano = 2020;
    car.valor = 60000.0;
    car.CalcIpva();

    System.out.println("Modelo: " + car.modelo);
    System.out.println("Ano: " + car.ano);
    System.out.println("Valor: R$" + car.valor);
    System.out.println("IPVA: R$" + car.ipva + "\n");

    carro.modelo = "Celta";
    carro.ano = 2008;
    carro.valor = 80000.0;
    carro.CalcIpva();

    System.out.println("Modelo: " + carro.modelo);
    System.out.println("Ano: " + carro.ano);
    System.out.println("Valor: R$" + carro.valor);
    System.out.println("IPVA: R$" + carro.ipva + "\n");
  }
}
