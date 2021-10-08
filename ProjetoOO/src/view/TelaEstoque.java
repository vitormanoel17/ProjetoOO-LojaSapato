package view;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import controller.*;

/**
 * Classe que gera tela relacionada ao estoque
 * @author Vitor manoel
 *	@version 1.0
 */
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
    private int[] pos;
    
    
    /**
     * 	Metodo que cria tela com a lista de produtos em estoque
     * @param d dados cadastrados no sistema
     */
    
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
    
    /**
     * Captura os eventos relacionados ao JList
     * (1) verifica se ha uma busca ativa no momento,
     * e baseado nisso envia a posicao do elemento requerido
     * pelo usuario para visualizacao de detalhes do produto
     */
    public void valueChanged(ListSelectionEvent e){

        pos = new int[this.e.getEstoque().getCalcado().size()];
        
        if(active){
            pos = this.e.getIndexBusca(this.e.buscarNome(categoria));
        }else{
            pos[listaProdutos.getSelectedIndex()] = listaProdutos.getSelectedIndex();
        }        

        if(e.getValueIsAdjusting()){

            System.out.println(pos[listaProdutos.getSelectedIndex()]);
            System.out.println(listaProdutos.getSelectedIndex());
            new TelaDetalheProduto(pos[listaProdutos.getSelectedIndex()],d,2).telaDetalhe();        
        }
    }

    /**
     * Captura eventos relacionados ao JButton
     * (1) verifica se o botao selecionado foi o de adicionar produto,
     * caso tenha sido gera nova tela para selecionar o tipo de produto
     * que sera cadastrado.
     * (2) verifica se o botao selecionafo foi o botao de atualizar,
     * caso tenha sido insere uma nova lista com os dados atualizados.
     * (3) verifica se o botao selecionado foi o botao de busca,
     * caso tenha sido realizado uma busca pela categoria do produto
     * requisitado.
     */
    
    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();

        // gera a tela de selecao de cadastro de novo produto
        if(search == adProd){
            new TelaSelProd(d);
        }

        // atualiza a lista mostrada na tela
        if(search == atualizar){
            active = false;

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
