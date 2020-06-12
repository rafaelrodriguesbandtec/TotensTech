package Model;
/**
 *
 * @author Italo
 */
public class Totens{
    
    //Atributos do totem
    protected Integer codigoTotem;
    protected String fabricante, modelo, sistemaOperacional;
    
    
    
    
    InformacaoTotem i = new InformacaoTotem();
    
    //Construtor dfa classe totens
    
    
    //Getters e Setters da classe totens
    public Integer getCodigoTotem() {
        return codigoTotem;
    }

    public void setCodigoTotem(Integer codigo) {
        this.codigoTotem = codigo;
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
    
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
   
   

    
    
}
