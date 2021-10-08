package controller;

import model.*;
import java.util.*;

/**
 * Classe que controla os dados cadastrados no sistema
 * @author Vitor manoel
 * @version 1.0
 */

public class ControleDados {
    
    private Dados dados = new Dados();
    private Validador v = new Validador();

    public ControleDados(){
        dados.fileWithSomeData();
    }

    public Dados getDados() {
        return dados;
    }

    public ArrayList<Cliente> getClientes(){
        return dados.getCliente();
    }

    public ArrayList<Funcionario> getFuncionarios(){
        return dados.getFuncionario();
    }

    public void removerCliente(int i){
        dados.getCliente().remove(i);
    }
    public void removerFuncionario(int i){
        dados.getFuncionario().remove(i);
    }

    public int getQtdVendas(){
        return dados.getFinanceiro().getVenda().size();
    }

    public Financeiro getFinanceiro(){
        return dados.getFinanceiro();
    }

    public Estoque getEstoque(){
        return dados.getEstoque();
    }
    
    /**
     * Método para inserir ou editar cliente
     * @param newDados vetor de String com os novos dados a serem cadastrados
     * @param pos inteiro que indica a posição do cliente que será editado
     * @param e inteiro que indica qual operação será realizada : cadastro ou alteração
     */
    public Boolean inserirEditarCliente(String[] newDados,int pos, int e){

        if(!newDados[3].matches("[0-9]+") || !newDados[4].matches("[0-9]+") || !newDados[7].matches("[0-9]+") ||
           !newDados[8].matches("[0-9]+") || !v.validarCep(newDados[3]) || !v.validarDdd(newDados[7]) || !v.validarTelefone(newDados[8])){
            return false;
        }else{
            // Verifica qual operaÃ§Ã£o serÃ¡ realizada com o cliente: cadastro ou alteraÃ§Ã£o
            if(e == 1){
                dados.getCliente().add(new Cliente(
                                        new Endereco(newDados[1], newDados[2], newDados[3], Integer.parseInt(newDados[4]), newDados[5], newDados[6]),
                                        new Telefone(Integer.parseInt(newDados[7]),Integer.parseInt(newDados[8])),
                                        newDados[0]
                                    ));
                return true;
            }else{
                getClientes().get(pos).setNome(newDados[0]);
                getClientes().get(pos).setEndereco(new Endereco(newDados[1], newDados[2], newDados[3], 
                                                    Integer.parseInt(newDados[4]), newDados[5], newDados[6]));
        
                getClientes().get(pos).setTelefone(new Telefone(Integer.parseInt(newDados[7]),
                                                            Integer.parseInt(newDados[8])));
                return true;
            }
        }
    }
    
    /**
     * Método para inserir ou editar funcionários
     * @param newDados vetor de String com os novos dados a serem cadastrados
     * @param pos inteiro que indica a posição do funcionário que será editado
     * @param e inteiro que indica qual operação será realizada : cadastro ou alteração
     */
    
    public Boolean inserirEditarFuncionario(String[] newDados,int pos, int e){

        if(!newDados[3].matches("[0-9]+") || !newDados[4].matches("[0-9]+") || !newDados[7].matches("[0-9]+") ||
           !newDados[8].matches("[0-9]+") || !v.validarCep(newDados[3]) || !v.validarDdd(newDados[7]) || !v.validarTelefone(newDados[8])){
            return false;
        }else{

            // Verifica qual operação será¡ realizada com o Funcionário: cadastro ou alteracao
            if(e == 1){
                dados.getFuncionario().add(new Funcionario(
                                            new Endereco(newDados[1], newDados[2], newDados[3], Integer.parseInt(newDados[4]), newDados[5], newDados[6]),
                                            new Telefone(Integer.parseInt(newDados[7]),Integer.parseInt(newDados[8])),
                                            newDados[0], 
                                            "Gerente",
                                            dados.getDate(),
                                            2000)
                                        );
                return true;
            }else{
                getFuncionarios().get(pos).setNome(newDados[0]);
                getFuncionarios().get(pos).setEndereco(new Endereco(newDados[1], newDados[2], newDados[3], 
                                                    Integer.parseInt(newDados[4]), newDados[5], newDados[6]));
        
                getFuncionarios().get(pos).setTelefone(new Telefone(Integer.parseInt(newDados[7]),
                                                            Integer.parseInt(newDados[8])));
                return true;
            }
        }
    }
    
    /**
     * Método para inserir ou editar Produto
     * @param novosDados vetor de String com os novos dados a serem cadastrados
     * @param op inteiro que indica o produto selecionado
     * @param escolha inteiro que indica qual operação será realizada : cadastro ou alteração
     * @param pos inteiro que indica a posição produto que será editado
     */

    public Boolean inserirEditarProduto(String[] novosDados, int op, int escolha,int pos){
        Boolean res = false;

        if(!novosDados[2].matches("[0-9]+") || !novosDados[5].matches("([+]?(\\d+\\.)?\\d+)") || !novosDados[7].matches("([+-]?(\\d+\\.)?\\d+)")){
            res = false;
        }else{

            // Verifica qual operação será realizada com o Produto: cadastro ou alteração
            if(escolha == 1){

                // verifica qual tipo de produto foi selecionado
                if(op == 0){
                    if(!novosDados[11].matches("[0-9]+") || !novosDados[1].matches("[0-9]+")){
                        Bota bota = new Bota(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                        Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                        bota.setLingueta(novosDados[23]);
                        bota.setPalmilha(novosDados[8]);
                        bota.setFechamento(novosDados[9]);
                        bota.setMaterialDoForro(novosDados[10]);
                        bota.setAlturaDoCano(Integer.parseInt(novosDados[11]));

                        getEstoque().setCalcado(bota);

                        res = true;
                    }
                }else if(op == 1){

                    Chinelo chinelo = new Chinelo(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                    Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                    chinelo.setMaterialTira(novosDados[13]);
                    chinelo.setSolado(novosDados[14]);

                    getEstoque().setCalcado(chinelo);

                    res = true;

                }else if(op == 2){

                Chuteira chuteira = new Chuteira(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                    Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                    
                    chuteira.setSuperficie(novosDados[15]);
                    chuteira.setTecnologia(novosDados[16]);
                    chuteira.setLinha(novosDados[17]);
                    chuteira.setFechamento(novosDados[9]);
                    chuteira.setMaterialDoForro(novosDados[10]);

                    getEstoque().setCalcado(chuteira);

                    res = true;

                }else if(op == 3){

                    if(!novosDados[12].matches("[0-9]+")){
                        res = false;
                    }else{
                        Sandalia sandalia = new Sandalia(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                        Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                        sandalia.setAlturaDoSalto(Integer.parseInt(novosDados[12]));
                        sandalia.setFechamento(novosDados[9]);
                        sandalia.setTipoDeSalto(novosDados[18]);

                        getEstoque().setCalcado(sandalia);

                        res = true;
                    }

                }else if(op == 4){

                    if(!novosDados[12].matches("[0-9]+")){
                        res = false;
                    }else{
                        SapatoSocial sapato = new SapatoSocial(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                        
                        sapato.setMaterialDoForro(novosDados[10]);
                        sapato.setPalmilha(novosDados[8]);
                        sapato.setAlturaDoSalto(Integer.parseInt(novosDados[12]));
                        sapato.setTipoDeBico(novosDados[19]);

                        getEstoque().setCalcado(sapato);

                        res = true;
                    }

                }else if(op == 5){
                    if(!novosDados[11].matches("[0-9]+")){
                        res = false;
                    }else{
                        Tenis  tenis= new Tenis(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                        Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                        tenis.setMaterialDoForro(novosDados[10]);
                        tenis.setPamilha(novosDados[8]);
                        tenis.setFechamento(novosDados[9]);
                        tenis.setPisada(novosDados[21]);
                        tenis.setAlturaDoCano(novosDados[11]);
                        tenis.setIndicacao(novosDados[22]);

                        getEstoque().setCalcado(tenis);

                        res = true;
                    }
                }

            }else if (escolha == 2){
                
                if(op == 0){
                    if(!novosDados[11].matches("[0-9]+")){
                        res = false;
                    }else{
                        Bota bota = new Bota(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                            Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                        bota.setLingueta(novosDados[23]);
                        bota.setPalmilha(novosDados[8]);
                        bota.setFechamento(novosDados[9]);
                        bota.setMaterialDoForro(novosDados[10]);
                        bota.setAlturaDoCano(Integer.parseInt(novosDados[11]));


                        getEstoque().getCalcado().set(pos, bota);

                        res = true;
                    }    
                        
                }else if(op == 1){
                    
                    Chinelo chinelo = new Chinelo(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                    Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                    
                    chinelo.setMaterialTira(novosDados[13]);
                    chinelo.setSolado(novosDados[14]);
                    
                    getEstoque().getCalcado().set(pos, chinelo);

                    res = true;
                }else if(op == 2){
                
                    Chuteira chuteira = new Chuteira(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                    Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                    
                    chuteira.setSuperficie(novosDados[15]);
                    chuteira.setTecnologia(novosDados[16]);
                    chuteira.setLinha(novosDados[17]);
                    chuteira.setFechamento(novosDados[9]);
                    chuteira.setMaterialDoForro(novosDados[10]);

                    getEstoque().getCalcado().set(pos, chuteira);

                    res = true;
                }else if(op == 3){

                    Sandalia sandalia = new Sandalia(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                    Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                    sandalia.setAlturaDoSalto(Integer.parseInt(novosDados[12]));
                    sandalia.setFechamento(novosDados[9]);
                    sandalia.setTipoDeSalto(novosDados[18]);

                    getEstoque().getCalcado().set(pos,sandalia);

                    res = true;
                }else if(op == 4){

                    if(!novosDados[20].matches("[0-9]+")){
                        res = false;
                    }else{
                        SapatoSocial sapato = new SapatoSocial(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                        
                        sapato.setMaterialDoForro(novosDados[10]);
                        sapato.setPalmilha(novosDados[8]);
                        sapato.setAlturaDoSalto(Integer.parseInt(novosDados[20]));
                        sapato.setTipoDeBico(novosDados[19]);

                        getEstoque().getCalcado().set(pos, sapato);

                        res = true;
                    }

                }else if(op == 5){

                    if(!novosDados[11].matches("[0-9]+")){
                        res = false;
                    }else{
                        Tenis  tenis= new Tenis(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                        tenis.setMaterialDoForro(novosDados[10]);
                        tenis.setPamilha(novosDados[8]);
                        tenis.setFechamento(novosDados[9]);
                        tenis.setPisada(novosDados[21]);
                        tenis.setAlturaDoCano(novosDados[11]);
                        tenis.setIndicacao(novosDados[22]);

                        getEstoque().getCalcado().set(pos,tenis);
                        
                        res = true;
                    }

                }
            }
        }
        int size = getEstoque().getCalcado().size();
        System.out.println(getEstoque().getCalcado().get(size-1));
        return res;
    }       
    
	/**
	 * Método que insere venda realizada
	 * @param prod inteiro que indica a posição do produto que será cadastrado
	 * @param cl inteiro que indica a posição do cliente que será cadastrado
	 * @param f inteiro que indica a posição do funcionário que será cadastrado
	 */
    
    public void inserirVenda(int prod,int cl,int f){
        Venda v = new Venda(getEstoque(),getEstoque().getCalcado().get(prod),
                            getClientes().get(cl),getFuncionarios().get(f),dados.getDate());
        System.out.println(getEstoque().getCalcado().get(prod).getCategoria() +
        getClientes().get(cl).getNome() + getFuncionarios().get(f).getNome());
        v.realizarVenda();
        dados.inserirVenda(v, getFinanceiro().getVenda().size() + 1);
    } 


}
