package com.streamchampion.application.oshi.information;

import oshi.hardware.Baseboard;
import oshi.hardware.Firmware;
import oshi.software.os.OperatingSystem;

public class ComputerSystem {

    private oshi.hardware.ComputerSystem computerSystem;
    private Firmware firmware;
    private Baseboard baseboard;
    private OperatingSystem operatingSystem;

    public ComputerSystem(oshi.hardware.ComputerSystem system, OperatingSystem operatingSystem) {
        computerSystem = system;
        firmware = computerSystem.getFirmware();
        baseboard = computerSystem.getBaseboard();
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystemToString() {
        return operatingSystem.toString();
    }

    public String getManufacturerComputerSystem() {
        return computerSystem.getManufacturer();
    }

    public String getModelComputerSystem() {
        return computerSystem.getModel();
    }

    public String getSerialNumberComputerSystem() {
        return computerSystem.getSerialNumber();
    }

    public String getName() {
        return firmware.getName();
    }

    public String getManufacturerFirmware() {
        return firmware.getManufacturer();
    }

    public String getDescription() {
        return firmware.getDescription();
    }

    public String getVersionFirmware() {
        return firmware.getVersion();
    }

    public String getReleaseDate() {
        return (firmware.getReleaseDate() == null ? "unknown"
            : firmware.getReleaseDate() == null ? "unknown" : firmware.getReleaseDate());
    }

    public String getManufacturerBaseboard() {
        return baseboard.getManufacturer();
    }

    public String getModelBaseboard() {
        return baseboard.getModel();
    }

    public String getVersionBaseboard() {
        return baseboard.getVersion();
    }

    public String getSerialNumberBaseboard() {
        return baseboard.getSerialNumber();
    }
}