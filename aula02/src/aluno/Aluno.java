package aluno;

public class Aluno {
  String nome;
  String curso;
  Double n1;
  Double n2;
  Double media;
  String status;

  void calculaMedia() {
    media = (n1 + n2) / 2;
  }

  void atualizarStatus() {
    if (media <= 4) {
      status = "reprovado";
    } else if (media <= 6) {
      status = "em recuperação";
    } else {
      status = "aprovado";
    }
  }
}