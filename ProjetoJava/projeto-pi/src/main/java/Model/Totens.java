package Model;
/**
 *
 * @author Italo
 */
public class Totens{
    
    //Atributos do totem
    protected Integer codigoTotem;
    protected String fabricante, modelo;

    //Construtor dfa classe totens
    public Totens(Integer codigoTotem, String fabricante, String modelo) {
        this.codigoTotem = codigoTotem;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    
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
}
