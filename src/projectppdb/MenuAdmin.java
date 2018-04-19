/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectppdb;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Deddy
 */
public class MenuAdmin extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    Daftaraknsiswa daks;
    Daftarsiswaa das;
    Daftarsiswaa2 das2;
    Daftarsiswa3 das3;
    Dataruangnts dat;
    Datasswayglls dsl;
    inputdftrsiswayglls idsl;
    Loginadm la;

    public MenuAdmin() {
        initComponents();
        setLocationRelativeTo(this);
        daks = new Daftaraknsiswa();
        das = new Daftarsiswaa();
        das2 = new Daftarsiswaa2();
        das3 = new Daftarsiswa3();
        dat = new Dataruangnts();
        dsl = new Datasswayglls();
        idsl = new inputdftrsiswayglls();
        la = new Loginadm();
        das.addNextListener(new nextListener());
        das2.addNextListener(new nextdas2Listener());
        dsl.addInputListener(new inputListener());
        
        

        Panelan.setLayout(layout);
        Panelan.add(daks);
        Panelan.add(das);
        Panelan.add(das2);
        Panelan.add(das3);
        Panelan.add(dat);
        Panelan.add(idsl);
        Panelan.add(la);
        Panelan.add(dsl);

        la.setVisible(true);
        das.setVisible(false);
        das2.setVisible(false);
        das3.setVisible(false);
        dat.setVisible(false);
        idsl.setVisible(false);
        daks.setVisible(false);
        dsl.setVisible(false);

    }
    
    private class nextListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            das.setVisible(false);
            das2.setVisible(true);
        }

    }
    private class nextdas2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            das3.setVisible(true);
            das2.setVisible(false);
        }

    }
     private class nextdas3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            das3.setVisible(true);
            das2.setVisible(false);
        }

    }
     private class inputListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            dsl.setVisible(false);
            idsl.setVisible(true);
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

        dftraknssw = new javax.swing.JButton();
        dtsswa = new javax.swing.JButton();
        dtsswayglls = new javax.swing.JButton();
        dtrngnts = new javax.swing.JButton();
        Panelan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dftraknssw.setBorderPainted(false);
        dftraknssw.setContentAreaFilled(false);
        dftraknssw.setDefaultCapable(false);
        dftraknssw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dftraknsswActionPerformed(evt);
            }
        });
        getContentPane().add(dftraknssw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 220, 50));

        dtsswa.setBorderPainted(false);
        dtsswa.setContentAreaFilled(false);
        dtsswa.setDefaultCapable(false);
        dtsswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtsswaActionPerformed(evt);
            }
        });
        getContentPane().add(dtsswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 120, 50));

        dtsswayglls.setBorderPainted(false);
        dtsswayglls.setContentAreaFilled(false);
        dtsswayglls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtsswaygllsActionPerformed(evt);
            }
        });
        getContentPane().add(dtsswayglls, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 250, 50));

        dtrngnts.setBorderPainted(false);
        dtrngnts.setContentAreaFilled(false);
        dtrngnts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtrngntsActionPerformed(evt);
            }
        });
        getContentPane().add(dtrngnts, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 200, 50));

        javax.swing.GroupLayout PanelanLayout = new javax.swing.GroupLayout(Panelan);
        Panelan.setLayout(PanelanLayout);
        PanelanLayout.setHorizontalGroup(
            PanelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        PanelanLayout.setVerticalGroup(
            PanelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(Panelan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1280, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Admin Revisi .jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 70, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dftraknsswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dftraknsswActionPerformed
        la.setVisible(false);
        das.setVisible(false);
        das2.setVisible(false);
        das3.setVisible(false);
        dat.setVisible(false);
        idsl.setVisible(false);
        daks.setVisible(true);
        dsl.setVisible(false);
    }//GEN-LAST:event_dftraknsswActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        la.setVisible(true);
        das.setVisible(false);
        das2.setVisible(false);
        das3.setVisible(false);
        dat.setVisible(false);
        idsl.setVisible(false);
        daks.setVisible(false);
        dsl.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed

    private void dtsswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtsswaActionPerformed
        la.setVisible(false);
        das.setVisible(true);
        das2.setVisible(false);
        das3.setVisible(false);
        dat.setVisible(false);
        idsl.setVisible(false);
        daks.setVisible(false);
        dsl.setVisible(false);
    }//GEN-LAST:event_dtsswaActionPerformed

    private void dtsswaygllsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtsswaygllsActionPerformed
        la.setVisible(false);
        das.setVisible(false);
        das2.setVisible(false);
        das3.setVisible(false);
        dat.setVisible(false);
        idsl.setVisible(false);
        daks.setVisible(false);
        dsl.setVisible(true);
    }//GEN-LAST:event_dtsswaygllsActionPerformed

    private void dtrngntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtrngntsActionPerformed
        la.setVisible(false);
        das.setVisible(false);
        das2.setVisible(false);
        das3.setVisible(false);
        dat.setVisible(true);
        idsl.setVisible(false);
        daks.setVisible(false);
        dsl.setVisible(false);
    }//GEN-LAST:event_dtrngntsActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelan;
    private javax.swing.JButton dftraknssw;
    private javax.swing.JButton dtrngnts;
    private javax.swing.JButton dtsswa;
    private javax.swing.JButton dtsswayglls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
