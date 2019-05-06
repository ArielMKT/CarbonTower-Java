package com.streamchampion.application.swing;

import com.streamchampion.application.oshi.SystemInformation;
import com.streamchampion.resources.database.InsertOshi;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import com.google.gson.Gson;

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

    public void setInformation() {
        boolean test = true;

        SystemInformation systemInformation = new SystemInformation();
        InsertOshi insertOshi = new InsertOshi();

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

                String params = "details={\"memoryRam\":\" " +
                        systemInformation.getRam().getMemoryUseInPercentage() + "\",\"tempCpu\":\" " +
                        systemInformation.getCpu().getCPUTemperature() + "\"} ";

                URL url = new URL("http://localhost:7000/test");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type", "application/json; utf-8");
                con.setRequestProperty("Accept", "application/json");
                con.setDoOutput(true);
                String jsonInputString = "{\"memoryRam\": \"" + systemInformation.getRam().getMemoryUseInPercentage()
                        + "\", \"tempCpu\": \" " + systemInformation.getCpu().getCPUTemperature() + "\"}";

                try (OutputStream os = con.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }

                try (BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), "utf-8"))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    int responseCode = con.getResponseCode();
                    System.out.println(responseCode + " " + response.toString());
                }

                //insertOshi.insertOshi(
                //        systemInformation.getRam().getMemoryUseInPercentage(),
                //        systemInformation.getCpu().getFansSpeed(),
                //        systemInformation.getCpu().getCPUTemperature()
                //);

                Thread.sleep(5000);
            } while (test);
        } catch (Exception e) {

        }
    }

}
