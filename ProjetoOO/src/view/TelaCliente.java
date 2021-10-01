package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controller.ControleCliente;
import controller.ControleDados;
import controller.ControleFuncionario;


public class TelaCliente implements ActionListener, ListSelectionListener {
    
    private ControleDados d;
    private ControleCliente clienteC;
    private ControleFuncionario fun;
    private JButton botaoEdit = new JButton("Editar");
    private JButton botaoRemove = new JButton("Remover");
    private JFrame tela = new JFrame();
    private JList<String> listaClientes;
    private JList<String> listaFuncionario;
    private JLabel info = new JLabel("Selecione o Cliente que deseja: ");
    private int sel;

    public void mostrarDados(int sel, ControleDados d){
        this.sel = sel;
        this.d = d;
        clienteC = new ControleCliente(d);
        fun = new ControleFuncionario(d);

        listaClientes = new JList<String>(clienteC.getClienteNome());
        listaFuncionario = new JList<String>(fun.getNomesFuncionarios());
        tela.setSize(700,500);
        // JButtons
        botaoEdit.setBounds(200,40,100,50);
        botaoRemove.setBounds(310,40,100,50);
        // JLists
        if(sel == 1){
            
            listaClientes.setBounds(120,150,400,300);
            listaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listaClientes.addListSelectionListener(this);
            tela.add(listaClientes);

        }else if(sel == 2){

            listaFuncionario.setBounds(120,150,400,300);
            listaFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listaFuncionario.addListSelectionListener(this);
            tela.add(listaFuncionario);
        }
        
        //JLabel
        info.setBounds(120,100,200,30);
        // Adicionando componentes a tela
        tela.add(botaoEdit);
        tela.add(botaoRemove);
        tela.add(info);

        botaoEdit.addActionListener(this);
        botaoRemove.addActionListener(this);

        tela.setLayout(null);
        tela.setVisible(true);
        
    }

    public void valueChanged(ListSelectionEvent event){
        Object search = event.getSource();

        if(event.getValueIsAdjusting() && search == listaClientes){

            new TelaDetalhe().mostrarDetalhes(listaClientes.getSelectedIndex(),d,sel);

        }else if(event.getValueIsAdjusting() && search == listaFuncionario){

            new TelaDetalhe().mostrarDetalhes(listaFuncionario.getSelectedIndex(),d, sel);

        }

    }

    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();

        if(search == botaoEdit){
            new TelaDetalhe().mostrarDetalhes(0,d,0);
        }

        if(search == botaoRemove){

        }

    }
}
