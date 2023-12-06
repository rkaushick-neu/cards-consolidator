/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import model.User;
import model.Card;
import utility.DatabaseConnector;

/**
 *
 * @author Ali
 */
public class Card_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Card_Panel
     */
    private Card newCard;
    private User loggedInUser;
    private User newUser;
    private JPanel BottomPanel;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
//    public Card_Panel(user newUser){
//        
//       this.newUser = newUser;
//        initComponents();
//}
    public Card_Panel(JPanel BottomPanel) {
        this.BottomPanel= BottomPanel;
        initComponents();
        populateUserCards();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Card_textFeild = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        points_text1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Card_textFeild1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        point_text2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Card_textFeild4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        point_text3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Card_NoFeild1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        expiry1 = new javax.swing.JTextField();
        Card_NoFeild2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        expiry2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Card_NoFeild3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        expiry3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        editStarbucksButton = new javax.swing.JButton();
        editPCOptimumButton = new javax.swing.JButton();
        editTimHortonsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel3.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel3.setText("Available Points:");

        Card_textFeild.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        Card_textFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_textFeildActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel4.setText("Card Name:");

        jButton1.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jButton1.setText("Add New Card");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        points_text1.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Tim_horton_logo.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Starbucks_Corporation_Logo_2011.svg.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel6.setText("Available Points:");

        Card_textFeild1.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        Card_textFeild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_textFeild1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel7.setText("Card Name:");

        point_text2.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        point_text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point_text2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Pc Optimum.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        Card_textFeild4.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        Card_textFeild4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_textFeild4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel9.setText("Card Name:");

        point_text3.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel10.setText("Available Points:");

        Card_NoFeild1.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        Card_NoFeild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_NoFeild1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel11.setText("Card No:");

        jLabel12.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel12.setText("Expiry Date:");

        expiry1.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        expiry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiry1ActionPerformed(evt);
            }
        });

        Card_NoFeild2.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        Card_NoFeild2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_NoFeild2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel13.setText("Card No:");

        expiry2.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        expiry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiry2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel14.setText("Expiry Date:");

        Card_NoFeild3.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        Card_NoFeild3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_NoFeild3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel15.setText("Expiry Date:");

        expiry3.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        jLabel16.setText("Card No:");

        deleteButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        deleteButton.setText("Delete A Card");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editStarbucksButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        editStarbucksButton.setText("Edit Card");

        editPCOptimumButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        editPCOptimumButton.setText("Edit Card");

        editTimHortonsButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        editTimHortonsButton.setText("Edit Card");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(points_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expiry1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Card_NoFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Card_textFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel14))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(expiry2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(point_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel7))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Card_NoFeild2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Card_textFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Card_NoFeild3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Card_textFeild4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(point_text3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expiry3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(editTimHortonsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editPCOptimumButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(294, 294, 294)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(180, 180, 180)
                        .addComponent(editStarbucksButton)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Card_textFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Card_NoFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(points_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expiry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Card_textFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(point_text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(expiry2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Card_NoFeild2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Card_textFeild4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Card_NoFeild3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(point_text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expiry3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editTimHortonsButton)
                            .addComponent(editPCOptimumButton))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(editStarbucksButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)
                        .addComponent(deleteButton)
                        .addGap(28, 28, 28))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // commented by R
        New_card newcard = new New_card(BottomPanel);
        BottomPanel.add(newcard);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Clicking on Starbucks icon displays the card details - if present.
     * Currently this is specifically a Starbucks card, however in the future we can set this to be any one of user's card.
     * @param evt Java Mouse Click event
     * @author team4
     * @version 2.1
     */
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//        Card_NoFeild2.setText(newCard.);
//        expiry2.setText(newUser.getExpiry_Date_StarBucks())
        Card starbucksCard = DatabaseConnector.getCard("StarBucks", 1);
//        for debugging:
//        System.out.println(dateFormat.format(starbucksCard.getExpiry()));
        if(starbucksCard.getType() == null){
            JOptionPane.showMessageDialog(this, "Please add a Starbucks Card first", "No Starbucks Card Entered!", JOptionPane.INFORMATION_MESSAGE);
        } else{
            Card_textFeild4.setText("Starbucks");
            Card_NoFeild3.setText(Integer.toString(starbucksCard.getCardNo()));
            point_text3.setText(Integer.toString(starbucksCard.getPoints()));
            expiry3.setText( dateFormat.format(starbucksCard.getExpiry()));
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Card_textFeild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_textFeild1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_textFeild1ActionPerformed

    private void Card_textFeild4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_textFeild4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_textFeild4ActionPerformed

    /**
     * Clicking on PC Optimum icon displays the card details - if present.
     * Currently this is specifically a PC Optimum card, however in the future we can set this to be any one of user's card.
     * @param evt Java Mouse Click event
     * @author team4
     * @version 2.0
     */
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Card pcOptimumCard = DatabaseConnector.getCard("PC Optimum", 1);
        if(pcOptimumCard.getType() == null){
            JOptionPane.showMessageDialog(this, "Please add a PC Optimum Card first.", "No PC Optimum Card Entered!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Card_textFeild1.setText(pcOptimumCard.getType());
            Card_NoFeild2.setText(Integer.toString(pcOptimumCard.getCardNo()));
            point_text2.setText(Integer.toString(pcOptimumCard.getPoints()));
            expiry2.setText(this.dateFormat.format(pcOptimumCard.getExpiry()));
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * Clicking the Tim Horton's icon displays the card details - if it is present.
     * Currently this is specifically a Tim Horton's card, however in the future we can set this to be any one of user's card.
     * @param evt Java Mouse Click event
     * @author team4
     * @version 2.0
     */
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Card timHortonsCard = new Card();
        timHortonsCard = DatabaseConnector.getCard("Tim Hortons", 1);
        if(timHortonsCard.getType() == null){
            JOptionPane.showMessageDialog(this, "Please add a Tim Horton's Card first.", "No Tim Horton's Card Entered!", JOptionPane.INFORMATION_MESSAGE);
        } else{
            this.Card_textFeild.setText(timHortonsCard.getType());
            this.Card_NoFeild1.setText(Integer.toString(timHortonsCard.getCardNo()));
            this.points_text1.setText(Integer.toString(timHortonsCard.getPoints()));
            this.expiry1.setText(this.dateFormat.format(timHortonsCard.getExpiry()));
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Card_textFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_textFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_textFeildActionPerformed

    private void Card_NoFeild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_NoFeild1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_NoFeild1ActionPerformed

    private void Card_NoFeild2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_NoFeild2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_NoFeild2ActionPerformed

    private void expiry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiry2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiry2ActionPerformed

    private void Card_NoFeild3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_NoFeild3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card_NoFeild3ActionPerformed

    private void expiry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiry1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiry1ActionPerformed

    private void point_text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_point_text2ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        DeleteCard newDeletecardPanel = new DeleteCard(BottomPanel);
        BottomPanel.add(newDeletecardPanel);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
        
    }//GEN-LAST:event_deleteButtonActionPerformed
 // ActionListener for the card image click
    
//public void addCard(user user) {
//        // Create a JLabel for the card
//        JLabel cardLabel = new JLabel("NewCard");
//
//        // Add an ActionListener to the label to handle click events
//        cardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                // Handle the click event, maybe open a details panel or dialog
//                Card_textFeild.setText("TimHorton");
//            }
//        });
//
//        // Add the label to the panel
//        Card_Panel newCard_Panel = new Card_Panel(BottomPanel);
//         newCard_Panel.add(cardLabel);
//       
//        // Repaint the panel to reflect the changes
//        revalidate();
//        repaint();
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Card_NoFeild1;
    private javax.swing.JTextField Card_NoFeild2;
    private javax.swing.JTextField Card_NoFeild3;
    private javax.swing.JTextField Card_textFeild;
    private javax.swing.JTextField Card_textFeild1;
    private javax.swing.JTextField Card_textFeild4;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editPCOptimumButton;
    private javax.swing.JButton editStarbucksButton;
    private javax.swing.JButton editTimHortonsButton;
    private javax.swing.JTextField expiry1;
    private javax.swing.JTextField expiry2;
    private javax.swing.JTextField expiry3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField point_text2;
    private javax.swing.JTextField point_text3;
    private javax.swing.JTextField points_text1;
    // End of variables declaration//GEN-END:variables

    public void populateUserCards(){
        //getting the list of cards from the database
        ArrayList <Card> userCards = DatabaseConnector.getUserCards(1);
        // setting the image icon size
        BufferedImage firstCardImage = null;
        BufferedImage secondCardImage = null;
        BufferedImage thirdCardImage = null;
        
        try{
            if(userCards.get(0).getType().equals("Tim Hortons")){
                firstCardImage = ImageIO.read(new File("Tim_horton_logo.png"));
                Image dimg = firstCardImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon firstImageIcon = new ImageIcon(dimg);
                jLabel2.setIcon(firstImageIcon);
            } else if(userCards.get(0).getType().equals("StarBucks")){
//                firstCardImage = ImageIO.read(new File("Tim_horton_logo.png"));
            }
        } catch(IOException e){
            
        }
    }

}
