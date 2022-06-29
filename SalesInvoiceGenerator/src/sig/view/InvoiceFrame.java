/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sig.controller.Controller;
import sig.model.InvoiceHeader;
import sig.model.InvoiceHeaderTableModel;

/**
 *
 * @author Lobna
 */
public class InvoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
        controller = new Controller(this);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        InvheaderTable = new javax.swing.JTable();
        InvheaderTable.getSelectionModel().addListSelectionListener(controller);
        createInvBtn = new javax.swing.JButton();
        createInvBtn.addActionListener(controller);
        delInvBtn = new javax.swing.JButton();
        delInvBtn.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNum = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvlineTable = new javax.swing.JTable();
        createLineBtn = new javax.swing.JButton();
        createLineBtn.addActionListener(controller);
        delLineBtn = new javax.swing.JButton();
        delLineBtn.addActionListener(controller);
        saveMenu = new javax.swing.JMenuBar();
        loadMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem4.addActionListener(controller);
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem5.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvheaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(InvheaderTable);

        createInvBtn.setText("Create New Invoice");

        delInvBtn.setText("Delete Invoice");
        delInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delInvBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("NUM");

        jLabel2.setText("Customer");

        jLabel3.setText("Date");

        jLabel4.setText("Total");

        txtNum.setText("jLabel5");

        txtCustomer.setText("jLabel6");

        txtDate.setText("jLabel7");

        txtTotal.setText("jLabel8");

        InvlineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(InvlineTable);

        createLineBtn.setText("Create New Line");
        createLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLineBtnActionPerformed(evt);
            }
        });

        delLineBtn.setText("Delete Line");
        delLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delLineBtnActionPerformed(evt);
            }
        });

        loadMenu.setText("File");

        jMenuItem4.setText("Load File");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        loadMenu.add(jMenuItem4);

        jMenuItem5.setText("Save File ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        loadMenu.add(jMenuItem5);

        saveMenu.add(loadMenu);

        setJMenuBar(saveMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createInvBtn)
                        .addGap(77, 77, 77)
                        .addComponent(delInvBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(txtNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createLineBtn)
                                .addGap(60, 60, 60)
                                .addComponent(delLineBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTotal))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvBtn)
                    .addComponent(delInvBtn)
                    .addComponent(createLineBtn)
                    .addComponent(delLineBtn))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delInvBtnActionPerformed

        // TODO add your handling code here:
        DefaultTableModel tbModel;
        tbModel = (DefaultTableModel) InvheaderTable.getModel();

        if (InvheaderTable.getSelectedRowCount() == 1) {
            tbModel.removeRow(InvheaderTable.getSelectedRow());
        } else {
            if (InvheaderTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select Single Row For Delete.");
            }
        }
    }//GEN-LAST:event_delInvBtnActionPerformed

    private void createLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createLineBtnActionPerformed

    private void delLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delLineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delLineBtnActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InvheaderTable;
    private javax.swing.JTable InvlineTable;
    private javax.swing.JButton createInvBtn;
    private javax.swing.JButton createLineBtn;
    private javax.swing.JButton delInvBtn;
    private javax.swing.JButton delLineBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu loadMenu;
    private javax.swing.JMenuBar saveMenu;
    private javax.swing.JLabel txtCustomer;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtNum;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
private Controller controller;
    private ArrayList<InvoiceHeader> invoiceHeaderList;
    private InvoiceHeaderTableModel headerTableModel;

    public Controller getController() {
        return controller;
    }

    public ArrayList<InvoiceHeader> getInvoiceHeaderList() {
        return invoiceHeaderList;
    }

    public void setInvoiceHeaderList(ArrayList<InvoiceHeader> invoiceHeaderList) {
        this.invoiceHeaderList = invoiceHeaderList;
        headerTableModel = new InvoiceHeaderTableModel(invoiceHeaderList);
        this.InvheaderTable.setModel(headerTableModel);
    }

    public JTable getInvheaderTable() {
        return InvheaderTable;
    }

    public JTable getInvlineTable() {
        return InvlineTable;
    }

}
