package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.ControleCliente;
import controller.ControleDados;


public class TelaCliente implements ListSelectionListener {

    private ControleDados dados = new ControleDados();
    private ControleCliente clienteC = new ControleCliente(dados);
    private JButton botaoEdit = new JButton("Editar");
    private JButton botaoRemove = new JButton("Remover");
    private JFrame tela = new JFrame();
    private JList<String> listaClientes = new JList<String>(clienteC.getClienteNome());
    private JLabel info = new JLabel("Selecione o Cliente que deseja: ");

    public TelaCliente(){

        tela.setSize(700,500);
        // JButtons
        botaoEdit.setBounds(200,40,100,50);
        botaoRemove.setBounds(310,40,100,50);
        // JLists
        listaClientes.setBounds(120,150,400,300);
        listaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //JLabel
        info.setBounds(120,100,200,30);
        // Adicionando componentes a tela
        tela.add(botaoEdit);
        tela.add(botaoRemove);
        tela.add(listaClientes);
        tela.add(info);

        listaClientes.addListSelectionListener(this);

        tela.setLayout(null);
        tela.setVisible(true);
        
    }

    public void valueChanged(ListSelectionEvent event){
        new TelaDetalhe(listaClientes.getSelectedIndex(),dados);
    }
}
