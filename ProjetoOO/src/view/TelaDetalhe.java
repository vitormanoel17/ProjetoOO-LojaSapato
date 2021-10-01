package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
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
    private JScrollPane tabScroll;
    private int pos;
    private int sel;
    private ControleDados d;

    public void mostrarDetalhes(int pos, ControleDados dados,int sel){
        this.pos = pos;
        this.sel = sel;
        this.d = dados;

        tela.setSize(700,500);
        
        if(sel == 1){
            txtNome = new JTextField(d.getClientes()[pos].getNome(),200);
            txtEnd = new JTextField(d.getClientes()[pos].getEndereco().toString(),200);
            txtTel = new JTextField(d.getClientes()[pos].getTelefone().toString(),200);

            criarTabela();
            tela.add(tabScroll);
            tela.add(compra);
        
        }else if(sel == 2){
            txtNome = new JTextField(d.getFuncionarios()[pos].getNome(),200);
            txtEnd = new JTextField(d.getFuncionarios()[pos].getEndereco().toString(),200);
            txtTel = new JTextField(d.getFuncionarios()[pos].getTelefone().toString(),200);
        
        }else{
            txtNome = new JTextField(200);
            txtEnd = new JTextField(200);
            txtTel = new JTextField(200);
        }

        nome.setBounds(30,30,100,30);
        endereco.setBounds(30,60,100,30);
        telefone.setBounds(30,90,100,30);
        compra.setBounds(30,120,100,30);
        txtNome.setBounds(150,30,200,30);
        txtEnd.setBounds(150,60,200,30);
        txtTel.setBounds(150,90,200,30);

        tela.add(nome);
        tela.add(telefone); 
        tela.add(endereco);
    
        tela.add(txtNome);
        tela.add(txtEnd);
        tela.add(txtTel);
        

        tela.setLayout(null);
        tela.setVisible(true);

        
    }
    
    public void criarTabela(){

        JTable tabela;
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
        tabScroll = new JScrollPane(tabela);
        tabScroll.setBounds(30,150,400,300);
        
    }
    
}
