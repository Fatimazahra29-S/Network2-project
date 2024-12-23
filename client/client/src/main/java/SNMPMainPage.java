
import javax.swing.*;

public class SNMPMainPage extends javax.swing.JFrame {

    public SNMPMainPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        signOutButton = new javax.swing.JButton();
        getSystemDataButton = new javax.swing.JButton();
        getTCPTableButton = new javax.swing.JButton();
        getARPTableButton = new javax.swing.JButton();
        getStatisticsSNMPButton = new javax.swing.JButton();
        mainLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SNMP Manager");
        setResizable(false);

        mainLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        mainLabel.setText("Welcome to SNMP Manager");

        signOutButton.setBackground(new java.awt.Color(164, 14, 38));
        signOutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signOutButton.setForeground(new java.awt.Color(242, 242, 242));
        signOutButton.setText("Sign Out");
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        getSystemDataButton.setBackground(new java.awt.Color(45, 147, 185));
        getSystemDataButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getSystemDataButton.setForeground(new java.awt.Color(255, 255, 255));
        getSystemDataButton.setText("System Data");
        getSystemDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSystemDataButtonActionPerformed(evt);
            }
        });

        getTCPTableButton.setBackground(new java.awt.Color(45, 147, 185));
        getTCPTableButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getTCPTableButton.setForeground(new java.awt.Color(255, 255, 255));
        getTCPTableButton.setText("TCP Table");
        getTCPTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getTCPTableButtonActionPerformed(evt);
            }
        });

        getARPTableButton.setBackground(new java.awt.Color(45, 147, 185));
        getARPTableButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getARPTableButton.setForeground(new java.awt.Color(255, 255, 255));
        getARPTableButton.setText("ARP Table");
        getARPTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getARPTableButtonActionPerformed(evt);
            }
        });

        getStatisticsSNMPButton.setBackground(new java.awt.Color(45, 147, 185));
        getStatisticsSNMPButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getStatisticsSNMPButton.setForeground(new java.awt.Color(255, 255, 255));
        getStatisticsSNMPButton.setText("SNMP Group Statistics");
        getStatisticsSNMPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStatisticsSNMPButtonActionPerformed(evt);
            }
        });

        mainLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        mainLabel1.setText("Get started by selecting any button below.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getSystemDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getTCPTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getARPTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getStatisticsSNMPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainLabel)
                    .addComponent(mainLabel1))
                .addGap(0, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainLabel)
                .addGap(18, 18, 18)
                .addComponent(mainLabel1)
                .addGap(30, 30, 30)
                .addComponent(getSystemDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getTCPTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getARPTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getStatisticsSNMPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        SNMPLogin login = new SNMPLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void getSystemDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSystemDataButtonActionPerformed
        SystemData systemData = new SystemData();
        systemData.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_getSystemDataButtonActionPerformed

    private void getTCPTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getTCPTableButtonActionPerformed
        TCPTable tcpTable = new TCPTable();
        tcpTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_getTCPTableButtonActionPerformed

    private void getARPTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getARPTableButtonActionPerformed
        ARPTable arpTable = new ARPTable();
        arpTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_getARPTableButtonActionPerformed

    private void getStatisticsSNMPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStatisticsSNMPButtonActionPerformed
        StatisticsSNMP statistics = new StatisticsSNMP();
        statistics.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_getStatisticsSNMPButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getARPTableButton;
    private javax.swing.JButton getStatisticsSNMPButton;
    private javax.swing.JButton getSystemDataButton;
    private javax.swing.JButton getTCPTableButton;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mainLabel1;
    private javax.swing.JButton signOutButton;
    // End of variables declaration//GEN-END:variables
}
