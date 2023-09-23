package encapsulamento;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Carro car = new Carro();
        
        Scanner input = new Scanner(System.in);
        
        // Coletar os dados
        System.out.println("Digite o modelo do carro: ");
        car.setModelo(input.next());
        
        System.out.println("Digite a marca do carro: ");
        car.setMarca(input.next());
        
        System.out.println("Digite o valor do carro: ");
        car.setValor(input.nextDouble());
        
        System.out.println("Digite o ano do carro: ");
        car.setAno(input.nextInt());
        
        // Exibir os dados
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Marca: " + car.getMarca());
        System.out.println("Valor: R$" + car.getValor());
        System.out.println("Ano: " + car.getAno());
    }
    
}
