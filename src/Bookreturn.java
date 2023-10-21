
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Bookreturn extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public Bookreturn() {
        super("Return");
        initComponents();
        conn = databaseconnectivity.ConnectDb();
    }

    public void Delete() {
        String sql = "delete from bookissue where Std_ID=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_StdId.getText());
            pst.execute();
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E);
        }
    }

    public void ReturnUpdate() {
        String sql = "insert into bookreturn values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_StdId.getText());
            pst.setString(2, jTextField_StdName.getText());
            pst.setString(3, jTextField_ParName.getText());
            pst.setString(4, jTextField_class.getText());
            pst.setString(5, jTextField_Year.getText());
            pst.setString(6, jTextField_Section.getText());
            pst.setString(7, jTextField_Phone.getText());
            pst.setString(8, jTextField_Bookid.getText());
            pst.setString(9, jTextField_Bookname.getText());
            pst.setString(10, jTextField_Writersname.getText());
            pst.setString(11, jTextField_Publisher.getText());
            pst.setString(12, jTextField_Edition.getText());
            pst.setString(13, jTextField_Price.getText());
            pst.setString(14, jTextField_Issued.getText());
            pst.setString(15, ((JTextField) jDateChooser_Return.getDateEditor().getUiComponent()).getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Book Returned");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, E.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_StdId = new javax.swing.JTextField();
        jTextField_Year = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_StdName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ParName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_Bookid = new javax.swing.JTextField();
        jTextField_Bookname = new javax.swing.JTextField();
        jTextField_Writersname = new javax.swing.JTextField();
        jTextField_Edition = new javax.swing.JTextField();
        jTextField_Price = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Issued = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField_Section = new javax.swing.JTextField();
        jTextField_class = new javax.swing.JTextField();
        jTextField_Publisher = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser_Return = new com.toedter.calendar.JDateChooser();
        jButton_Return = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();
        jButton_Renew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true), "Book Return", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        jLabel1.setText("Student ID");

        jLabel7.setText("Phone No");

        jTextField_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_YearActionPerformed(evt);
            }
        });

        jLabel3.setText("Parent's Name");

        jLabel6.setText("Section");

        jLabel4.setText("Class");

        jLabel5.setText("Year");

        jLabel2.setText("Student's Name");

        jTextField_ParName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ParNameActionPerformed(evt);
            }
        });

        jLabel12.setText("Book ID");

        jLabel9.setText("Book Name");

        jLabel11.setText("Writer's Name");

        jLabel10.setText("Publisher");

        jLabel8.setText("Edition");

        jLabel13.setText("Price");

        jTextField_Writersname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_WritersnameActionPerformed(evt);
            }
        });

        jLabel14.setText("Date Of Issue");

        jButton3.setMnemonic('S');
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField_Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SectionActionPerformed(evt);
            }
        });

        jTextField_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_classActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_StdId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_StdName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ParName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_class, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Section, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_Bookname, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addComponent(jTextField_Bookid)
                        .addComponent(jTextField_Writersname)
                        .addComponent(jTextField_Price)
                        .addComponent(jTextField_Issued)
                        .addComponent(jTextField_Publisher))
                    .addComponent(jTextField_Edition, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_StdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_StdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_ParName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_Writersname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jTextField_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Bookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jTextField_Issued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel16.setText("Return Date");

        jButton_Return.setMnemonic('R');
        jButton_Return.setText("Return");
        jButton_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnActionPerformed(evt);
            }
        });

        jButton_Back.setMnemonic('K');
        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jButton_Renew.setMnemonic('N');
        jButton_Renew.setText("Renew");
        jButton_Renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RenewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Return)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Renew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Back))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser_Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Back)
                    .addComponent(jButton_Return)
                    .addComponent(jButton_Renew))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ParNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ParNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ParNameActionPerformed

    private void jTextField_WritersnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_WritersnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_WritersnameActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_RenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RenewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RenewActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql = "select * from bookissue where Std_ID=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_StdId.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String add = rs.getString("Std_Name");
                jTextField_StdName.setText(add);
                String add1 = rs.getString("Par_Name");
                jTextField_ParName.setText(add1);
                String add2 = rs.getString("Class");
                jTextField_class.setText(add2);
                String add3 = rs.getString("Year");
                jTextField_Year.setText(add3);
                String add4 = rs.getString("Section");
                jTextField_Section.setText(add4);
                String add5 = rs.getString("Phone");
                jTextField_Phone.setText(add5);
                String add6 = rs.getString("Book_ID");
                jTextField_Bookid.setText(add6);
                String add7 = rs.getString("Book_Name");
                jTextField_Bookname.setText(add7);
                String add8 = rs.getString("Writers_Name");
                jTextField_Writersname.setText(add8);
                String add9 = rs.getString("Publisher");
                jTextField_Publisher.setText(add9);
                String add10 = rs.getString("Edition");
                jTextField_Edition.setText(add10);
                String add11 = rs.getString("Price");
                jTextField_Price.setText(add11);
                String add12 = rs.getString("Issue_Date");
                jTextField_Issued.setText(add12);
                rs.close();
                pst.close();
            } else {
                JOptionPane.showMessageDialog(null, "Book not issued with with ID");
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Please Enter valid Student ID");
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, E);
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed
    public void reset() {
        jTextField_StdId.setText("");
        jTextField_StdName.setText("");
        jTextField_ParName.setText("");
        jTextField_class.setText("");
        jTextField_Year.setText("");
        jTextField_Section.setText("");
        jTextField_Phone.setText("");
        jTextField_Bookid.setText("");
        jTextField_Bookname.setText("");
        jTextField_Writersname.setText("");
        jTextField_Publisher.setText("");
        jTextField_Edition.setText("");
        jTextField_Price.setText("");
        jTextField_Issued.setText("");
    }

    private void jTextField_SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SectionActionPerformed

    private void jTextField_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_classActionPerformed

    private void jTextField_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_YearActionPerformed

    private void jButton_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnActionPerformed
        Delete();
        ReturnUpdate();
    }//GEN-LAST:event_jButton_ReturnActionPerformed

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
            java.util.logging.Logger.getLogger(Bookreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookreturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Renew;
    private javax.swing.JButton jButton_Return;
    private com.toedter.calendar.JDateChooser jDateChooser_Return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Bookid;
    private javax.swing.JTextField jTextField_Bookname;
    private javax.swing.JTextField jTextField_Edition;
    private javax.swing.JTextField jTextField_Issued;
    private javax.swing.JTextField jTextField_ParName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Publisher;
    private javax.swing.JTextField jTextField_Section;
    private javax.swing.JTextField jTextField_StdId;
    private javax.swing.JTextField jTextField_StdName;
    private javax.swing.JTextField jTextField_Writersname;
    private javax.swing.JTextField jTextField_Year;
    private javax.swing.JTextField jTextField_class;
    // End of variables declaration//GEN-END:variables
}
