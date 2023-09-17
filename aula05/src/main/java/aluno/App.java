package aluno;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        AlunoTec obj2 = new AlunoTec();
        AlunoSuperior obj3 = new AlunoSuperior();
        
        Scanner input = new Scanner(System.in);
        
        int a = 0, b = 0, c = 0;
        
        do {
            System.out.println("\n### MENU DE CADASTRO ###");
            
            System.out.println("\n [1] - ALUNO NORMAL");
            System.out.println("\n [2] - ALUNO TÉCNICO");
            System.out.println("\n [3] - ALUNO SUPERIOR");
            
            System.out.println("\n ESCOLHA UMA OPÇÃO: ");
            b = input.nextInt();
            
            switch (b) {
                case 1:
                    System.out.println("\nCADASTRO DE ALUNO NORMAL");
                    
                    System.out.println("Digite o nome: ");
                    obj1.nome = input.next();
                    
                    System.out.println("Digite a N1: ");
                    obj1.n1 = input.nextDouble();
                    
                    System.out.println("DIgite a N2: ");
                    obj1.n2 = input.nextDouble();
                    
                    obj1.calcStatus();
                    
                    System.out.println("NOME: " + obj1.nome);
                    System.out.println("MÉDIA: " + obj1.media);
                    System.out.println("STATUS: " + obj1.status);
                    
                    break;
                case 2:
                    System.out.println("\n CADASTRO DE ALUNO TECNICO");
                    
                    System.out.println("Digite o nome: ");
                    obj2.nome = input.next();
                    
                    System.out.println("Digite a N1: ");
                    obj2.n1 = input.nextDouble();
                    
                    System.out.println("DIgite a N2: ");
                    obj2.n2 = input.nextDouble();
                    
                    System.out.println("DIgite a N3: ");
                    obj2.n3 = input.nextDouble();
                    
                    obj2.calcStatus();
                    
                    System.out.println("NOME: " + obj2.nome);
                    System.out.println("MÉDIA: " + obj2.media);
                    System.out.println("STATUS: " + obj2.status);
                    
                    break;
                case 3:
                    System.out.println("\n CADASTRO DE ALUNO SUPERIOR");
                    
                    System.out.println("Digite o nome: ");
                    obj3.nome = input.next();
                    
                    System.out.println("Digite a N1: ");
                    obj3.n1 = input.nextDouble();
                    
                    System.out.println("DIgite a N2: ");
                    obj3.n2 = input.nextDouble();
                    
                    System.out.println("DIgite a N3: ");
                    obj3.n3 = input.nextDouble();
                    
                    System.out.println("DIgite a N4: ");
                    obj3.n4 = input.nextDouble();
                    
                    System.out.println("Digite 1 caso o aluno tenha publicado um artigo \n");
                    System.out.println("Digite 2 para caso não tenha publicado o artigo");
                    c = input.nextInt();
                    
                    if (c == 1)
                        obj3.calcStatus(c);
                    else
                        obj3.calcStatus();
                    
                    System.out.println("NOME: " + obj3.nome);
                    System.out.println("MÉDIA: " + obj3.media);
                    System.out.println("STATUS: " + obj3.status);
                    
                    break;
                default:
                    System.out.println("\n&&& OPÇÃO INVÁLIDA!!! &&&");
            }
            
            System.out.println("\nDigite 1 para continuar, e 0 para sair!");
            a = input.nextInt();
        } while (a != 0);
        
        System.out.println("Você saiu do sistema!");
        
    }
}
