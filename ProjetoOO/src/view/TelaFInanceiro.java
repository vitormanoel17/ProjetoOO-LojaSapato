package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.ControleDados;

/**
 * Classe que gera tela financeiro, apresentando
 * os dados de vendas.
 * @author Vitor manoel
 * @version 1.0
 */
public class TelaFInanceiro {
    
    JFrame janela = new JFrame("Financeiro");
    ControleDados d;
    JList<String> listaVenda;

    public TelaFInanceiro(ControleDados d){
        this.d = d;
        
        listaVenda = new JList<>(d.getFinanceiro().historicoVendas());
        JLabel contasApagar = new JLabel(d.getFinanceiro().contasPendentes());
        JLabel contasAReceber = new JLabel(d.getFinanceiro().contasAreceber());
        JLabel saldo = new JLabel(d.getFinanceiro().calculoSaldo());
        
        listaVenda.setBounds(50,90,700,300);
        contasAReceber.setBounds(50,30,200,30);
        contasApagar.setBounds(250,30,200,30);
        saldo.setBounds(500,30,300,30);

        janela.add(contasAReceber);
        janela.add(contasApagar);
        janela.add(listaVenda);
        janela.add(saldo);

        janela.setSize(800,500);
        janela.setLayout(null);
        janela.setVisible(true);
    }

}
