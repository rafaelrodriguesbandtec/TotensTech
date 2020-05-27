package Controller;
import Model.Totens;

/**
 *
 * @author Italo
 */
public class Leitura extends Totens{
    //Atributos da classe leitura
    private Double leituraMemoria, leituraDisco, leituraCpu, temperaturaCpu, data;

    //Construtor 
    public Leitura(Integer codigoTotem, String fabricante, String modelo, Integer codigoEmpresa, String razaoSocial, String cnpj, String cep, String rua, String numero, String bairro, String cidade, String estado, String complemento) {
        super(codigoTotem, fabricante, modelo, codigoEmpresa, razaoSocial, cnpj, cep, rua, numero, bairro, cidade, estado, complemento);
    }
        
    
    //Métodos da classe
    public void lerDados(){
        //Metodo de leitura de dados, discutir em reunião dados relevantes
    }    
    
    public String exibirDados(){
        String dadosDoTotem = String.format("Codigo do totem: %s \nModelo do Totem: %s \nFabricante do totem: %s", getCodigoTotem(), getModelo(), getFabricante());
        String dadosDaEmpresa = String.format("Codigo da empresa: %s \nCNPJ: %s \nRazão social: %s", getCodigoEmpresa(), getCnpj(), getRazaoSocial());
        String dadosDeLocalizacao = String.format("Cep: %s \nRua: %s \nNúmero: %s \nBairro: %s \nCidade: %s \nEstado: %s \nComplemento: %s", getCep(), getRua(), getNumero(), getBairro(), getCidade(), getEstado(), getComplemento());
        
        return "\nDados da empresa \n"+dadosDaEmpresa+"\nDados do totem \n"+dadosDoTotem+"\nLocalização\n"+dadosDeLocalizacao;
    }
    
    //Getters e Setters da classe leitura
    public Double getLeituraMemoria() {
        return leituraMemoria;
    }

    public void setLeituraMemoria(Double leituraMemoria) {
        this.leituraMemoria = leituraMemoria;
    }

    public Double getLeituraDisco() {
        return leituraDisco;
    }

    public void setLeituraDisco(Double leituraDisco) {
        this.leituraDisco = leituraDisco;
    }

    public Double getLeituraCpu() {
        return leituraCpu;
    }

    public void setLeituraCpu(Double leituraCpu) {
        this.leituraCpu = leituraCpu;
    }

    public Double getTemperaturaCpu() {
        return temperaturaCpu;
    }

    public void setTemperaturaCpu(Double temperaturaCpu) {
        this.temperaturaCpu = temperaturaCpu;
    }

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }   
}
