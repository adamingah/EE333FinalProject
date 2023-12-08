/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author jmyer
 */
public class ShoppingCartItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductInfoPanel
     */
    public ShoppingCartItemPanel() {
        initComponents();
    }
    
    public void setIDText(String ID) {
        this.productIDLabel.setText(ID);
    }
    
    public void setQuantityPPUAndTPText(int Quantity, double PPU) {
        double totalPrice = PPU * Double.valueOf(Quantity);
        
        this.productQuantityLabel.setText(String.valueOf(Quantity));
        this.productPPULabel.setText(String.valueOf(PPU));
        this.productTPLabel.setText(String.valueOf(totalPrice));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        productTPLabel = new javax.swing.JLabel();
        productPPULabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        productIDLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        productQuantityLabel = new javax.swing.JLabel();

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        productTPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        productPPULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        productIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        productQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(productIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productPPULabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productTPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator6)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productTPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(productPPULabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(productIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(productQuantityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator5)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel productIDLabel;
    private javax.swing.JLabel productPPULabel;
    private javax.swing.JLabel productQuantityLabel;
    private javax.swing.JLabel productTPLabel;
    // End of variables declaration//GEN-END:variables
}
