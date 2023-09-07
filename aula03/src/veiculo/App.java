package veiculo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta();

        Scanner into = new Scanner(System.in);

        System.out.println("Digite o modelo: ");
        moto.modelo = into.next();
        System.out.println("Digite a marca: ");
        moto.marca = into.next();
        System.out.println("Digite o valor: ");
        moto.valor = into.nextDouble();
        System.out.println("Digite as cilindradas: ");
        moto.cilindradas = into.nextInt();
        moto.calcImposto();

        System.out.println("Modelo: " + moto.modelo);
        System.out.println("marca: " + moto.marca);
        System.out.println("valor: " + moto.valor);
        System.out.println("cilindradas: " + moto.cilindradas);
        System.out.println("imposto: " + moto.imposto);
    }
}
