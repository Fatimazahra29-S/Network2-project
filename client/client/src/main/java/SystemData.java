
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class SystemData extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    
    public SystemData() {
        initComponents();
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) dataTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editDialog = new javax.swing.JDialog(this);
        mainLabel1 = new javax.swing.JLabel();
        submitDataButton = new javax.swing.JButton();
        sysLocationLabel = new javax.swing.JLabel();
        sysLocationField = new javax.swing.JTextField();
        sysContactLabel = new javax.swing.JLabel();
        sysContactField = new javax.swing.JTextField();
        sysNameLabel = new javax.swing.JLabel();
        sysNameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        mainLabel = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        editDataButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        getDataButton = new javax.swing.JButton();

        editDialog.setMinimumSize(new java.awt.Dimension(450, 420));
        editDialog.setModal(true);
        editDialog.setResizable(false);
        editDialog.setSize(new java.awt.Dimension(435, 360));

        mainLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        mainLabel1.setText("Edit System Data");

        submitDataButton.setBackground(new java.awt.Color(45, 164, 78));
        submitDataButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitDataButton.setForeground(new java.awt.Color(242, 242, 242));
        submitDataButton.setText("Submit");
        submitDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDataButtonActionPerformed(evt);
            }
        });

        sysLocationLabel.setText("System Location ");

        sysContactLabel.setText("System Contact ");

        sysNameLabel.setText("System Name ");

        javax.swing.GroupLayout editDialogLayout = new javax.swing.GroupLayout(editDialog.getContentPane());
        editDialog.getContentPane().setLayout(editDialogLayout);
        editDialogLayout.setHorizontalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editDialogLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mainLabel1)
                                .addGroup(editDialogLayout.createSequentialGroup()
                                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sysContactLabel)
                                        .addComponent(sysNameLabel))
                                    .addGap(26, 26, 26)
                                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sysNameField)
                                        .addComponent(sysContactField)
                                        .addComponent(submitDataButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                                .addGroup(editDialogLayout.createSequentialGroup()
                                    .addComponent(sysLocationLabel)
                                    .addGap(22, 22, 22)
                                    .addComponent(sysLocationField))))
                        .addGroup(editDialogLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        editDialogLayout.setVerticalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mainLabel1)
                .addGap(39, 39, 39)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysContactLabel)
                    .addComponent(sysContactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysNameLabel)
                    .addComponent(sysNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysLocationLabel)
                    .addComponent(sysLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(submitDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SNMP Manager");
        setResizable(false);

        mainLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        mainLabel.setText("System Data");

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SysDescr", null},
                {"SysObjectID", null},
                {"SysUpTime", null},
                {"SysContact", null},
                {"SysName", null},
                {"SysLocation", null}
            },
            new String [] {
                "Information Type", "Information"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.setAutoResizeMode(0);
        dataTable.setAutoscrolls(false);
        tableScrollPane.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setMinWidth(120);
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            dataTable.getColumnModel().getColumn(0).setMaxWidth(120);
            dataTable.getColumnModel().getColumn(1).setMinWidth(780);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(780);
        }
        dataTable.getAccessibleContext().setAccessibleDescription("");

        editDataButton.setBackground(new java.awt.Color(45, 147, 185));
        editDataButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editDataButton.setForeground(new java.awt.Color(242, 242, 242));
        editDataButton.setText("Edit System Data");
        editDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDataButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(164, 14, 38));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(242, 242, 242));
        backButton.setText("Back to Main Page");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        getDataButton.setBackground(new java.awt.Color(45, 147, 185));
        getDataButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getDataButton.setForeground(new java.awt.Color(242, 242, 242));
        getDataButton.setText("Get System Data");
        getDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(editDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(mainLabel)
                .addContainerGap(716, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainLabel)
                .addGap(18, 18, 18)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDataButtonActionPerformed
        editDialog.setLocationRelativeTo(this);
        editDialog.setVisible(true);
    }//GEN-LAST:event_editDataButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        SNMPMainPage mainPage = new SNMPMainPage();
        mainPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDataButtonActionPerformed
        String contact = sysContactField.getText();
        String name = sysNameField.getText();
        String location =sysLocationField.getText();
        
        // Send POST request to PHP server
        try {
            // Create the URL
            URL url = new URL("http://localhost/php2/page1.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            String contentStr = "application/x-www-form-urlencoded";
            connection.setRequestProperty("Content-Type", contentStr);
            connection.setUseCaches(false);

            // Set the request parameters
            String params = "contact=" + URLEncoder.encode(contact, "UTF-8") + "&name=" + URLEncoder.encode(name, "UTF-8") + "&location=" + URLEncoder.encode(location, "UTF-8");

            // Write the parameters to the request body
            try ( OutputStream os = connection.getOutputStream()) {
                byte[] input = params.getBytes("UTF-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            
            connection.disconnect();

            // Display response
            String msg;
            String space = " ";

            for (int i = 0; i < ("Response from http://localhost/php2/page1.php").length(); i++) {
                space += " ";
            }

            if (responseCode == HttpURLConnection.HTTP_OK) {
                msg = "The data has been edited successfully." + space + "\nHTTP Response Code: " + responseCode;
                JOptionPane.showMessageDialog(rootPane, msg, "Response from http://localhost/php2/page1.php", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error during request. HTTP Response Code: " + responseCode, "Response from " + url, JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, e, "Server Error", JOptionPane.ERROR_MESSAGE);
        }
        
        editDialog.dispose();
    }//GEN-LAST:event_submitDataButtonActionPerformed

    private void getDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataButtonActionPerformed
        createTable();
    }//GEN-LAST:event_getDataButtonActionPerformed

    private void createTable() {
        tableModel.setRowCount(0);

        // Send GET request to PHP server
        try {
            // Create the URL
            URL url = new URL("http://localhost/php2/page1.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Read and display response
            try ( BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String[] values = reader.readLine().split("\\|\\|\\|");

                tableModel.setRowCount(0);

                tableModel.addRow(new Object[]{"SysDescr", values[0]});
                tableModel.addRow(new Object[]{"SysObjectID", values[1]});
                tableModel.addRow(new Object[]{"SysUpTime", values[2]});
                tableModel.addRow(new Object[]{"SysContact", values[5]});
                tableModel.addRow(new Object[]{"SysName", values[3]});
                tableModel.addRow(new Object[]{"SysLocation", values[4]});
            }

            connection.disconnect();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, e, "Server Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton editDataButton;
    private javax.swing.JDialog editDialog;
    private javax.swing.JButton getDataButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mainLabel1;
    private javax.swing.JButton submitDataButton;
    private javax.swing.JTextField sysContactField;
    private javax.swing.JLabel sysContactLabel;
    private javax.swing.JTextField sysLocationField;
    private javax.swing.JLabel sysLocationLabel;
    private javax.swing.JTextField sysNameField;
    private javax.swing.JLabel sysNameLabel;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
