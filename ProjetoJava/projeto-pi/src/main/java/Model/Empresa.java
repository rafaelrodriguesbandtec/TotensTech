package Model;
/**
 *
 * @author Italo
 */
public class Empresa extends Endereco {
    //Atributos da empresa
    protected Integer codigoEmpresa;
    protected String nomeEmpresa,razaoSocial, cnpj;

    //Contrutor da empresa
    public Empresa(Integer codigoEmpresa, String nomeEmpresa, String razaoSocial, String cnpj, String cep, String rua, String numero, String bairro, String cidade, String estado, String complemento) {
        super(cep, rua, numero, bairro, cidade, estado, complemento);
        this.codigoEmpresa = codigoEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
 
    //Getters e Setters
    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
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
}
