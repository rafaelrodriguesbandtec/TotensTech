package Controller;

import Model.Totens;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class TotensRowMapper implements RowMapper<Totens>{

    @Override
    public Totens mapRow(ResultSet rs, int rowNum) throws SQLException {
        Totens toten = new Totens();
        toten.setIdTotens(rs.getInt("idTotens"));
        toten.setFabricante(rs.getString("Fabricante"));
        toten.setModelo(rs.getString("Modelo"));
        toten.setMemoria(rs.getString("Memoria"));
        toten.setCpuTotem(rs.getString("CpuToten"));
        toten.setEspacoEmDisco(rs.getString("EspacoEmDisco"));
        toten.setSerialNumber(rs.getString("SerialNumber"));
        return toten;
    }
    
}
