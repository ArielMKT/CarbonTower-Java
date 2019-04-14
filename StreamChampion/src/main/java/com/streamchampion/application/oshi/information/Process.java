package com.streamchampion.application.oshi.information;

import oshi.hardware.GlobalMemory;
import oshi.software.os.OSProcess;
import oshi.util.FormatUtil;

public class Process {

    private int pid;
    private double percentageCPU;
    private double percentageMemory;
    private long virtualSize;
    private long residentSetSize;
    private String name;

    public Process(OSProcess p, GlobalMemory memory) {
        pid = p.getProcessID();
        percentageCPU = 100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime();
        percentageMemory = 100d * p.getResidentSetSize() / memory.getTotal();
        virtualSize = p.getVirtualSize();
        residentSetSize = p.getResidentSetSize();
        name = p.getName();
    }

    public String getName() {
        return name;
    }

    public int getPID() {
        return pid;
    }

    public Double getPercentageCPU() {
        return percentageCPU;
    }

    public Double getPercentageMemory() {
        return percentageMemory;
    }

    public String getVirtualSize() {
        return FormatUtil.formatBytes(virtualSize);
    }

    public String getResidentSetSize() {
        return FormatUtil.formatBytes(residentSetSize);
    }
}