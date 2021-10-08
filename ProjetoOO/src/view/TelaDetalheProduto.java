package view;

import java.awt.event.*;
import javax.swing.*;
import controller.*;
import model.*;

public class TelaDetalheProduto implements ActionListener{
    private ControleDados d;
    private ControleEstoque e;
    private JFrame janela = new JFrame("Detalhe Produto");
    private JButton salvar = new JButton("Salvar");
    private JButton remProd = new JButton("Remover"); 
    private JButton cancelar = new JButton("Cancelar");
    private JLabel categoria = new JLabel("Categoria:");
    private JTextField txtCateg;
    private JLabel cor = new JLabel("Cor:");
    private JTextField txtCor;
    private JLabel tamanho = new JLabel("Tamanho:");
    private JTextField txtTamanho;
    private JLabel peso = new JLabel("Peso:");
    private JTextField txtPeso ;
    private JLabel marca = new JLabel("Marca:");
    private JTextField txtMarca;
    private JLabel material = new JLabel("Material: ");
    private JTextField txtMaterial;
    private JLabel preco = new JLabel("Preco: (R$)");
    private JTextField txtPreco;
    private JLabel descricao = new JLabel("Descrição: ");
    private JTextField txtDescricao;
    private JLabel custo = new JLabel("Custo: (R$)");
    private JTextField txtCusto;
    private JLabel fornecedor = new JLabel("Fornecedor: ");
    private JTextField txtFornecedor;
    private JLabel palmilha = new JLabel("palmilha: ");
    private JTextField txtPalm;
    private JLabel fechamento = new JLabel("Fechamento: ");
    private JTextField txtFecha;
    private JLabel materialForro = new JLabel("Material Forro: "); 
    private JTextField txtMatForro;
    private JLabel altCano = new JLabel("Altura do Cano: (cm) "); 
    private JTextField txtAltCano; 
    private JLabel alturaDoSalto = new JLabel("Altura do Salto: (cm) ");
    private JTextField txtAltSalto;
    private JLabel materialTira = new JLabel("Material da Tira: ");
    private JTextField txtMatTira;
    private JLabel solado = new JLabel("Solado: ");
    private JTextField txtSolado;
    private JLabel superficie = new JLabel("Superficie: ");
    private JTextField txtSup;
    private JLabel tecnologia = new JLabel("Tecnologia: ");
    private JTextField txtTecno;
    private JLabel linha = new JLabel("Linha: ");
    private JTextField txtLinha;
    private JLabel tipoDeSalto = new JLabel("Tipo de Salto: ");
    private JTextField txtTipoSalto;
    private JLabel pisada = new JLabel("Pisada: ");
    private JTextField txtPisada = new JTextField(200);
    private JLabel indicacao = new JLabel("indicação: ");
    private JTextField txtIndicacao = new JTextField(200);
    private JLabel tipoDeBico = new JLabel("Tipo de Bico: ");
    private JTextField txtTipoBico = new JTextField(200);
    private JLabel lingueta = new JLabel("Lingueta: ");
    private JTextField txtLing = new JTextField(200);
    private int pos;
    private int op;
    private int escolha;
    private String[] novosDados = new String[25];
    
    public TelaDetalheProduto(int pos, ControleDados dados,int escolha){
        this.d = dados;
        this.e = new ControleEstoque(d);
        this.pos = pos;
        this.escolha = escolha;
        janela.setSize(500,700);
       
        salvar.setBounds(50,600,100,50);
        remProd.setBounds(170,600,100,50);
        cancelar.setBounds(290,600,100,50);

        salvar.addActionListener(this);
        remProd.addActionListener(this);
        cancelar.addActionListener(this);

        janela.add(salvar);
        janela.add(remProd);
        janela.add(cancelar);
        janela.setLayout(null);
        janela.setVisible(true);
    }

    // Adiciona os campos comuns a todos os produtos
    public void getDadosComuns(){

        txtCateg = new JTextField(e.getCalcado(pos).getCategoria(),200);
        txtCateg.setEnabled(false);
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

    // Gera os campos do produto selecionado com seus dados
    public void telaDetalhe(){ 
        
        // Verifica qual a classe do objeto para gerar os campos adequados
        if(e.getCalcado(pos) instanceof Bota){
            this.op = 0;
            getDadosComuns();

            Bota bota = (Bota) e.getCalcado(pos);
        
            txtLing = new JTextField(bota.getLingueta(),200);
            txtPalm = new JTextField(bota.getPalmilha(),200);
            txtFecha = new JTextField(bota.getFechamento(),200);
            txtMatForro = new JTextField(bota.getMaterialDoForro(),200);
            txtAltCano = new JTextField(String.valueOf(bota.getAlturaDoCano()),200);

            lingueta.setBounds(30,330,100,30);
            txtLing.setBounds(100,330,100,30);
            palmilha.setBounds(30,360,100,30);
            txtPalm.setBounds(100,360,100,30);
            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(120,390,100,30);
            materialForro.setBounds(30,420,100,30);
            txtMatForro.setBounds(120,420,100,30);
            altCano.setBounds(30,450,200,30);
            txtAltCano.setBounds(150,450,100,30);
            
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
            this.op = 1;
            getDadosComuns();

            Chinelo chinelo = (Chinelo) e.getCalcado(pos);

            txtMatTira = new JTextField(chinelo.getMaterialTira(),200);
            txtSolado = new JTextField(chinelo.getSolado(),200);

            materialTira.setBounds(30,330,100,30);
            txtMatTira.setBounds(130,330,100,30);
            solado.setBounds(30,360,100,30);
            txtSolado.setBounds(100,360,100,30);

            janela.add(materialTira);
            janela.add(txtMatTira);
            janela.add(solado);
            janela.add(txtSolado);


        }else if(e.getCalcado(pos) instanceof Chuteira){
            this.op = 2;
            getDadosComuns();

            Chuteira chuteira = (Chuteira) e.getCalcado(pos);

            txtSup = new JTextField(chuteira.getSuperficie(),200);
            txtTecno = new JTextField(chuteira.getTecnologia(),200);
            txtLinha = new JTextField(chuteira.getLinha(),200);
            txtMatForro = new JTextField(chuteira.getMaterialDoForro(),200);
            txtFecha = new JTextField(chuteira.getFechamento(),200);

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
            this.op = 3;
            getDadosComuns();

            Sandalia sandalia = (Sandalia) e.getCalcado(pos);

            txtAltSalto = new JTextField(String.valueOf(sandalia.getAlturaDoSalto()),200);
            txtTipoSalto = new JTextField(sandalia.getTipoDeSalto(),200);
            txtFecha = new JTextField(sandalia.getFechamento(),200);

            alturaDoSalto.setBounds(30,330,200,30);
            txtAltSalto.setBounds(150,330,100,30);
            tipoDeSalto.setBounds(30,360,100,30);
            txtTipoSalto.setBounds(100,360,100,30);
            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(120,390,100,30);
            
            janela.add(alturaDoSalto);
            janela.add(txtAltSalto);
            janela.add(tipoDeSalto);
            janela.add(txtTipoSalto);
            janela.add(fechamento);
            janela.add(txtFecha);

            

        }else if(e.getCalcado(pos) instanceof SapatoSocial){
            this.op = 4;    
            getDadosComuns();

            SapatoSocial sapato = (SapatoSocial) e.getCalcado(pos);

            txtMatForro = new JTextField(sapato.getMaterialDoForro(),200);
            txtTipoBico = new JTextField(sapato.getTipoDeBico(),200);
            txtAltSalto = new JTextField(String.valueOf(sapato.getAlturaDoSalto()),200);
            txtPalm = new JTextField(sapato.getPalmilha(),200);

            materialForro.setBounds(30,330,100,30);
            txtMatForro.setBounds(120,330,100,30);
            tipoDeBico.setBounds(30,360,100,30);
            txtTipoBico.setBounds(120,360,100,30);
            alturaDoSalto.setBounds(30,390,200,30);
            txtAltSalto.setBounds(150,390,100,30);
            palmilha.setBounds(30,420,100,30);
            txtPalm.setBounds(100,420,100,30);

            janela.add(materialForro);
            janela.add(txtMatForro);
            janela.add(tipoDeBico);
            janela.add(txtTipoBico);
            janela.add(alturaDoSalto);
            janela.add(txtAltSalto);
            janela.add(palmilha);
            janela.add(txtPalm);

        }else if(e.getCalcado(pos) instanceof Tenis){
            this.op = 5;
            getDadosComuns();

            Tenis tenis = (Tenis) e.getCalcado(pos);

            txtMatForro = new JTextField(tenis.getMaterialDoForro(),200);
            txtPalm = new JTextField(tenis.getPamilha(),200);
            txtFecha = new JTextField(tenis.getFechamento(),200);
            txtPisada = new JTextField(tenis.getPisada(),200); 
            txtAltCano = new JTextField(tenis.getAlturaDoCano(),200);
            indicacao = new JLabel("indicação: ");
            txtIndicacao = new JTextField(tenis.getIndicacao(),200);

            materialForro.setBounds(30,330,100,30);
            txtMatForro.setBounds(120,330,100,30);
            palmilha.setBounds(30,360,100,30);
            txtPalm.setBounds(100,360,100,30);
            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(100,390,100,30);
            pisada.setBounds(30,420,100,30);
            txtPisada.setBounds(100,420,100,30);
            altCano.setBounds(30,450,200,30);
            txtAltCano.setBounds(150,450,100,30);
            indicacao.setBounds(30,480,100,30);
            txtIndicacao.setBounds(100,480,100,30);

            janela.add(materialForro);
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

    // Gera os campos em branco para cadastro de novos produtos
    public void telaCadastro(int op){
        this.op = op;

        txtCor = new JTextField(200);
        txtTamanho = new JTextField(200);
        txtPeso = new JTextField(200);
        txtMarca = new JTextField(200);
        txtMaterial = new JTextField(200);
        txtPreco = new JTextField(200);
        txtDescricao = new JTextField(200);
        txtCusto = new JTextField(200);
        txtFornecedor = new JTextField(200);

        //coloca campos especificos de bota, sapato social e tênis
        if(op == 0 || op == 4 || op == 5){

            txtPalm = new JTextField(200);

            palmilha.setBounds(30,360,100,30);
            txtPalm.setBounds(100,360,100,30);

            janela.add(palmilha);
            janela.add(txtPalm);

        }

        //coloca campos especificos de bota,chuteira, sandália e tênis
        if(op == 0 || op == 2 || op == 3 || op == 5){
            txtFecha = new JTextField(200);

            fechamento.setBounds(30,390,100,30);
            txtFecha.setBounds(120,390,100,30);

            janela.add(fechamento);
            janela.add(txtFecha);

        }

        //coloca campos especificos de bota, chuteira, sapato social e tênis
        if(op == 0 || op == 2 || op == 4 || op == 5){
            txtMatForro = new JTextField(200);
            
            materialForro.setBounds(30,420,100,30);
            txtMatForro.setBounds(120,420,100,30);

            janela.add(materialForro);
            janela.add(txtMatForro);

        }
        //coloca campos especificos de bota e tênis
        if(op == 0 || op == 5){
            txtAltCano = new JTextField(200); 
            
            altCano.setBounds(30,450,200,30);
            txtAltCano.setBounds(150,450,100,30);

            janela.add(altCano);
            janela.add(txtAltCano);
        }
        //coloca campos especificos de sandália e sapato social
        if(op == 3 || op == 4){
            txtAltSalto = new JTextField(200);

            alturaDoSalto.setBounds(30,330,200,30);
            txtAltSalto.setBounds(150,330,100,30);

            janela.add(alturaDoSalto);
            janela.add(txtAltSalto);
        }

        // Adiciona os campos especificos do produto selecionado
        if (op == 0){

            //String[] nomeCategoria = {" Bota","Chinelo","Chuteira","Sandália","Sapato Social","Tenis"};
            //JComboBox<String> listaCateg = new JComboBox<String>(nomeCategoria);
        
            txtCateg = new JTextField("bota",200);
            //listaCateg.setEnabled(false);
            
            
            //listaCateg.setBounds(100,30,100,30);
            lingueta.setBounds(30,330,100,30);
            txtLing.setBounds(100,330,100,30);
            //janela.add(listaCateg);
            janela.add(lingueta);
            janela.add(txtLing);

        }else if(op == 1){

            txtCateg = new JTextField("Chinelo",200);
            materialTira = new JLabel("Material da Tira: ");
            txtMatTira = new JTextField(200);
            solado = new JLabel("Solado: ");
            txtSolado = new JTextField(200);

            materialTira.setBounds(30,330,100,30);
            txtMatTira.setBounds(120,330,100,30);
            solado.setBounds(30,360,100,30);
            txtSolado.setBounds(100,360,100,30);

            janela.add(materialTira);
            janela.add(txtMatTira);
            janela.add(solado);
            janela.add(txtSolado);

        }else if(op == 2){

            txtCateg = new JTextField("Chuteira",200);
            superficie = new JLabel("Superficie: ");
            txtSup = new JTextField(200);
            tecnologia = new JLabel("Tecnologia: ");
            txtTecno = new JTextField(200);
            linha = new JLabel("Linha: ");
            txtLinha = new JTextField(200);

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
            
            txtCateg = new JTextField("Sandália",200);
            tipoDeSalto = new JLabel("Tipo de Salto: ");
            txtTipoSalto = new JTextField(200);

            tipoDeSalto.setBounds(30,360,100,30);
            txtTipoSalto.setBounds(120,360,100,30);
            
            janela.add(tipoDeSalto);
            janela.add(txtTipoSalto);

        }else if(op == 4){

            txtCateg = new JTextField("Sapato social",200);

            tipoDeBico.setBounds(30,330,100,30);
            txtTipoBico.setBounds(100,330,100,30);
            alturaDoSalto.setBounds(30,390,200,30);
            txtAltSalto.setBounds(150,390,100,30);

            janela.add(tipoDeBico);
            janela.add(txtTipoBico);
            janela.add(alturaDoSalto);
            janela.add(txtAltSalto);

        }else if(op == 5){
            
            txtCateg = new JTextField("Tênis",200);
            txtPisada = new JTextField(200);
            txtIndicacao = new JTextField(200);

            pisada.setBounds(30,330,100,30);
            txtPisada.setBounds(100,330,100,30);
            indicacao.setBounds(30,480,100,30);
            txtIndicacao.setBounds(120,480,100,30);

            janela.add(pisada);
            janela.add(txtPisada);
            janela.add(indicacao);
            janela.add(txtIndicacao);

        }
        
        txtCateg.setEnabled(false);
        salvar.setBounds(100,600,100,50);
        cancelar.setBounds(250,600,100,50);
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

        janela.remove(remProd);
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

    // Gerencia os eventos relacionados ao JButton
    public void actionPerformed(ActionEvent e){
        Object search = e.getSource();

        if(search == salvar){
            novosDados[0] = txtCateg.getText();
            novosDados[1] = txtCor.getText();
            novosDados[2] = txtTamanho.getText();
            novosDados[3] = txtMarca.getText();
            novosDados[4] = txtMaterial.getText();
            novosDados[5] = txtPreco.getText();
            novosDados[6] = txtDescricao.getText();
            novosDados[7] = txtCusto.getText();

            if (op == 0 || op == 4 || op == 5){

                novosDados[8] = txtPalm.getText();     
            }
    
            //coloca campos especificos de bota,chuteira, sandália e tênis
            if(op == 0 || op == 2 || op == 3 || op == 5){
                
                novosDados[9] = txtFecha.getText();
    
            }
    
            //coloca campos especificos de bota, chuteira, sapato social e tênis
            if(op == 0 || op == 2 || op == 4 || op == 5){
                
                novosDados[10] = txtMatForro.getText();

            }
            //coloca campos especificos de bota e tênis
            if(op == 0 || op == 5){
                novosDados[11] = txtAltCano.getText();
            }
            //coloca campos especificos de sandália e sapato social
            if(op == 3 || op == 4){
                novosDados[12] = txtAltSalto.getText();
            }

            if(op == 0){
                novosDados[23] = txtLing.getText();
            }

            if(op == 1){

                novosDados[13] = txtMatTira.getText();
                novosDados[14] = txtSolado.getText();


            }else if(op == 2){

                novosDados[15] = txtSup.getText();
                novosDados[16] = txtTecno.getText();
                novosDados[17] = txtLinha.getText();

            }else if(op == 3){
                
                novosDados[18] = txtTipoSalto.getText();
        

            }else if(op == 4){

                novosDados[19] = txtTipoBico.getText();
                novosDados[20] = txtAltSalto.getText();


            }else if(op == 5){
                 
                novosDados[21] = txtPisada.getText();
                novosDados[22] = txtIndicacao.getText();

            }

            d.inserirEditarProduto(novosDados,op,escolha,pos);
            mensagemSucesso();
            janela.dispose();
            
        }

        if(search == remProd){
            this.e.excluirProd(pos);
            mensagemExclusao();
            janela.dispose();
        }

        if(search == cancelar){
            janela.dispose();
        }
    }
    
    public void mensagemExclusao(){
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
    }

    public void mensagemSucesso(){
        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
    }
}


