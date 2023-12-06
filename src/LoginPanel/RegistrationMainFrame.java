/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginPanel;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.User;
import utility.DatabaseConnector;


/**
 *
 * @author gauravvraii
 */
public class RegistrationMainFrame extends javax.swing.JFrame {
    
    private String hashedPassword;

    /**
     * Creates new form RegistrationMainFrame
     */
    public RegistrationMainFrame() {
        initComponents();
        
    }
    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            // Convert the byte array to a hexadecimal string
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashedBytes) {
                stringBuilder.append(String.format("%02x", b));
            }

            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception appropriately (e.g., log it)
            e.printStackTrace();
            return null;
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

        mainPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        RegistrationPanel = new javax.swing.JPanel();
        RegistrationTitleLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        nameErrorLabel = new javax.swing.JLabel();
        emailErrorLabel = new javax.swing.JLabel();
        passwordErrorLabel = new javax.swing.JLabel();
        JDateChooser = new com.toedter.calendar.JDateChooser();
        JPasswordField = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(835, 654));

        mainPanel2.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setBackground(new java.awt.Color(0, 102, 204));
        titleLabel.setFont(new java.awt.Font("Kailasa", 1, 48)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("CardsConsolidator");

        nameLabel.setFont(new java.awt.Font("Kailasa", 1, 18)); // NOI18N
        nameLabel.setText("Name:");

        RegistrationPanel.setBackground(new java.awt.Color(0, 102, 255));

        RegistrationTitleLabel.setFont(new java.awt.Font("Kailasa", 1, 24)); // NOI18N
        RegistrationTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrationTitleLabel.setText("Registration");

        javax.swing.GroupLayout RegistrationPanelLayout = new javax.swing.GroupLayout(RegistrationPanel);
        RegistrationPanel.setLayout(RegistrationPanelLayout);
        RegistrationPanelLayout.setHorizontalGroup(
            RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrationPanelLayout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(RegistrationTitleLabel)
                .addGap(220, 220, 220))
        );
        RegistrationPanelLayout.setVerticalGroup(
            RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrationPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(RegistrationTitleLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        emailLabel.setFont(new java.awt.Font("Kailasa", 1, 18)); // NOI18N
        emailLabel.setText("Email:");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyTyped(evt);
            }
        });

        dobLabel.setFont(new java.awt.Font("Kailasa", 1, 18)); // NOI18N
        dobLabel.setText("DOB:");

        emailLabel1.setFont(new java.awt.Font("Kailasa", 1, 18)); // NOI18N
        emailLabel1.setText("Password:");

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyTyped(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(0, 102, 255));
        submitButton.setFont(new java.awt.Font("Kailasa", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        nameErrorLabel.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 14)); // NOI18N
        nameErrorLabel.setForeground(new java.awt.Color(255, 0, 51));

        emailErrorLabel.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 14)); // NOI18N
        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 51));

        passwordErrorLabel.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 14)); // NOI18N
        passwordErrorLabel.setForeground(new java.awt.Color(255, 0, 51));

        JDateChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JDateChooserKeyPressed(evt);
            }
        });

        JPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPasswordFieldActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 102, 255));
        backButton.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addComponent(RegistrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel1)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField)
                            .addComponent(JPasswordField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(44, 44, 44)
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordErrorLabel)
                            .addComponent(emailErrorLabel)
                            .addComponent(nameErrorLabel))))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(titleLabel))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordErrorLabel))
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        Date dob = JDateChooser.getDate();
        char[] passwordChar = JPasswordField.getPassword();
        String password = new String(passwordChar);
        

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all required fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                hashedPassword = hashPassword(password);
                System.out.println("Hashed Password during registration: " + hashedPassword);
                System.out.println("Hashed Password: " + hashedPassword);
                
                JOptionPane.showMessageDialog(this, "Name: " + name + "\nEmail: " + email + "\nDOB: " + dob, "Successfully Registered", JOptionPane.INFORMATION_MESSAGE); 
                JOptionPane.showMessageDialog(null, "Successfully Login", "User Information", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e){
                e.printStackTrace();
            }
                
}
        //Insert into DB
                User newUser = new User(email, hashedPassword);

        try{
            newUser.setName(nameTextField.getText());
            newUser.setEmail(emailTextField.getText());
            newUser.setDOB(JDateChooser.getDate());
            newUser.setPassword(hashedPassword);

            
            //insert into DB
            DatabaseConnector.addUser(newUser);
            JOptionPane.showMessageDialog(null, "User Registered Successfully", "Successful Registration", JOptionPane.INFORMATION_MESSAGE);

            cleanup();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        LoginMainFrame loginFrame = new LoginMainFrame();
        loginFrame.setVisible(true);
        this.dispose();

//        JOptionPane.showMessageDialog(this, "Name: " + name + "\nEmail: " + email + "\nDOB: " + dob + "\nPassword: " + password, "Successfully Registered", JOptionPane.INFORMATION_MESSAGE);

//        JOptionPane.showMessageDialog(null, "Successfully Registered", "User Information", JOptionPane.INFORMATION_MESSAGE);
//        LoginMainFrame loginFrame = new LoginMainFrame();
//        loginFrame.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void emailTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyTyped
        // TODO add your handling code here:
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(emailTextField.getText());

        if (!matcher.matches()) {
            emailErrorLabel.setText("Invalid Email!");
        } else {
            emailErrorLabel.setText(null);
        }
    }//GEN-LAST:event_emailTextFieldKeyTyped

    private void nameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyTyped
        // TODO add your handling code here:
        String name = nameTextField.getText();
        if (name.isEmpty() || !name.matches("^[a-zA-Z]+$")) {
            nameErrorLabel.setText("Invalid Name!");
        } else {
            nameErrorLabel.setText(null);
}
    }//GEN-LAST:event_nameTextFieldKeyTyped

    private void JDateChooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JDateChooserKeyPressed
        // TODO add your handling code here:
        Date selectedDate = JDateChooser.getDate();
        if (selectedDate != null) {
            // Perform additional validation if needed
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);
            System.out.println("Selected Date of Birth: " + formattedDate);
        } else {
            // Handle the case where no date is selected
            System.out.println("Please select a valid date of birth.");
        }

    }//GEN-LAST:event_JDateChooserKeyPressed

    private void JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPasswordFieldActionPerformed
        // TODO add your handling code here:
        char[] passwordChar = JPasswordField.getPassword();
        String userEnteredPassword = new String(passwordChar);

        String passwordRegex = "^(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(userEnteredPassword);

        if (!matcher.matches()) {
            passwordErrorLabel.setText("Invalid Password!");
        } else {
            passwordErrorLabel.setText(null);
        }

    }//GEN-LAST:event_JPasswordFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose(); // Close the current frame
        new LoginMainFrame().setVisible(true); // Show the login frame
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateChooser;
    private javax.swing.JPasswordField JPasswordField;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JLabel RegistrationTitleLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JPanel mainPanel2;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void cleanup() {
        nameTextField.setText("");
        emailTextField.setText("");
        JDateChooser.setDate(null);
        JPasswordField.setText("");
    }
    
    

}
