package view;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import controller.*;

public class TelaEstoque implements ListSelectionListener,ActionListener{

    private JFrame janela = new JFrame("Estoque");
    private JButton adProd = new JButton("Adicionar Produto");
    private JButton atualizar = new JButton("Atualizar");
    private JButton btnBusca = new JButton("Buscar");
    private JLabel txtProd = new JLabel("Produtos: ");
    private JTextField txtBusca = new JTextField(200);
    private ControleEstoque e;
    private ControleDados d;
    private JList<String> listaProdutos;
    private String categoria;
    private Boolean active = false;
    private int pos;

    public void mostrarEstoque(ControleDados d){
        
        this.d = d;
        e = new ControleEstoque(d);

        janela.setSize(700,500);
        txtProd.setBounds(30,30,100,30);
        adProd.setBounds(90,400,200,30);
        atualizar.setBounds(350,400,200,30);
        btnBusca.setBounds(550,50,100,30);
        txtBusca.setBounds(400,50,150,30);

        listaProdutos = new JList<String>(e.getEstoque().listarProdutos());
        listaProdutos.setBounds(120,90,400,300);
        listaProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaProdutos.getSelectionModel().addListSelectionListener(this);

        janela.add(txtProd);
        janela.add(adProd);
        janela.add(atualizar);
        janela.add(listaProdutos);
        janela.add(btnBusca);
        janela.add(txtBusca);

        adProd.addActionListener(this);
        atualizar.addActionListener(this);
        btnBusca.addActionListener(this);

        janela.setLayout(null);
        janela.setVisible(true);

    }    

    public void valueChanged(ListSelectionEvent e){
        
        if(active){
            pos = this.e.getIndexBusca(this.e.buscarNome(categoria));
        }else{
            pos = listaProdutos.getSelectedIndex();
        }        

        if(e.getValueIsAdjusting()){

            System.out.println(pos);
            new TelaDetalheProduto(pos,d,2).telaDetalhe();        
        }
    }

    // 
    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();

        // Leva a tela de seleção de cadastro de novo produto
        if(search == adProd){
            new TelaSelProd(d);
        }

        // atualiza a lista mostrada na tela
        if(search == atualizar){
            active = false;

            this.e = new ControleEstoque(d);
            listaProdutos.setListData(this.e.getEstoque().listarProdutos());
            listaProdutos.updateUI();
            this.e.mensagem();
        }
        
        // realiza busca 
        if(search == btnBusca){
            categoria = txtBusca.getText();
            active = true;

            listaProdutos.setListData(this.e.buscarNome(categoria));
        }
    }

}
