package aluno;

public class Tecnico extends Aluno {
  Double n3;

  void calcMedia() {
    media = (n1 + n2 + n3) / 3;
  }

  void atualizarStatus() {
    if (media <= 4) {
      status = "reprovado";
    } else if (media <= 5) {
      status = "Em recuperação";
    } else {
      status = "aprovado";
    }
  }
}
