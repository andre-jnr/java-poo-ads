import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Vetor v = new Vetor();
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        v.criarlista(); // criando banco de dados

        do {
            System.out.println("###SISTEMA DE CADASTRO###\n");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - LISTAR VEICULO COM O ANO ACIMA DE 2010");
            System.out.println("4 - LISTAR VEICULO POR MARCA");
            System.out.println("5 - LISTAR VEICULO ACIMA DE CEM MIL REAIS");
            System.out.println("6 - Sair");

            System.out.println("\n escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("##MODULO DE CADASTRO##");
                    v.inserir();
                    break;
                case 2:
                    System.out.println("##MODULO DE LISTAGEM##");
                    v.listar();
                    break;
                case 3:
                    System.out.println("MODULO DE LISTAGEM");
                    v.listar2010();
                    break;
                case 4:
                    System.out.println("MODULO DE LISTAGEM");
                    System.out.println("Em desenvolvimento!");
                    break;
                case 5:
                    System.out.println("### Veiculoas acima de R$100.000,00");
                    v.listar100();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }

        } while (opcao != 6);

    }

}