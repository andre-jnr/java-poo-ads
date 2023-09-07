package aluno;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Tecnico estudante = new Tecnico();

    Scanner into = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    estudante.nome = into.next();
    System.out.println("Digite seu curso: ");
    estudante.curso = into.next();
    System.out.println("Digite a n1: ");
    estudante.n1 = into.nextDouble();
    System.out.println("Digite a n2: ");
    estudante.n2 = into.nextDouble();
    System.out.println("Digite a n3: ");
    estudante.n3 = into.nextDouble();

    estudante.calcMedia();
    estudante.atualizarStatus();

    System.out.println("Nome: " + estudante.nome);
    System.out.println("curso: " + estudante.curso);
    System.out.println("N1: " + estudante.n1);
    System.out.println("N2: " + estudante.n2);
    System.out.println("N3: " + estudante.n3);
    System.out.println("Média: " + estudante.media);
    System.out.println("Status: " + estudante.status);
  }
}
