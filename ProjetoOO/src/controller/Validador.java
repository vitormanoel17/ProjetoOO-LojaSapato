package controller;

public class Validador {
    
    public Boolean validarDdd(String ddd){
        if(ddd.length() != 2){
            return false;
        }
        return true;    
    }

    public Boolean validarTelefone(String telefone){
        
        if(telefone.length()!= 9){
            return false;
        }
        
        return true;
    }

    public boolean validarCep(String cep){
        if(cep.length() != 8){
            return false;
        }
        return true;
    }
}
