package controller;

import model.*;
import java.util.*;

public class ControleDados {
    
    private Dados dados = new Dados();

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
    public void removerFuncionanrio(int i){
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

    public void inserirEditarCliente(String[] newDados,int pos, int e){

        // Verifica qual operação será realizada com o cliente: cadastro ou alteração
        if(e == 1){
            dados.getCliente().add(new Cliente(
                                    new Endereco(newDados[1], newDados[2], newDados[3], Integer.parseInt(newDados[4]), newDados[5], newDados[6]),
                                    new Telefone(Integer.parseInt(newDados[7]),Integer.parseInt(newDados[8])),
                                    newDados[0]
                                ));
        }else{
            getClientes().get(pos).setNome(newDados[0]);
            getClientes().get(pos).setEndereco(new Endereco(newDados[1], newDados[2], newDados[3], 
                                                Integer.parseInt(newDados[4]), newDados[5], newDados[6]));
      
            getClientes().get(pos).setTelefone(new Telefone(Integer.parseInt(newDados[7]),
                                                        Integer.parseInt(newDados[8])));
        }
        System.out.println(dados.getCliente().get(dados.getCliente().size()-1));
        
    }

    public void inserirEditarFuncionario(String[] newDados,int pos, int e){

        // Verifica qual operação será realizada com o Funcionário: cadastro ou alteração
        if(e == 1){
            dados.getFuncionario().add(new Funcionario(
                                        new Endereco(newDados[1], newDados[2], newDados[3], Integer.parseInt(newDados[4]), newDados[5], newDados[6]),
                                        new Telefone(Integer.parseInt(newDados[7]),Integer.parseInt(newDados[8])),
                                        newDados[0], 
                                        "Gerente",
                                        dados.getDate(),
                                        2000)
                                    );
        }else{
            getFuncionarios().get(pos).setNome(newDados[0]);
            getFuncionarios().get(pos).setEndereco(new Endereco(newDados[1], newDados[2], newDados[3], 
                                                Integer.parseInt(newDados[4]), newDados[5], newDados[6]));
      
            getFuncionarios().get(pos).setTelefone(new Telefone(Integer.parseInt(newDados[7]),
                                                        Integer.parseInt(newDados[8])));
        }
    }

    public void inserirEditarProduto(String[] novosDados, int op, int escolha,int pos){

        // Verifica qual operação será realizada com o Produto: cadastro ou alteração
        if(escolha == 1){

            // verifica qual tipo de produto foi selecionado
            if(op == 0){

                Bota bota = new Bota(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                bota.setLingueta(novosDados[23]);
                bota.setPalmilha(novosDados[8]);
                bota.setFechamento(novosDados[9]);
                bota.setMaterialDoForro(novosDados[10]);
                bota.setAlturaDoCano(Integer.parseInt(novosDados[11]));


                getEstoque().setCalcado(bota);
            }else if(op == 1){

                Chinelo chinelo = new Chinelo(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                chinelo.setMaterialTira(novosDados[13]);
                chinelo.setSolado(novosDados[14]);

                getEstoque().setCalcado(chinelo);

            }else if(op == 2){

               Chuteira chuteira = new Chuteira(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                
                chuteira.setSuperficie(novosDados[15]);
                chuteira.setTecnologia(novosDados[16]);
                chuteira.setLinha(novosDados[17]);
                chuteira.setFechamento(novosDados[9]);
                chuteira.setMaterialDoForro(novosDados[10]);

                getEstoque().setCalcado(chuteira);

            }else if(op == 3){

                Sandalia sandalia = new Sandalia(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                sandalia.setAlturaDoSalto(Integer.parseInt(novosDados[12]));
                sandalia.setFechamento(novosDados[9]);
                sandalia.setTipoDeSalto(novosDados[18]);

                getEstoque().setCalcado(sandalia);

            }else if(op == 4){
                SapatoSocial sapato = new SapatoSocial(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                        Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                
                sapato.setMaterialDoForro(novosDados[10]);
                sapato.setPalmilha(novosDados[8]);
                sapato.setAlturaDoSalto(Integer.parseInt(novosDados[20]));
                sapato.setTipoDeBico(novosDados[19]);

                getEstoque().setCalcado(sapato);

            }else if(op == 5){

                Tenis  tenis= new Tenis(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                tenis.setMaterialDoForro(novosDados[10]);
                tenis.setPamilha(novosDados[8]);
                tenis.setFechamento(novosDados[9]);
                tenis.setPisada(novosDados[21]);
                tenis.setAlturaDoCano(novosDados[11]);
                tenis.setIndicacao(novosDados[22]);

                getEstoque().setCalcado(tenis);

            }

        }else if (escolha == 2){
            
            if(op == 0){

                Bota bota = new Bota(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                    Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                bota.setLingueta(novosDados[23]);
                bota.setPalmilha(novosDados[8]);
                bota.setFechamento(novosDados[9]);
                bota.setMaterialDoForro(novosDados[10]);
                bota.setAlturaDoCano(Integer.parseInt(novosDados[11]));


                getEstoque().getCalcado().set(pos, bota);
                
            }else if(op == 1){
                
                Chinelo chinelo = new Chinelo(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                
                chinelo.setMaterialTira(novosDados[13]);
                chinelo.setSolado(novosDados[14]);
                
                getEstoque().getCalcado().set(pos, chinelo);

            }else if(op == 2){
               
                Chuteira chuteira = new Chuteira(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                
                chuteira.setSuperficie(novosDados[15]);
                chuteira.setTecnologia(novosDados[16]);
                chuteira.setLinha(novosDados[17]);
                chuteira.setFechamento(novosDados[9]);
                chuteira.setMaterialDoForro(novosDados[10]);

                getEstoque().getCalcado().set(pos, chuteira);

            }else if(op == 3){

                Sandalia sandalia = new Sandalia(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                sandalia.setAlturaDoSalto(Integer.parseInt(novosDados[12]));
                sandalia.setFechamento(novosDados[9]);
                sandalia.setTipoDeSalto(novosDados[18]);

                getEstoque().getCalcado().set(pos,sandalia);

            }else if(op == 4){

                SapatoSocial sapato = new SapatoSocial(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                                        Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));
                
                sapato.setMaterialDoForro(novosDados[10]);
                sapato.setPalmilha(novosDados[8]);
                sapato.setAlturaDoSalto(Integer.parseInt(novosDados[20]));
                sapato.setTipoDeBico(novosDados[19]);

                getEstoque().getCalcado().set(pos, sapato);

            }else if(op == 5){

                Tenis  tenis= new Tenis(novosDados[0], novosDados[1],Integer.parseInt(novosDados[2]), novosDados[3], novosDados[4], 
                                        Float.valueOf(novosDados[5]), novosDados[6], Float.valueOf(novosDados[7]));

                tenis.setMaterialDoForro(novosDados[10]);
                tenis.setPamilha(novosDados[8]);
                tenis.setFechamento(novosDados[9]);
                tenis.setPisada(novosDados[21]);
                tenis.setAlturaDoCano(novosDados[11]);
                tenis.setIndicacao(novosDados[22]);

                getEstoque().getCalcado().set(pos,tenis);
                
            }
        }
        int size = getEstoque().getCalcado().size();
        System.out.println(getEstoque().getCalcado().get(size-1));       
    }

    public void inserirVenda(int prod,int cl,int f){
        Venda v = new Venda(getEstoque(),getEstoque().getCalcado().get(prod),
                            getClientes().get(cl),getFuncionarios().get(f),dados.getDate());
        System.out.println(getEstoque().getCalcado().get(prod).getCategoria() +
        getClientes().get(cl).getNome() + getFuncionarios().get(f).getNome());
        v.realizarVenda();
        dados.inserirVenda(v, getFinanceiro().getVenda().size() + 1);
        getClientes().get(cl).listarCompras();
        System.out.println(getClientes().get(cl).getQuantCompras());
    } 


}
