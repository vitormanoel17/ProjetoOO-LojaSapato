package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaSelProd implements ListSelectionListener{
    JFrame janela = new JFrame("Seleção de Produto");
    JLabel desc = new JLabel("Escolha a Categoria de calçado que deseja cadastrar:");
    String[] nomeCategoria = {"Bota","Chinelo","Chuteira","Sandália","Sapato Social","Tenis"};
    JList<String> listaCategoria = new JList<String>(nomeCategoria);

    public TelaSelProd(){
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
        new TelaDetalheProduto(1);
    }
}
