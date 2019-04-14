package com.streamchampion.application.oshi.information;

import oshi.hardware.NetworkIF;
import oshi.util.FormatUtil;

public class NetworkInterface {

    private NetworkIF networkIF;

    public NetworkInterface(NetworkIF net) {
        networkIF = net;
    }

    public String[] getIPv4addr() {
        return networkIF.getIPv4addr();
    }

    public String[] getIPv6addr() {
        return networkIF.getIPv6addr();
    }

    public String getName() {
        return networkIF.getName();
    }

    public String getDisplayName() {
        return networkIF.getDisplayName();
    }

    public String getSpeed() {
        return FormatUtil.formatValue(networkIF.getSpeed(), "bps");
    }

    public String getMTU() {
        return String.valueOf(networkIF.getMTU());
    }
}