package view;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controller.*;

/**
 * Classe que gera tela que apresenta os clientes ou funcion�rios cadastrados
 * @author Vitor manoel
 * @version 1.0
 */
public class TelaPessoa implements ActionListener, ListSelectionListener {
    
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
    private int[] pos;
    private String nome;
    
    /**
     * M�todo para construir tela com os dados de um cliente ou funcion�rio
     * @param sel inteiro que indica se foi selecionado cliente ou funcion�rio
     * @param d dados cadastrados no sistema
     */
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
    
    /**
     * M�todo que captura os eventos relacionados ao JList,
     * (1) verifica se a lista selecionada foi a lista de cliente,
     * e envia a posi��o selecionada para a constru��o de tela de detalhes.
     * (2) verifica se a lista selecionada foi a lista de funcion�rio,
     * e envia a posi��o selecionada para a constru��o da tela de detalhes.
     */
    
    public void valueChanged(ListSelectionEvent event){
        Object search = event.getSource();

        if(event.getValueIsAdjusting() && search == listaClientes){

            pos = new int[d.getClientes().size()];

            if(active){
                pos =  clienteC.getIndexBusca(clienteC.buscarNome(nome)); 
            }else{
                pos[listaClientes.getSelectedIndex()] = listaClientes.getSelectedIndex();
            }

            new TelaDetalhe().mostrarDetalhes(pos[listaClientes.getSelectedIndex()],d,sel,2);

        }else if(event.getValueIsAdjusting() && search == listaFuncionario){

            pos = new int[d.getFuncionarios().size()];

            if(active){
                pos =  fun.getIndexBusca(fun.buscarNome(nome)); 
            }else{
                pos[listaFuncionario.getSelectedIndex()] = listaFuncionario.getSelectedIndex();
            }

            new TelaDetalhe().mostrarDetalhes(pos[listaFuncionario.getSelectedIndex()],d, sel,2);

        }

    }
    
    
    /**
     * M�todo que captura os eventos relacionados ao JButton
     * (1) verifica se o bot�o selecionado foi o bot�o de cadastro,
     * caso tenha sido, cria uma nova tela detalhe, depois de verificar
     * se a escolha foi cliente ou funcionario
     * (2) verifica se o bot�o selecionadoo foi o bot�o atualizar,
     * caso tenha sido verifica se a sele��o foi de cliente ou funcion�rio
     * e insere uma nova lista com os dados atualizados.
     * (3) verifica se o bot�o selecionado foi bot�o de busca,
     * caso tenha sido verifica se a sele��o foi de cliente ou funcion�rio.
     * e insere uma nova lista com os dados da busca realizada
     */
    
    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();

        if(search == botaoCadastro){

            // Seleciona a tela de cadastro de cliente
            if(sel == 1){
                new TelaDetalhe().mostrarDetalhes(0,d,3,1);
            }
            
            //Seleciona a tela de cadastro de Funcionario
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

            // Atualiza a Lista de Funcionarios
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

            // Realiza busca pelo nome do funcionario
            if(sel == 2){
                listaFuncionario.setListData(fun.buscarNome(nome));
                listaFuncionario.updateUI();
            }
        }

    }
    
    /**
     * Apresenta mensagem indicando que a exclus�o foi realizada com sucesso
     */
    public void mensagemExclusao(){
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Apresenta mensagem indicando que n�o h� um item da lista selecionado
     */
    public void mensagemErroListaSel(){
        JOptionPane.showMessageDialog(null, "Selecione um item da Lista", null, JOptionPane.INFORMATION_MESSAGE);
    }
}
