/**
 * MIT License
 *
 * Copyright (c) 2010 - 2020 The OSHI Project Contributors: https://github.com/oshi/oshi/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package TesteAPI;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;
import oshi.hardware.CentralProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oshi.software.os.OSProcess;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.util.FormatUtil;
import oshi.util.Util;

public class SystemInfoTest {

    private SystemInfo informacaoSistema = new SystemInfo();
    private OperatingSystem opSystem = informacaoSistema.getOperatingSystem();
    private HardwareAbstractionLayer abstraHard = informacaoSistema.getHardware();

    public Double getCpu() {
        CentralProcessor processo = abstraHard.getProcessor();
        long[] tiks = processo.getSystemCpuLoadTicks();
        Util.sleep(1000);
        Double cpu=processo.getSystemCpuLoadBetweenTicks(tiks) * 100d;
        return cpu;
    }

    public String discoModelo() {
        HWDiskStore[] ds = abstraHard.getDiskStores();
        String discoU = "";
        for (HWDiskStore disco : ds) {
            discoU = disco.getModel();

        }
        return discoU;

    }



    public Double getMemoria() {
         Double memoriaUsada=(100d * (this.memoriaTot() - this.memoriaDisp()));
        return memoriaUsada/ this.memoriaTot();
    }

    public String memoriaDisponivelS() {
        long memoria=abstraHard.getMemory().getAvailable();
        return FormatUtil.formatBytes(memoria);
    }

    private long memoriaDisp() {
        long memoria=abstraHard.getMemory().getAvailable();
        return memoria;
    }

    public String memoriaTotalS() {
        long memoria=abstraHard.getMemory().getTotal();
        return FormatUtil.formatBytes(memoria);
    }

    private long memoriaTot() {
        long memoria=abstraHard.getMemory().getTotal();
        return memoria;
    }

    public static void main(String[] args) {
        SystemInfoTest test = new SystemInfoTest();
        System.out.println("Uso cpu: " + test.getCpu().intValue() + "%");
        System.out.println("total de memoria: " + test.memoriaTotalS());

        System.out.println("uso memoria:" + test.getMemoria().intValue() + "%");
        System.out.println("resto de memoria:" + test.memoriaDisponivelS());
        System.out.println(test.discoModelo());

    }

}
