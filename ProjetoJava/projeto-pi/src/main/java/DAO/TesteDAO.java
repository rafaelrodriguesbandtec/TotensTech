
package DAO;

import Conexao.ConexaoDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteDAO {

    
    public static void main(String[] args){
    //UsuarioDAO u = new UsuarioDAO();
    
    //u.ChecarLogin("cleyson@abreu.com", "876543210");
    
    Connection con = ConexaoDados.getConnection();
        //PreparedStatement prepara todo os parematros para query
        PreparedStatement stmt = null;
        //ResultSet ira guardar o resultado da consulta que prepared Esta consultando
        ResultSet rs = null; 
        
        //stmt.executeQu("select * from [dbo].[Usuario];");
    
    }
    
}
