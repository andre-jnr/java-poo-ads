package pessoa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa obj = new Pessoa();
        Scanner into = new Scanner(System.in);

        int x = 0;

        do {
            System.out.println("#### Inicio ####");

            System.out.println("Digite o nome: ");
            obj.nome = into.next(); // captura strings

            System.out.println("DIgite o RG");
            obj.rg = into.next();

            System.out.println("Digite a renda: ");
            obj.renda = into.nextDouble();

            System.out.println("Digite a idade: ");
            obj.idade = into.nextInt();

            obj.atualizarStatus();

            System.out.println("Nome: " + obj.nome);
            System.out.println("Idade: " + obj.idade);
            System.out.println("RG: " + obj.rg);
            System.out.println("Renda: " + obj.renda);
            System.out.println("Status: " + obj.status);

            System.out.println("Digite 1 p/ continuar e 0 p/ sair");
            x = into.nextInt();
        } while (x != 0);
    }
}
