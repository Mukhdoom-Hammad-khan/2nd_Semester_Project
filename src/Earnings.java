
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Earnings extends javax.swing.JFrame 
{

    ArrayList<Medicine>allMedicines=new ArrayList<>();
    ArrayList<BillingInfo>allRecord=new ArrayList<>();
    public Earnings() 
    {
        initComponents();
        readAllMData();
        readAllRData();
        getAllEarnings();
        setResizable(false);
    }

    int getMData(int cid)
    {
        for (int i=0;i<allMedicines.size();i++)
        {
            if(allMedicines.get(i).getId()==cid)
            {
                return allMedicines.get(i).getSellingPrice();
            }
        }
        return  0;
    }
    int getAllEarnings()
    {
        int earningByFee=0;
        int earningByMedicines=0;
        for(int i=0;i<allRecord.size();i++)
        {
            earningByFee+=allRecord.get(i).getFee();
            ArrayList<Integer> tmp=allRecord.get(i).getMedicineID();
            for(int j=0;j<tmp.size();j++)
            {
                earningByMedicines+=getMData(tmp.get(j));
            }
        }
        ebf.setText(String.valueOf(earningByFee));
        ebm.setText(String.valueOf(earningByMedicines));
        ne.setText(String.valueOf(earningByFee + earningByMedicines));
        return 0;
    }
    void readAllMData()
    {
        try
        {
        File mfile = new File("mdata.txt");
        if (!mfile.exists()) {
            mfile.createNewFile();
            return;
        }
        
        Scanner sc = new Scanner(mfile);
        while (sc.hasNextLine()) {
            String data = sc.nextLine().trim();
            if (data.isEmpty()) continue;
            
            String[] curData = data.split(";");
            if (curData.length != 6) continue; // Skip malformed lines
            
            try 
            {
                Medicine medicine = new Medicine();
                medicine.setId(Integer.parseInt(curData[0]));
                medicine.setName(curData[1]);
                medicine.setSellingPrice(Integer.parseInt(curData[2]));
                medicine.setBuyingPrice(Integer.parseInt(curData[3]));
                medicine.setQuantity(Integer.parseInt(curData[4]));
                medicine.setDescription(curData[5]);
                allMedicines.add(medicine);
            } catch (NumberFormatException e) {
                System.err.println("Skipping invalid patient data: " + data);
            }
        }
        sc.close();}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error reading data: " + e.getMessage());
        }
    }
    void readAllRData()
        {
            try
            {
                File mfile = new File("record.txt");
                if (!mfile.exists()) 
                {
                    mfile.createNewFile();
                    return;
                }
        
            Scanner sc = new Scanner(mfile);
            while (sc.hasNextLine()) 
            {
                String data = sc.nextLine().trim();
                if (data.isEmpty()) continue;
            
                String[] curData = data.split(";");
                if (curData.length != 5) continue; // Skip malformed lines
            
                try {
                    BillingInfo record = new BillingInfo();
                    record.setPatientID(Integer.parseInt(curData[0]));
                    record.setFee(Integer.parseInt(curData[1]));
                    record.setRecomendations(curData[2]);
                    record.setDate(curData[3]);
                    String[] mList=curData[4].split(",");
                    for (int i=0;i<mList.length;i++)
                    {
                        record.setMedicineID(Integer.parseInt(mList[i]));
                    }
                    this.allRecord.add(record);
                } catch (NumberFormatException e) 
                {
                    System.err.println("Skipping invalid patient data: " + data);
                }
            }
            sc.close();
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error reading data: " + e.getMessage());
                e.printStackTrace();
            }
        }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ebf = new javax.swing.JLabel();
        ebm = new javax.swing.JLabel();
        ne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Earnings");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Hospital Management System");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/money.gif"))); // NOI18N

        home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 0, 0));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(home))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Earnings by Fee");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Earnings by Medicines");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Net Earnings");

        ebf.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        ebf.setText("00");

        ebm.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        ebm.setText("00");

        ne.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        ne.setText("00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ne))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ebf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ebm, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(252, 252, 252))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ebf))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ebm)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ne))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1014, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        setVisible(false);
        new Home().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

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
        java.util.logging.Logger.getLogger(Earnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Earnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Earnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Earnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Earnings().setVisible(true);
    }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ebf;
    private javax.swing.JLabel ebm;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel ne;
    // End of variables declaration//GEN-END:variables
}
