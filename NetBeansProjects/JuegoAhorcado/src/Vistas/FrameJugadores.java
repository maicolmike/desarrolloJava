/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.ClsFrase;
import Clases.ClsJugador;
import Clases.ClsRespuesta;
import Controladores.CtlJugador;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David Pérez Arias
 */
public class FrameJugadores extends javax.swing.JFrame {

    private FramePrincipal framePrincipal;
    LinkedList<ClsJugador> listaJugadores;
    CtlJugador controlador;

    /**
     * Creates new form FrameNuevoJugador
     */
    public FrameJugadores() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(this); // Para centrar el frame en la pantalla     
        this.controlador = new CtlJugador();
        this.consultarJugadores();
    }

    public void setFramePrincipal(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    public void actualizarTabla(LinkedList<ClsJugador> jugadores) {

        String[] nombreColumnas = {"Id", "Nombre", "ciudad", "edad"};
        // add row dynamically into the table 
        DefaultTableModel dtm = new DefaultTableModel(nombreColumnas, 0);

        for (ClsJugador jugador : jugadores) {
            dtm.addRow(new Object[]{
                jugador.getId(), jugador.getNombre(),jugador.getCiudad(),jugador.getEdad()
            });
        }

        this.jTablaJugadores.setModel(dtm);

        this.jTablaJugadores.getColumnModel().getColumn(0).setPreferredWidth(40);
        this.jTablaJugadores.getColumnModel().getColumn(0).setMaxWidth(40);
        this.jTablaJugadores.getColumnModel().getColumn(0).setMinWidth(40);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        this.jTablaJugadores.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);

    }

    public void consultarJugadores() {
        this.listaJugadores = this.controlador.consultarJugadores();
        this.actualizarTabla(listaJugadores);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaJugadores = new javax.swing.JTable();
        buttonActualizarJugador = new javax.swing.JButton();
        buttonEliminarJugador = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextCiudad = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración jugadores");

        jTablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "ciudad", "edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaJugadores);

        buttonActualizarJugador.setText("Editar");
        buttonActualizarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarJugadorActionPerformed(evt);
            }
        });

        buttonEliminarJugador.setText("Eliminar");
        buttonEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(buttonActualizarJugador)
                .addGap(33, 33, 33)
                .addComponent(buttonEliminarJugador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEliminarJugador)
                    .addComponent(buttonActualizarJugador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista jugadores", jPanel1);

        jLabel3.setText("Nombre");

        jLabel4.setText("Ciudad");

        jLabel5.setText("Edad");

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jTextCiudad)
                            .addComponent(jTextEdad)
                            .addComponent(jTextId)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jButtonAgregar)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButtonAgregar)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Nuevo jugador", jPanel2);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonVolver)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
        this.framePrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void buttonEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarJugadorActionPerformed
        // TODO add your handling code here:
        try {

            int posicionFilaSeleccionada = this.jTablaJugadores.getSelectedRow();
            String idJugador = this.jTablaJugadores.getModel().getValueAt(posicionFilaSeleccionada, 0).toString();
            System.out.println(idJugador);

            int id = Integer.parseInt(idJugador);
            ClsJugador jugador = new ClsJugador(idJugador, "","","");
            this.controlador.eliminarJugadores(jugador);
            //mensaje eliminar frase
            JOptionPane.showMessageDialog(this, "¡Eliminastes al jugador!");
            //listar la tabla con las frases
            this.consultarJugadores();

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Parece ser que el registro no tiene enunciado");
        }
    }//GEN-LAST:event_buttonEliminarJugadorActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        try {

            String idTexto = this.jTextId.getText();

            int id = Integer.parseInt(idTexto);

            String nombre = this.jTextNombre.getText();
            String ciudad = this.jTextCiudad.getText();
            String edad = this.jTextEdad.getText();
            

            if (idTexto.equals("") || nombre.equals("")|| ciudad.equals("") || edad.equals("")) {
                JOptionPane.showMessageDialog(this, "Te han faltado campos por diligenciar");
                return;
            } else {
                ClsJugador jugador = new ClsJugador(idTexto, nombre,ciudad,edad);

                ClsRespuesta respuesta = this.controlador.agregarJugador(jugador);
                JOptionPane.showMessageDialog(this, respuesta.getMensajeUsuario());
                //listar la tabla con las frases
                 this.consultarJugadores();
                 //limpiar
                 this.jTextId.setText("");
                 this.jTextNombre.setText("");
                 this.jTextCiudad.setText("");
                 this.jTextEdad.setText("");
            
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El id debe ser númerico");
        }

    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void buttonActualizarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarJugadorActionPerformed
        // TODO add your handling code here:
        int row = this.jTablaJugadores.getSelectedRow();
        int id = Integer.parseInt(this.jTablaJugadores.getModel().getValueAt(row, 0).toString());
        String idJugador = this.jTablaJugadores.getModel().getValueAt(row, 0).toString();
        String nombre = this.jTablaJugadores.getModel().getValueAt(row, 1).toString();
        String ciudad = this.jTablaJugadores.getModel().getValueAt(row, 2).toString();
        String edad = this.jTablaJugadores.getModel().getValueAt(row, 3).toString();
      // TableCellEditor celdaEditada = this.jTablaFrases.getCellEditor(row, 2);
      // String enunciado = celdaEditada.getCellEditorValue().toString();
        
        
        ClsJugador jugador = new ClsJugador(idJugador, nombre, ciudad, edad);
       this.controlador.actualizarJugadores(jugador);
       JOptionPane.showMessageDialog(this, "¡Actualizastes al jugador!");
       //listar la tabla con las frases
            this.consultarJugadores();
        
        System.out.println(id);
    }//GEN-LAST:event_buttonActualizarJugadorActionPerformed

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
            java.util.logging.Logger.getLogger(FrameJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizarJugador;
    private javax.swing.JButton buttonEliminarJugador;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablaJugadores;
    private javax.swing.JTextField jTextCiudad;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
