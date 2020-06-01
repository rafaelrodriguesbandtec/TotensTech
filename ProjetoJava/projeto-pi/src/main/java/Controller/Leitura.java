package Controller;
import Model.Empresa;
import Model.Totens;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Italo
 */
public class Leitura{
    //Atributos da classe leitura
    private Double leituraMemoria, leituraDisco, leituraCpu, temperaturaCpu;
    
    //Data atual do computador
    DateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    
    //Métodos da classe
    public void lerDados(){
        //Metodo de leitura de dados, discutir em reunião dados relevantes
        
    }    
    
    public String exibirDados(Totens totem, Empresa empresa){
        String dadosDoTotem = String.format("Codigo do totem: %s \nModelo do Totem: %s \nFabricante do totem: %s", totem.getCodigoTotem(), totem.getModelo(), totem.getFabricante());
        String dadosDaEmpresa = String.format("Codigo da empresa: %s \nCNPJ: %s \nRazão social: %s", empresa.getCodigoEmpresa(), empresa.getCnpj(), empresa.getRazaoSocial());
        String dadosDeLocalizacao = String.format("Cep: %s \nRua: %s \nNúmero: %s \nBairro: %s \nCidade: %s \nEstado: %s \nComplemento: %s", empresa.getCep(), empresa.getRua(), empresa.getNumero(), empresa.getBairro(), empresa.getCidade(), empresa.getEstado(), empresa.getComplemento());
        
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
}
