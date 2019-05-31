package com.streamchampion.application.oshi.information;

import oshi.hardware.GlobalMemory;
import oshi.util.FormatUtil;

public class Ram {

    private GlobalMemory globalMemory;

    public Ram(GlobalMemory memory) {
        globalMemory = memory;
    }

    public String getMemoryAvailable() {
        return FormatUtil.formatBytes(globalMemory.getAvailable());
    }

    public String getTotalMemory() {
        return FormatUtil.formatBytes(globalMemory.getTotal());
    }

    public String getMemoryUseInPercentage() {
        Long available = globalMemory.getAvailable();
        Long total = globalMemory.getTotal();
        Double percentage = (((total - available.doubleValue())/total)*100);
        return String.valueOf(percentage.intValue());
    }
}