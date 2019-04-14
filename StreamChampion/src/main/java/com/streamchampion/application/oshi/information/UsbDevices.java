package com.streamchampion.application.oshi.information;

import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.UsbDevice;

public class UsbDevices {

    private HardwareAbstractionLayer hardwareAbstractionLayer;

    public UsbDevices(HardwareAbstractionLayer hardwareAbstractionLayer) {
        this.hardwareAbstractionLayer = hardwareAbstractionLayer;
    }

    public String[] getUSBDevices() {
        UsbDevice[] usbDevices = hardwareAbstractionLayer.getUsbDevices(true);
        String[] usbs = new String[usbDevices.length];
        for(int i = 0; i < usbDevices.length; i++) {
            usbs[i] = usbDevices[i].toString();
        }
        return usbs;
    }
}
