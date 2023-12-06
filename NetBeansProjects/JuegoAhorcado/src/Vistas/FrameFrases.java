/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.ClsFrase;
import Controladores.*;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;

/**
 *
 * @author David Pérez Arias
 */
public class FrameFrases extends javax.swing.JFrame {

    /**
     * Creates new form FrameFrases
     */
    private FramePrincipal framePrincipal;
    LinkedList<ClsFrase> listaFrases;
    CtlFrases controlador;

    public FrameFrases() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(this); // Para centrar el frame en la pantalla        
        this.controlador = new CtlFrases();
        this.consultarFrases();
    }

    public void setFramePrincipal(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    public void actualizarTabla(LinkedList<ClsFrase> frases) {

        String[] nombreColumnas = {"Id", "Frase", "Enunciado"};
        // add row dynamically into the table 
        DefaultTableModel dtm = new DefaultTableModel(nombreColumnas, 0);

        for (ClsFrase frase : frases) {
            dtm.addRow(new Object[]{
                frase.getId(), frase.getTexto(), frase.getEnunciado()
            });
        }

        this.jTablaFrases.setModel(dtm);

        this.jTablaFrases.getColumnModel().getColumn(0).setPreferredWidth(40);
        this.jTablaFrases.getColumnModel().getColumn(0).setMaxWidth(40);
        this.jTablaFrases.getColumnModel().getColumn(0).setMinWidth(40);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        this.jTablaFrases.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);

    }

    public void consultarFrases() {
        this.listaFrases = this.controlador.consultarFrases();
        this.actualizarTabla(listaFrases);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaFrases = new javax.swing.JTable();
        buttonActualizarFrase = new javax.swing.JButton();
        buttonEliminarFrase = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buttonAgregarFrase = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFrase = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextEnunciado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTablaFrases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Frase", "Enunciado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaFrases);

        buttonActualizarFrase.setText("Editar");
        buttonActualizarFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarFraseActionPerformed(evt);
            }
        });

        buttonEliminarFrase.setText("Eliminar");
        buttonEliminarFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarFraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(buttonActualizarFrase)
                .addGap(64, 64, 64)
                .addComponent(buttonEliminarFrase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActualizarFrase)
                    .addComponent(buttonEliminarFrase))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Lista de frases", jPanel1);

        buttonAgregarFrase.setText("Agregar");
        buttonAgregarFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarFraseActionPerformed(evt);
            }
        });

        jLabel1.setText("Frase:");

        jTextFrase.setColumns(20);
        jTextFrase.setRows(5);
        jScrollPane2.setViewportView(jTextFrase);

        jLabel2.setText("Enunciado:");

        jTextEnunciado.setColumns(20);
        jTextEnunciado.setRows(5);
        jScrollPane3.setViewportView(jTextEnunciado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAgregarFrase)
                .addGap(225, 225, 225))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(buttonAgregarFrase)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nueva Frase", jPanel2);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Administración de frases");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        buttonVolver.setText("Volver");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(buttonVolver)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(buttonVolver))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        this.setVisible(false);
        this.framePrincipal.setVisible(true);
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void buttonAgregarFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarFraseActionPerformed

        String textoFrase = this.jTextFrase.getText();
        String enunciado = this.jTextEnunciado.getText();

        if (textoFrase.equals("")) {
            JOptionPane.showMessageDialog(this, "Oh no, debes escribir la frase");
            return;
        }

        if (enunciado.equals("")) {
            JOptionPane.showMessageDialog(this, "Oh no, debes escribir el enunciado");
            return;
        }

        ClsFrase frase = new ClsFrase(-1, textoFrase, enunciado);

        boolean respuesta = this.controlador.agregarFrase(frase);

        if (respuesta == true) {
            this.consultarFrases();
            JOptionPane.showMessageDialog(this, "¡Felicidades!, has agregado una nueva frase.");
            this.jTextFrase.setText("");
            this.jTextEnunciado.setText("");
        }

    }//GEN-LAST:event_buttonAgregarFraseActionPerformed

    private void buttonActualizarFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarFraseActionPerformed

        int row = this.jTablaFrases.getSelectedRow();
        int id = Integer.parseInt(this.jTablaFrases.getModel().getValueAt(row, 0).toString());
        String palabra = this.jTablaFrases.getModel().getValueAt(row, 1).toString();
        String enunciado = this.jTablaFrases.getModel().getValueAt(row, 2).toString();
        
      // TableCellEditor celdaEditada = this.jTablaFrases.getCellEditor(row, 2);
      // String enunciado = celdaEditada.getCellEditorValue().toString();
        
        
        ClsFrase  frase = new ClsFrase(id, palabra, enunciado);
       this.controlador.actualizarFrase(frase);
       JOptionPane.showMessageDialog(this, "¡Actualizastes la frase!");
       //listar la tabla con las frases
            this.consultarFrases();
        
        System.out.println(id);

    }//GEN-LAST:event_buttonActualizarFraseActionPerformed

    private void buttonEliminarFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarFraseActionPerformed

        try {

            int posicionFilaSeleccionada = this.jTablaFrases.getSelectedRow();
            String idTexto = this.jTablaFrases.getModel().getValueAt(posicionFilaSeleccionada, 0).toString();
            System.out.println(idTexto);

            int id = Integer.parseInt(idTexto);
            ClsFrase frase = new ClsFrase(id, "", "");
            this.controlador.eliminarFrase(frase);
            //mensaje eliminar frase
            JOptionPane.showMessageDialog(this, "¡Eliminastes la frase!");
            //listar la tabla con las frases
            this.consultarFrases();

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Parece ser que el registro no tiene enunciado");
        }


    }//GEN-LAST:event_buttonEliminarFraseActionPerformed

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
            java.util.logging.Logger.getLogger(FrameFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFrases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizarFrase;
    private javax.swing.JButton buttonAgregarFrase;
    private javax.swing.JButton buttonEliminarFrase;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablaFrases;
    private javax.swing.JTextArea jTextEnunciado;
    private javax.swing.JTextArea jTextFrase;
    // End of variables declaration//GEN-END:variables
}
