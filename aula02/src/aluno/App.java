package aluno;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Aluno obj = new Aluno();
        Scanner into = new Scanner(System.in);

        int x = 0;

        do {
            System.out.println("#### Inicio ####");

            System.out.println("Digite o nome: ");
            obj.nome = into.next(); // captura strings

            System.out.println("DIgite o curso: ");
            obj.curso = into.next();

            System.out.println("Digite a N1: ");
            obj.n1 = into.nextDouble();

            System.out.println("Digite a N2: ");
            obj.n2 = into.nextDouble();

            obj.calculaMedia();
            obj.atualizarStatus();

            System.out.println("Nome: " + obj.nome);
            System.out.println("Curso: " + obj.curso);
            System.out.println("N1: " + obj.n1);
            System.out.println("N2: " + obj.n2);
            System.out.println("Média: " + obj.media);
            System.out.println("Status: " + obj.status);

            System.out.println("Digite 1 p/ continuar e 0 p/ sair");
            x = into.nextInt();
        } while (x != 0);
    }
}
