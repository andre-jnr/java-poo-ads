package aluno;

public class AlunoTec extends Aluno{
    Double n3;
    
    void calcStatus(){
        media = (n1  + n2 + n3) / 3;
        
        if (media >= 5) {
            status = "Aprovado";
        } else if ((media >= 4) && (media < 5)) {
            status = "Em recuperação";
        } else {
            status = "Reprovado";
        }
    }
}
