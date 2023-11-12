package aula09;

import javax.swing.JOptionPane;

public class Vetor {
    Pessoa[] vet;
    int contador = 0;
    
    void criarLista() {
        vet = new Pessoa[5];
    }
    
    void inserir(Pessoa pessoa) {
        if (contador == 5) {
            JOptionPane.showMessageDialog(null,"Lista cheia! ");
        }
        else {
            vet[contador] = new Pessoa();
            
            vet[contador].setNome(pessoa.getNome());
            vet[contador].setIdade(pessoa.getIdade());
            vet[contador].setSalario(pessoa.getSalario());
            
            contador++;
        }
    }
    
    void listar() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "LIsta vazia!");
        }
        else {
            for (int i = 0; i < contador; i++) {
                JOptionPane.showMessageDialog(null, "Listando os dados!! \n"
                        + "Nome: " + vet[i].getNome() + "\n"
                        + "Idade: " + vet[i].getIdade() + "\n"
                        + "Salario: " + vet[i].getSalario());
            }
        }
    }
}
