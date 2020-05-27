package Model;
/**
 *
 * @author Italo
 */
public class Empresa {
    //Atributos da empresa
    protected Integer codigoEmpresa;
    protected String razaoSocial, cnpj, cep, rua, numero, bairro, cidade, estado, complemento;

    //Contrutor da empresa
    public Empresa(Integer codigoEmpresa, String razaoSocial, String cnpj, String cep, String rua, String numero, String bairro, String cidade, String estado, String complemento) {
        this.codigoEmpresa = codigoEmpresa;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }
    
 
    //Getters e Setters

    public Integer getCondigo() {
        return codigoEmpresa;
    }

    public void setCondigo(Integer codigoEmpresa) {
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
