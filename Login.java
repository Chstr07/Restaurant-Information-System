
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


    
    

public class Login extends javax.swing.JFrame {
    
    String FilePath = "C:\\Users\\chest\\OneDrive\\Desktop\\OOPTP\\DataBase.txt";
    ArrayList<String> all_usernames = new ArrayList<>();
    Map<String, String> usernameANDpassword = new HashMap<>();
    
    
    public Login() {
       initComponents();
    
    getUsers();
    
    for(String uname:all_usernames){
    System.out.println("uname");
}
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pass = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblKey = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        btnLClr = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        RFullname = new javax.swing.JTextField();
        RUser = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnRClr = new javax.swing.JButton();
        REmail = new javax.swing.JTextField();
        lblRCPass = new javax.swing.JLabel();
        lblRUser = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblREmail = new javax.swing.JLabel();
        lblRpass = new javax.swing.JLabel();
        RCPass = new javax.swing.JPasswordField();
        RPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(182, 147, 95));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, 40));

        lblPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PASS.png"))); // NOI18N
        jPanel1.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 40));

        btnLogin.setBackground(new java.awt.Color(218, 175, 121));
        btnLogin.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 50));

        lblKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/key.png"))); // NOI18N
        jPanel1.add(lblKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        user.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 200, 40));

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/USER.png"))); // NOI18N
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 50));

        lblLogin.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        lblLogin.setText("LOGIN");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 160, 40));

        btnLClr.setBackground(new java.awt.Color(218, 175, 121));
        btnLClr.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        btnLClr.setText("CLEAR");
        btnLClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLClrActionPerformed(evt);
            }
        });
        jPanel1.add(btnLClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 190, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 490, 350));

        jPanel2.setBackground(new java.awt.Color(87, 58, 21));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 10, 490));

        jPanel3.setBackground(new java.awt.Color(182, 147, 95));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegister.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        lblRegister.setText("Register");
        jPanel3.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 50));

        RFullname.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        RFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFullnameActionPerformed(evt);
            }
        });
        jPanel3.add(RFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 280, 40));

        RUser.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        RUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUserActionPerformed(evt);
            }
        });
        jPanel3.add(RUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 280, 40));

        btnRegister.setBackground(new java.awt.Color(218, 175, 121));
        btnRegister.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 50));

        btnRClr.setBackground(new java.awt.Color(218, 175, 121));
        btnRClr.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        btnRClr.setText("CLEAR");
        btnRClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRClrActionPerformed(evt);
            }
        });
        jPanel3.add(btnRClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 190, 50));

        REmail.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        REmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REmailActionPerformed(evt);
            }
        });
        jPanel3.add(REmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 280, 40));

        lblRCPass.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        lblRCPass.setText("CONFIRM:");
        jPanel3.add(lblRCPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, -1));

        lblRUser.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        lblRUser.setText("USERNAME:");
        jPanel3.add(lblRUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, -1));

        lblFName.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        lblFName.setText("FULLNAME:");
        jPanel3.add(lblFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, -1));

        lblREmail.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        lblREmail.setText("EMAIL:");
        jPanel3.add(lblREmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, -1));

        lblRpass.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        lblRpass.setText("PASSWORD:");
        jPanel3.add(lblRpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, -1));

        RCPass.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        RCPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCPassActionPerformed(evt);
            }
        });
        jPanel3.add(RCPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 280, 40));

        RPass.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jPanel3.add(RPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 280, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 490, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkIfUsernameExists(String un){
        boolean exist = false;
        
        for(String username: all_usernames){
            if(username.equals(un)){
                exist = true;
            }
        }
        
        return exist;
    }
    public void getUsers()
    {
        File file = new File(FilePath);
        String username = "";
        String password = "";
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            Object[] lines = br.lines().toArray();
            for(int i=0; i<lines.length; i++){
                String[] row = lines[i].toString().split(":");
                if(row[0].equals("Username")){
                    username = row[1];
                    all_usernames.add(username);
                }
                else if(row[0].equals("Password")){
                    password = row[1];
                }
                if(!username.equals("")&& !password.equals("")){
                    usernameANDpassword.put(username, password);
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String username = RUser.getText();
        String fullname = RFullname.getText();
        String email = REmail.getText();
        String password = String.valueOf(RPass.getPassword());
        String cpassword = String.valueOf(RCPass.getPassword());
        
        File file = new File(FilePath);
        try {
            FileWriter fw = new FileWriter(file, true);
            
            if (password.equals(cpassword)){
                if(!checkIfUsernameExists(username)){
                    fw.write("Username: " + username + "\r\n" );
                    fw.write("Fullname: " + fullname + "\r\n" );
                    fw.write("Email: " + email + "\r\n" );
                    fw.write("Password: " + password + "\r\n");
                    fw.write("----------------------" + "\r\n");
                    fw.close();  
                }
                else{
                JOptionPane.showMessageDialog(null,"Username Already Exist, Try Another One");
            }
            }
            else{
                JOptionPane.showMessageDialog(null,"Password Confirmation Error");
            }
            
         
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void btnRClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRClrActionPerformed
        RUser.setText("");
        RFullname.setText("");
        REmail.setText("");
        RPass.setText("");
        RCPass.setText("");
        
        
        
    }//GEN-LAST:event_btnRClrActionPerformed

    private void RUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RUserActionPerformed

    private void RFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RFullnameActionPerformed

    private void btnLClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLClrActionPerformed
        user.setText("");
        pass.setText("");
    }//GEN-LAST:event_btnLClrActionPerformed

    private void REmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REmailActionPerformed

    private void RCPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RCPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField RCPass;
    private javax.swing.JTextField REmail;
    private javax.swing.JTextField RFullname;
    private javax.swing.JPasswordField RPass;
    private javax.swing.JTextField RUser;
    private javax.swing.JButton btnLClr;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRClr;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblKey;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRCPass;
    private javax.swing.JLabel lblREmail;
    private javax.swing.JLabel lblRUser;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblRpass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    

}
