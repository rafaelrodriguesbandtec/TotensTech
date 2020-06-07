/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.hardware.CentralProcessor;
import oshi.software.os.OSProcess;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
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
        return  (processoCpu.getSystemCpuLoadBetweenTicks(cpu) * 100d);
    }

    public String discoModelo() {
        HWDiskStore[] discoM = abstraHard.getDiskStores();
        String discoModelo = "";
        for (HWDiskStore disco : discoM) {
            discoModelo = disco.getModel();
        }
        return discoModelo;

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

    public Double getUsoDisco() {
        return 0.0;
    }

    public static void main(String[] args) {
        InformacaoTotem totem = new InformacaoTotem();
        System.out.println("Uso cpu: " + totem.getCpu().intValue() + "%");
        System.out.println("total de memoria: " + totem.memoriaTotalS());
        System.out.println("uso memoria:" + totem.getMemoria().intValue() + "%");
        System.out.println("resto de memoria:" + totem.memoriaDisponivelS());
        System.out.println(totem.discoModelo());
        System.out.println("Nome pc: " + totem.getProprietario());
        System.out.println("Sistema operacional: " + totem.getSistemaOperacional());
        System.out.println(totem.getUsoDisco());

    }

}
