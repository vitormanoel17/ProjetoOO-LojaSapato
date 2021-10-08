package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import controller.ControleCliente;
import controller.ControleDados;
import controller.ControleFuncionario;

public class TelaDetalhe implements ActionListener{

    private JFrame tela = new JFrame("Detalhes");
    private JLabel nome = new JLabel("Nome: ");
    private JLabel endereco = new JLabel("Endereço: ");
    private JLabel cidade = new JLabel("Cidade: ");
    private JLabel estado = new JLabel("Estado: ");
    private JLabel cep = new JLabel("Cep: ");
    private JLabel numEnd = new JLabel("Numº:");
    private JLabel bairro = new JLabel("Bairro:");
    private JLabel logradouro = new JLabel("Logradouro: ");
    private JLabel ddd = new JLabel("DDD: ");
    private JLabel telefone = new JLabel("Tel: ");
    private JLabel compra = new JLabel("Compras: ");
    private JButton btnSalvar = new JButton("Salvar");
    private JButton botaoRemove = new JButton("Remover");
    private JButton btnCancel = new JButton("Cancelar");
    private JLabel qtdVendas;
    private JLabel salario;
    private JTextField txtNome;
    private JTextField txtCidade;
    private JTextField txtEstado;
    private JTextField txtCep;
    private JTextField txtNumEnd;
    private JTextField txtBairro;
    private JTextField txtLogradouro;
    private JTextField txtDDD;
    private JTextField txtTel;
    private JScrollPane tabScroll;
    private JTable tabela;
    private int pos;
    private int sel;
    private int escolha;
    private ControleDados d;
    private ControleCliente c;
    private ControleFuncionario func;
    private String[] novosDados = new String[12];

    public void mostrarDetalhes(int pos, ControleDados dados,int sel, int escolha){
        this.sel = sel;
        this.pos = pos;
        this.d = dados;
        this.escolha = escolha;
        func = new ControleFuncionario(dados);
        c = new ControleCliente(dados);
        
        tela.setSize(700,600);
        
        // Mostra campos especificos de clientes
        if(sel == 1){

            txtNome = new JTextField(c.getNome(pos),200);
            txtCidade = new JTextField(c.getEndereco(pos).getCidade(),200);
            txtEstado = new JTextField(c.getEndereco(pos).getEstado(),200);
            txtCep = new JTextField(c.getEndereco(pos).getCep(),200);
            txtNumEnd = new JTextField(String.valueOf(c.getEndereco(pos).getNumero()),200);
            txtBairro = new JTextField(c.getEndereco(pos).getBairro(),200);
            txtLogradouro = new JTextField(c.getEndereco(pos).getLogradouro(),200);
            txtDDD = new JTextField(String.valueOf(c.getTelefone(pos).getDdd()),200);
            txtTel = new JTextField(String.valueOf(c.getTelefone(pos).getNumero()),200);

            criarTabela();
            tela.add(tabScroll);
            tela.add(compra);
        
        // mostra campos especificos de Funcionario
        }else if(sel == 2){

            txtNome = new JTextField(func.getNome(pos),200);
            txtCidade = new JTextField(func.getEndereco(pos).getCidade(),200);
            txtEstado = new JTextField(func.getEndereco(pos).getEstado(),200);
            txtCep = new JTextField(func.getEndereco(pos).getCep(),200);
            txtNumEnd = new JTextField(String.valueOf(func.getEndereco(pos).getNumero()),200);
            txtBairro = new JTextField(func.getEndereco(pos).getBairro(),200);
            txtLogradouro = new JTextField(func.getEndereco(pos).getLogradouro(),200);
            txtDDD = new JTextField(String.valueOf(func.getTelefone(pos).getDdd()),200);
            txtTel = new JTextField(String.valueOf(func.getTelefone(pos).getNumero()),200);
            qtdVendas = new JLabel("Quantidade de Vendas: " + String.valueOf(func.getQuantVendas(pos)));
            salario = new JLabel("Salário: " + String.valueOf(func.getSalario(pos)));

            salario.setBounds(400,30,200,30);
            qtdVendas.setBounds(400,60,200,30);
            tela.add(qtdVendas);
            tela.add(salario);
        }else{
            txtNome = new JTextField(200);
            txtCidade = new JTextField(200);
            txtEstado = new JTextField(200);
            txtCep = new JTextField(200);
            txtNumEnd = new JTextField(200);
            txtBairro = new JTextField(200);
            txtLogradouro = new JTextField(200);
            txtDDD = new JTextField(200);
            txtTel = new JTextField(200);
        }

        nome.setBounds(30,30,100,30);
        txtNome.setBounds(90,30,200,30);
        endereco.setBounds(30,60,100,30);
        cidade.setBounds(30,90,100,30);
        txtCidade.setBounds(90,90,100,30);
        estado.setBounds(200,90,100,30);
        txtEstado.setBounds(250,90,100,30);
        cep.setBounds(360,90,100,30);
        txtCep.setBounds(390,90,100,30);
        numEnd.setBounds(500,90,100,30);
        txtNumEnd.setBounds(540,90,100,30);
        bairro.setBounds(30,120,100,30);
        txtBairro.setBounds(90,120,100,30);
        logradouro.setBounds(200,120,100,30);
        txtLogradouro.setBounds(280,120,100,30);
        ddd.setBounds(30,150,50,30);
        txtDDD.setBounds(90,150,50,30);
        telefone.setBounds(150,150,100,30);
        txtTel.setBounds(180,150,200,30);
        compra.setBounds(30,180,100,30);

        tela.add(nome);
        tela.add(ddd);
        tela.add(telefone); 
        tela.add(endereco);
        tela.add(cidade);
        tela.add(estado);
        tela.add(cep);
        tela.add(numEnd);
        tela.add(txtNome);
        tela.add(txtCidade);
        tela.add(txtEstado);
        tela.add(txtCep);
        tela.add(txtNumEnd);
        tela.add(bairro);
        tela.add(txtBairro);
        tela.add(logradouro);
        tela.add(txtLogradouro);
        tela.add(txtDDD);
        tela.add(txtTel);

        tela.add(btnCancel);
        tela.add(btnSalvar);
        tela.add(botaoRemove);

            //Verifica se a opçao selecionada foi visualizar detalhes 
            if(escolha == 2){

                //posiciona os botoes em posições diferentes caso tela seja para cliente
                if(sel == 1){
                    btnSalvar.setBounds(500,300,100,30);
                    botaoRemove.setBounds(500,350,100,30);
                    btnCancel.setBounds(500,400,100,30);

                }else{
                    btnSalvar.setBounds(100,400,100,30);
                    botaoRemove.setBounds(250,400,100,30);
                    btnCancel.setBounds(400,400,100,30);    
                }
            
            // verifica se a opção selecionada foi cadastrar
            }else if(escolha == 1){
                tela.add(botaoRemove);
                btnSalvar.setBounds(200,400,100,30);
                btnCancel.setBounds(350,400,100,30);
            }

            btnCancel.addActionListener(this);
            btnSalvar.addActionListener(this);
            botaoRemove.addActionListener(this);
        

        tela.setLayout(null);
        tela.setVisible(true);

        
    }
    
    //gera tabela com informações de compra do cliente
    public void criarTabela(){

        Object[][] lista = new Object[50][3];
        Object[] colName = {"Data","Categoria","Preço"};

        if (c.getQtdCompras(pos) != 0){
        
            for(int i = 0; i< c.getQtdCompras(pos); i++){
                Object[] linha = {c.getCompra(pos)[i].getDataDaCompra(),c.getCompra(pos)[i].getCalcado().getCategoria(),
                                  c.getCompra(pos)[i].getCalcado().getPreco()};

                lista[i][0] = linha[0];
                lista[i][1] = linha[1];
                lista[i][2] = linha[2];
            }
        }
        
        tabela = new JTable(lista,colName);
        tabScroll = new JScrollPane(tabela);
        tabScroll.setBounds(30,210,400,300);
        
    }
    
    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();

        if(search == btnSalvar){

            novosDados[0] = txtNome.getText();
            novosDados[1] = txtCidade.getText();
            novosDados[2] = txtEstado.getText();
            novosDados[3] = txtCep.getText();
            novosDados[4] = txtNumEnd.getText();
            novosDados[5] = txtBairro.getText();
            novosDados[6] = txtLogradouro.getText();
            novosDados[7] = txtDDD.getText();
            novosDados[8] = txtTel.getText();

            // Atualiza dados de cliente ou cadastra novo cliente
            if(sel == 1 || sel == 3){
            
                d.inserirEditarCliente(novosDados, pos,escolha);
            
            // Atualiza dados de funcionário ou cadastra no funcionário
            }else if (sel == 2 || sel == 4){

                d.inserirEditarFuncionario(novosDados, pos,escolha);

            }
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
            tela.dispose();
        }

        if(search == botaoRemove){
            
            //Remove o cliente selecionado na lista
            if(sel == 1){               
                d.removerCliente(pos);
                mensagemExclusao();
                tela.dispose();
            }

            //Remove o Funcionário selecionado na lista
            if(sel == 2){

                d.removerFuncionanrio(pos);
                mensagemExclusao();
                tela.dispose();
            }
        }

        if(search == btnCancel) {
            tela.dispose();
        }
    }

    public void mensagemExclusao(){
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
    }

    public void mensagemErroListaSel(){
        JOptionPane.showMessageDialog(null, "Selecione um item da Lista", null, JOptionPane.INFORMATION_MESSAGE);
    }
}
