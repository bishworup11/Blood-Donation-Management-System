
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bishw
 */
public class recipientAccount extends javax.swing.JFrame {

    /**
     * Creates new form recipientAccount
     */
      String user, type,mobile;
    int id;
    
    public recipientAccount(String user,int id) {
        initComponents();
         this.user = user;
        this.id = id;
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/blooddonation1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from recipient where user_name='" + user + "' AND Id='" + id + "' ");
            rs.next();
            type = rs.getString(9);
            idT.setText(rs.getString(1));
            nameT.setText(rs.getString(2));
            fathernameT.setText(rs.getString(3));
            mothernameT.setText(rs.getString(4));

            dobT.setText(rs.getString(5));
            mobileT.setText(rs.getString(6));
            mobile=rs.getString(6);
            genderT.setText(rs.getString(7));
            emailT.setText(rs.getString(8));
            bloodT.setText(rs.getString(9));

            cityT.setText(rs.getString(10));
           addressT.setText(rs.getString(11));
    

        } catch (Exception e) {

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

        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idT = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameT = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fathernameT = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mothernameT = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dobT = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        genderT = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bloodT = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        mobileT = new javax.swing.JTextField();
        emailT = new javax.swing.JTextField();
        cityT = new javax.swing.JTextField();
        addressT = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 174, 210, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Donor.png"))); // NOI18N
        jButton6.setText(" Add New Donor ");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 243, 210, 50));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/recipient history.png"))); // NOI18N
        jButton7.setText("Add New Recipient ");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 313, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search user.png"))); // NOI18N
        jButton5.setText("Search Donor");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 383, 210, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/blood-donation.png"))); // NOI18N
        jButton2.setText("Donor History");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 457, 210, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/recipient1.png"))); // NOI18N
        jButton3.setText("Recipient History");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 527, 210, 50));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        jButton8.setText("Logout");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 604, 210, 60));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recipient Account");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 460, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Recipient Id");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 238, 130, -1));

        idT.setBackground(new java.awt.Color(69, 73, 74));
        idT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idT.setForeground(new java.awt.Color(255, 0, 0));
        idT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idT.setOpaque(true);
        getContentPane().add(idT, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 238, 37, 20));

        jLabel10.setBackground(new java.awt.Color(102, 102, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Full Name");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 300, 130, -1));

        nameT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameT.setForeground(new java.awt.Color(255, 255, 255));
        nameT.setText("jLabel2");
        getContentPane().add(nameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 298, 200, -1));

        jLabel11.setBackground(new java.awt.Color(102, 102, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Father's Name");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 343, 130, -1));

        fathernameT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fathernameT.setForeground(new java.awt.Color(255, 255, 255));
        fathernameT.setText("jLabel5");
        getContentPane().add(fathernameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 341, 200, -1));

        jLabel12.setBackground(new java.awt.Color(102, 102, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mother's Name");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 130, -1));

        mothernameT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mothernameT.setForeground(new java.awt.Color(255, 255, 255));
        mothernameT.setText("jLabel6");
        getContentPane().add(mothernameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 200, 17));

        jLabel13.setBackground(new java.awt.Color(102, 102, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Date of Birth");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 420, 130, -1));

        dobT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dobT.setForeground(new java.awt.Color(255, 255, 255));
        dobT.setText("jLabel7");
        getContentPane().add(dobT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 200, -1));

        jLabel14.setBackground(new java.awt.Color(102, 102, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Mobile");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 462, 130, -1));

        jLabel15.setBackground(new java.awt.Color(102, 102, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Gender");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 505, 130, -1));

        genderT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderT.setForeground(new java.awt.Color(255, 255, 255));
        genderT.setText("jLabel9");
        getContentPane().add(genderT, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 503, 200, -1));

        jLabel16.setBackground(new java.awt.Color(102, 102, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Email");
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 559, 130, -1));

        jLabel17.setBackground(new java.awt.Color(102, 102, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Blood Group");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 606, 130, -1));

        bloodT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bloodT.setForeground(new java.awt.Color(255, 255, 255));
        bloodT.setText("jLabel21");
        getContentPane().add(bloodT, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 604, 200, -1));

        jLabel18.setBackground(new java.awt.Color(102, 102, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("City");
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, 130, -1));

        jLabel19.setBackground(new java.awt.Color(102, 102, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Complete Address");
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, 130, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Select your blood group to get blood");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 410, -1, 39));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Blood Group");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("GET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 550, 80, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 490, 94, -1));

        mobileT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mobileT.setForeground(new java.awt.Color(51, 51, 51));
        mobileT.setText("jTextField1");
        mobileT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTActionPerformed(evt);
            }
        });
        getContentPane().add(mobileT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 200, -1));

        emailT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailT.setForeground(new java.awt.Color(0, 0, 0));
        emailT.setText("jTextField1");
        getContentPane().add(emailT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 200, -1));

        cityT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cityT.setForeground(new java.awt.Color(0, 0, 0));
        cityT.setText("jTextField1");
        getContentPane().add(cityT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 240, 200, -1));

        addressT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressT.setForeground(new java.awt.Color(0, 0, 0));
        addressT.setText("jTextField1");
        getContentPane().add(addressT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, 200, -1));

        jButton10.setBackground(new java.awt.Color(0, 102, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hm.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new addDonor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new addRecipient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new search_donor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new donor_history().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          try {
            // TODO add your handling code here:
            String type=jComboBox1.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/blooddonation1","root","");
            
              PreparedStatement pst=con.prepareStatement("insert into recipient_history values(?,?,?,?,?,?)");
         String date=String.valueOf(java.time.LocalDate.now());
        String time=String.valueOf(java.time.LocalTime.now());
            String myuser=user;
           // String blood=type;
            pst.setInt(1, id);
            pst.setString(3,type);
            pst.setString(2,myuser);
            pst.setString(4,mobile);

            pst.setString(5,date);
            pst.setString(6,time);
            pst.executeUpdate();
          //  Statement stm=con.createStatement();
            
            
            
            //update available_unit
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from available_unit where name='"+type+"'");
            rs.next();
            int no=rs.getInt(2)-1;
            PreparedStatement stm=con.prepareStatement("update available_unit set available='"+no+"' where name='"+type+"'");
            stm.executeUpdate();
            JOptionPane.showMessageDialog(this,"Request Successful!!");
            
            
            
            
            new home().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(recipientAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        String name=nameT.getText();
        // String fatherName=jTextField2.getText();
        // String motherName=jTextField3.getText();
        // SimpleDateFormat dFormate=new SimpleDateFormat("dd-MM-yyyy");
        // SimpleDateFormat dFormate=new SimpleDateFormat("yyyy-MM-dd");

        // String dob=dFormate.format(jDateChooser1.getDate());
        String mobile=mobileT.getText();
        // String gender=(String)jComboBox1.getSelectedItem();
        String email=emailT.getText();
        //  String bloodGroup=(String)jComboBox2.getSelectedItem();
        String city=cityT.getText();
        String address=addressT.getText();
        if(mobile.equals("")||email.equals("")||city.equals("")||address.equals(""))
        {
            JOptionPane.showMessageDialog(this, "All field are required");
        }
        else
        {
            try
            {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/blooddonation1","root","");

                // PreparedStatement st=con.prepareStatement("insert into donor values(?,?,?,?,?,?,?,?,?,?,?)");
                PreparedStatement st2=con.prepareStatement("update recipient set mobile='"+mobile+"',email='"+email+"',city='"+city+"',address='"+address+"' where user_name='"+user+"' AND Id='"+id+"' ");
                st2.executeUpdate();

                //  st.setInt(1,id);
                // st.setString(2,name);
                // st.setString(3,fatherName);
                // st.setString(4,motherName);
                // st.setString(5,dob);
                //                  st.setString(6,mobile);
                //                  //st.setString(7, gender);
                //                  st.setString(8, email);
                //                 // st.setString(9, bloodGroup);
                //                  st.setString(10, city);
                //                  st.setString(11, address);

                //                  st.executeUpdate();
                JOptionPane.showMessageDialog(this,"Update Successful!!");

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void mobileTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTActionPerformed

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
            java.util.logging.Logger.getLogger(recipientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recipientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recipientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recipientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recipientAccount("user",1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressT;
    private javax.swing.JLabel bloodT;
    private javax.swing.JTextField cityT;
    private javax.swing.JLabel dobT;
    private javax.swing.JTextField emailT;
    private javax.swing.JLabel fathernameT;
    private javax.swing.JLabel genderT;
    private javax.swing.JLabel idT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mobileT;
    private javax.swing.JLabel mothernameT;
    private javax.swing.JLabel nameT;
    // End of variables declaration//GEN-END:variables
}
