package Model;
/**
 *
 * @author Italo
 */
public class Totens{
    
    //Atributos do totem
    protected Integer idTotens, fkEmpresa;
    protected String fabricante, modelo, memoria, cpuTotem, espacoEmDisco, serialNumber;
    
    //Getters e Setters
    public Integer getIdTotens() {
        return idTotens;
    }

    public void setIdTotens(Integer idTotens) {
        this.idTotens = idTotens;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getCpuTotem() {
        return cpuTotem;
    }

    public void setCpuTotem(String cpuTotem) {
        this.cpuTotem = cpuTotem;
    }

    public String getEspacoEmDisco() {
        return espacoEmDisco;
    }

    public void setEspacoEmDisco(String espacoEmDisco) {
        this.espacoEmDisco = espacoEmDisco;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }
    
    
    
    
    
   

    
    
}
