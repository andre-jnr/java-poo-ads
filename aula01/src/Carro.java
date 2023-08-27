public class Carro {

    String modelo;
    int ano;
    Double valor;
    Double ipva;

    void CalcIpva() {
        if (valor <= 40000.0) {
            ipva = valor * 2 / 100;
        } else if (valor <= 60000.0) {
            ipva = valor * 2 / 100;
        } else {
            ipva = valor * 0.06;
        }
    }
}
