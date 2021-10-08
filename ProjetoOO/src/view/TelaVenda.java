package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import controller.ControleCliente;
import controller.ControleDados;
import controller.ControleEstoque;
import controller.ControleFuncionario;

/**
 * Classe que gera tela com informações para realizar venda
 * @author Vitor manoel
 * @version 1.0
 */

public class TelaVenda implements ActionListener{
    
    private JFrame janela = new JFrame("Venda");
    private JButton btnFinaliza = new JButton("Finalizar Venda");
    private JButton btnCancel = new JButton("Cancelar");
    private JLabel descCliente = new JLabel("Clientes: "); 
    private JLabel descFuncionario = new JLabel("FuncionÃ¡rio: ");
    private JLabel descProduto = new JLabel("Produtos: ");
    private JComboBox<String> clientes;
    private JComboBox<String> funcionarios;
    private JList<String> produtos;
    private ControleCliente c;
    private ControleFuncionario f;
    private ControleEstoque e;
    private ControleDados d;  

    public TelaVenda(ControleDados d){
        janela.setSize(500,500);

        this.d = d;
        c = new ControleCliente(d);
        f = new ControleFuncionario(d);
        e = new ControleEstoque(d);
        
        produtos = new JList<String>(e.getEstoque().listarProdutos());
        funcionarios = new JComboBox<>(f.getNomesFuncionarios());
        clientes = new JComboBox<>(c.getClienteNome());

        descCliente.setBounds(250,30,100,30);    
        descFuncionario.setBounds(30,30,100,30);    
        produtos.setBounds(60,100,350,300);
        funcionarios.setBounds(120,30,100,50);
        clientes.setBounds(320,30,100,50);
        btnFinaliza.setBounds(50,410,150,50);
        btnCancel.setBounds(240,410,150,50);


        janela.add(descFuncionario);
        janela.add(descCliente);
        janela.add(produtos);
        janela.add(btnFinaliza);
        janela.add(btnCancel);
        janela.add(funcionarios);
        janela.add(clientes);

        janela.setLayout(null);
        janela.setVisible(true);

        btnFinaliza.addActionListener(this);
        btnCancel.addActionListener(this);
    }

    /**
     * Captura eventos relacionados ao JButton
     * (1) Verifica se o botão selecionado foi o botão de finalizar,
     * caso tenha sido envia, os dados selecionados pelo usuário para
     * cadastro de uma nova venda. 
     * (2) Verifica se o botão selecionado foi o botão de cancelar,
     * caso tenha sido, fecha a janela.
     */
    
    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();
        
        if(search == btnFinaliza){
            d.inserirVenda(produtos.getSelectedIndex(),clientes.getSelectedIndex(), funcionarios.getSelectedIndex());
            JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
            janela.dispose();
        }

        if(search == btnCancel){
            janela.dispose();
        }
    }
}
