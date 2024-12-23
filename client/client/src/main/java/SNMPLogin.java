
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SNMPLogin extends javax.swing.JFrame implements DocumentListener {
    boolean verify1Flag = false;
    boolean verify2Flag = false;

    public SNMPLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        proceedButton.setEnabled(false);
        userNameField.getDocument().addDocumentListener(this);
        idField.getDocument().addDocumentListener(this);
        passwordField.getDocument().addDocumentListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        verify1Button = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();
        LoginIcon = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        idField = new javax.swing.JTextField();
        verify2Button = new javax.swing.JButton();
        proceedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SNMP Manager");
        setResizable(false);

        userNameLabel.setText("Username");

        idLabel.setText("ID");

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        verify1Button.setBackground(new java.awt.Color(45, 164, 78));
        verify1Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        verify1Button.setForeground(new java.awt.Color(242, 242, 242));
        verify1Button.setText("Verify1 (Servlet)");
        verify1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify1ButtonActionPerformed(evt);
            }
        });

        mainLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        mainLabel.setText("Sign in to System");

        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/01-loginIcon.png"))); // NOI18N

        passwordLabel.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        verify2Button.setBackground(new java.awt.Color(45, 164, 78));
        verify2Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        verify2Button.setForeground(new java.awt.Color(242, 242, 242));
        verify2Button.setText("Verify2 (JSP)");
        verify2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify2ButtonActionPerformed(evt);
            }
        });

        proceedButton.setBackground(new java.awt.Color(45, 147, 185));
        proceedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        proceedButton.setForeground(new java.awt.Color(242, 242, 242));
        proceedButton.setText("Proceed to Main Page");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginIcon)
                .addGap(18, 18, 18)
                .addComponent(mainLabel)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(idLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(verify1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(verify2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LoginIcon)
                    .addComponent(mainLabel))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(userNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(passwordLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verify1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verify2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void verify1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify1ButtonActionPerformed
        String name = userNameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        // Send POST request to Servlet
        try {
            // Create the URL
            String servletURL = "http://localhost:8080/server/CheckName";
            HttpURLConnection connection = (HttpURLConnection) new URL(servletURL).openConnection();
            
            // Set the request method to POST
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            String contentStr = "application/x-www-form-urlencoded";
            connection.setRequestProperty("Content-Type", contentStr);
            connection.setUseCaches(false);
            
            // Set the request parameters
            String params = "name=" + URLEncoder.encode(name, "UTF-8") + "&password=" + URLEncoder.encode(password, "UTF-8");

            // Write the parameters to the request body
            try ( OutputStream os = connection.getOutputStream()) {
                byte[] input = params.getBytes("UTF-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            
            // Read the response then close the connection
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            connection.disconnect();

            // Display response
            String msg;
            String space = " ";

            for (int i = 0; i < ("Response from " + servletURL).length(); i++) {
                space += " ";
            }

            if (responseCode == HttpURLConnection.HTTP_OK) {
                int msgType = content.toString().equals("Permit") ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE;
                msg = "POST Request to Servlet:" + space + "\n" + params + "\n\nServlet Response:\n" + content.toString();
                JOptionPane.showMessageDialog(rootPane, msg, "Response from " + servletURL, msgType);
                verify1Flag = content.toString().equals("Permit");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error during Servlet Verify. HTTP Response Code: " + responseCode, "Response from " + servletURL, JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, e, "Server Error", JOptionPane.ERROR_MESSAGE);
        }

        proceedButton.setEnabled(verify1Flag && verify2Flag);
    }//GEN-LAST:event_verify1ButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void verify2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify2ButtonActionPerformed
        String id = idField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        // Send POST request to JSP
        try {
            // Create the URL
            String jspURL = "http://localhost:8080/server/CheckID.jsp";
            HttpURLConnection connection = (HttpURLConnection) new URL(jspURL).openConnection();
            
            // Set the request method to POST
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            String contentStr = "application/x-www-form-urlencoded";
            connection.setRequestProperty("Content-Type", contentStr);
            connection.setUseCaches(false);
            
            // Set the request parameters
            String params = "id=" + URLEncoder.encode(id, "UTF-8") + "&password=" + URLEncoder.encode(password, "UTF-8");
            
            // Write the parameters to the request body
            try ( OutputStream os = connection.getOutputStream()) {
                byte[] input = params.getBytes("UTF-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            
            // Read the response then close the connection
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            connection.disconnect();

            // Display response
            String msg;
            String space = "       ";

            for (int i = 0; i < ("Response from " + jspURL).length(); i++) {
                space += " ";
            }
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                int msgType = content.toString().equals("Permit") ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE;
                msg = "POST Request to JSP:" + space + "\n" + params + "\n\nJSP Response:\n" + content.toString();
                JOptionPane.showMessageDialog(rootPane, msg, "Response from " + jspURL, msgType);
                verify2Flag = content.toString().equals("Permit");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error during JSP Verify. HTTP Response Code: " + responseCode, "Response from " + jspURL, JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, e, "Server Error", JOptionPane.ERROR_MESSAGE);
        }

        proceedButton.setEnabled(verify1Flag && verify2Flag);
    }//GEN-LAST:event_verify2ButtonActionPerformed

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        SNMPMainPage mainPage = new SNMPMainPage();
        mainPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_proceedButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton proceedButton;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JButton verify1Button;
    private javax.swing.JButton verify2Button;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertUpdate(DocumentEvent e) {
        verify1Flag = false;
        verify2Flag = false;
        proceedButton.setEnabled(false);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        verify1Flag = false;
        verify2Flag = false;
        proceedButton.setEnabled(false);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        verify1Flag = false;
        verify2Flag = false;
        proceedButton.setEnabled(false);
    }
}
