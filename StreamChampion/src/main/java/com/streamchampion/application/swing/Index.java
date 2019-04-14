package com.streamchampion.application.swing;

import com.streamchampion.application.oshi.SystemInformation;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame {

    private ImageIcon icon = new ImageIcon("icon.jpeg");
    private JButton btnLogout;
    private JPanel panelTexts;
    private JPanel panelResultTexts;
    private JLabel lblFanRpm;
    private JLabel lblFanRpmOshi;
    private JLabel lblMemoryRam;
    private JLabel lblMemoryRamOshi;
    private JLabel lblOsOshi;
    private JLabel lblTempGpu;
    private JLabel lblTempGpuJSensor;
    private JLabel lblTempProcessor;
    private JLabel lblTempProcessorOshi;
    private JLabel lblUseGpu;
    private JLabel lblUseGpuJSensor;
    private JLabel lblUseProcessor;
    private JLabel lblUseProcessorOshi;
    private JLabel lblWelcome;

    private Index() {
        initComponents();
    }
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("saindo...");
                System.exit(1);
            }
        });

        lblWelcome = new javax.swing.JLabel();
        panelTexts = new javax.swing.JPanel();
        lblFanRpmOshi = new javax.swing.JLabel();
        lblUseProcessorOshi = new javax.swing.JLabel();
        lblTempProcessorOshi = new javax.swing.JLabel();
        lblMemoryRamOshi = new javax.swing.JLabel();
        lblTempGpuJSensor = new javax.swing.JLabel();
        lblUseGpuJSensor = new javax.swing.JLabel();
        panelResultTexts = new javax.swing.JPanel();
        lblFanRpm = new javax.swing.JLabel();
        lblUseProcessor = new javax.swing.JLabel();
        lblTempProcessor = new javax.swing.JLabel();
        lblMemoryRam = new javax.swing.JLabel();
        lblTempGpu = new javax.swing.JLabel();
        lblUseGpu = new javax.swing.JLabel();
        lblOsOshi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StreamChampion");
        getContentPane().setBackground(new java.awt.Color(225, 225, 225));
        setIconImage(icon.getImage());
        setResizable(false);

        btnLogout.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 14)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(new LineBorder(Color.white, 8, true));
        btnLogout.setBorderPainted(false);
        btnLogout.setFocusPainted(false);

        lblWelcome.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 18)); // NOI18N
        lblWelcome.setText("Bem-vindo nome-jogador!");

        panelTexts.setBackground(new java.awt.Color(225, 225, 225));
        javax.swing.GroupLayout panelTextsLayout = new javax.swing.GroupLayout(panelTexts);
        panelTexts.setLayout(panelTextsLayout);
        panelTextsLayout.setHorizontalGroup(
            panelTextsLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING
            ).addGroup(
                panelTextsLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        panelTextsLayout.createParallelGroup(
                            javax.swing.GroupLayout.Alignment.LEADING,
                            false
                        ).addComponent(
                            lblTempGpuJSensor,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE
                        ).addComponent(
                            lblFanRpmOshi,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            134,
                            javax.swing.GroupLayout.PREFERRED_SIZE
                        ).addGroup(
                            panelTextsLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(
                                    lblMemoryRamOshi,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    140,
                                    javax.swing.GroupLayout.PREFERRED_SIZE
                                ).addGroup(
                                javax.swing.GroupLayout.Alignment.LEADING,
                                panelTextsLayout.createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.TRAILING,
                                    false
                                ).addComponent(lblUseProcessorOshi,
                                    javax.swing.GroupLayout.Alignment.LEADING,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE
                                ).addComponent(
                                    lblTempProcessorOshi,
                                    javax.swing.GroupLayout.Alignment.LEADING,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    134,
                                    javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                            )
                        ).addComponent(
                            lblUseGpuJSensor,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE))
                    .addGap(105, 105, 105))
        );
        panelTextsLayout.setVerticalGroup(
            panelTextsLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING
            ).addGroup(
                panelTextsLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                        lblTempProcessorOshi,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        33,
                        javax.swing.GroupLayout.PREFERRED_SIZE
                    ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblUseProcessorOshi,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    33,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblMemoryRamOshi,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    40,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblFanRpmOshi,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    39,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblTempGpuJSensor,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    33,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblUseGpuJSensor,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    33,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addContainerGap()
            )
        );

        lblFanRpm.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblFanRpm.setText("Velocidade do Cooler");

        lblUseProcessor.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblUseProcessor.setText("Uso do Processador: ");

        lblTempProcessor.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblTempProcessor.setText("Temperatura do Processador: ");

        lblMemoryRam.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblMemoryRam.setText("Memória RAM:");

        lblTempGpu.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblTempGpu.setText("Temperatura da placa de vídeo: ");

        lblUseGpu.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblUseGpu.setText("Uso da placa de vídeo: ");

        panelResultTexts.setBackground(new java.awt.Color(225, 225, 225));
        javax.swing.GroupLayout panelResultTextsLayout = new javax.swing.GroupLayout(panelResultTexts);
        panelResultTexts.setLayout(panelResultTextsLayout);
        panelResultTextsLayout.setHorizontalGroup(
            panelResultTextsLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING
                ).addGroup(
                panelResultTextsLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        panelResultTextsLayout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING
                            ).addComponent(
                            lblTempProcessor
                        ).addComponent(
                            lblUseProcessor
                        ).addComponent(
                            lblUseGpu
                        ).addComponent(
                            lblMemoryRam
                        ).addComponent(
                            lblFanRpm
                        ).addComponent(
                            lblTempGpu
                        )
                    ).addContainerGap()
            )
        );
        panelResultTextsLayout.setVerticalGroup(
            panelResultTextsLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING
                ).addGroup(
                panelResultTextsLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                        lblTempProcessor,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        33,
                        javax.swing.GroupLayout.PREFERRED_SIZE
                    ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblUseProcessor,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    33,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblMemoryRam,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    33,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblFanRpm,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    39,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblTempGpu,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    33,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED
                ).addComponent(
                    lblUseGpu,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    33,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addContainerGap()
            )
        );

        lblFanRpmOshi.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblFanRpmOshi.setText("xxxx");

        lblUseProcessorOshi.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblUseProcessorOshi.setText("xx%");

        lblTempProcessorOshi.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblTempProcessorOshi.setText("x.x");

        lblMemoryRamOshi.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblMemoryRamOshi.setText("xx% - xx");

        lblTempGpuJSensor.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblTempGpuJSensor.setText("x.x");

        lblUseGpuJSensor.setFont(new Font("Exo 2 Semi Bold", Font.PLAIN, 16)); // NOI18N
        lblUseGpuJSensor.setText("xx%");

        lblOsOshi.setFont(new Font("Exo 2 Medium", Font.PLAIN, 12)); // NOI18N
        lblOsOshi.setText("Windows 10 Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING
                ).addGroup(
                layout.createSequentialGroup()
                    .addGap(
                        51,
                        51,
                        51
                    ).addComponent(
                    panelResultTexts,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addGroup(
                    layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                    ).addGroup(
                        layout.createSequentialGroup()
                            .addGap(
                                19,
                                19,
                                19
                            ).addComponent(
                            panelTexts,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            100,
                            javax.swing.GroupLayout.PREFERRED_SIZE
                        ).addContainerGap(
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE
                        )
                    ).addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()
                            .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE
                            ).addComponent(
                            lblOsOshi
                        ).addContainerGap()
                    )
                )
            ).addGroup(
                layout.createSequentialGroup()
                    .addGap(
                        27,
                        27,
                        27
                    ).addComponent(
                    lblWelcome,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    320,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                ).addComponent(
                    btnLogout,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    125,
                    javax.swing.GroupLayout.PREFERRED_SIZE
                ).addContainerGap(
                    28,
                    Short.MAX_VALUE
                )
            )
        );
        layout.setVerticalGroup(
            layout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING
                ).addGroup(
                layout.createSequentialGroup()
                    .addGap(
                        20,
                        20,
                        20
                    ).addGroup(
                    layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.BASELINE
                    ).addComponent(
                        lblWelcome
                    ).addComponent(
                        btnLogout,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        33,
                        javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                ).addGap(
                    17,
                    17,
                    17
                ).addGroup(
                    layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                    ).addGroup(
                        layout.createSequentialGroup()
                            .addGap(
                                4,
                                4,
                                4
                            ).addComponent(
                            panelResultTexts,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    ).addGroup(
                        layout.createSequentialGroup()
                            .addComponent(
                                panelTexts,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                250,
                                javax.swing.GroupLayout.PREFERRED_SIZE
                            ).addPreferredGap(
                            javax.swing.LayoutStyle.ComponentPlacement.RELATED
                        ).addComponent(
                            lblOsOshi
                        )
                    )
                ).addContainerGap(
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE
                )
            )
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setInformation(){
        boolean test = true;

        SystemInformation systemInformation = new SystemInformation();

        lblTempProcessorOshi.setText(systemInformation.getCpu().getCPUTemperature());
        lblUseProcessorOshi.setText(systemInformation.getCpuUsage());
        lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryUseInPercentage()
            + "% / " +
            systemInformation.getRam().getTotalMemory());
        lblFanRpmOshi.setText(systemInformation.getCpu().getFansSpeed());
        lblOsOshi.setText(systemInformation.getComputerSystem().getOperatingSystemToString());

        try {
            while (test) {
                lblUseProcessorOshi.setText(systemInformation.getCpuUsage());
                lblUseProcessorOshi.setText(systemInformation.getCpuUsage());
//                lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryAvailable());
                lblMemoryRamOshi.setText(systemInformation.getRam().getMemoryUseInPercentage()
                    + "% / " +
                    systemInformation.getRam().getTotalMemory());
                lblFanRpmOshi.setText(systemInformation.getCpu().getFansSpeed());
                Thread.sleep(15000);
            }
        }catch(InterruptedException e){

        }
    }

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        Index index  = new Index();
        index.setVisible(true);
        index.setInformation();
    }

}
