package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ControleDados;
import controller.ControleEstoque;

public class TelaDetalheProduto {
    ControleDados d = new ControleDados();
    ControleEstoque e = new ControleEstoque(d);

    JFrame janela = new JFrame("Detalhe Produto");
    JLabel categoria = new JLabel("Categoria:");
    JTextField txtCateg;
    JLabel cor = new JLabel("Cor:");
    JTextField txtCor;
    JLabel tamanho = new JLabel("Tamanho:");
    JTextField txtTamanho;
    JLabel peso = new JLabel("Peso:");
    JTextField txtPeso ;
    JLabel marca = new JLabel("Marca:");
    JTextField txtMarca;
    JLabel material = new JLabel("Material: ");
    JTextField txtMaterial;
    JLabel preco = new JLabel("Preco: ");
    JTextField txtPreco;
    JLabel descricao = new JLabel("Descrição: ");
    JTextField txtDescricao;
    JLabel custo = new JLabel("Custo: ");
    JTextField txtCusto;
    JLabel fornecedor = new JLabel("Fornecedor: ");
    JTextField txtFornecedor;
    int pos;
    
    public TelaDetalheProduto(int pos){
        this.pos = pos;
        janela.setSize(500,700);
        
        txtCateg = new JTextField(e.getCalcado(pos).getCategoria(),200);
        txtCor = new JTextField(e.getCalcado(pos).getCor(),200);
        txtTamanho = new JTextField(String.valueOf(e.getCalcado(pos).getTamanho()),200);
        txtPeso = new JTextField(String.valueOf(e.getCalcado(pos).getPeso()),200);
        txtMarca = new JTextField(e.getCalcado(pos).getMarca(),200);
        txtMaterial = new JTextField(e.getCalcado(pos).getMaterial(),200);
        txtPreco = new JTextField(String.valueOf(e.getCalcado(pos).getPreco()),200);
        txtDescricao = new JTextField(e.getCalcado(pos).getDescricao(),200);
        txtCusto = new JTextField(String.valueOf(e.getCalcado(pos).getCusto()),200);
        txtFornecedor = new JTextField(200);

        categoria.setBounds(30,30,100,30);
        txtCateg.setBounds(100,30,100,30);
        cor.setBounds(30,60,100,30);
        txtCor.setBounds(100,60,100,30);
        tamanho.setBounds(30,90,100,30);
        txtTamanho.setBounds(100,90,100,30);
        peso.setBounds(30,120,100,30);
        txtPeso.setBounds(100,120,100,30);
        marca.setBounds(30,150,100,30);
        txtMarca.setBounds(100,150,100,30);
        material.setBounds(30,180,100,30);
        txtMaterial.setBounds(100,180,100,30);
        preco.setBounds(30,210,100,30);
        txtPreco.setBounds(100,210,100,30);
        descricao.setBounds(30,240,100,30);
        txtDescricao.setBounds(100,240,100,30);
        custo.setBounds(30,270,100,30);
        txtCusto.setBounds(100,270,100,30);
        fornecedor.setBounds(30,300,100,30);
        txtFornecedor.setBounds(100,300,100,30);

        janela.add(categoria);
        janela.add(txtCateg);
        janela.add(cor);
        janela.add(txtCor);
        janela.add(tamanho);
        janela.add(txtTamanho);
        janela.add(peso);
        janela.add(txtPeso);
        janela.add(marca);
        janela.add(txtMarca);
        janela.add(material);
        janela.add(txtMaterial);
        janela.add(preco);
        janela.add(txtPreco);
        janela.add(descricao);
        janela.add(txtDescricao);
        janela.add(custo);
        janela.add(txtCusto);
        janela.add(fornecedor);
        janela.add(txtFornecedor);

        janela.setLayout(null);
        janela.setVisible(true);
    }
}
