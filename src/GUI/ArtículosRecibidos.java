/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge Eduardo
 */
public class ArtículosRecibidos extends javax.swing.JFrame {
    public ArrayList <Casillero> casilleros;
    /**
     * Creates new form ArtículosRecibidos
     */
    public ArtículosRecibidos() {
        initComponents();
        jTableRecibidos.setModel(new DefaultTableModel(null,new String[]{"Propietario","Nivel","Tipo artículo","Monto","Fecha"}));
        GUI.TableHelp popUp =new GUI.TableHelp();
        popUp.popupTable(jTableRecibidos);
    }
    /**
     * Creates new form ArtículosRecibidos with the global ArrayList <Casillero> casilleros
     */
    public ArtículosRecibidos(ArrayList <Casillero> casillero){
        initComponents();
        this.casilleros = casillero;
        jTableRecibidos.setModel(new DefaultTableModel(null,new String[]{"Propietario","Nivel","Tipo artículo","Monto","Fecha"}));
        GUI.TableHelp popUp =new GUI.TableHelp();
        popUp.popupTable(jTableRecibidos);
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
        jButtonClear = new javax.swing.JButton();
        jDateChooserRecibidos = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRecibidos = new javax.swing.JTable();
        jButtonFind = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(510, 310));
        setPreferredSize(new java.awt.Dimension(920, 430));
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Artículos recibidos"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonClear.setText("Limpiar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jDateChooserRecibidos.setBackground(new java.awt.Color(204, 204, 255));
        jDateChooserRecibidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooserRecibidosKeyTyped(evt);
            }
        });
        jPanel1.add(jDateChooserRecibidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, -1));

        jTableRecibidos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTableRecibidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTableRecibidos.setGridColor(new java.awt.Color(0, 102, 153));
        jTableRecibidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableRecibidos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 680, 330));

        jButtonFind.setText("Buscar");
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 80, -1));

        jLabelFecha.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(204, 255, 255));
        jLabelFecha.setText("Ingrese la fecha de búsqueda:");
        jPanel1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/fondo2.0.jpg"))); // NOI18N
        Fondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 960, 410));

        bindingGroup.bind();

        setSize(new java.awt.Dimension(936, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        AdministradorDeEntregables ventanaEntregables = new AdministradorDeEntregables();
        ventanaEntregables.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        try{
            TableHelp SystemDate= new TableHelp();
            //Ocupo que Datos=... venga con los datos de mis compañeros; crear método en TableHelp
            String[][] Datos= {{"Juan Mata","Oro","Sobre","0.99","15/04/2018"},{"Mauricio Áviles","Platino","Electronico","1.20","15/04/2018"},{"Yossi Mejía","Normal","Silla de LoL","2.05",SystemDate.getSystemDate()},{"Mario Camacho","Oro","sobre","0.26","16/04/2018"},{"Yosua Díaz","Normal","Electrónicos","3.25",SystemDate.getSystemDate()},{"Jorge Gutiérrez","Platino","Gorro","1.26","16/04/2018"} };
            String[][] dataShow= new String[50][50];
            TableHelp mostrar= new TableHelp();
            String[][] newData = mostrar.showData(jTableRecibidos, jDateChooserRecibidos, Datos, dataShow );
            if(newData[0][0]==null){
                jTableRecibidos.setModel(new DefaultTableModel(null,new String[]{"Propietario","Nivel","Tipo Artículo","Monto","Fecha"}));
                JOptionPane.showMessageDialog(this, "No hay datos disponibles");
            }
            else{ 
                TableHelp llenar= new TableHelp();
                llenar.showData(jTableRecibidos, jDateChooserRecibidos, Datos, dataShow );
            }
        }
        catch(Exception e){
            if( jDateChooserRecibidos.getDate()==null){
                jTableRecibidos.setModel(new DefaultTableModel(null,new String[]{"Propietario","Nivel","Tipo Artículo","Monto","Fecha"}));
                JOptionPane.showMessageDialog(this,"Elija una fecha válida");        
            }
        }
    }//GEN-LAST:event_jButtonFindActionPerformed
   
    private void jDateChooserRecibidosActionPerformed(java.awt.event.ActionEvent evt){   
    }
    private void jDateChooserRecibidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserRecibidosKeyTyped

    }//GEN-LAST:event_jDateChooserRecibidosKeyTyped

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTableRecibidos.setModel(new DefaultTableModel(null,new String[]{"Propietario","Nivel","Tipo artículo","Monto","Fecha"}));
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(ArtículosRecibidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArtículosRecibidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArtículosRecibidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArtículosRecibidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArtículosRecibidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonRegresar;
    private com.toedter.calendar.JDateChooser jDateChooserRecibidos;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRecibidos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
