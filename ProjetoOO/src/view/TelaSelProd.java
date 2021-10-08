package view;

import javax.swing.*;
import javax.swing.event.*;
import controller.ControleDados;

public class TelaSelProd implements ListSelectionListener{
    
    private JFrame janela = new JFrame("Seleção de Produto");
    private JLabel desc = new JLabel("Escolha a Categoria de calçado que deseja cadastrar:");
    private String[] nomeCategoria = {"Bota","Chinelo","Chuteira","Sandália","Sapato Social","Tênis"};
    private JList<String> listaCategoria = new JList<String>(nomeCategoria);
    private ControleDados d;

    public TelaSelProd(ControleDados dados){
        this.d = dados;
        janela.setSize(400,250);
        desc.setBounds(30,30,400,30);
        listaCategoria.setBounds(30,60,300,120);
        listaCategoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaCategoria.addListSelectionListener(this);

        janela.add(desc);
        janela.add(listaCategoria);
        
        janela.setLayout(null);
        janela.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e){

        // Gera tela para cadastro de novo produto
        if(e.getValueIsAdjusting()){
            new TelaDetalheProduto(0,d,1).telaCadastro(listaCategoria.getSelectedIndex());
            janela.dispose();
        }
    }
}
