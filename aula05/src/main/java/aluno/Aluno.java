package aluno;

public class Aluno {
    String nome;
    Double n1;
    Double n2;
    Double media;
    String status;
    
    void calcStatus() {
        media = (n1 + n2) / 2;
        
        if (media >= 5) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
    }
}