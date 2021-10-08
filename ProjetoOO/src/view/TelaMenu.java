package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import controller.ControleDados;

/**
 * Classe que gera a tela de menu com as opções
 * de visualização de diferentes telas
 * @author Vitor manoel
 * @version 1.0
 */
public class TelaMenu implements ActionListener{
    ControleDados d = new ControleDados();
    private JFrame janela = new JFrame("Tela Menu");
    private JButton botao = new JButton("Cliente");
    private JButton botao2 = new JButton("Estoque");
    private JButton botao3 = new JButton("FuncionÃ¡rio");
    private JButton botao4 = new JButton("Financeiro");
    private JButton botao5 = new JButton("Vendas");

    public TelaMenu(){
        janela.setSize(500,500);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        botao.setBounds(190, 75, 100, 50);
        botao2.setBounds(190, 150, 100, 50);
        botao3.setBounds(190, 225, 100, 50);
        botao4.setBounds(190, 300, 100, 50);
        botao5.setBounds(190,375,100,50);
      
        janela.setLayout(null);

        janela.add(botao);
        janela.add(botao2);
        janela.add(botao3);
        janela.add(botao4);
        janela.add(botao5);

        botao.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
    }

    public static void main (String[] args){
        TelaMenu tela = new TelaMenu();
    }

    /**
     * Captura eventos relacionados ao JButton
     * (1) verifica se o botão selecionado foi o botao1,
     * caso tenha sido gera tela cliente
     * (2) verifica se o botão selecionado foi o botao2,
     * caso tenha sido gera tela estoque
     * (3) verifica se o botão selecionado foi o botao3,
     * caso tenha sido gera tela de funcionário
     * (4) verifica se o botão selecionado foi o botao4,
     * caso tenha sido gera tela do financeiro
     * (5) verifica se o botão selecionado foi o botao5,
     * caso tenha sido gera tela de venda
     */
    
    public void actionPerformed(ActionEvent e) {
        Object search = e.getSource();

        if(search == botao) {
            new TelaPessoa().mostrarDados(1, d);
        }

        if(search == botao2){
            new TelaEstoque().mostrarEstoque(d);
        }
        
        if(search == botao3){
            new TelaPessoa().mostrarDados(2,d);
        }
        
        if(search == botao4){
            new TelaFInanceiro(d);
        }

        if(search == botao5){
            new TelaVenda(d);
        }
    }



}
