package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import controller.ControleCliente;
import controller.ControleDados;

public class TelaDetalhe {

    private JFrame tela = new JFrame("Detalhes");
    private JLabel nome = new JLabel("Nome: ");
    private JLabel endereco = new JLabel("Endereço: ");
    private JLabel telefone = new JLabel("Telefone: ");
    private JLabel compra = new JLabel("Compras: ");
    private JTextField txtNome;
    private JTextField txtEnd;
    private JTextField txtTel;
    private JTable tabela;
    private int pos;

    public TelaDetalhe(int pos, ControleDados dados){
        this.pos = pos;
        tela.setSize(700,500);
        
        txtNome = new JTextField(dados.getClientes()[pos].getNome(),200);
        txtEnd = new JTextField(dados.getClientes()[pos].getEndereco().toString(),200);
        txtTel = new JTextField(dados.getClientes()[pos].getTelefone().toString(),200);

        nome.setBounds(30,30,100,30);
        endereco.setBounds(30,60,100,30);
        telefone.setBounds(30,90,100,30);
        compra.setBounds(30,120,100,30);
        txtNome.setBounds(150,30,200,30);
        txtEnd.setBounds(150,60,200,30);
        txtTel.setBounds(150,90,200,30);

        
        criarTabela();

        tela.add(nome);
        tela.add(telefone);
        tela.add(endereco);
        tela.add(compra);
        tela.add(txtNome);
        tela.add(txtEnd);
        tela.add(txtTel);
        tela.add(tabela);

        tela.setLayout(null);
        tela.setVisible(true);

        
    }
    
    public void criarTabela(){

        ControleDados c = new ControleDados();
        ControleCliente cc = new ControleCliente(c);
        Object[][] lista = new Object[50][3];
        Object[] colName = {"Data","Cateoria","Preço"};

        if (cc.getQtdCompras(pos) != 0){
        
            for(int i = 0; i< cc.getQtdCompras(pos); i++){
                Object[] linha = {cc.getCompra(pos)[i].getDataDaCompra(),cc.getCompra(pos)[i].getCalcado().getCategoria(),
                                  cc.getCompra(pos)[i].getCalcado().getPreco()};

                lista[i][0] = linha[0];
                lista[i][1] = linha[1];
                lista[i][2] = linha[2];
            }
        }
        
        tabela = new JTable(lista,colName);
        tabela.setBounds(30,150,400,300);
        
    }
}
