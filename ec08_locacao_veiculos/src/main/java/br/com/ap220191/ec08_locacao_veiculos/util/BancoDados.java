package br.com.ap220191.ec08_locacao_veiculos.util;

import java.io.FileWriter;
import java.io.PrintWriter;

public class BancoDados {
    
    public void salvarCliente(){
    }
    
    public void salvarAdministrador(){
        FileWriter fw;
        PrintWriter pw;
        
        try{
            fw = new FileWriter("bancoDados/Administrador.txt");
            pw = new PrintWriter(fw);
            
        }catch(Exception ex){
            
        }
        
    }
    
    public void salvarMotoristas(){
    }
    
    public void salvarVeiculos(){
    }
    
    
}
