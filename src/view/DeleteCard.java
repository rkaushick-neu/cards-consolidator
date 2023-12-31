/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Card;
import model.User;
import utility.DatabaseConnector;

/**
 *
 * @author bharatsingh
 */
public class DeleteCard extends javax.swing.JPanel {
    

    /**
     * Creates new form DeleteCard
     */
    User user;
    Card selectedCard;
    private JPanel BottonPanel;
    ArrayList<Card> usercard;
    public DeleteCard(JPanel BottomPanel) 
    {
        this.BottonPanel=BottomPanel;
        initComponents();
        populateCardTable();
    }
    private void populateCardTable()
    {try
    {
        this.usercard=DatabaseConnector.getUserCards(1);
        DefaultTableModel model=(DefaultTableModel) cardTable.getModel();
        model.setRowCount(0);
            for(Card c1 : usercard)
            {
                Object [] cardrow  = new Object[5];
                cardrow[0] = c1.getCardNo();
                cardrow[1] = c1.getType();
                cardrow[2] = c1.getUID();
                cardrow[3] = c1.getPoints();
                cardrow[4] = c1.getExpiry();
                model.addRow(cardrow);
            }
    }
    catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error!", HEIGHT);  
            }
    
    
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
        DeleteCardButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Annai MN", 0, 18)); // NOI18N
        jLabel1.setText("Delete Card");

        DeleteCardButton.setText("Delete");
        DeleteCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCardButtonActionPerformed(evt);
            }
        });

        cardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Card No", "Type", "UID", "Points", "Expiry"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cardTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(DeleteCardButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(DeleteCardButton)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCardButtonActionPerformed
        // TODO add your handling code here:
        
            int selectedRowIndex = cardTable.getSelectedRow();
          

        // validating if the user has selected a row before hitting delete

        if(selectedRowIndex == -1){

            // user has not selected a row

            JOptionPane.showMessageDialog(this, "Please select the card first!", "Oops, unable to delete!", HEIGHT);

        } else {

            try{

                this.selectedCard = this.usercard.get(selectedRowIndex);

                DatabaseConnector.deleteCard(selectedCard);

                JOptionPane.showMessageDialog(null, "Card Deleted Successfully!", "Success!", HEIGHT);

                

                populateCardTable();

            } catch (Exception e){

                JOptionPane.showMessageDialog(this, e.getMessage(), "Unable to delete Card!", HEIGHT);

            }

        }
        
       
    }//GEN-LAST:event_DeleteCardButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteCardButton;
    private javax.swing.JTable cardTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

