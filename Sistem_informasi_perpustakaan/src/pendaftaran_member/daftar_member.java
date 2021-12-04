/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pendaftaran_member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import sistem_informasi_perpustakaan.Main_menu;
import sistem_informasi_perpustakaan.connection.db_connection;

/**
 *
 * @author asus
 */
public class daftar_member extends javax.swing.JFrame {

    /**
     * Creates new form daftar_member
     */
    public daftar_member() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonDaftar = new javax.swing.JButton();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jDateChooserBirth = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 496));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jTextFieldNama.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextFieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, -1));

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, -1));

        jButtonDaftar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDaftar.setText("Daftar");
        jButtonDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDaftarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 166, -1));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "laki-laki", "perempuan" }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 166, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 74, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jTextFieldPhone.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 74, -1));

        jTextAreaAddress.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jDateChooserBirth.setDateFormatString("d MMMMM , yyyy");
        jDateChooserBirth.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jDateChooserBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 166, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Birth Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Daftar Member");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 203, 44));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 73, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_ground.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDaftarActionPerformed
        
        String gender;
        String nama = jTextFieldNama.getText();
        String email = jTextFieldEmail.getText();
        String phone = jTextFieldPhone.getText();
        String address = jTextAreaAddress.getText();
        
        Date ys = new Date();
        SimpleDateFormat dateNow = new SimpleDateFormat("yyy-MM-dd");//menentukan format tanggal (tahun-bulan-hari)
        String nowDate = dateNow.format(ys);// menyimpan tanggal sekarang ke dalam variabel yg bertipe string
        SimpleDateFormat dateformat = new SimpleDateFormat("yyy-MM-dd");
        String birth = dateformat.format(jDateChooserBirth.getDate());
        
        LocalDate ultah = LocalDate.parse(birth, DateTimeFormatter.ISO_DATE);
        LocalDate now = LocalDate.parse(nowDate, DateTimeFormatter.ISO_DATE);
        
        Connection conn = db_connection.getConnection();
        PreparedStatement ps = null;
        String sql ="INSERT INTO tb_member (nama,jenis_kelamin,tanggal_lahir,No_hp,email,alamat,tgl_daftar) VALUES (?,?,?,?,?,?,?);";
        
        if(jComboBoxGender.getSelectedItem()=="laki-laki"){
            gender = "laki-laki";
        } else {
            gender = "perempuan";
        }
        
        if(jTextFieldNama.getText().equals("") || jTextFieldPhone.getText().equals("")
                || jTextFieldEmail.getText().equals("") || jTextAreaAddress.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Pastikan Semua Data Terisi");
        }else if(ultah.isAfter(now)){
            JOptionPane.showMessageDialog(null,"Tanggal Ulang Tahun \nMelebihi Tanggal Sekarang");
        }else {
            try {
                ps = conn.prepareStatement(sql);
                ps.setString(1,nama);
                ps.setString(2,gender);
                ps.setString(3,birth);
                ps.setString(4,phone);
                ps.setString(5,email);
                ps.setString(6,address);
                ps.setString(7,nowDate);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Pendaftaran Berhasil");

                Main_menu mn_menu = new Main_menu();
                mn_menu.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(daftar_member.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonDaftarActionPerformed

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGenderActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main_menu mn_menu = new Main_menu();
        mn_menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(daftar_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDaftar;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooserBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
