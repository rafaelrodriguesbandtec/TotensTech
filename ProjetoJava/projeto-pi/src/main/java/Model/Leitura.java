package Model;

public class Leitura {
    private Integer codigoLeitura, temperatura, fkToten;
    private String data;
    private Double LeituraMemoria, LeituraDisco, LeituraCpu;

    public Integer getCodigoLeitura() {
        return codigoLeitura;
    }

    public void setCodigoLeitura(Integer codigoLeitura) {
        this.codigoLeitura = codigoLeitura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getFkToten() {
        return fkToten;
    }

    public void setFkToten(Integer fkToten) {
        this.fkToten = fkToten;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getLeituraMemoria() {
        return LeituraMemoria;
    }

    public void setLeituraMemoria(Double LeituraMemoria) {
        this.LeituraMemoria = LeituraMemoria;
    }

    public Double getLeituraDisco() {
        return LeituraDisco;
    }

    public void setLeituraDisco(Double LeituraDisco) {
        this.LeituraDisco = LeituraDisco;
    }

    public Double getLeituraCpu() {
        return LeituraCpu;
    }

    public void setLeituraCpu(Double LeituraCpu) {
        this.LeituraCpu = LeituraCpu;
    }
    
    
}
