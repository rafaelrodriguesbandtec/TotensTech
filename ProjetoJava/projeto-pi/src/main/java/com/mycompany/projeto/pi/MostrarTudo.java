package com.mycompany.projeto.pi;

import java.util.ArrayList;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;
//import oshi.software.os.NetworkParams;

public class MostrarTudo {
   
    SystemInfo systemInfo = new SystemInfo();
    //Interface com informações sobre o sistema
        
        HardwareAbstractionLayer hardwareInfo = systemInfo.getHardware();
        //Interface com informações sobre os componentes apartir dessa interface vamos 
        //usar classes para pegar informações de cada componente
        
        CentralProcessor cpu = hardwareInfo.getProcessor();
        //Classe de abstração do CPU
        
        Sensors sensor = hardwareInfo.getSensors();
        //Informações dos sensores (Usaremos a temperatura)

   
        
        GlobalMemory GM = hardwareInfo.getMemory();
        //Informações da memória
       
        //NetworkParams net = systemInfo.getOperatingSystem().getNetworkParams();
        //Informações placa de rede e sistema (Ip etc)
       
        
       // private String    memoriaTotal , memoriaFisica ;
        
        private Double memoriaDisponivel;
                
        private Double temperaturaCpu;
        
        private List freqCpu = new ArrayList<>(); 

         
    
        public void verificarMemoriaDisponivel(){
        memoriaDisponivel = Double.valueOf(GM.getAvailable()/1000000000);    
        
              //double recebelonge = (double) variavelLong
        
          
        freqCpu.add(cpu.getCurrentFreq());
           
                  
        
        temperaturaCpu =  sensor.getCpuTemperature();
               
        //memoriaTotal = String.format("Memória total: %.2f", Double.valueOf(GM.getTotal()));   
               
        //memoriaFisica = String.format("Memória fisica: %.2f", Double.valueOf(GM.getPhysicalMemory()));          
        }

    public Double getTemperaturaCpu() {
        return temperaturaCpu;
    }

   /* public String getMemoriaTotal() {
        return memoriaTotal;
    }*/

    /*public String getMemoriaFisica() {
        return memoriaFisica;
    }*/
        
    public Double getMemoriaDisponivel() {
        return memoriaDisponivel;   
    }
    
    public List getFreqCpu() {
        return freqCpu;
    }
}


