/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extention.to.apcs;

/**
 *
 * @author blank
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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
        secondLinkTF = new javax.swing.JTextField();
        firstLinkTF = new javax.swing.JTextField();
        compareButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstLinkTF1 = new javax.swing.JTextField();
        firstLinkTF3 = new javax.swing.JTextField();
        firstLinkTF4 = new javax.swing.JTextField();
        firstLinkTF5 = new javax.swing.JTextField();
        firstLinkTF6 = new javax.swing.JTextField();
        firstLinkTF7 = new javax.swing.JTextField();
        firstLinkTF8 = new javax.swing.JTextField();
        firstLinkTF9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        firstLinkTF10 = new javax.swing.JTextField();
        firstLinkTF11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        firstLinkTF13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        firstLinkTF14 = new javax.swing.JTextField();
        firstLinkTF15 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        firstLinkTF16 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        firstLinkTF17 = new javax.swing.JTextField();
        firstLinkTF18 = new javax.swing.JTextField();
        cpuPrice1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        firstLinkTF20 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        firstLinkTF21 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        firstLinkTF22 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        differenceTF = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PCPARTPICKER BUILD COMPARER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1010, 90));

        secondLinkTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        secondLinkTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondLinkTF.setText("INSERT BUILD 2 LINK");
        getContentPane().add(secondLinkTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 350, 40));

        firstLinkTF.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 230, 30));

        compareButton.setText("COMPARE");
        compareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareButtonActionPerformed(evt);
            }
        });
        getContentPane().add(compareButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 93, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Final Price");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CPU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Motherboard");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("CPU-Cooler");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("RAM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Storage");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("GPU");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Case");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 150, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("PowerSupply");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, 30));

        firstLinkTF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstLinkTF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstLinkTF1.setText("INSERT BUILD 1 LINK");
        getContentPane().add(firstLinkTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 40));

        firstLinkTF3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 230, 30));

        firstLinkTF4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 230, 30));

        firstLinkTF5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 230, 30));

        firstLinkTF6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 230, 30));

        firstLinkTF7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 230, 30));

        firstLinkTF8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 230, 30));

        firstLinkTF9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Storage");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 150, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("GPU");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 150, 30));

        firstLinkTF10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 230, 30));

        firstLinkTF11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 230, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Case");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 150, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("PowerSupply");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 150, 30));

        firstLinkTF13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 230, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("RAM");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 150, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Motherboard");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 150, 30));

        firstLinkTF14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 230, 30));

        firstLinkTF15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 230, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("CPU-Cooler");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 150, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("CPU");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 150, 30));

        firstLinkTF16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 230, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Tier");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 80, 30));

        firstLinkTF17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 230, 30));

        firstLinkTF18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 140, 30));

        cpuPrice1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cpuPrice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cpuPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 230, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Final Price");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 80, 30));

        firstLinkTF20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstLinkTF20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstLinkTF20ActionPerformed(evt);
            }
        });
        getContentPane().add(firstLinkTF20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 140, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Difference");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 80, 30));

        firstLinkTF21.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 140, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Tier");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 80, 30));

        firstLinkTF22.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstLinkTF22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(firstLinkTF22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, 140, 30));

        differenceTF.setColumns(20);
        differenceTF.setRows(5);
        jScrollPane1.setViewportView(differenceTF);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstLinkTF20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstLinkTF20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstLinkTF20ActionPerformed

    private void compareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareButtonActionPerformed
        // TODO add your handling code here:
     String link1 = firstLinkTF.getText();
     String link2 = secondLinkTF.getText();
     
     String[] parts1 = new String[8];
     String[] parts2 = new String[8];
     
     parts1 = ExtentionToAPCS.getInfo(link1);
     parts2 = ExtentionToAPCS.getInfo(link2);
     
     int totalPrice1 = Integer.parseInt(parts1[7]);
     int totalPrice2 = Integer.parseInt(parts2[7]);
     int cpuCooler1 = Integer.parseInt(parts1[2]);
     int cpuCooler2 = Integer.parseInt(parts2[2]);
     int gpuPrice1 = Integer.parseInt(parts1[4]);
     int gpuPrice2 = Integer.parseInt(parts2[4]);
     
     String tiers1 = findTiers(totalPrice1, cpuCooler1, gpuPrice1 );
     String tiers2 = findTiers(totalPrice2, cpuCooler2, gpuPrice2);
     
     cpuPrice1.setText(parts1[0]);
     
    }//GEN-LAST:event_compareButtonActionPerformed
    public void setDifference(int totalPrice1, int totalPrice2)
    {
        int difference = totalPrice1 - totalPrice2;
        if(difference < 0)
        {
            differenceTF.setText("Build 1 is " + difference + "more expensive.");
        }
        else
        {
            differenceTF.setText("Build 2 is " + difference + "more expenseive.");
        }
    }
    
   
    
    public String findTiers(int totalPrice, int cpuCoolerPrice, int gpuPrice)
    {
        String tier = "";
        if(totalPrice >= 30000 && cpuCoolerPrice >= 100)
        {
            tier = "God Ship";
        }
        else if(totalPrice >= 10000 && cpuCoolerPrice >= 100)
        {
            tier = "Mothership";
        }
        else if(totalPrice >= 8000 && cpuCoolerPrice >= 100)
        {
            tier = "Aircraft Carrier";
        }
        else if(totalPrice >= 5000 && cpuCoolerPrice >= 100)
        {
            tier = "Submarine";
        }
        else if((totalPrice >= 3000 && cpuCoolerPrice != 0) || gpuPrice >= 1500)
        {
            tier = "Battleship";
        }
        else if((totalPrice >= 1500 && cpuCoolerPrice != 0) || gpuPrice >= 700)
        {
            tier = "Frigate";
        }
        else if(totalPrice >= 800)
        {
            tier = "Fishing Boat";
        }
        else 
        {
            tier = "Hella Broken Paddle Boat";
        }
        return tier;
    }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compareButton;
    private javax.swing.JTextField cpuPrice1;
    private javax.swing.JTextArea differenceTF;
    private javax.swing.JTextField firstLinkTF;
    private javax.swing.JTextField firstLinkTF1;
    private javax.swing.JTextField firstLinkTF10;
    private javax.swing.JTextField firstLinkTF11;
    private javax.swing.JTextField firstLinkTF13;
    private javax.swing.JTextField firstLinkTF14;
    private javax.swing.JTextField firstLinkTF15;
    private javax.swing.JTextField firstLinkTF16;
    private javax.swing.JTextField firstLinkTF17;
    private javax.swing.JTextField firstLinkTF18;
    private javax.swing.JTextField firstLinkTF20;
    private javax.swing.JTextField firstLinkTF21;
    private javax.swing.JTextField firstLinkTF22;
    private javax.swing.JTextField firstLinkTF3;
    private javax.swing.JTextField firstLinkTF4;
    private javax.swing.JTextField firstLinkTF5;
    private javax.swing.JTextField firstLinkTF6;
    private javax.swing.JTextField firstLinkTF7;
    private javax.swing.JTextField firstLinkTF8;
    private javax.swing.JTextField firstLinkTF9;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField secondLinkTF;
    // End of variables declaration//GEN-END:variables
}