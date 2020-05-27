package Model;
/**
 *
 * @author Italo
 */
public class Usuario extends Empresa{
    //Atributos da classe Usuario 
    private Integer codigoUsuario, nivelAcesso;
    private String nome, cpf, login, senha;

    //Construtor da classe Usuario
    public Usuario(Integer codigoUsuario, Integer nivelAcesso, String nome, String cpf, String login, String senha, Integer codigoEmpresa, String razaoSocial, String cnpj, String cep, String rua, String numero, String bairro, String cidade, String estado, String complemento) {
        super(codigoEmpresa, razaoSocial, cnpj, cep, rua, numero, bairro, cidade, estado, complemento);
        this.codigoUsuario = codigoUsuario;
        this.nivelAcesso = nivelAcesso;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }
    

    //Getters e Setters da Empresa
    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigo) {
        this.codigoUsuario = codigo;
    }

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
