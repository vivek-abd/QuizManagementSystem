/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quiz.app;


import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 *
 * @author user
 */
public class Response extends javax.swing.JPanel {

	/**
	 * Creates new form Response
	 */

    public JButton returnButton;

	public Response() {
		setMinimumSize(new Dimension(600, 600));
		initComponents();
	}

	public static void main(String args[]){
		javax.swing.JFrame frame = new javax.swing.JFrame();
		javax.swing.JPanel panel = new Response();
		frame.add(panel);

		frame.setSize(900, 900);
		frame.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                javax.swing.JPanel main_panel = new javax.swing.JPanel();
                javax.swing.JLabel returnLabel = new javax.swing.JLabel();
                returnButton= new javax.swing.JButton();

                setBackground(new java.awt.Color(255, 255, 255));
                setPreferredSize(new java.awt.Dimension(828, 510));
                setLayout(new java.awt.GridLayout(1, 0));

                main_panel.setBackground(new java.awt.Color(255, 255, 255));

                returnLabel.setBackground(new java.awt.Color(255, 255, 255));
                returnLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                returnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                returnLabel.setText("Your Response has been Recorded Successfully!");

                returnButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                returnButton.setText("Return to home");
                returnButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                returnButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
                main_panel.setLayout(main_panelLayout);
                main_panelLayout.setHorizontalGroup(
                        main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172))
                );
                main_panelLayout.setVerticalGroup(
                        main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                add(main_panel);
        }// </editor-fold>//GEN-END:initComponents

        private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_returnButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        // End of variables declaration//GEN-END:variables
}
