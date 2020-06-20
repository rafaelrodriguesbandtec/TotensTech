package Controller;

import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class UsuarioRowMapper implements RowMapper<Usuario>{

    @Override
    public Usuario mapRow(ResultSet rs, int i) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setCodigoUsuario(rs.getInt("idUsuario"));
        usuario.setNome(rs.getString("Nome"));
        usuario.setCpf(rs.getString("Cpf"));
        usuario.setEmail(rs.getString("Email"));
        usuario.setSenha(rs.getString("Senha"));
        usuario.setNivelAcesso(rs.getInt("NivelAcesso"));
        usuario.setFkEmpresa(rs.getInt("fkEmpresa"));
        usuario.setToken(rs.getString("Token"));
        return usuario;
    }
    
}
