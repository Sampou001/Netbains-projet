
package login;
import java.awt.Color;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
//import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Register extends javax.swing.JFrame {

    
    public Register() {
        initComponents();
        Border borderRegister = BorderFactory.createMatteBorder(7, 7, 7, 7, Color.yellow);
        panelregister.setBorder(borderRegister);
        
        Border borderclose = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
        lblClose.setBorder(borderclose);
        
        Border borderMinimize = BorderFactory.createMatteBorder(1,1,1,1, Color.black);
        lblMinimize.setBorder(borderMinimize);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelregister = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        btnRegister = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelregister.setBackground(new java.awt.Color(204, 0, 153));
        panelregister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setPreferredSize(new java.awt.Dimension(5, 15));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        panelregister.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 20, 30));

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setPreferredSize(new java.awt.Dimension(5, 15));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        panelregister.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 20, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ENREGISTREMENT");
        panelregister.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 360, 100));

        getContentPane().add(panelregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 50, 20));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 280, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 20));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 280, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, 20));

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 280, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, 20));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 280, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(">> Already Have an Account ? Login<<");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 370, 30));

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbFemale.setSelected(true);
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mail");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, 20));

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbMale.setText("Male");
        getContentPane().add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister.setText("Enregistrez");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 370, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Genre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, 20));
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 280, 30));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 280, 30));

        setSize(new java.awt.Dimension(601, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        loggin login = new loggin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(checkEmptyFields())
            JOptionPane.showMessageDialog(null,"s'il vous plait saisissez toutes les informations", "Information",JOptionPane.ERROR_MESSAGE);
        else{
            String name = txtName.getText();
            String username = txtUsername.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String confirmPassword = String.valueOf(txtConfirmPassword.getPassword());
            String phone = txtPhone.getText();
            String mail = txtMail.getText();
            String gender ="Male";
            if(rbFemale.isSelected())
                gender ="Female";
            if(!matchingPasswords(password,confirmPassword)){
                JOptionPane.showMessageDialog(null,"Mot de passe incorrecte", "Mot de passe",JOptionPane.ERROR_MESSAGE);
                
            }else{
                PreparedStatement ps;
             
                String query = "insert into users.user3(name1,username,password,phone,mail,gender) values(?,?,?,?,?,?)";//image a été delete
                try{                 
                    ps = Connection_DBJ.getConnection().prepareStatement(query);
                    ps.setString(1,name);
                    ps.setString(2,username);
                    ps.setString(3,password);
                    ps.setString(4,phone);
                    ps.setString(5,mail);
                    ps.setString(6,gender);
                    /*try{
                        InputStream image = new FileInputStream(new File(lblImagePath.getText()));//chemin de l'image
                        ps.setBlob(7,image);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"L'image n'a pas été copiée", "ERROR",JOptionPane.PLAIN_MESSAGE);
                    }*/
                    if(!checkUser()){
                        if(ps.executeUpdate()!=0){
                           JOptionPane.showMessageDialog(null,"Votre compte a été créé avec SUCCESS", "SUCCESS",JOptionPane.PLAIN_MESSAGE);
                    }
                     else{
                           JOptionPane.showMessageDialog(null,"Votre Compte n'a pas été créé", "ERROR",JOptionPane.PLAIN_MESSAGE);
                         } 
                         }
               
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Erreur de connexion avec la BD", "ERROR",JOptionPane.PLAIN_MESSAGE);
                    //JOptionPane.showMessageDialog(null,""+ex.getMessage());
                }
            }
         
            
            
                
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char key = evt.getKeyChar();
        if(!Character.isDigit(key)){
             evt.consume();
        }
           
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
         Border borderClose = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
       lblClose.setBorder(borderClose);
       lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        Border borderClose = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
       lblClose.setBorder(borderClose);
       lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        Border borderClose = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
       lblMinimize.setBorder(borderClose);
       lblMinimize.setForeground(Color.white);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        Border borderClose = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
       lblMinimize.setBorder(borderClose);
       lblMinimize.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private boolean checkEmptyFields(){
        return(txtName.getText().equals("") || txtUsername.getText().equals("") ||String.valueOf(txtPassword.getPassword()).equals("")
                || String.valueOf(txtConfirmPassword.getPassword()).equals("") || txtPhone.getText().equals("") || txtMail.getText().equals("")
                /*|| lblImagePath.getText().equals("image path ")*/);
    }
    private boolean matchingPasswords(String p1,String p2){
        return (p1.equals(p2));
    }
    private boolean checkUser(){
        PreparedStatement ps;
        ResultSet rs;
        boolean userExist = false;
        String query = "select name,username From users.user3 where username=?";
        try{
            ps = Connection_DBJ.getConnection().prepareStatement(query);
            ps.setString(1,txtUsername.getText());
            rs = ps.executeQuery();
            if(rs.next()){
                userExist = true;
                JOptionPane.showMessageDialog(null,"Le nom d'utilisateur existe déjà", "ERROR",JOptionPane.ERROR_MESSAGE);
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erreur de connexion avec la BD", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return userExist;
    }
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel panelregister;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
