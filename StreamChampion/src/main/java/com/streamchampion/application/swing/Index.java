package com.streamchampion.application.swing;

import com.streamchampion.application.oshi.SystemInformation;
import com.streamchampion.domain.Loggable;
import com.streamchampion.resources.database.InsertOshi;
import com.streamchampion.resources.httpRequest.PostHttpRequest;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Index extends Components {

    private ImageIcon icon = new ImageIcon("src/main/resources/icons/icon.jpeg");
    private SystemInformation systemInformation;

    public Index() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (
            ClassNotFoundException |
                InstantiationException |
                IllegalAccessException |
                UnsupportedLookAndFeelException e
        ) {
            new Loggable().createLogs(e.toString(), "Logs/", "Log");
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        initComponents();
        systemInformation = new SystemInformation();
    }

    //    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StreamChampion");
        getContentPane().setBackground(new java.awt.Color(225, 225, 225));
        setIconImage(icon.getImage());
        setResizable(false);

        btnLogout = new javax.swing.JButton();
        btnLogout.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 14)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(new LineBorder(Color.white, 8, true));
        btnLogout.setBorderPainted(false);
        btnLogout.setFocusPainted(false);
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("saindo...");
                System.exit(1);
            }
        });

        lblWelcome = new javax.swing.JLabel();
        lblWelcome.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 18)); // NOI18N
        lblWelcome.setText("Bem-vindo nome-jogador!");

        createPanels();

    }// </editor-fold>//GEN-END:initComponents

    public void setInformation() {
        boolean test = true;
//        InsertOshi insertOshi = new InsertOshi();

        String strDateFormat = "yyyy-MM-dd";
        String strHourFormat = "HH:mm:ss";
        lblOsOshi.setText(systemInformation.getComputerSystem().getOperatingSystemToString());

        new Thread(() -> {
            try {
                while(test) {
                    System.out.println("thread é nois");
                    lblTempProcessorOshi.setText(systemInformation.getCpu().getCPUTemperature());
                    lblUseProcessorOshi.setText(systemInformation.getCpuUsage() + "%");
                    lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryUseInPercentage()
                            + "% / " +
                            systemInformation.getRam().getTotalMemory());
                    lblFanRpmOshi.setText(systemInformation.getCpu().getFansSpeed());
                    lblTempGpuJSensor.setText(systemInformation.getGpu().getTemperatureGPU());
                    lblUseGpuJSensor.setText(systemInformation.getGpu().getGPUCoreValue());

                    Date date = new Date();
                    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
                    DateFormat hourFormat = new SimpleDateFormat(strHourFormat);

                    final String jsonInputString =
                        "{\"useRam\": \"" + systemInformation.getRam().getMemoryUseInPercentage() + "\"," +
                        "\"tempGPU\": \"" + systemInformation.getGpu().getTemperatureGPU() + "\"," +
                        "\"useGPU\": \" " + systemInformation.getGpu().getGPUCoreValue() + "\"," +
                        "\"useCPU\": \" " + systemInformation.getCpuUsage() + "\"," +
                        "\"useDisc\": \"00\"," +
                        "\"rpmCooler\": \"0\"," +
                        "\"tempCPU\": \" " + systemInformation.getCpu().getCPUTemperature()+ "\"," +
                        "\"usbDevice\": \"TODO\"," +
                        "\"metricDate\": \" " + dateFormat.format(date) + "\"," +
                        "\"metricTime\": \"" + hourFormat.format(date) + "\"}";
                    final String url = "http://35.199.74.137:7000/machine/metric/" + getIdMachine();

                    new PostHttpRequest().postHttpRequest(jsonInputString, url);
                    Thread.sleep(5000);
                }
            }catch(Exception e){
                new Loggable().createLogs(e.toString(), "Logs/", "Log");
                System.out.println(e);
            }
        }).start();
    }

    protected String getMachine() throws Exception{
        return "{\"idMachine\": \"" + getIdMachine() +"\", " +
                "\"motherBoard\": \"" + systemInformation.getComputerSystem().getManufacturerBaseboard() + "\", " +
                "\"os\": \"" + systemInformation.getComputerSystem().getOperatingSystemToString() + "\", " +
                "\"manufacturer\": \"" + systemInformation.getComputerSystem().getManufacturerComputerSystem() + "\", " +
                "\"model\": \"" + systemInformation.getComputerSystem().getModelComputerSystem() + "\"}";
    }

    private String getIdMachine() throws Exception{
        InetAddress ip = InetAddress.getLocalHost();

        return ip.getHostName();
    }

}
