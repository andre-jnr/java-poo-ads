package funcionario;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Bairro b1 = new Bairro("Compensa");
    Bairro b2 = new Bairro("Jorge Teixeira");
    Bairro b3 = new Bairro("Riacho Doce");

    Setor s1 = new Setor("TI");
    Setor s2 = new Setor("ADM");
    Setor s3 = new Setor("Log");

    Funcionario fun = new Funcionario();
    Scanner input = new Scanner(System.in);
    int a = 0, b = 0;

    System.out.println("Digire o nome do funcionario: ");
    fun.setNome(input.next());

    System.out.println("Digite a matricula do funcionario: ");
    fun.setId(input.nextInt());

    System.out.println("Digite o sálario do funcionario: ");
    fun.setSalario(input.nextDouble());

    System.out.println("[1] - Bairro: " + b1.getNome());
    System.out.println("[2] - Bairro: " + b2.getNome());
    System.out.println("[3] - Bairro: " + b3.getNome());
    System.out.println("Escolha o bairro pelo código (1, 2, 3): ");
    a = input.nextInt();

    switch (a) {
      case 1:
        fun.setBairro(b1);
        break;
      case 2:
        fun.setBairro(b2);
        break;
      case 3:
        fun.setBairro(b3);
        break;
      default:
        System.out.println("Opção incorreta");
        break;
    }

    System.out.println("[1] - Setor: " + s1.getNome());
    System.out.println("[2] - Setor: " + s2.getNome());
    System.out.println("[3] - Setor: " + s3.getNome());
    System.out.println("Escolha o setor pelo código (1, 2, 3): ");
    b = input.nextInt();

    switch (b) {
      case 1:
        fun.setSetor(s1);
        break;
      case 2:
        fun.setSetor(s2);
        break;
      case 3:
        fun.setSetor(s3);
        break;
      default:
        System.out.println("Opção incorreta");
        break;
    }

    System.out.println("Matricula: " + fun.getId());
    System.out.println("Nome: " + fun.getNome());
    System.out.println("Salario: R$" + fun.getSalario());
    System.out.println("Bairro: " + fun.getBairro().getNome());
    System.out.println("Setor: " + fun.getSetor().getNome());
  }
}
