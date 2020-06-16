/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import DAO.LeituraDAO;
import DAO.TotenDAO;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.hardware.CentralProcessor;
import oshi.software.os.OSProcess;


import oshi.hardware.HWDiskStore;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;

import oshi.util.FormatUtil;
import oshi.util.Util;

/**
 *
 * @author Rafael
 */
public class InformacaoTotem {

    private final SystemInfo informacaoSistema = new SystemInfo();
    private final OperatingSystem opSystem = informacaoSistema.getOperatingSystem();
    private final HardwareAbstractionLayer abstraHard = informacaoSistema.getHardware();
    
    
    public Double getCpu() {
        CentralProcessor processoCpu = abstraHard.getProcessor();
        long[] cpu = processoCpu.getSystemCpuLoadTicks();
        Util.sleep(5000);
        return (processoCpu.getSystemCpuLoadBetweenTicks(cpu) * 100d);
    }

    public String getDiscoModelo() {
        HWDiskStore[] discoM = abstraHard.getDiskStores();
        String discoModelo = "";
        for (HWDiskStore disco : discoM) {
            discoModelo = disco.getModel();
        }
        return discoModelo;

    }
  

    public Double getDiscoEspacoLivre() {

        FileSystem file = informacaoSistema.getOperatingSystem().getFileSystem();
        Double discoLivre = 0.0;
        for (OSFileStore s : file.getFileStores()) {
            discoLivre += s.getFreeSpace();
            
        }
        return discoLivre;
    }
     public String getDiscoEspacoLivreString() {

        FileSystem file = informacaoSistema.getOperatingSystem().getFileSystem();
        long discoLivre = 0;
        for (OSFileStore s : file.getFileStores()) {
            discoLivre += s.getFreeSpace();
        }
        return FormatUtil.formatBytesDecimal(discoLivre);
    }
    
     public String getDiscoEspacoUsado() {

        FileSystem file = informacaoSistema.getOperatingSystem().getFileSystem();
        long discoLivre = 0;
        for (OSFileStore s : file.getFileStores()) {
            discoLivre += s.getTotalSpace()-s.getFreeSpace();
        }
        return FormatUtil.formatBytesDecimal(discoLivre);
    }
    
    public String getTipoDeDisco(){
         FileSystem file = informacaoSistema.getOperatingSystem().getFileSystem();
        String tipoDisco = "";
        for (OSFileStore s : file.getFileStores()) {
            tipoDisco = s.getType();
        }
        return tipoDisco;
    }

    public Double getDiscoEspacoTotal() {
        FileSystem file = informacaoSistema.getOperatingSystem().getFileSystem();
        Double discoTotal = 0.0;
        for (OSFileStore s : file.getFileStores()) {
            discoTotal += Double.valueOf(s.getTotalSpace());
           
        }
        return discoTotal;
    }
      public String getDiscoEspacoTotalString() {
        FileSystem file = informacaoSistema.getOperatingSystem().getFileSystem();
        long discoTotal = 0;
        for (OSFileStore s : file.getFileStores()) {
            discoTotal += s.getTotalSpace();

        }
        return FormatUtil.formatBytesDecimal(discoTotal);
    }
     public Double getPorcentagemDisponivelDisco() {
       
        Double discoTotal= (this.getDiscoEspacoLivre()*100d)/this.getDiscoEspacoTotal();
        return discoTotal;
    }
    public Double getPorcentagemUsadaDisco() {
      
        Double discoTotal= 100-((this.getDiscoEspacoLivre()*100d)/this.getDiscoEspacoTotal());
     
        return discoTotal;
    }

    public String getProprietario() {
        OSProcess proc = opSystem.getProcess(opSystem.getProcessId());
        String proprietario = proc.getUser();
        return proprietario;
    }

    public String getSistemaOperacional() {
        String sistemaOp = String.valueOf(informacaoSistema.getOperatingSystem());
        return sistemaOp;
    }

    public Double getMemoria() {
        Double memoriaUsada = (100d * (this.memoriaTot() - this.memoriaDisp()));
        return memoriaUsada / this.memoriaTot();
    }

    public String memoriaDisponivelS() {
        long memoria = abstraHard.getMemory().getAvailable();
        return FormatUtil.formatBytes(memoria);
    }

    private Double memoriaDisp() {
        long memoria = abstraHard.getMemory().getAvailable();
        return Double.valueOf(memoria);
    }

    public String memoriaTotalS() {
        long memoria = abstraHard.getMemory().getTotal();
        return FormatUtil.formatBytes(memoria);
    }

    private Double memoriaTot() {
        long memoria = abstraHard.getMemory().getTotal();
        return Double.valueOf(memoria);
    }

    public String getMarcaTotem() {
        return String.format("%s", abstraHard.getComputerSystem().getManufacturer());
    }

    public String getModeloTotem() {
        return String.format("%s", abstraHard.getComputerSystem().getModel());
    }
    public String getNomeCpu() {
        return String.format("%s",abstraHard.getProcessor().getProcessorIdentifier().getName());
    }
   
   public String getSerialToten() {
        return String.format("%s",abstraHard.getComputerSystem().getSerialNumber());
    }
    
     public Double getTemperatura(){
         Double td= abstraHard.getSensors().getCpuTemperature();
         return td;
     }
     
     
     

    public static void main(String[] args) {
        
        InformacaoTotem totem = new InformacaoTotem();
        
        TotenDAO dao =  new TotenDAO();
        LeituraDAO leiDAO = new LeituraDAO();
        
        System.out.println("Uso cpu: " + totem.getCpu().intValue() + "%");
        System.out.println("total de memoria: " + totem.memoriaTotalS());
        System.out.println("uso memoria: " + totem.getMemoria().intValue() + "%");
        System.out.println("resto de memoria: " + totem.memoriaDisponivelS());
        System.out.println("Modelo do HD: "+totem.getDiscoModelo());
        System.out.println("Nome pc: " + totem.getProprietario());
        System.out.println("Sistema operacional: " + totem.getSistemaOperacional());
        

        System.out.println("Fabricante do totem: "+totem.getMarcaTotem());
        System.out.println("Modelo do totem: "+totem.getModeloTotem());
        System.out.println("Espaço livre no disco: "+totem.getDiscoEspacoLivreString());
        System.out.println("Espaço total no disco: "+totem.getDiscoEspacoTotalString());
        System.out.println("Espaço usado no disco: "+totem.getDiscoEspacoUsado());
        System.out.println("Tipo do formato do disco: "+totem.getTipoDeDisco());
        System.out.println("Porcentagem usada no disco: "+totem.getPorcentagemUsadaDisco()+"%");
        System.out.println("Porcentagem livre no disco: "+totem.getPorcentagemDisponivelDisco()+"%");
        System.out.println("Temperatura cpu: "+totem.getTemperatura());
        System.out.println("Nome da cpu: "+totem.getNomeCpu());
         
        System.out.println("Serial Number: "+totem.getSerialToten());

        //dao.novoTotem(totem);
        //leiDAO.lerDados(totem);
        
        

    }

}
