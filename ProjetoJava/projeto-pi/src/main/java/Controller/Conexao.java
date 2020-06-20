package Controller;

import org.apache.commons.dbcp2.BasicDataSource;
/**
 *
 * @author Italo
 */
public class Conexao {
    private BasicDataSource dataSource;

    public Conexao() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://svrtotenstech.database.windows.net:1433;database=bdTotensTech;user=localadmin@svrtotenstech;password=#Gfgrupo5b;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        dataSource.setUsername("localadmin");
        dataSource.setPassword("#Gfgrupo5b");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}