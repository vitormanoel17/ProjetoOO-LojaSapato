package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.ControleDados;
import controller.ControleEstoque;
import model.*;

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

        janela.setLayout(null);
        janela.setVisible(true);
    }

    public void getDadosComuns(){

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

    }

    public void telaDetalhe(){ 

        if(e.getCalcado(pos) instanceof Bota){

            getDadosComuns();

            JLabel lingueta = new JLabel("Lingueta: ");
            JTextField txtLing = new JTextField(200);
            JLabel palmilha = new JLabel("Palmilha: ");
            JTextField txtPalm = new JTextField(200);
            JLabel fechamento = new JLabel("Fechamento: ");
            JTextField txtFecha = new JTextField(200);
            JLabel materialForro = new JLabel("Material Forro: ");
            JTextField txtMatForro = new JTextField(200);
            JLabel altCano = new JLabel("Altura do Cano: ");
            JTextField txtAltCano = new JTextField(200);

            lingueta.setBounds(30,330,100,30);
            txtLing.setBounds(100,330,100,30);
            palmilha.setBounds(30,360,100,30);
            txtPalm.setBounds(100,360,100,30);
            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(120,390,100,30);
            materialForro.setBounds(30,420,100,30);
            txtMatForro.setBounds(120,420,100,30);
            altCano.setBounds(30,450,100,30);
            txtAltCano.setBounds(120,450,100,30);
            
            janela.add(lingueta);
            janela.add(txtLing);
            janela.add(palmilha);
            janela.add(txtPalm);
            janela.add(fechamento);
            janela.add(txtFecha);
            janela.add(materialForro);
            janela.add(txtMatForro);
            janela.add(altCano);
            janela.add(txtAltCano);
            

        }else if(e.getCalcado(pos) instanceof Chinelo ){

            getDadosComuns();

            JLabel materialTira = new JLabel("Material da Tira: ");
            JTextField txtMatTira = new JTextField(200);
            JLabel solado = new JLabel("Solado: ");
            JTextField txtSolado = new JTextField(200);

            materialTira.setBounds(30,330,100,30);
            txtMatTira.setBounds(100,330,100,30);
            solado.setBounds(30,360,100,30);
            txtSolado.setBounds(100,360,100,30);

            janela.add(materialTira);
            janela.add(txtMatTira);
            janela.add(solado);
            janela.add(txtSolado);


        }else if(e.getCalcado(pos) instanceof Chuteira){

            getDadosComuns();

            JLabel superficie = new JLabel("Superficie: ");
            JTextField txtSup = new JTextField(200);
            JLabel tecnologia = new JLabel("Tecnologia: ");
            JTextField txtTecno = new JTextField(200);
            JLabel linha = new JLabel("Linha: ");
            JTextField txtLinha = new JTextField(200);
            JLabel materialForro = new JLabel("Material do Forro: ");
            JTextField txtMatForro = new JTextField(200);
            JLabel fechamento = new JLabel("Fechamento: ");
            JTextField txtFecha = new JTextField(200);

            superficie.setBounds(30,330,100,30);
            txtSup.setBounds(100,330,100,30);
            tecnologia.setBounds(30,360,100,30);
            txtTecno.setBounds(100,360,100,30);
            linha.setBounds(30,390,100,30);
            txtLinha.setBounds(120,390,100,30);
            materialForro.setBounds(30,420,100,30);
            txtMatForro.setBounds(120,420,100,30);
            fechamento.setBounds(30,450,100,30);
            txtFecha.setBounds(120,450,100,30);

            janela.add(superficie);
            janela.add(txtSup);
            janela.add(tecnologia);
            janela.add(txtTecno);
            janela.add(linha);
            janela.add(txtLinha);
            janela.add(materialForro);
            janela.add(txtMatForro);
            janela.add(fechamento);
            janela.add(txtFecha);

        }else if(e.getCalcado(pos) instanceof Sandalia){

            getDadosComuns();
            
            JLabel alturaDoSalto = new JLabel("Altura do Salto: ");
            JTextField txtAltSalto = new JTextField(200);
            JLabel tipoDeSalto = new JLabel("Tipo de Salto");
            JTextField txtTipoSalto = new JTextField(200);
            JLabel fechamento = new JLabel("Fechamento ");
            JTextField txtFecha = new JTextField(200);

            alturaDoSalto.setBounds(30,330,100,30);
            txtAltSalto.setBounds(100,330,100,30);
            tipoDeSalto.setBounds(30,360,100,30);
            txtTipoSalto.setBounds(100,360,100,30);
            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(100,390,100,30);
            
            janela.add(alturaDoSalto);
            janela.add(txtAltSalto);
            janela.add(tipoDeSalto);
            janela.add(txtTipoSalto);
            janela.add(fechamento);
            janela.add(txtFecha);

            

        }else if(e.getCalcado(pos) instanceof SapatoSocial){
            
            getDadosComuns();

            JLabel materialDoForro = new JLabel("Material do Forro: ");
            JTextField txtMatForro = new JTextField(200);
            JLabel tipoDeBico = new JLabel("Tipo de Bico: ");
            JTextField txtTipoBico = new JTextField(200);
            JLabel alturaDoSalto = new JLabel("Altura do Salto: ");
            JTextField txtAltSalto = new JTextField(200);
            JLabel palmilha = new JLabel("Palmilha: ");
            JTextField txtPalm = new JTextField(200);

            materialDoForro.setBounds(30,330,100,30);
            txtMatForro.setBounds(100,330,100,30);
            tipoDeBico.setBounds(30,360,100,30);
            txtTipoBico.setBounds(100,360,100,30);
            alturaDoSalto.setBounds(30,390,100,30);
            txtAltSalto.setBounds(100,390,100,30);
            palmilha.setBounds(30,420,100,30);
            txtPalm.setBounds(100,420,100,30);

            janela.add(materialDoForro);
            janela.add(txtMatForro);
            janela.add(tipoDeBico);
            janela.add(txtTipoBico);
            janela.add(alturaDoSalto);
            janela.add(txtAltSalto);
            janela.add(palmilha);
            janela.add(txtPalm);

        }else if(e.getCalcado(pos) instanceof Tenis){

            getDadosComuns();

            JLabel materialDoForro = new JLabel("Material do Forro: ");
            JTextField txtMatForro = new JTextField(200);
            JLabel palmilha = new JLabel("Palmilha: ");
            JTextField txtPalm = new JTextField(200);
            JLabel fechamento = new JLabel("Fechamento: ");
            JTextField txtFecha = new JTextField(200);
            JLabel pisada = new JLabel("Pisada: ");
            JTextField txtPisada = new JTextField(200);
            JLabel altCano = new JLabel("Altura do Cano: ");
            JTextField txtAltCano = new JTextField(200);
            JLabel indicacao = new JLabel("indicação: ");
            JTextField txtIndicacao = new JTextField(200);

            materialDoForro.setBounds(30,330,100,30);
            txtMatForro.setBounds(100,330,100,30);
            palmilha.setBounds(30,360,100,30);
            txtPalm.setBounds(100,360,100,30);
            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(100,390,100,30);
            pisada.setBounds(30,420,100,30);
            txtPisada.setBounds(100,420,100,30);
            altCano.setBounds(30,450,100,30);
            txtAltCano.setBounds(100,450,100,30);
            indicacao.setBounds(30,480,100,30);
            txtIndicacao.setBounds(100,480,100,30);

            janela.add(materialDoForro);
            janela.add(txtMatForro);
            janela.add(palmilha);
            janela.add(txtPalm);
            janela.add(fechamento);
            janela.add(txtFecha);
            janela.add(pisada);
            janela.add(txtPisada);
            janela.add(altCano);
            janela.add(txtAltCano);
            janela.add(indicacao);
            janela.add(txtIndicacao);

        }else{
            txtCateg = new JTextField(200);
            txtCor = new JTextField(200);
            txtTamanho = new JTextField(200);
            txtPeso = new JTextField(200);
            txtMarca = new JTextField(200);
            txtMaterial = new JTextField(200);
            txtPreco = new JTextField(200);
            txtDescricao = new JTextField(200);
            txtCusto = new JTextField(200);
            txtFornecedor = new JTextField(200);
        }

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
    }

    public void telaCadastro(int op){
        op = 5;
        
        txtCateg = new JTextField(200);
        txtCor = new JTextField(200);
        txtTamanho = new JTextField(200);
        txtPeso = new JTextField(200);
        txtMarca = new JTextField(200);
        txtMaterial = new JTextField(200);
        txtPreco = new JTextField(200);
        txtDescricao = new JTextField(200);
        txtCusto = new JTextField(200);
        txtFornecedor = new JTextField(200);

        if(op == 0 || op == 4 || op == 5){

            JLabel palmilha = new JLabel("Palmilha: ");
            JTextField txtPalm = new JTextField(200);

            palmilha.setBounds(30,360,100,30);
            txtPalm.setBounds(100,360,100,30);

            janela.add(palmilha);
            janela.add(txtPalm);

        }

        if(op == 0 || op == 2 || op == 3 || op == 5){
            JLabel fechamento = new JLabel("Fechamento: ");
            JTextField txtFecha = new JTextField(200);

            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(120,390,100,30);

            janela.add(fechamento);
            janela.add(txtFecha);

        }

        if(op == 0 || op == 2 || op == 4 || op == 5){
            JLabel materialForro = new JLabel("Material Forro: "); 
            JTextField txtMatForro = new JTextField(200);
            
            materialForro.setBounds(30,420,100,30);
            txtMatForro.setBounds(120,420,100,30);

            janela.add(materialForro);
            janela.add(txtMatForro);

        }

        if(op == 0 || op == 5){
            JLabel altCano = new JLabel("Altura do Cano: "); 
            JTextField txtAltCano = new JTextField(200); 
            
            altCano.setBounds(30,450,100,30);
            txtAltCano.setBounds(120,450,100,30);

            janela.add(altCano);
            janela.add(txtAltCano);
        }

        if(op == 3 || op == 4){
            JLabel alturaDoSalto = new JLabel("Altura do Salto: ");
            JTextField txtAltSalto = new JTextField(200);

            alturaDoSalto.setBounds(30,330,100,30);
            txtAltSalto.setBounds(100,330,100,30);
        }

        if (op == 0){

            String[] nomeCategoria = {"Bota","Chinelo","Chuteira","Sandália","Sapato Social","Tenis"};
            JComboBox<String> listaCateg = new JComboBox<String>(nomeCategoria);
            JLabel lingueta = new JLabel("Lingueta: ");
            JTextField txtLing = new JTextField(200);

            listaCateg.setBounds(100,30,100,30);
            lingueta.setBounds(30,330,100,30);
            txtLing.setBounds(100,330,100,30);
            janela.remove(txtCateg);
            janela.add(listaCateg);
            janela.add(lingueta);
            janela.add(txtLing);

        }else if(op == 1){
            
            JLabel materialTira = new JLabel("Material da Tira: ");
            JTextField txtMatTira = new JTextField(200);
            JLabel solado = new JLabel("Solado: ");
            JTextField txtSolado = new JTextField(200);

            materialTira.setBounds(30,330,100,30);
            txtMatTira.setBounds(100,330,100,30);
            solado.setBounds(30,360,100,30);
            txtSolado.setBounds(100,360,100,30);

            janela.add(materialTira);
            janela.add(txtMatTira);
            janela.add(solado);
            janela.add(txtSolado);

        }else if(op == 2){

            JLabel superficie = new JLabel("Superficie: ");
            JTextField txtSup = new JTextField(200);
            JLabel tecnologia = new JLabel("Tecnologia: ");
            JTextField txtTecno = new JTextField(200);
            JLabel linha = new JLabel("Linha: ");
            JTextField txtLinha = new JTextField(200);

            superficie.setBounds(30,330,100,30);
            txtSup.setBounds(100,330,100,30);
            tecnologia.setBounds(30,360,100,30);
            txtTecno.setBounds(100,360,100,30);
            linha.setBounds(30,450,100,30);
            txtLinha.setBounds(120,450,100,30);

            janela.add(superficie);
            janela.add(txtSup);
            janela.add(tecnologia);
            janela.add(txtTecno);
            janela.add(linha);
            janela.add(txtLinha);

        }else if(op == 3){
           
            JLabel tipoDeSalto = new JLabel("Tipo de Salto: ");
            JTextField txtTipoSalto = new JTextField(200);

            tipoDeSalto.setBounds(30,330,100,30);
            txtTipoSalto.setBounds(120,330,100,30);
            
            janela.add(tipoDeSalto);
            janela.add(txtTipoSalto);

        }else if(op == 4){

            JLabel tipoDeBico = new JLabel("Tipo de Bico: ");
            JTextField txtTipoBico = new JTextField(200);
            JLabel alturaDoSalto = new JLabel("Altura do Salto: ");
            JTextField txtAltSalto = new JTextField(200);

            tipoDeBico.setBounds(30,330,100,30);
            txtTipoBico.setBounds(100,330,100,30);
            alturaDoSalto.setBounds(30,390,100,30);
            txtAltSalto.setBounds(120,390,100,30);

            janela.add(tipoDeBico);
            janela.add(txtTipoBico);
            janela.add(alturaDoSalto);
            janela.add(txtAltSalto);

        }else if(op == 5){

            JLabel pisada = new JLabel("Pisada: ");
            JTextField txtPisada = new JTextField(200);
            JLabel indicacao = new JLabel("indicação: ");
            JTextField txtIndicacao = new JTextField(200);

            pisada.setBounds(30,330,100,30);
            txtPisada.setBounds(100,330,100,30);
            indicacao.setBounds(30,480,100,30);
            txtIndicacao.setBounds(120,480,100,30);

            janela.add(pisada);
            janela.add(txtPisada);
            janela.add(indicacao);
            janela.add(txtIndicacao);

        }

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
    }
}
