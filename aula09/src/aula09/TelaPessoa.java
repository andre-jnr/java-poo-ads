package aula09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPessoa implements ActionListener{
    JFrame tela = new JFrame("Cadastrar pessoa");
    JPanel painel = new JPanel();
    
    // labels
    JLabel lblnome = new JLabel("Nome: ");
    JLabel lblidade = new JLabel("Idade: ");
    JLabel lblsal = new JLabel("Salario: ");
    
    // campos de texto
    JTextField txtnome = new JTextField();
    JTextField txtidade = new JTextField();
    JTextField txtsal = new JTextField();
    
    // botões
    JButton btnsalvar = new JButton("Salvar");
    JButton btnlistar = new JButton("Listar");
    JButton btncancelar = new JButton("Cancelar");
    
    String nome = "";
    Double salario = 0.0;
    Integer idade = 0;
    
    Pessoa pes = new Pessoa();
    Vetor v = new Vetor();
    
    void criarTela() {
        v.criarLista();
        
        tela.setSize(350, 250); // tamanho da tela
        tela.setLocation(250, 250);
        painel.setLayout(null);
        
        // Posições dos labels e input de texto
        lblnome.setBounds(30, 10, 100, 30);
        txtnome.setBounds(110, 10, 120, 30);
        
        lblidade.setBounds(30, 50, 100, 30);
        txtidade.setBounds(110, 50, 100, 30);
        
        lblsal.setBounds(30, 90, 100, 30);
        txtsal.setBounds(110, 90, 140, 30);
        
        // posições dos botões e ações
        btnsalvar.setBounds(10, 150, 90, 30);
        btnsalvar.addActionListener(this); // Ação
        btnlistar.setBounds(120, 150, 90, 30);
        btnlistar.addActionListener(this);
        btncancelar.setBounds(230, 150, 90, 30);
        btncancelar.addActionListener(this);
        
        painel.add(lblnome);
        painel.add(txtnome);
        painel.add(lblidade);
        painel.add(txtidade);
        painel.add(lblsal);
        painel.add(txtsal);
        painel.add(btnsalvar);
        painel.add(btnlistar);
        painel.add(btncancelar);
        
        tela.getContentPane().add(painel);
        tela.setVisible(true); //tornar a tela visivel
    }
    
    public static void main(String[] args) {
        TelaPessoa tp = new TelaPessoa();
        tp.criarTela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnsalvar) {
            nome = txtnome.getText();
            idade = Integer.valueOf(txtidade.getText());
            salario = Double.valueOf(txtsal.getText());
            pes.setNome(nome);
            pes.setIdade(idade);
            pes.setSalario(salario);
            
            v.inserir(pes);
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            
            txtnome.setText("");
            txtidade.setText("");
            txtsal.setText("");
        }
        
        if (e.getSource() == btnlistar) {
            v.listar();
        }
        
        if (e.getSource() == btncancelar) {
            tela.dispose();
        }
    }
}
