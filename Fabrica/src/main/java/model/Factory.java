
package model;


public class Factory {
    public Pessoa getPessoa(String nome, String sexo){
        if (sexo.equals("M"))
            return new Senhor (nome);
        if (sexo.equals("F"))
            return new Senhora (nome);
        if(sexo.equals(""))
            return new Outros(nome);
        return null;
            
        
        
            
        
    }
    
}
