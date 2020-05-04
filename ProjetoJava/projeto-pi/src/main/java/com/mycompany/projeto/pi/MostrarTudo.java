package com.mycompany.projeto.pi;

import java.util.ArrayList;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;
import oshi.util.FormatUtil;
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
        
       
              
        //Atributos e variaveis
        private Double memoriaDisponivel, memoriaTotal;
                   
        private Double temperaturaCpu, freqCpu;
        
        long[] freqs = cpu.getCurrentFreq();
        
        //Registrar informações da CPU
        //Capturar frequencia do CPU
        public void registrarInfoCpu(){
 
            for(int i = 0; i < freqs.length;i++){
      
                freqs[i] = freqs[i] + freqs[i]+ freqs[i] + freqs[i];
                freqCpu = Double.valueOf(freqs[i]); 
            } 
       
              
          temperaturaCpu =  sensor.getCpuTemperature();
        }       
               
        //Regristrar Memória
        public void registrarInfoMemoria(){
            
        memoriaDisponivel = Double.valueOf(GM.getAvailable()/1000000000);    
                  
        memoriaTotal = Double.valueOf(GM.getTotal()/1000000000);   
               
        //memoriaFisica = Double.valueOf(GM.getPhysicalMemory());          
        }
        
        
        public void infoHardware(){
        
        }
        
        
    /* Getter e Setters */                       
    public Double getTemperaturaCpu() {
        return temperaturaCpu;
    }

    public Double getMemoriaTotal() {
        return memoriaTotal;
    }

    /*public String getMemoriaFisica() {
        return memoriaFisica;
    }*/
        
    public Double getMemoriaDisponivel() {
        return memoriaDisponivel;   
    }
    
    public Double getFreqCpu() {
        return freqCpu;
    }
}
