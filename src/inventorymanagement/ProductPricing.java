/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ADMIN
 */
public class ProductPricing extends javax.swing.JFrame implements KeyListener {
    MyConnection connection ;
    /**
     * Creates new form ProductPricing
     */
    public ProductPricing() throws ClassNotFoundException, SQLException {
        connection = new MyConnection();
        initComponents();
        setLocationRelativeTo(null);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        jComboBox1.removeAllItems();
        connection.rs = connection.st.executeQuery("select name from categories where active in ('yes','Yes')");
        jComboBox1.addItem("");
        while(connection.rs.next()){
            jComboBox1.addItem(connection.rs.getString(1));
        }
        searchtf.addKeyListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management System[Product Pricing]");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        save.setText("SAVE");
        save.setToolTipText("Finalize changes and click this to update it");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.setToolTipText("Select any row and delete it");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Buying Price", "Profit Margin %", "Discount %", "Final Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Category:");

        jLabel2.setText("Search");

        searchtf.setToolTipText("Enter barcode to search a product");
        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });

        jButton6.setText("View");
        jButton6.setToolTipText("Click this and view all products with their selling pricing");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 169, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(searchtf))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        //DefaultTableModel model = (DefaultTableModel)table.getModel();
        Object oldname = table.getModel().getValueAt(table.getSelectedRow(), 0);
        int buyingprice = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 1).toString());
        int oldProfit = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 2).toString());
        int oldDiscount = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(),3).toString());
        double selling_price =(buyingprice+(buyingprice*oldProfit/100));
        selling_price =selling_price-(selling_price*oldDiscount/100); 
        
        try {
            System.out.println("selling price:"+selling_price+"/tbuying price:"+buyingprice+",profit:"+oldProfit+",discout:"+oldDiscount);
            int a = connection.st.executeUpdate("update product_pricing set buying_price ="+buyingprice+",profit_margin="+oldProfit+",discount="+oldDiscount+",selling_price="+selling_price+" where product_name ='"+oldname+"'");
            if(a==1){
                JOptionPane.showMessageDialog(null, "Selling price successfully updated.");
                updateTable();
            }
            else
                JOptionPane.showMessageDialog(null, "Something went wrong");
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductPricing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int r = table.getSelectedRow();
            int a = connection.st.executeUpdate("delete from product_pricing where product_name='"+table.getValueAt(r, 0)+"'");
            if(a==1){
                JOptionPane.showMessageDialog(null, "Product deleted successfully.");
                updateTable();
                
            }
            else
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Something went wrong, please try again.");
          
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!jComboBox1.getSelectedItem().toString().equals("")){
            try {
                System.out.println("kk");
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.setRowCount(0);
                int i =0;
                while(i<model.getRowCount()){
                    model.removeRow(i);
                }
                connection.rs = connection.st.executeQuery("select *  from product_pricing where product_name in (select P_name from products where Category in('"+jComboBox1.getSelectedItem().toString()+"'))");
                if(connection.rs.next()==false)
                    JOptionPane.showMessageDialog(null, "No Product has been purchased in this category.");
                else{
                    connection.rs = connection.st.executeQuery("select *  from product_pricing where product_name in (select P_name from products where Category in('"+jComboBox1.getSelectedItem().toString()+"'))");
                    while(connection.rs.next()){
                        
                        System.out.println("kk");
                    
                        Object [] col = new Object[]{connection.rs.getString(1),connection.rs.getString(2),connection.rs.getString(3),connection.rs.getString(4),connection.rs.getString(5)};
                        System.out.println("kk");
                    
                        model.addRow(col);
                        System.out.println("kk");
                    }
                }
                System.out.println("kkll");
                System.out.println(connection.rs);
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Something went wrong, please try again.");
          
            }
            
        }   
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
           
               UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
               //com.jtattoo.plaf.mint.MintLookAndFeel
            
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductPricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProductPricing().setVisible(true);
                } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "Something went wrong, please try again.");
          
                } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Something went wrong, please try again.");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(KeyEvent.getKeyText(ke.getKeyCode()).equalsIgnoreCase("Escape")){
                this.setVisible(false);
                new Dashboard().setVisible(true);
            }
        if(KeyEvent.getKeyText(ke.getKeyCode()).equalsIgnoreCase("Enter")){
            String barcode = searchtf.getText();
            try {
                connection.rs = connection.st.executeQuery("select * from product_pricing where product_name =(select p_name from products where barcode='"+barcode+"')");
                if(connection.rs.next()==false){
                    JOptionPane.showMessageDialog(null, "No purchased product found with barcode '"+barcode+"'.");
                }
                else{
                    connection.rs = connection.st.executeQuery("select * from product_pricing where product_name =(select p_name from products where barcode='"+barcode+"')");
                    while(connection.rs.next()){
                        DefaultTableModel model = (DefaultTableModel)table.getModel();
                        Object col[] = new Object[]{connection.rs.getString(1),connection.rs.getString(2),connection.rs.getString(3),connection.rs.getString(4),connection.rs.getString(5)};
                        model.addRow(col);
                    }
                }
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Something went wrong, please try again.");
            }
        
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void updateTable(){
     if(!jComboBox1.getSelectedItem().toString().equals("")){
            try {
                System.out.println("kk");
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                int i =0;
                while(i<model.getRowCount()){
                    model.removeRow(i);
                }
                connection.rs = connection.st.executeQuery("select *  from product_pricing where product_name in (select P_name from products where Category in('"+jComboBox1.getSelectedItem().toString()+"'))");
                if(connection.rs.next()==false)
                    JOptionPane.showMessageDialog(null, "No Product has been purchased in this category.");
                else{
                    connection.rs = connection.st.executeQuery("select *  from product_pricing where product_name in (select P_name from products where Category in('"+jComboBox1.getSelectedItem().toString()+"'))");
                    while(connection.rs.next()){
                        
                        System.out.println("kk");
                    
                        Object [] col = new Object[]{connection.rs.getString(1),connection.rs.getString(2),connection.rs.getString(3),connection.rs.getString(4),connection.rs.getString(5)};
                        System.out.println("kk");
                    
                        model.addRow(col);
                        System.out.println("kk");
                    }
                }
                System.out.println("kkll");
                System.out.println(connection.rs);
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Something went wrong, please try again.");
             }
            
        }   
            // TODO add your handling code here:
    }                            
}
