public class Home extends javax.swing.JFrame {

public Home() {
    initComponents();
    setResizable(false);
}

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        patients = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medicines = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        earnings = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        checkup = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        powerOff = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("SSUET Hospital");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Hospital Managemnet System");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/smalllogo.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        patients.setBackground(new java.awt.Color(255, 255, 255));
        patients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        patients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientsMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/patient.gif"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Patients");

        javax.swing.GroupLayout patientsLayout = new javax.swing.GroupLayout(patients);
        patients.setLayout(patientsLayout);
        patientsLayout.setHorizontalGroup(
            patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsLayout.createSequentialGroup()
                .addGroup(patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(patientsLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientsLayout.setVerticalGroup(
            patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18))
        );

        medicines.setBackground(new java.awt.Color(255, 255, 255));
        medicines.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        medicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medicinesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medicinesMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/medicines.gif"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("medicines");

        javax.swing.GroupLayout medicinesLayout = new javax.swing.GroupLayout(medicines);
        medicines.setLayout(medicinesLayout);
        medicinesLayout.setHorizontalGroup(
            medicinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicinesLayout.createSequentialGroup()
                .addGroup(medicinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medicinesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(medicinesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medicinesLayout.setVerticalGroup(
            medicinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicinesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );

        reports.setBackground(new java.awt.Color(255, 255, 255));
        reports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/reports.gif"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Reports");

        javax.swing.GroupLayout reportsLayout = new javax.swing.GroupLayout(reports);
        reports.setLayout(reportsLayout);
        reportsLayout.setHorizontalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(30, 30, 30))
        );
        reportsLayout.setVerticalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18))
        );

        earnings.setBackground(new java.awt.Color(255, 255, 255));
        earnings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        earnings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                earningsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                earningsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                earningsMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/money.gif"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Earnings");

        javax.swing.GroupLayout earningsLayout = new javax.swing.GroupLayout(earnings);
        earnings.setLayout(earningsLayout);
        earningsLayout.setHorizontalGroup(
            earningsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(earningsLayout.createSequentialGroup()
                .addGroup(earningsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(earningsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(earningsLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        earningsLayout.setVerticalGroup(
            earningsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(earningsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18))
        );

        checkup.setBackground(new java.awt.Color(255, 255, 255));
        checkup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        checkup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkupMouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/checkup.gif"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Check Up");

        javax.swing.GroupLayout checkupLayout = new javax.swing.GroupLayout(checkup);
        checkup.setLayout(checkupLayout);
        checkupLayout.setHorizontalGroup(
            checkupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkupLayout.createSequentialGroup()
                .addGroup(checkupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(checkupLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkupLayout.setVerticalGroup(
            checkupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18))
        );

        powerOff.setBackground(new java.awt.Color(255, 255, 255));
        powerOff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        powerOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                powerOffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                powerOffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                powerOffMouseExited(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/poweroff.gif"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Power Off");

        javax.swing.GroupLayout powerOffLayout = new javax.swing.GroupLayout(powerOff);
        powerOff.setLayout(powerOffLayout);
        powerOffLayout.setHorizontalGroup(
            powerOffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(powerOffLayout.createSequentialGroup()
                .addGroup(powerOffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(powerOffLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(powerOffLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        powerOffLayout.setVerticalGroup(
            powerOffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(powerOffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/medical.gif"))); // NOI18N
        jLabel16.setMaximumSize(new java.awt.Dimension(500, 400));
        jLabel16.setMinimumSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(earnings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(medicines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(powerOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(medicines, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(earnings, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(patients, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkup, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(powerOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1014, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void patientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsMouseEntered
    patients.setBackground(java.awt.Color.decode("#deedee"));        
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsMouseEntered

    private void patientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsMouseExited
    patients.setBackground(java.awt.Color.WHITE); 
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsMouseExited

    private void medicinesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinesMouseEntered
    medicines.setBackground(java.awt.Color.decode("#deedee"));
        // TODO add your handling code here:
    }//GEN-LAST:event_medicinesMouseEntered

    private void medicinesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinesMouseExited
    medicines.setBackground(java.awt.Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_medicinesMouseExited

    private void patientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsMouseClicked
        Patients patients= new Patients();
        this.setVisible(false);
        patients.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsMouseClicked

    private void medicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinesMouseClicked
        Medicines medicines=new Medicines();
        this.setVisible(false);
        medicines.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_medicinesMouseClicked

    private void checkupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseEntered
        checkup.setBackground(java.awt.Color.decode("#deedee"));
        // TODO add your handling code here:
    }//GEN-LAST:event_checkupMouseEntered

    private void checkupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseExited
        checkup.setBackground(java.awt.Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_checkupMouseExited

    private void checkupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseClicked
        CheckUp checkup=new CheckUp();
        this.setVisible(false);
        checkup.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_checkupMouseClicked

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
    reports.setBackground(java.awt.Color.decode("#deedee"));
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(java.awt.Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsMouseExited

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        Reports reports = new Reports();
        this.setVisible(false);
        reports.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsMouseClicked

    private void earningsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earningsMouseEntered
        earnings.setBackground(java.awt.Color.decode("#deedee"));
        // TODO add your handling code here:
    }//GEN-LAST:event_earningsMouseEntered

    private void earningsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earningsMouseExited
        earnings.setBackground(java.awt.Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_earningsMouseExited

    private void earningsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earningsMouseClicked
        Earnings earnings=new Earnings();
        this.setVisible(false);
        earnings.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_earningsMouseClicked

    private void powerOffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerOffMouseEntered
        powerOff.setBackground(java.awt.Color.decode("#deedee"));
        // TODO add your handling code here:
    }//GEN-LAST:event_powerOffMouseEntered

    private void powerOffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerOffMouseExited
        powerOff.setBackground(java.awt.Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_powerOffMouseExited

    private void powerOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerOffMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_powerOffMouseClicked

    
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
        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Home().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel checkup;
    private javax.swing.JPanel earnings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel medicines;
    private javax.swing.JPanel patients;
    private javax.swing.JPanel powerOff;
    private javax.swing.JPanel reports;
    // End of variables declaration//GEN-END:variables
}
