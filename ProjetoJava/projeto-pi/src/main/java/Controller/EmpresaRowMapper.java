package Controller;

import Model.Empresa;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmpresaRowMapper implements RowMapper<Empresa>{

    @Override
    public Empresa mapRow(ResultSet rs, int i) throws SQLException {
        Empresa empresa = new Empresa();
        
        empresa.setIdEmpresa(rs.getInt("idEmpresa"));
        empresa.setRazaoSocial(rs.getString("RazaoSocial"));
        empresa.setCnpj(rs.getString("Cnpj"));
        empresa.setEmail(rs.getString("Email"));
        empresa.setSenha(rs.getString("Senha"));
        empresa.setFkEndereco(rs.getInt("fkEndereco"));
        return empresa;
    }
    
}
