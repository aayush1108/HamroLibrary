
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class passwordrecovery extends javax.swing.JFrame {

    Connection conn;

    public passwordrecovery() {
        super("Forgot Passsword");
        initComponents();
        conn = databaseconnectivity.ConnectDb();

    }

    public void search() {
        try {
            String UN = jTextField_UN.getText();
            String sql = "select * from accountcreate where Username='" + UN + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String Name = null;
            String SecreteQsn = null;
            if(rs.next()) {
                Name = rs.getString("Name") + "\t";
                SecreteQsn = rs.getString("SecreteQsn") + "\t";
                jTextField_Name.setText(Name);
                jTextField_SecQsn.setText(SecreteQsn);
                rs.close();
                st.close();
                   }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username");
            }
               } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    //If answer is correct the retrive button will show the password in textfield
    public void Retrieve(){
            String Ans=jTextField_Ans.getText();
              String sql="select * from Accountcreate where Answer='"+Ans+"'";
            try{
                PreparedStatement pst=conn.prepareStatement(sql);
                ResultSet rs=pst.executeQuery();
                if(rs.next()){
                    int Answer = 0;
                    jTextField_Pass.setText(rs.getString(3));
                     }
                else{
                        JOptionPane.showMessageDialog(null, "Answer Incorrect");
                }
             }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
    }}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_SecQsn = new javax.swing.JTextField();
        jTextField_Pass = new javax.swing.JTextField();
        jTextField_Ans = new javax.swing.JTextField();
        jButton_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_search = new javax.swing.JButton();
        jTextField_UN = new javax.swing.JTextField();
        jButton_Retrive = new javax.swing.JButton();
        jButton_back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Recovery");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true), "Password Recovery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        jTextField_SecQsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SecQsnActionPerformed(evt);
            }
        });

        jTextField_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PassActionPerformed(evt);
            }
        });

        jTextField_Ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AnsActionPerformed(evt);
            }
        });

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Name");

        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jLabel5.setText("Your Password");

        jLabel3.setText("Your Security Question");

        jLabel4.setText("Answer");

        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jTextField_UN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UNActionPerformed(evt);
            }
        });

        jButton_Retrive.setText("Retrive");
        jButton_Retrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RetriveActionPerformed(evt);
            }
        });

        jButton_back1.setText("Clear Data");
        jButton_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Retrive)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jTextField_Ans)
                            .addComponent(jTextField_SecQsn)
                            .addComponent(jTextField_UN)
                            .addComponent(jTextField_Name))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_back1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton_search)
                    .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_back1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_SecQsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_back)
                    .addComponent(jButton_Retrive))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UNActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_SecQsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SecQsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SecQsnActionPerformed

    private void jTextField_AnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AnsActionPerformed

    private void jTextField_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PassActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        search();    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back1ActionPerformed
        jTextField_UN.setText("");
        jTextField_Name.setText("");
        jTextField_SecQsn.setText("");
        jTextField_Ans.setText("");
        jTextField_Pass.setText("");
    }//GEN-LAST:event_jButton_back1ActionPerformed

    private void jButton_RetriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RetriveActionPerformed
       //Retrieve Method is called here
       Retrieve();
    }//GEN-LAST:event_jButton_RetriveActionPerformed

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
            java.util.logging.Logger.getLogger(passwordrecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passwordrecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passwordrecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passwordrecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passwordrecovery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Retrive;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_back1;
    private javax.swing.JButton jButton_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Ans;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Pass;
    private javax.swing.JTextField jTextField_SecQsn;
    private javax.swing.JTextField jTextField_UN;
    // End of variables declaration//GEN-END:variables
}
