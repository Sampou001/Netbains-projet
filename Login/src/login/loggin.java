package login;
import java.awt.Color;
//import static java.awt.Color.yellow;
import java.sql.*;
import javax.swing.BorderFactory;
//import javafx.scene.layout.Border;
//import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
//import static javax.swing.JOptionPane.ERROR_MESSAGE;
//import javax.swing.border.MatteBorder;

public class loggin extends javax.swing.JFrame {

    public loggin() {
        initComponents();
        Border borderlogin = BorderFactory.createMatteBorder(3,3,3,3,Color.yellow);
        panelLogin.setBorder(borderlogin);
        
        Border borderClose = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        lblClose.setBorder(borderClose);
        Border borderMinimize = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        lblMinimize.setBorder(borderMinimize);
        
        Border borderUsername = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        txtUsername.setBorder(borderUsername);
        Border borderpassword = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        txtPassword.setBorder(borderpassword);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtCreate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(102, 102, 102));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setOpaque(true);
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, 70));

        lblMinimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
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
        panelLogin.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, -1));

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
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
        lblClose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblCloseKeyPressed(evt);
            }
        });
        panelLogin.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, -1));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 120));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 250, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 250, 40));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 310, 40));

        txtCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCreate.setText(">>Create a new account<<");
        txtCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCreateMouseClicked(evt);
            }
        });
        getContentPane().add(txtCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 310, 40));

        setSize(new java.awt.Dimension(600, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void txtCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCreateMouseClicked
        Register register = new Register();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        loggin.super.dispose();
    }//GEN-LAST:event_txtCreateMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        if(checkEmptyFields()){
            JOptionPane.showMessageDialog(null,"S'il vous plait entrez Username et le password","Information",JOptionPane.ERROR_MESSAGE);
        }else{
            PreparedStatement ps;
            ResultSet rs;
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String query = "select * From users.user3 where username=? and password=?";
            try{
                ps = Connection_DBJ.getConnection().prepareStatement(query);
                ps.setString(1,username);
                ps.setString(2,password); 
                rs = ps.executeQuery();
                if(rs.next()){
                    menu men = new menu();
                    men.setVisible(true);
                    men.setLocationRelativeTo(null);
                    men.getLblWelcom().setText("Welcom "+rs.getString(1)+" le GUINEEN");
                    loggin.super.dispose();
                }else
                    JOptionPane.showMessageDialog(null,"Username ou Password incorrecte","incorrect data",JOptionPane.ERROR_MESSAGE);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Connection avec la BD  faible");
                
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
         System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        
    }//GEN-LAST:event_txtUsernameActionPerformed

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

    private void lblCloseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCloseKeyPressed
      
       
    }//GEN-LAST:event_lblCloseKeyPressed

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
        return (txtUsername.getText().equals("")||txtPassword.getText().equals(""));
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel txtCreate;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
