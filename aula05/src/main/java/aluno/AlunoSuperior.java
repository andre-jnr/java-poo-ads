package aluno;

public class AlunoSuperior extends AlunoTec{
    Double n4;
    Integer artigo = 0;
    
    @Override
    void calcStatus() {
        media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 6) {
            status = "Aprovado";
        } else if (media < 4) {
            status = "Recuperação";
        } else {
            status = "Em recuperação";
        }
    }
    
    void calcStatus(int a){
        media = 10.0;
        status = "Aprovado";
    }
}
