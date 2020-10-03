/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge Eduardo
 */
public class ArtículosPendientes extends TableHelp {
    public ArrayList <Casillero> casilleros;
    /**Costructor de la clase, setea la tabla con los respectivos datos en las columnas
     * además llama al popUp para que esté habilitado en la tabla.
     * No recibe parámetros ni retorna.
     */
    public ArtículosPendientes() {
        initComponents();
        jTablePendientes.setModel(new DefaultTableModel(null,new String[]{"Propietario","Nivel","Tipo artículo","Monto","Fecha"}));
        popupTable(jTablePendientes);
    }
    /**Segundo costructor de la clase, setea la tabla con los respectivos datos en las columnas
     * además llama al popUp para que esté habilitado en la tabla y posee el ArrayList <Casillero> casilleros global
     * No recibe parámetros ni retorna.
     * @param casillero
     */
    public ArtículosPendientes(ArrayList <Casillero> casillero) {
        initComponents();
        this.casilleros=casillero;
        jTablePendientes.setModel(new DefaultTableModel(null,new String[]{"Propietario","Nivel","Tipo artículo","Monto","Fecha"}));
        popupTable(jTablePendientes);
    }
    
    @Override
    /** Método se sobreescribe de TableHelp con el fin de habilitar una opción más en el popUpMenu
     * @param tabla
     * No retorna.
     */
    public void popupTable(javax.swing.JTable tabla){
        JPopupMenu popupMenu= new JPopupMenu();
        
        JMenuItem menuItem1= new JMenuItem("Detelle del monto",new ImageIcon(getClass().getResource("/GUI/blueMoneda.png")));
        JMenuItem menuItem2= new JMenuItem("Enviar Correo",new ImageIcon(getClass().getResource("/GUI/correoElectronico.png")));
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"Aquí va el detalle del monto","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"OMG...aquí tengo que enviar el correo","Correo enviado",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        tabla.setComponentPopupMenu(popupMenu);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jScrollPanePendientes = new javax.swing.JScrollPane();
        jTablePendientes = new javax.swing.JTable();
        jButtonClear1 = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabelPendientes = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(580, 260));
        setPreferredSize(new java.awt.Dimension(830, 476));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Artículos pendientes"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePendientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTablePendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTablePendientes.setColumnSelectionAllowed(true);
        jTablePendientes.getTableHeader().setReorderingAllowed(false);
        jScrollPanePendientes.setViewportView(jTablePendientes);
        jTablePendientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPanePendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 740, 320));

        jButtonClear1.setText("Cargar");
        jPanel1.add(jButtonClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        jLabelPendientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPendientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPendientes.setText("Listado de artículos pendientes:");
        jPanel1.add(jLabelPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/fondo2.0.jpg"))); // NOI18N
        Fondo.setText(" ");
        Fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Fondo.setOpaque(true);
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -6, 830, 450));

        bindingGroup.bind();

        setSize(new java.awt.Dimension(836, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        AdministradorDeEntregables ventanaEntregables = new AdministradorDeEntregables();
        ventanaEntregables.setVisible(true);
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
            java.util.logging.Logger.getLogger(ArtículosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArtículosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArtículosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArtículosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArtículosPendientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonClear1;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelPendientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPanePendientes;
    private javax.swing.JTable jTablePendientes;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
