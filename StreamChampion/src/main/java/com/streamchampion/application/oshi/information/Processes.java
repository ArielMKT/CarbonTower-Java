package com.streamchampion.application.oshi.information;

import oshi.hardware.GlobalMemory;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

import java.util.Arrays;
import java.util.List;

public class Processes {

    private OperatingSystem operatingSystem;
    private GlobalMemory globalMemory;

    public Processes(OperatingSystem os, GlobalMemory memory) {
        operatingSystem = os;
        globalMemory = memory;
    }

    public Process[] getProcesses(int limit) {
        List<OSProcess> procs = Arrays.asList(operatingSystem.getProcesses(limit, OperatingSystem.ProcessSort.CPU));
        Process[] processes = new Process[procs.size()];
        for (int i = 0; i < procs.size(); i++) {
            processes[i] = new Process(procs.get(i), globalMemory);
        }
        return processes;
    }
}