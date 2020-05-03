package Conexao;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConexaoDados {
    private final BasicDataSource dataSource;

    public ConexaoDados(){
        this.dataSource = new BasicDataSource();
        //dataSource​.setDriverClassName("org.h2.Driver");
        //dataSource​.setUrl("jdbc:h2:file:~/testedb");  
        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource​.setUrl("jdbc:mysql://localhost:3306/aula01?useTimezone=true&serverTimezone=UTC");  
        dataSource​.setUsername("root");
        dataSource​.setPassword("bandtec");
    }
   
    public BasicDataSource getDataSource(){
        return dataSource;
    }
}
