package aluno;

public class Aluno {
  String nome;
  String curso;
  Double n1;
  Double n2;
  Double media;
  String status;

  void calcMedia() {
    media = (n1 + n2) / 2;
  }

  void atualizarStatus() {
    if (media <= 4.9) {
      status = "reprovado";
    } else {
      status = "aprovado";
    }
  }
}
