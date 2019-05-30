package com.streamchampion.application.oshi;

import com.streamchampion.application.oshi.information.*;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.text.DecimalFormat;

public class SystemInformation {

    private SystemInfo systemInfo;
    private HardwareAbstractionLayer hardwareAbstractionLayer;
    private OperatingSystem operatingSystem;
    private ComputerSystem computerSystem;
    private Cpu cpu;
    private Network network;
    private Processes processes;
    private Ram ram;
    private UsbDevices usbDevices;
    private Gpu gpu;

    public String getCpuUsage(){
        double us = hardwareAbstractionLayer.getProcessor().getSystemCpuLoad();
        DecimalFormat deci = new DecimalFormat("0");
        return deci.format(us * 100);
    }

    public SystemInformation() {
        systemInfo = new SystemInfo();
        hardwareAbstractionLayer = systemInfo.getHardware();
        operatingSystem = systemInfo.getOperatingSystem();
        computerSystem = new ComputerSystem(hardwareAbstractionLayer.getComputerSystem(), operatingSystem);
        cpu = new Cpu(hardwareAbstractionLayer.getProcessor(), hardwareAbstractionLayer.getSensors());
        network = new Network(hardwareAbstractionLayer, operatingSystem);
        processes = new Processes(operatingSystem, hardwareAbstractionLayer.getMemory());
        ram = new Ram(hardwareAbstractionLayer.getMemory());
        usbDevices = new UsbDevices(hardwareAbstractionLayer);
        gpu = new Gpu();
    }

    public Gpu getGpu() { return gpu; }

    public ComputerSystem getComputerSystem() {
        return computerSystem;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Network getNetwork() {
        return network;
    }

    public Processes getProcesses() {
        return processes;
    }

    public Ram getRam() {
        return ram;
    }

    public UsbDevices getUsbDevices() {
        return usbDevices;
    }
}