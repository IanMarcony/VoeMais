/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uea.voemais.admin.view;

import com.uea.voemais.InitialSignInFrame;
import com.uea.voemais.shared.airplane.controller.AirplaneController;
import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.destination.controller.DestinationController;
import com.uea.voemais.shared.destination.model.Destination;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class SelectionMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form SelectionMenuFrame
     */
    public SelectionMenuFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        indexFlightsButton = new javax.swing.JButton();
        createNewFlightButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        createAirplaneButton = new javax.swing.JButton();
        createNewDestinationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setPreferredSize(new java.awt.Dimension(800, 400));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setText("SAIR");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        indexFlightsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        indexFlightsButton.setText("Visualizar voos");
        indexFlightsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexFlightsButtonActionPerformed(evt);
            }
        });

        createNewFlightButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createNewFlightButton.setText("Criar novos voos");
        createNewFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewFlightButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Central do Funcionário");
        jLabel1.setToolTipText("");

        createAirplaneButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createAirplaneButton.setText("Cadastrar novo avião");
        createAirplaneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirplaneButtonActionPerformed(evt);
            }
        });

        createNewDestinationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createNewDestinationButton.setText("Criar novo destino");
        createNewDestinationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewDestinationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(createAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(indexFlightsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(createNewFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(createNewDestinationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indexFlightsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createNewDestinationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indexFlightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexFlightsButtonActionPerformed
        FlightVisualizationFrame dados =  new FlightVisualizationFrame();
        dados.pack();
        dados.show();
        this.dispose();
    }//GEN-LAST:event_indexFlightsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
      InitialSignInFrame dados = new InitialSignInFrame();
       dados.pack();
        dados.show();
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void createNewFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewFlightButtonActionPerformed
         List<Airplane> airplaneList = AirplaneController.getFromDB();
        
        if(airplaneList.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Não tem aviões cadastrados");
            
           return;
       
        }
        
        List<Destination> destinationList = DestinationController.getFromDB();
         if(destinationList.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Não tem destinos cadastrados");
           return;
        }
        FlightRegisterFrame FlightRegisteringFrame = new FlightRegisterFrame();
        FlightRegisteringFrame.pack();
        FlightRegisteringFrame.show();
        this.dispose();
    }//GEN-LAST:event_createNewFlightButtonActionPerformed

    private void createAirplaneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirplaneButtonActionPerformed
        CreateNewAirplaneFrame dados = new CreateNewAirplaneFrame();
        dados.pack();
        dados.show();
        this.dispose();
    }//GEN-LAST:event_createAirplaneButtonActionPerformed

    private void createNewDestinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewDestinationButtonActionPerformed
        CreateNewDestinationFrame dados = new CreateNewDestinationFrame();
        dados.pack();
        dados.show();
        this.dispose();
    }//GEN-LAST:event_createNewDestinationButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SelectionMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAirplaneButton;
    private javax.swing.JButton createNewDestinationButton;
    private javax.swing.JButton createNewFlightButton;
    private javax.swing.JButton indexFlightsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
