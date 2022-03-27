package GUI;


public class output extends javax.swing.JFrame {
    
    int month2[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public output() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cardNo = new javax.swing.JTextField();
        OKbtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Untitled-1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(240, 240));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Untitled-1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ID Card Info Finder");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel2.add(cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, 160, -1));

        OKbtn.setBackground(new java.awt.Color(51, 255, 255));
        OKbtn.setText("Ok");
        OKbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtnActionPerformed(evt);
            }
        });
        jPanel2.add(OKbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel12.setText("Enter ID Card Number");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel13.setText("Developed by Thilina Dilshan");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 310));

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Details");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 390, 38);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Gender      : ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(60, 80, 110, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Birth Year : ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(60, 120, 110, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Month       : ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(60, 160, 110, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Date           : ");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 200, 120, 25);

        gender.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        gender.setText(" ");
        jPanel3.add(gender);
        gender.setBounds(190, 70, 110, 40);

        year.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        year.setText(" ");
        jPanel3.add(year);
        year.setBounds(190, 121, 90, 25);

        month.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        month.setText(" ");
        jPanel3.add(month);
        month.setBounds(190, 156, 130, 30);

        date.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        date.setText(" ");
        jPanel3.add(date);
        date.setBounds(190, 196, 60, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 320, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(574, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtnActionPerformed
        String number = cardNo.getText();
        int n = number.length();
        if(n==12){
            
            int d2;
            year.setText(number.substring(0,4));
            String set2Text = number.substring(4,7);
            int intValue = Integer.parseInt(set2Text);
            int d = Integer.parseInt(number.substring(4, 7));
            if (d > 500) {
                d2 = (d - 500);
            } 
            else {
                d2 = d;
            }
            
            
            
            if(intValue>500){
                gender.setText("Female");
            }
            else{
                gender.setText("Male");
            }
            
                int mo = 0, da = 0;
                int days = d2;

            for (int i = 0; i < month2.length; i++) {
                if (days < month2[i]) {
                    mo = i + 1;
                    da = days;
                    break;
                } else {
                    days = days - month2[i];
                }
            }
            //System.out.println("Month : " + mo + "\nDate : " + da);
            date.setText(Integer.toString(da));
            month.setText(Integer.toString(mo));
             
        }
        else{
            year.setText("19"+number.substring(0,2));
            String set2Text = number.substring(2,5);
            int intValue = Integer.parseInt(set2Text);
            int d = Integer.parseInt(number.substring(2, 5));
            int d2;
            
            if (d > 500) {
                d2 = (d - 500);
            } 
            else {
                d2 = d;
            }
            
            if(intValue>500){
                gender.setText("Female");
            }
            else{
                gender.setText("Male");
            }
            
            int mo = 0, da = 0;
                int days = d2;

            for (int i = 0; i < month2.length; i++) {
                if (days < month2[i]) {
                    mo = i + 1;
                    da = days;
                    break;
                } else {
                    days = days - month2[i];
                }
            }
            //System.out.println("Month : " + mo + "\nDate : " + da);
            date.setText(Integer.toString(da));
            month.setText(Integer.toString(mo));
        }
        
    }//GEN-LAST:event_OKbtnActionPerformed

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
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new output().setVisible(true);
            }
        });
    }
    
    static int leap(int year){
        
        // year to be checked
    
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      //System.out.println(year + " is a leap year.");
        return 1;
    else
      //System.out.println(year + " is not a leap year.");
        return 0;
    }
    
    public int getDays(String number,int n) {
        int d;
        if (n==12) {
            d = Integer.parseInt(number.substring(4, 7));
        } else {
            d = Integer.parseInt(number.substring(2, 5));
        }
        if (d > 500) {
            return (d - 500);
        } else {
            return d;
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKbtn;
    private javax.swing.JTextField cardNo;
    private javax.swing.JLabel date;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel month;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
