package com.streamchampion.application.swing;

import com.streamchampion.application.oshi.SystemInformation;
import com.streamchampion.resources.database.InsertOshi;
import com.streamchampion.resources.httpRequest.PostHttpRequest;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Index extends Components {

    private ImageIcon icon = new ImageIcon("src/main/resources/icons/icon.jpeg");

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
                UnsupportedLookAndFeelException ex
        ) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
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

        SystemInformation systemInformation = new SystemInformation();
//        InsertOshi insertOshi = new InsertOshi();

        lblOsOshi.setText(systemInformation.getComputerSystem().getOperatingSystemToString());

        try {
            do {
                lblTempProcessorOshi.setText(systemInformation.getCpu().getCPUTemperature());
                lblUseProcessorOshi.setText(systemInformation.getCpuUsage());
//                lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryAvailable());
                lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryUseInPercentage()
                        + "% / " +
                        systemInformation.getRam().getTotalMemory());
                System.out.println(systemInformation.getCpu().getFansSpeed());
                lblFanRpmOshi.setText(systemInformation.getCpu().getFansSpeed());

                String jsonInputString = "{\"memoryRam\": \"" + systemInformation.getRam().getMemoryUseInPercentage()
                    + "\", \"tempCpu\": \" " + systemInformation.getCpu().getCPUTemperature() + "\"}";
                String url = "http://localhost:7000/oshi";

                new PostHttpRequest().postHttpRequest(jsonInputString, url);

                Thread.sleep(5000);
            } while (test);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
