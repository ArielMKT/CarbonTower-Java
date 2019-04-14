package com.streamchampion.application.oshi.information;

import oshi.hardware.CentralProcessor;
import oshi.hardware.Sensors;
import oshi.util.FormatUtil;
import oshi.util.Util;

import java.util.Arrays;

public class Cpu {

    private CentralProcessor processor;
    private Sensors sensors;

    public Cpu(CentralProcessor processor, Sensors sensors) {
        this.processor = processor;
        this.sensors = sensors;
    }

    private static void print(CentralProcessor processor) {

        long[] prevTicks = processor.getSystemCpuLoadTicks();
        long[] ticks = processor.getSystemCpuLoadTicks();
        System.out.println("CPU, IOWait, and IRQ ticks @ 1 sec:" + Arrays.toString(ticks));
        long user =
            ticks[CentralProcessor.TickType.USER.getIndex()] - prevTicks[CentralProcessor.TickType.USER.getIndex()];
        long nice =
            ticks[CentralProcessor.TickType.NICE.getIndex()] - prevTicks[CentralProcessor.TickType.NICE.getIndex()];
        long sys =
            ticks[CentralProcessor.TickType.SYSTEM.getIndex()] - prevTicks[CentralProcessor.TickType.SYSTEM.getIndex()];
        long idle =
            ticks[CentralProcessor.TickType.IDLE.getIndex()] - prevTicks[CentralProcessor.TickType.IDLE.getIndex()];
        long iowait =
            ticks[CentralProcessor.TickType.IOWAIT.getIndex()] - prevTicks[CentralProcessor.TickType.IOWAIT.getIndex()];
        long irq =
            ticks[CentralProcessor.TickType.IRQ.getIndex()] - prevTicks[CentralProcessor.TickType.IRQ.getIndex()];
        long softirq =
            ticks[CentralProcessor.TickType.SOFTIRQ.getIndex()] - prevTicks[CentralProcessor.TickType.SOFTIRQ.getIndex()];
        long steal =
            ticks[CentralProcessor.TickType.STEAL.getIndex()] - prevTicks[CentralProcessor.TickType.STEAL.getIndex()];
        long totalCpu = user + nice + sys + idle + iowait + irq + softirq + steal;
        double[] loadAverage = processor.getSystemLoadAverage(3);
        long freq = processor.getVendorFreq();

        System.out.println("Uptime: " + FormatUtil.formatElapsedSecs(processor.getSystemUptime()));
        System.out.println(
            "Context Switches/Interrupts: " + processor.getContextSwitches() + " / " + processor.getInterrupts());

        System.out.println("CPU, IOWait, and IRQ ticks @ 0 sec:" + Arrays.toString(prevTicks));
        // Wait a second...
        Util.sleep(1000);

        System.out.format(
            "User: %.1f%% Nice: %.1f%% System: %.1f%% Idle: %.1f%% IOwait: %.1f%% IRQ: %.1f%% SoftIRQ: %.1f%% Steal: %.1f%%%n",
            100d * user / totalCpu, 100d * nice / totalCpu, 100d * sys / totalCpu, 100d * idle / totalCpu,
            100d * iowait / totalCpu, 100d * irq / totalCpu, 100d * softirq / totalCpu, 100d * steal / totalCpu);

        System.out.format("CPU load: %.1f%% (OS MXBean)%n", processor.getSystemCpuLoad() * 100);

        System.out.println("CPU load averages:" + (loadAverage[0] < 0 ? " N/A" : String.format(" %.2f", loadAverage[0]))
            + (loadAverage[1] < 0 ? " N/A" : String.format(" %.2f", loadAverage[1]))
            + (loadAverage[2] < 0 ? " N/A" : String.format(" %.2f", loadAverage[2])));
        // per core CPU
        StringBuilder procCpu = new StringBuilder("CPU load per processor:");
        System.out.println(procCpu.toString());


        if (freq > 0) {
            System.out.println("Max Frequency: " + FormatUtil.formatHertz(freq));
        }

    }

    public String getProcessor() {
        return processor.toString();
    }

    public String getPhysicalProcessorCount() {
        return String.valueOf(processor.getPhysicalProcessorCount());
    }

    public String getLogicalProcessorCount() {
        return String.valueOf(processor.getLogicalProcessorCount());
    }

    public String getProcessorID() {
        return processor.getProcessorID();
    }

    public String getIdentifier() {
        return processor.getIdentifier();
    }

    public String getFamily() {
        return processor.getFamily();
    }

    public String getInterrupts() {
        Long interrupts = processor.getInterrupts();
        return interrupts.toString();
    }

    public String getContextSwitches() {
        Long contextSwitches = processor.getContextSwitches();
        return contextSwitches.toString();
    }

    public String getUpTime() {
        return FormatUtil.formatElapsedSecs(processor.getSystemUptime());
    }

    public String getSystemCPULoad() {
        Double cpuLoad = processor.getSystemCpuLoad() * 100;
        return cpuLoad.toString();
    }

    public String getMaxFrequency() {
        long freq = processor.getVendorFreq();
        return FormatUtil.formatHertz(freq);
    }

    public String getCPUTemperature() {
        return String.valueOf(sensors.getCpuTemperature());
    }

    public String getFansSpeed() {
        return Arrays.toString(sensors.getFanSpeeds());
    }

    public String getCPUVoltage() {
        return String.valueOf(sensors.getCpuVoltage());
    }

}