package com.streamchampion.application.oshi.information;

import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import oshi.software.os.OperatingSystem;

public class Network {

    private HardwareAbstractionLayer hardwareAbstractionLayer;
    private OperatingSystem operatingSystem;

    public Network(HardwareAbstractionLayer hardwareAbstractionLayer, OperatingSystem operatingSystem) {
        this.hardwareAbstractionLayer = hardwareAbstractionLayer;
        this.operatingSystem = operatingSystem;
    }

    public String getNetworkHostName() {
        return operatingSystem.getNetworkParams().getHostName();
    }
    public String getNetworkDomainName() {
        return operatingSystem.getNetworkParams().getDomainName();
    }
    public String[] getNetworkDNSServers() {
        return operatingSystem.getNetworkParams().getDnsServers();
    }
    public String getNetworkIpv4DefaultGateway() {
        return operatingSystem.getNetworkParams().getIpv4DefaultGateway();
    }
    public String getNetworkIpv6DefaultGateway() {
        return operatingSystem.getNetworkParams().getIpv6DefaultGateway();
    }

    public NetworkInterface[] getIPv4addrrs() {
        NetworkIF[] networkIFs = hardwareAbstractionLayer.getNetworkIFs();
        NetworkInterface[] networkInterfaces = new NetworkInterface[networkIFs.length];

        for (int i = 0; i < networkIFs.length; i++) {
            networkInterfaces[i] = new NetworkInterface(networkIFs[i]);
        }

        return networkInterfaces;
    }
}
