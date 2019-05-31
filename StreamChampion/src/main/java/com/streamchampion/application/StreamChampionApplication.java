package com.streamchampion.application;

import com.streamchampion.application.swing.Index;
import com.streamchampion.application.swing.Login;
import com.streamchampion.domain.Loggable;
import com.streamchampion.resources.database.Connection;

import javax.swing.*;

public class StreamChampionApplication {

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
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
        //</editor-fold>

        /* Create and display the form */

//        new Connection().getConnection();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

}
