/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;

/**
 *
 * @author Radek
 */
public class CurrencySystem extends javax.swing.JApplet {
        double USD_value_PLN = 3.58; //From Dollar to PLN
        double PLN_value_USD = 0.28;   //From PLN to Dollar
        double PLN_value_EUR = 0.23;   //From PLN to EUR
        double EUR_value_PLN = 4.28;   //From EUR to PLN
        double PLN_value_GBP = 0.21;   //From PLN to GBP
        double GBP_value_PLN = 4.86;   //From GBP to PLN
        double USD_value_EUR = 0.84; //From $ to EUR
        double EUR_value_USD = 1.19; //From EUR to $
        double USD_value_GBP = 0.74;//From $ to GBP
        double GBP_value_USD = 1.36; //From GBP to $
        double GBP_value_EUR = 1.14;//From GBP to EUR
        double EUR_value_GBP = 0.88;//From EUR to GBP
    

    /**
     * Initializes the applet CurrencySystem
     */
    @Override
    public void init() {
        
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
            java.util.logging.Logger.getLogger(CurrencySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Choiceofcurrency = new javax.swing.JComboBox<>();
        Convertsion = new javax.swing.JButton();
        AreaOfCurrency = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Solution = new javax.swing.JLabel();

        Choiceofcurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your currencies", "From USD to PLN", "From PLN to USD", "From EUR to PLN", "From PLN to EUR", "From GBP to PLN", "From PLN to GBP", "From USD to EUR", "From EUR to USD", "From USD to GBP", "From GBP to USD", "From EUR to GBP", "From GBP to EUR" }));

        Convertsion.setText("Convert");
        Convertsion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertsionActionPerformed(evt);
            }
        });

        AreaOfCurrency.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AreaOfCurrency.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 0, 18)); // NOI18N
        jLabel1.setText("Currency Converter");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Solution.setBackground(new java.awt.Color(153, 153, 153));
        Solution.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        Solution.setForeground(new java.awt.Color(153, 0, 0));
        Solution.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Choiceofcurrency, 0, 173, Short.MAX_VALUE)
                            .addComponent(Solution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Convertsion)
                            .addComponent(AreaOfCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Choiceofcurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaOfCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Convertsion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Reset))
                    .addComponent(Solution, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        AreaOfCurrency.setText(null);
        Solution.setText(null);
        Solution.setOpaque(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void ConvertsionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertsionActionPerformed
        // Here we'll going to make our currency system
        
        //Conversion from USD to PLN
        
        double Currentcurrency = Double.parseDouble(AreaOfCurrency.getText());
        if (Choiceofcurrency.getSelectedItem().equals("From USD to PLN"))
        {
            String finale = String.format("PLN %.2f", Currentcurrency * USD_value_PLN);
            Solution.setText(finale);
        }
        //Conversion from PLN to USD
        else if (Choiceofcurrency.getSelectedItem().equals("From PLN to USD"))
        {
            String finale = String.format ("$ %.2f", Currentcurrency * PLN_value_USD);
            Solution.setText(finale);
        }
        //Conversion from EUR to PLN
        else if (Choiceofcurrency.getSelectedItem().equals("From EUR to PLN"))
        {
            String finale = String.format ("PLN %.2f", Currentcurrency * EUR_value_PLN);
            Solution.setText(finale);
        }
        //Conversion from PLN to EUR
        else if (Choiceofcurrency.getSelectedItem().equals("From PLN to EUR"))
        {
            String finale = String.format ("€ %.2f", Currentcurrency * PLN_value_EUR);
            Solution.setText(finale);
        }
        //Conversion from GBP to PLN
        else if (Choiceofcurrency.getSelectedItem().equals("From GBP to PLN"))
        {
            String finale = String.format ("PLN %.2f", Currentcurrency * GBP_value_PLN);
            Solution.setText(finale);
        }
        //Conversion from PLN to GBP
        else if (Choiceofcurrency.getSelectedItem().equals("From PLN to GBP"))
        {
            String finale = String.format ("£ %.2f", Currentcurrency * PLN_value_GBP);
            Solution.setText(finale);
        }
        //Conversion from USD to EUR
        else if (Choiceofcurrency.getSelectedItem().equals("From USD to EUR"))
        {
            String finale = String.format ("€ %.2f", Currentcurrency * USD_value_EUR);
            Solution.setText(finale);
        }
        //Conversion from EUR to USD
        else if (Choiceofcurrency.getSelectedItem().equals("From EUR to USD"))
        {
            String finale = String.format ("$ %.2f", Currentcurrency * EUR_value_USD);
            Solution.setText(finale);
        }
        //Conversion from USD to GBP
        else if (Choiceofcurrency.getSelectedItem().equals("From USD to GBP"))
        {
            String finale = String.format ("£ %.2f", Currentcurrency * USD_value_GBP);
            Solution.setText(finale);
        }
        //Conversion from GBP to USD
        else if (Choiceofcurrency.getSelectedItem().equals("From GBP to USD"))
        {
            String finale = String.format ("$ %.2f", Currentcurrency * GBP_value_USD);
            Solution.setText(finale);
        }
        //Conversion from EUR to GBP
        else if (Choiceofcurrency.getSelectedItem().equals("From EUR to GBP"))
        {
            String finale = String.format ("£ %.2f", Currentcurrency * EUR_value_GBP);
            Solution.setText(finale);
        }
        //Conversion from GBP to EUR
        else if (Choiceofcurrency.getSelectedItem().equals("From GBP to EUR"))
        {
            String finale = String.format ("€ %.2f", Currentcurrency * GBP_value_EUR);
            Solution.setText(finale);
        }
        
        
    }//GEN-LAST:event_ConvertsionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AreaOfCurrency;
    private javax.swing.JComboBox<String> Choiceofcurrency;
    private javax.swing.JButton Convertsion;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Solution;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
