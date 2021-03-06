
package GUI;

import java.util.ArrayList;

public class CompraVenta extends javax.swing.JFrame {
    public ArrayList <Casillero> casilleros;
    /**
     * Creates new form CompraVenta
     */
    public CompraVenta() {
        initComponents();
    }
    
    /**
     * Creates new form CompraVenta with the global ArrayList <Casillero> casilleros
     * @param casilleros
     */
    public CompraVenta(ArrayList <Casillero> casillero) {
        initComponents();
        this.casilleros=casillero;
    }

    /**Método que utiliza el web service del BCCR para obtener la venta del dolar(USD) al día
     * No recibe parámetros ni retorna.
     */
    public void setVenta(){
        String cambio;
        TableHelp SystemDate= new TableHelp();
        cambio = WebServiceBCCR.WSBCCR.obtenerIndicadoresEconomicosXML("318", SystemDate.getSystemDate(),SystemDate.getSystemDate(), "Jorge Gutiérrez", "N");
        int punto= cambio.indexOf(".");
        String valor =cambio.substring(punto-3, punto+3);
        jTextFieldVenta.setText(valor+"₡");
        
    }
    public int getVenta(){
        String cambio;
        TableHelp SystemDate= new TableHelp();
        cambio = WebServiceBCCR.WSBCCR.obtenerIndicadoresEconomicosXML("318", SystemDate.getSystemDate(),SystemDate.getSystemDate(), "Jorge Gutiérrez", "N");
        int punto= cambio.indexOf(".");
        String valor =cambio.substring(punto-3,punto);
        int venta= Integer.parseInt(valor);
        return venta;
    }
    
    /**Método que utiliza el web service del BCCR para obtener la compra del dolar(USD) al día
     * No recibe parámetros ni retorna.
     */
    public void setCompra(){
        String cambio;
        TableHelp SystemDate= new TableHelp();
        cambio = WebServiceBCCR.WSBCCR.obtenerIndicadoresEconomicosXML("317", SystemDate.getSystemDate(),SystemDate.getSystemDate(), "Jorge Gutiérrez", "N");
        int punto= cambio.indexOf(".");
        String valor =cambio.substring(punto-3, punto+3);
        jTextFieldCompra.setText(valor+"₡");
    }
    public int getCompra(){
        String cambio;
        TableHelp SystemDate= new TableHelp();
        cambio = WebServiceBCCR.WSBCCR.obtenerIndicadoresEconomicosXML("317", SystemDate.getSystemDate(),SystemDate.getSystemDate(), "Jorge Gutiérrez", "N");
        int punto= cambio.indexOf(".");
        String valor =cambio.substring(punto-3,punto);
        int compra= Integer.parseInt(valor);
        return compra;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldCompra = new javax.swing.JTextField();
        jTextFieldVenta = new javax.swing.JTextField();
        jLabelDolar1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonRegresar = new javax.swing.JButton();
        jLabelDolar = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();
        jLabelDivisa = new javax.swing.JLabel();
        jLabelInfo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de cambio");
        setLocation(new java.awt.Point(750, 350));
        setPreferredSize(new java.awt.Dimension(350, 180));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCompra.setEditable(false);
        jTextFieldCompra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldCompra.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCompra.setText("Click para consultar");
        jTextFieldCompra.setBorder(null);
        jTextFieldCompra.setOpaque(false);
        jTextFieldCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCompraMouseClicked(evt);
            }
        });
        jPanel1.add(jTextFieldCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, -1));

        jTextFieldVenta.setEditable(false);
        jTextFieldVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldVenta.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldVenta.setText("Click para consultar");
        jTextFieldVenta.setBorder(null);
        jTextFieldVenta.setOpaque(false);
        jTextFieldVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldVentaMouseClicked(evt);
            }
        });
        jPanel1.add(jTextFieldVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, -1));

        jLabelDolar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDolar1.setText("Venta:");
        jPanel1.add(jLabelDolar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, 10));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 170, 10));

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabelDolar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDolar.setText("Compra:");
        jPanel1.add(jLabelDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        jLabelInfo.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabelInfo.setText("(Los datos presentes son tomados diariamente)");
        jPanel1.add(jLabelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabelDivisa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDivisa.setText("Cambio del Dolar (USD)");
        jPanel1.add(jLabelDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelInfo1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabelInfo1.setText("Datos oficiales del Banco Central de Costa Rica.");
        jPanel1.add(jLabelInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Fondo.setBackground(new java.awt.Color(204, 204, 255));
        Fondo.setForeground(new java.awt.Color(204, 204, 255));
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/fondo2.0.jpg"))); // NOI18N
        Fondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 550, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 170));

        setSize(new java.awt.Dimension(372, 181));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jTextFieldVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldVentaMouseClicked
        setVenta();
        jTextFieldVenta.disable();
    }//GEN-LAST:event_jTextFieldVentaMouseClicked

    private void jTextFieldCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCompraMouseClicked
        setCompra();
        jTextFieldCompra.disable();
    }//GEN-LAST:event_jTextFieldCompraMouseClicked

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed
       
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelDivisa;
    private javax.swing.JLabel jLabelDolar;
    private javax.swing.JLabel jLabelDolar1;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelInfo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCompra;
    private javax.swing.JTextField jTextFieldVenta;
    // End of variables declaration//GEN-END:variables
}
