package view;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controller.*;

public class TelaCliente implements ActionListener, ListSelectionListener {
    
    private ControleDados d;
    private ControleCliente clienteC;
    private ControleFuncionario fun;
    private JButton botaoCadastro = new JButton("Cadastrar");
    private JButton btnAtualizar = new JButton("Atualizar");
    private JButton btnBusca = new JButton("Buscar");
    private JTextField txtBusca = new JTextField(200); 
    private JFrame tela = new JFrame();
    private JList<String> listaClientes;
    private JList<String> listaFuncionario;
    private JLabel info = new JLabel("Selecione o Cliente que deseja: ");
    private int sel;
    private Boolean active = false;
    private int pos;
    private String nome;

    public void mostrarDados(int sel, ControleDados d){
        this.sel = sel;
        this.d = d;
        clienteC = new ControleCliente(d);
        fun = new ControleFuncionario(d);

        tela.setSize(700,500);
        // JButtons
        botaoCadastro.setBounds(200,40,100,50);
        btnAtualizar.setBounds(320,40,100,50);
        btnBusca.setBounds(550,110,100,30);
        // JLists
        listaClientes = new JList<String>(clienteC.getClienteNome());
        listaFuncionario = new JList<String>(fun.getNomesFuncionarios());

        // Gerar lista de clientes cadastrados
        if(sel == 1){
            
            listaClientes.setBounds(120,150,400,300);
            listaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listaClientes.addListSelectionListener(this);
            listaClientes.setVisibleRowCount(clienteC.getClienteNome().length);
            tela.add(listaClientes);

        // Gerar lista de funcionarios cadastrados
        }else if(sel == 2){

            listaFuncionario.setBounds(120,150,400,300);
            listaFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listaFuncionario.addListSelectionListener(this);
            listaFuncionario.setVisibleRowCount(fun.getNomesFuncionarios().length);;
            tela.add(listaFuncionario);
        }
        
        txtBusca.setBounds(400,110,150,30);
        // JLabel
        info.setBounds(120,100,200,30);
        // Adicionando componentes a tela
        tela.add(botaoCadastro);
        tela.add(btnAtualizar);
        tela.add(btnBusca);
        tela.add(info);
        tela.add(txtBusca);

        botaoCadastro.addActionListener(this);
        btnAtualizar.addActionListener(this);
        btnBusca.addActionListener(this);

        tela.setLayout(null);
        tela.setVisible(true);
        
    }

    public void valueChanged(ListSelectionEvent event){
        Object search = event.getSource();

        if(event.getValueIsAdjusting() && search == listaClientes){

            if(active){
                pos =  clienteC.getIndexBusca(clienteC.buscarNome(nome)); 
            }else{
                pos = listaClientes.getSelectedIndex();
            }

            new TelaDetalhe().mostrarDetalhes(pos,d,sel,2);

        }else if(event.getValueIsAdjusting() && search == listaFuncionario){

            if(active){
                pos =  fun.getIndexBusca(fun.buscarNome(nome)); 
            }else{
                pos = listaFuncionario.getSelectedIndex();
            }

            new TelaDetalhe().mostrarDetalhes(pos,d, sel,2);

        }

    }

    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();

        if(search == botaoCadastro){

            // Seleciona a tela de cadastro de cliente
            if(sel == 1){
                new TelaDetalhe().mostrarDetalhes(0,d,3,1);
            }
            
            //Seleciona a tela de cadastro de Funcionário
            if(sel == 2){
                new TelaDetalhe().mostrarDetalhes(0,d,4,1);
            }
        }


        if(search == btnAtualizar){
            active = false;
            
            // Atuliza a Lista de Clientes
            if(sel == 1){
                listaClientes.setListData(clienteC.getClienteNome());
                listaClientes.updateUI();
            }

            // Atualiza a Lista de Funcionários
            if(sel == 2){
                listaFuncionario.setListData(fun.getNomesFuncionarios());
                listaFuncionario.updateUI();
            }
        }

        if(search == btnBusca){
            nome = txtBusca.getText();
            active = true;

            // Realiza busca pelo nome do cliente
            if(sel == 1){
                listaClientes.setListData(clienteC.buscarNome(nome));
                listaClientes.updateUI();
            }

            // Realiza busca pelo nome do funcionário
            if(sel == 2){
                listaFuncionario.setListData(fun.buscarNome(nome));
                listaFuncionario.updateUI();
            }
        }

    }

    public void mensagemExclusao(){
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
    }

    public void mensagemErroListaSel(){
        JOptionPane.showMessageDialog(null, "Selecione um item da Lista", null, JOptionPane.INFORMATION_MESSAGE);
    }
}
