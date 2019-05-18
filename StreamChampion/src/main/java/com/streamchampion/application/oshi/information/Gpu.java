package com.streamchampion.application.oshi.information;

import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.sensors.Load;
import com.profesorfalken.jsensors.model.sensors.Temperature;

import java.util.List;

public class Gpu {

    public String getTemperatureGPU() {
        List<com.profesorfalken.jsensors.model.components.Gpu> gpuList = JSensors.get.components().gpus;

        if(gpuList.isEmpty())
            return "Not Available";

        Double totalTemp = 0.0;
        Double quantGPU = 0.0;

        for (final com.profesorfalken.jsensors.model.components.Gpu gpu : gpuList) {
            if(gpu.sensors != null) {

//                List<Load> loads = gpu.sensors.loads;
//                for (final Load load : loads) {
//                    System.out.println("Name: " + load.name + " Value: " + load.value);
//                }

                List<Temperature> temps = gpu.sensors.temperatures;
                for (final Temperature temp : temps) {
                    totalTemp += temp.value;
                    quantGPU++;
                }
            }
        }

        if(totalTemp == 0.0)
            return "Not Available";

        return String.valueOf(totalTemp/quantGPU);
    }

    public String getGPUCoreValue() {

        List<com.profesorfalken.jsensors.model.components.Gpu> gpuList = JSensors.get.components().gpus;

        if(gpuList.isEmpty())
            return "Not Available";

        for (final com.profesorfalken.jsensors.model.components.Gpu gpu : gpuList) {
            if(gpu.sensors != null) {

                List<Load> loads = gpu.sensors.loads;
                for (final Load load : loads) {
                    if(load.name == "Load GPU Core Value")
                        return String.valueOf(load.value);
                }
            }
        }

        return "Not Available";
    }

}
