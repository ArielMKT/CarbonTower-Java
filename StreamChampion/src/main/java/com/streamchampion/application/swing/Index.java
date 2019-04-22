package com.streamchampion.application.swing;

import com.streamchampion.application.oshi.SystemInformation;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends Components {

    private ImageIcon icon = new ImageIcon("src/main/resources/icons/icon.jpeg");

    public Index() {
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

    public void setInformation(){
        boolean test = true;

        SystemInformation systemInformation = new SystemInformation();

        lblOsOshi.setText(systemInformation.getComputerSystem().getOperatingSystemToString());

        try {
            do{
                lblTempProcessorOshi.setText(systemInformation.getCpu().getCPUTemperature());
                lblUseProcessorOshi.setText(systemInformation.getCpuUsage());
//                lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryAvailable());
                lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryUseInPercentage()
                    + "% / " +
                    systemInformation.getRam().getTotalMemory());
                System.out.println(systemInformation.getCpu().getFansSpeed());
                lblFanRpmOshi.setText(systemInformation.getCpu().getFansSpeed());
                Thread.sleep(5000);
            }while (test);
        }catch(InterruptedException e){

        }
    }

}
