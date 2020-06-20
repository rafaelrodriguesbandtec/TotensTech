package DAO;

import Conexao.ConexaoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Objeto de Aceeso a Dados DAO todas as querys serão executadas dentro desse pacote DAO 
public class UsuarioDAO {

    //Retorno booleano para checar se o usuário esta presente no banco de dados 
    public boolean ChecarLogin(String login, String senha) {

        //abrindo conexão
        Connection con = ConexaoDados.getConnection();
        //PreparedStatement prepara todo os parematros para query
        PreparedStatement stmt = null;
        //ResultSet ira guardar o resultado da consulta que prepared Esta consultando
        ResultSet rs = null;
        //Variavel Checar retornara como true caso o usuaário estaja no banco
        boolean checar = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM Usuario WHERE Email = ? and Senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            //para a query ser executada é necessario ultilzar o comando executeQuery();
            rs = stmt.executeQuery();

            //E por esse if é onde a validação aconteçe já que o resultado da query esta dentro do rs e ele percorre
            //todo banco procurando os dois dados apresentado login e senha
            if (rs.next()) {

                checar = true;

            } else if (!checar) {
                stmt = con.prepareStatement("SELECT * FROM Empresa WHERE Email = ? and Senha = ?");
                stmt.setString(1, login);
                stmt.setString(2, senha);
                //para a query ser executada é necessario ultilzar o comando executeQuery();
                rs = stmt.executeQuery();
                if (rs.next()) {

                    checar = true;

                }
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Ocorreu um erro não foi possivel realizar a consulta", ex);
        } finally {
            //encerrando todas as conexões
            ConexaoDados.closeConnection(con, stmt, rs);
        }

        return checar;

    }

}
