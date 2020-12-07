/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaordersystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Chase Scallion
 */
public class MenuFrame extends javax.swing.JFrame {

    private PizzaOrderModel myModel;
    public MenuFrame(PizzaOrderModel myModel) {
        this.myModel = myModel;
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

        titleLabel = new javax.swing.JLabel();
        orderButton = new javax.swing.JButton();
        completeButton = new javax.swing.JButton();
        cancelOrderButton = new javax.swing.JButton();
        diplayOrdersButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("1213 Pizzeria");

        orderButton.setText("Place Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        completeButton.setText("Complete Order");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        cancelOrderButton.setText("Cancel Order");
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });

        diplayOrdersButton.setText("Incomplete Orders");
        diplayOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diplayOrdersButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(completeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diplayOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel)
                .addGap(29, 29, 29)
                .addComponent(orderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelOrderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diplayOrdersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //FIXME: Implement the event handler
    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
    this.dispose();
    OrderFrame myOrderFrame = new OrderFrame(myModel);
    myOrderFrame.setVisible(true);
    }//GEN-LAST:event_orderButtonActionPerformed
    //FIXME: Implement the event handler
    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        int orderNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the order number"));
        double total = myModel.completeOrder(orderNum);
        if(total != -1) {
            JOptionPane.showMessageDialog(this, "Your total is : $" + total);
        }else if(total == - 1){
            JOptionPane.showMessageDialog(this, "This order does not exist or has already been completed");
        }
    }//GEN-LAST:event_completeButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed
        // TODO add your handling code here:
        int orderNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the order number"));
        
        if(myModel.cancelOrder(orderNum) == true) {
            JOptionPane.showMessageDialog(this, "Your order has been cancelled.");
        }else if(myModel.cancelOrder(orderNum) == false) {
            JOptionPane.showMessageDialog(this, "This order does not exist or has already been completed");
        }
        
    }//GEN-LAST:event_cancelOrderButtonActionPerformed

    private void diplayOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diplayOrdersButtonActionPerformed
        // TODO add your handling code here:
        myModel.displayIncompleteOrders();
    }//GEN-LAST:event_diplayOrdersButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelOrderButton;
    private javax.swing.JButton completeButton;
    private javax.swing.JButton diplayOrdersButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}