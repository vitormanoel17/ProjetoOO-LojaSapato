package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import controller.ControleDados;
import controller.ControleEstoque;

public class TelaEstoque implements ListSelectionListener,ActionListener{

    JFrame janela = new JFrame("Estoque");
    JButton adProd = new JButton("Adicionar Produto");
    JButton remProd = new JButton("Remover Produto"); 
    JLabel txtProd = new JLabel("Produtos: ");
    JTable tabela;


    public TelaEstoque(){
        janela.setSize(700,500);
        txtProd.setBounds(30,30,100,30);
        adProd.setBounds(90,400,200,30);
        remProd.setBounds(350,400,200,30);

        criarTabela();

        janela.add(txtProd);
        janela.add(adProd);
        janela.add(remProd);
        janela.add(tabela);

        adProd.addActionListener(this);
        remProd.addActionListener(this);

        janela.setLayout(null);
        janela.setVisible(true);

    }
    
    public void criarTabela(){

        ControleDados c = new ControleDados();
        ControleEstoque e =  new ControleEstoque(c);
        Object[][] lista = new Object[50][4];
        Object[] colName = {"Categoria","cor","Tamanho","Marca"};

        if (!e.getEstoque().getCalcado().isEmpty()){
        
            for(int i = 0; i < e.getEstoque().getCalcado().size(); i++){
                Object[] linha = {e.getCalcado(i).getCategoria(),e.getCalcado(i).getCor(),
                                  e.getCalcado(i).getTamanho(), e.getCalcado(i).getMarca()};

                lista[i][0] = linha[0];
                lista[i][1] = linha[1];
                lista[i][2] = linha[2];
                lista[i][3] = linha[3];

            }
        }
        
        tabela = new JTable(lista,colName);
        tabela.setBounds(120,90,400,300);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.getSelectionModel().addListSelectionListener(this);
   
        
    }

    public void valueChanged(ListSelectionEvent e){
        new TelaDetalheProduto(tabela.getSelectedRow());        
    }

    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();
        if(search == adProd){
            new TelaSelProd();
        }
    }

}
