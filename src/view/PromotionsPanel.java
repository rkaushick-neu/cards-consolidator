/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Card;
import model.Promotion;
import model.User;
import utility.DatabaseConnector;

/**
 * 
 * @author team4
 */
public class PromotionsPanel extends javax.swing.JPanel {

    private JPanel bottomPanel;
    /**
     * Constructor of the PromotionsPanel takes in the bottomPanel as argument.
     * @param bottomPanel Bottom Panel
     */
    public PromotionsPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
        initComponents();
        promotionsTitleLabel.setText("Top Promotions!");

        /** First set all the promotion labels to visible */
        setAllPromotionLabelsHidden();
        
        ArrayList <Promotion> allPromotions = new ArrayList<Promotion>();
        allPromotions = DatabaseConnector.getAllPromotions();
        this.displayPromotionsInLabels(allPromotions);
        
        promotionTypeLabel1.setVisible(true);
        promotionTypeLabel2.setVisible(true);
        promotionTypeLabel3.setVisible(true);
        
        promotionTypeLabel1.setText(allPromotions.get(0).getType());
        promotionTypeLabel2.setText(allPromotions.get(1).getType());
        promotionTypeLabel3.setText(allPromotions.get(2).getType());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        timHortonsButton = new javax.swing.JButton();
        starbucksPromoButton = new javax.swing.JButton();
        pcOptimumPromoButton = new javax.swing.JButton();
        allCardsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        promotionsTitleLabel = new javax.swing.JLabel();
        promotionMessageLabel1 = new javax.swing.JLabel();
        promotionEligibilityLabel1 = new javax.swing.JLabel();
        promotionMessageLabel2 = new javax.swing.JLabel();
        promotionEligibilityLabel2 = new javax.swing.JLabel();
        promotionMessageLabel3 = new javax.swing.JLabel();
        promotionEligibilityLabel3 = new javax.swing.JLabel();
        promotionTypeLabel1 = new javax.swing.JLabel();
        promotionTypeLabel2 = new javax.swing.JLabel();
        promotionTypeLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSplitPane1.setDividerLocation(200);

        timHortonsButton.setBackground(new java.awt.Color(0, 102, 255));
        timHortonsButton.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        timHortonsButton.setForeground(new java.awt.Color(255, 255, 255));
        timHortonsButton.setText("Tim Hortons");
        timHortonsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timHortonsButtonActionPerformed(evt);
            }
        });

        starbucksPromoButton.setBackground(new java.awt.Color(0, 102, 255));
        starbucksPromoButton.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        starbucksPromoButton.setForeground(new java.awt.Color(255, 255, 255));
        starbucksPromoButton.setText("Starbucks");
        starbucksPromoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starbucksPromoButtonActionPerformed(evt);
            }
        });

        pcOptimumPromoButton.setBackground(new java.awt.Color(0, 102, 255));
        pcOptimumPromoButton.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        pcOptimumPromoButton.setForeground(new java.awt.Color(255, 255, 255));
        pcOptimumPromoButton.setText("PC Optimum");
        pcOptimumPromoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcOptimumPromoButtonActionPerformed(evt);
            }
        });

        allCardsButton.setBackground(new java.awt.Color(0, 102, 255));
        allCardsButton.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        allCardsButton.setForeground(new java.awt.Color(255, 255, 255));
        allCardsButton.setText("All Cards");
        allCardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allCardsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcOptimumPromoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(starbucksPromoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timHortonsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(allCardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(allCardsButton)
                .addGap(80, 80, 80)
                .addComponent(timHortonsButton)
                .addGap(80, 80, 80)
                .addComponent(starbucksPromoButton)
                .addGap(80, 80, 80)
                .addComponent(pcOptimumPromoButton)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        promotionsTitleLabel.setFont(new java.awt.Font("Annai MN", 0, 18)); // NOI18N
        promotionsTitleLabel.setText("Top Promotions!");

        promotionMessageLabel1.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionMessageLabel1.setText("Promotion Message");

        promotionEligibilityLabel1.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionEligibilityLabel1.setText("Promotion Eligibility");

        promotionMessageLabel2.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionMessageLabel2.setText("Promotion Message");

        promotionEligibilityLabel2.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionEligibilityLabel2.setText("Promotion Eligibility");

        promotionMessageLabel3.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionMessageLabel3.setText("Promotion Message");

        promotionEligibilityLabel3.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionEligibilityLabel3.setText("Promotion Eligibility");

        promotionTypeLabel1.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionTypeLabel1.setText("Promotion From");

        promotionTypeLabel2.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionTypeLabel2.setText("Promotion From");

        promotionTypeLabel3.setFont(new java.awt.Font("Annai MN", 0, 12)); // NOI18N
        promotionTypeLabel3.setText("Promotion From");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(promotionsTitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(promotionTypeLabel3)
                    .addComponent(promotionTypeLabel2)
                    .addComponent(promotionTypeLabel1)
                    .addComponent(promotionEligibilityLabel3)
                    .addComponent(promotionMessageLabel3)
                    .addComponent(promotionEligibilityLabel2)
                    .addComponent(promotionMessageLabel2)
                    .addComponent(promotionEligibilityLabel1)
                    .addComponent(promotionMessageLabel1))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(promotionsTitleLabel)
                .addGap(50, 50, 50)
                .addComponent(promotionMessageLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(promotionEligibilityLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(promotionTypeLabel1)
                .addGap(50, 50, 50)
                .addComponent(promotionMessageLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(promotionEligibilityLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(promotionTypeLabel2)
                .addGap(50, 50, 50)
                .addComponent(promotionMessageLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(promotionEligibilityLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(promotionTypeLabel3)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void starbucksPromoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starbucksPromoButtonActionPerformed
        // TODO add your handling code here:
        promotionsTitleLabel.setText("Starbucks Promotions!");
        /** Currently Starbucks is hard-coded but this value will be dynamic. */
        ArrayList <Promotion> cardPromotions = DatabaseConnector.getSelectPromotions("Starbucks");
        
        /** Setting the all promotion labels as visible*/
        setAllPromotionLabelsHidden();
        
        /** Displaying the promotions into the labels */
        displayPromotionsInLabels(cardPromotions);
    }//GEN-LAST:event_starbucksPromoButtonActionPerformed

    private void timHortonsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timHortonsButtonActionPerformed
        /** Currently Tim Horton's is hard-coded but this value will be dynamic. */
//        ArrayList <String> cardPromotions = getCardPromotions("Tim Hortons");
        promotionsTitleLabel.setText("Tim Hortons Promotions!");
        
        // change this to the other function later
        ArrayList <Promotion> cardPromotions = DatabaseConnector.getSelectPromotions("Tim Hortons");
        
        /** Setting the all promotion labels as visible*/
        setAllPromotionLabelsHidden();
        
        /** Displaying the promotions into the labels */
        displayPromotionsInLabels(cardPromotions);
        
        
    }//GEN-LAST:event_timHortonsButtonActionPerformed

    private void pcOptimumPromoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcOptimumPromoButtonActionPerformed
        // TODO add your handling code here:
        
        promotionsTitleLabel.setText("PC Optimum Promotions!");
        // change this to the other function later
        ArrayList <Promotion> cardPromotions = DatabaseConnector.getSelectPromotions("PC Optimum");
        
        /** Setting the all promotion labels as visible*/
        setAllPromotionLabelsHidden();
        
        /** Displaying the promotions into the labels */
        displayPromotionsInLabels(cardPromotions);
    }//GEN-LAST:event_pcOptimumPromoButtonActionPerformed

    /**
     * This is when the 'All Cards' button is clicked.
     * This will show the promotions of all the top promotions from all of users loyalty cards.
     * @param evt 
     */
    private void allCardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allCardsButtonActionPerformed
//        ArrayList <Promotions> allCardPromotions = getCardPromotions("All");
        promotionsTitleLabel.setText("Top Promotions!");

        /** First set all the promotion labels to visible */
        setAllPromotionLabelsHidden();
        
        ArrayList <Promotion> allPromotions = new ArrayList<Promotion>();
        allPromotions = DatabaseConnector.getAllPromotions();
        this.displayPromotionsInLabels(allPromotions);
        
        promotionTypeLabel1.setVisible(true);
        promotionTypeLabel2.setVisible(true);
        promotionTypeLabel3.setVisible(true);
        
        promotionTypeLabel1.setText(allPromotions.get(0).getType());
        promotionTypeLabel2.setText(allPromotions.get(1).getType());
        promotionTypeLabel3.setText(allPromotions.get(2).getType());
        /** Displaying the promotions into the labels */
//        displayPromotionsInLabels(allCardPromotions);
    }//GEN-LAST:event_allCardsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allCardsButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton pcOptimumPromoButton;
    private javax.swing.JLabel promotionEligibilityLabel1;
    private javax.swing.JLabel promotionEligibilityLabel2;
    private javax.swing.JLabel promotionEligibilityLabel3;
    private javax.swing.JLabel promotionMessageLabel1;
    private javax.swing.JLabel promotionMessageLabel2;
    private javax.swing.JLabel promotionMessageLabel3;
    private javax.swing.JLabel promotionTypeLabel1;
    private javax.swing.JLabel promotionTypeLabel2;
    private javax.swing.JLabel promotionTypeLabel3;
    private javax.swing.JLabel promotionsTitleLabel;
    private javax.swing.JButton starbucksPromoButton;
    private javax.swing.JButton timHortonsButton;
    // End of variables declaration//GEN-END:variables

    /**
     * Based on the card title parameter, it retrieves the promotions from the database and returns it in an array list.
     * The valid values for the cardTitle parameter are: 'All', 'Tim Hortons', 'Starbucks'.
     * @param cardTitle Name of Card
     * @return Array List of Strings
     */
    public ArrayList <String> getCardPromotions(String cardTitle){
        /**
         * The promotionsArray is an Array List of Strings.
         * It will hold 4 main elements:
         * promotionsArray[0] - Promotions Title Label
         * promotionsArray[1] - Promotion Message
         * promotionsArray[2] - Promotion Eligibility
         * Additionally if there are more than 1 promotions it will also hold:
         * promotionsArray[3] - Promotion Message
         * promotionsArray[4] - Promotion Eligibility
         * ...
         * and so forth.
         */
        ArrayList <String> promotionsArray = new ArrayList<String>();
        if(cardTitle.equals("All")){
            promotionsArray.add("Top Promotions!");
            /** Here we need to get the best promotions for all the cards. */
            /** Call the database. */
            /** Loop over database items. */
            for (int i=0; i<3; i++){
                promotionsArray.add("Promotion Message");
                promotionsArray.add("Promotion Eligibility");
            }
            return promotionsArray;
        } else if(cardTitle.equals("Tim Hortons")){
            promotionsArray.add("Tim Hortons Promotions!");
            /** Here we need to get a call to the database to retrieve the Tim's promotions. */
            // for now displaying some dummy data
            promotionsArray.add("Get 5% off on your Latte now!!");
            promotionsArray.add("Eligibility: "+Integer.toString(500)+" points");
        }
        return promotionsArray;
    }
    
    public void setAllPromotionLabelsVisible(){
        promotionMessageLabel1.setVisible(true);
        promotionEligibilityLabel1.setVisible(true);
        promotionMessageLabel2.setVisible(true);
        promotionEligibilityLabel2.setVisible(true);
        promotionMessageLabel3.setVisible(true);
        promotionEligibilityLabel3.setVisible(true);
    }
    
    public void setAllPromotionLabelsHidden(){
        promotionMessageLabel1.setVisible(false);
        promotionEligibilityLabel1.setVisible(false);
        promotionTypeLabel1.setVisible(false);
        promotionMessageLabel2.setVisible(false);
        promotionEligibilityLabel2.setVisible(false);
        promotionTypeLabel2.setVisible(false);
        promotionMessageLabel3.setVisible(false);
        promotionEligibilityLabel3.setVisible(false);
        promotionTypeLabel3.setVisible(false);
    }
    
    public void displayPromotionsInLabels(ArrayList <Promotion> cardPromotions){
        int numberOfPromotions = cardPromotions.size();
        System.out.println(Integer.toString(numberOfPromotions));
//        if(numberOfPromotions == 0){
//            /** Edge case - no promotions added? */
//        }
        if(numberOfPromotions >= 1){
            /** This means there is only one promotion */
            promotionMessageLabel1.setText(cardPromotions.get(0).getPromotionName());
            promotionEligibilityLabel1.setText("Eligibility: "+Integer.toString(cardPromotions.get(0).getEligiblePoints())+" points");
            
            /** Next making these labels visible */
            promotionMessageLabel1.setVisible(true);
            promotionEligibilityLabel1.setVisible(true);
        } 
        if(numberOfPromotions >= 2){
            promotionMessageLabel2.setText(cardPromotions.get(1).getPromotionName());
            promotionEligibilityLabel2.setText("Eligibility: "+Integer.toString(cardPromotions.get(1).getEligiblePoints())+" points");
            
            /** Next setting these labels visible */            
            promotionMessageLabel2.setVisible(true);
            promotionEligibilityLabel2.setVisible(true);
        } 
        if(numberOfPromotions >= 3){
            promotionMessageLabel3.setText(cardPromotions.get(2).getPromotionName());
            promotionEligibilityLabel3.setText("Eligibility: "+Integer.toString(cardPromotions.get(2).getEligiblePoints())+" points");
            
            /** Next setting these labels visible */            
            promotionMessageLabel3.setVisible(true);
            promotionEligibilityLabel3.setVisible(true);
        }
    }
    
//    public void displayPromotionsInLabels(ArrayList <String> cardPromotions){
//        System.out.println(cardPromotions.size());
//        System.out.println(cardPromotions.get(1));
//        System.out.println(cardPromotions.get(2));
//        if(cardPromotions.size() < 3){
//            /** Setting all  labels as invisible */
//            promotionMessageLabel1.setVisible(false);
//            promotionEligibilityLabel1.setVisible(false);
//            promotionMessageLabel2.setVisible(false);
//            promotionEligibilityLabel2.setVisible(false);
//            promotionMessageLabel3.setVisible(false);
//            promotionEligibilityLabel3.setVisible(false);
//        }
//        if(cardPromotions.size() == 3){
//            /** This means there is only one promotion */
//            promotionMessageLabel1.setText(cardPromotions.get(1));
//            promotionEligibilityLabel1.setText(cardPromotions.get(2));
//            
//            /** Next setting the other labels as invisible */
//            promotionMessageLabel2.setVisible(false);
//            promotionEligibilityLabel2.setVisible(false);
//            promotionMessageLabel3.setVisible(false);
//            promotionEligibilityLabel3.setVisible(false);
//        } 
//        if(cardPromotions.size() == 5){
//            promotionMessageLabel2.setText(cardPromotions.get(3));
//            promotionEligibilityLabel2.setText(cardPromotions.get(4));
//            
//            /** Next setting the other labels as invisible */            
//            promotionMessageLabel3.setVisible(false);
//            promotionEligibilityLabel3.setVisible(false);
//        } 
//        if(cardPromotions.size() >= 7){
//            promotionMessageLabel1.setText(cardPromotions.get(1));
//            promotionEligibilityLabel1.setText(cardPromotions.get(2));
//            promotionMessageLabel2.setText(cardPromotions.get(3));
//            promotionEligibilityLabel2.setText(cardPromotions.get(4));
//            promotionMessageLabel3.setText(cardPromotions.get(5));
//            promotionEligibilityLabel3.setText(cardPromotions.get(6));
//        } 
//    }
    
    public void getUserAndCardDetails(){
        User loggedInUser = new User();
        loggedInUser = DatabaseConnector.getAllusers().get(0);
        ArrayList <Card> userCards = DatabaseConnector.getUserCards(loggedInUser.getId());
    }
}