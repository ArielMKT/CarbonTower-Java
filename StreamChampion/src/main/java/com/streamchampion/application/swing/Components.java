package com.streamchampion.application.swing;

import javax.swing.*;
import java.awt.*;

class Components extends JFrame {

    JButton btnLogout;
    JPanel panelResultTexts;
    JPanel panelTexts;
    JLabel lblFanRpm;
    JLabel lblFanRpmOshi;
    JLabel lblMemoryRam;
    JLabel lblMemoryRamOshi;
    JLabel lblOsOshi;
    JLabel lblTempGpu;
    JLabel lblTempGpuJSensor;
    JLabel lblTempProcessor;
    JLabel lblTempProcessorOshi;
    JLabel lblUseGpu;
    JLabel lblUseGpuJSensor;
    JLabel lblUseProcessor;
    JLabel lblUseProcessorOshi;
    JLabel lblWelcome;

    void createPanels(){
        panelTexts = new JPanel();
        lblFanRpm = new JLabel();
        lblUseProcessor = new JLabel();
        lblTempProcessor = new JLabel();
        lblMemoryRam = new JLabel();
        lblTempGpu = new JLabel();
        lblUseGpu = new JLabel();

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

        panelTexts.setBackground(new java.awt.Color(225, 225, 225));
        javax.swing.GroupLayout panelTextsLayout = new javax.swing.GroupLayout(panelTexts);
        panelTexts.setLayout(panelTextsLayout);
        panelTextsLayout.setHorizontalGroup(
            panelTextsLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING
                ).addGroup(
                panelTextsLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        panelTextsLayout
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
        panelTextsLayout.setVerticalGroup(
            panelTextsLayout
                .createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING
                ).addGroup(
                panelTextsLayout
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

        panelResultTexts = new JPanel();
        lblFanRpmOshi = new JLabel();
        lblUseProcessorOshi = new JLabel();
        lblTempProcessorOshi = new JLabel();
        lblMemoryRamOshi = new JLabel();
        lblTempGpuJSensor = new JLabel();
        lblUseGpuJSensor = new JLabel();
        lblOsOshi = new JLabel();

        panelResultTexts.setBackground(new java.awt.Color(225, 225, 225));
        javax.swing.GroupLayout panelResultTextsLayout = new javax.swing.GroupLayout(panelResultTexts);
        panelResultTexts.setLayout(panelResultTextsLayout);
        panelResultTextsLayout.setHorizontalGroup(
            panelResultTextsLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING
            ).addGroup(
                panelResultTextsLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        panelResultTextsLayout.createParallelGroup(
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
                            panelResultTextsLayout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(
                                    lblMemoryRamOshi,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    150,
                                    javax.swing.GroupLayout.PREFERRED_SIZE
                                ).addGroup(
                                javax.swing.GroupLayout.Alignment.LEADING,
                                panelResultTextsLayout.createParallelGroup(
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
        panelResultTextsLayout.setVerticalGroup(
            panelResultTextsLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING
            ).addGroup(
                panelResultTextsLayout
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
                    panelTexts,
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
                            panelResultTexts,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            150,
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
                            panelTexts,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    ).addGroup(
                        layout.createSequentialGroup()
                            .addComponent(
                                panelResultTexts,
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
    }
    
}
