/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionariog65;

import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author TITANQ
 */
public class FrameConcesionario extends javax.swing.JFrame {

    private LinkedList<ClsCarro> listaCarros = new LinkedList<ClsCarro>();
    private LinkedList<ClsCarro> listaCarrosVendidos = new LinkedList<ClsCarro>();

    /**
     * Creates new form FrameConcesionario
     */
    public FrameConcesionario() {

        initComponents();

        this.AgregarCarrosPorDefecto();
    }

    public void AgregarCarrosPorDefecto() {

        ClsCarro carro = new ClsCarro("1", "2015", "Toyota", "Rojo", 25000000);
        this.listaCarros.add(carro);

        ClsCarro carro2 = new ClsCarro("2", "2018", "Chevrolet", "Verde", 18000000);
        this.listaCarros.add(carro2);

        ClsCarro carro3 = new ClsCarro("3", "2015", "Nissan", "Negro", 1700000);
        this.listaCarros.add(carro3);

        this.ActualizarListaInventario();

    }

    public void ActualizarListaInventario() {

        DefaultListModel model = new DefaultListModel();
        for (ClsCarro c : this.listaCarros) {
            String item
                    = c.getId() + " - " + c.getMarca() + " - "
                    + c.getModelo() + " - " + c.getColor() + " - " + c.getPrecio();
            model.addElement(item);
        }

        this.jListCarros.setModel(model);
    }

    public void ActualizarListaCarrosVendidos() {

        DefaultListModel model = new DefaultListModel();
        for (ClsCarro c : this.listaCarrosVendidos) {
            String item
                    = c.getId() + " - " + c.getMarca() + " - "
                    + c.getModelo() + " - " + c.getColor() + " - " + c.getPrecio();
            model.addElement(item);
        }

        this.jListCarrosVendidos.setModel(model);
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
        botonVenderCarro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCarros = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldId = new javax.swing.JTextField();
        txtFieldMarca = new javax.swing.JTextField();
        txtFieldModelo = new javax.swing.JTextField();
        txtFieldPrecio = new javax.swing.JTextField();
        comboColor = new javax.swing.JComboBox<>();
        botonAgregarCarro = new javax.swing.JButton();
        botonLimpiarFormulario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCarrosVendidos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVenderCarro.setText("Vender carro");
        botonVenderCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVenderCarroActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListCarros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(botonVenderCarro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botonVenderCarro))
        );

        jTabbedPane1.addTab("Lista de carros", jPanel1);

        jLabel2.setText("Id:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Color");

        comboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Verde", "Azul", "Negro", "Gris" }));

        botonAgregarCarro.setText("Agregar Carro");
        botonAgregarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCarroActionPerformed(evt);
            }
        });

        botonLimpiarFormulario.setText("Limpiar formulario");
        botonLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFieldMarca)
                            .addComponent(txtFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtFieldId))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(botonAgregarCarro)
                        .addGap(47, 47, 47)
                        .addComponent(botonLimpiarFormulario)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarCarro)
                    .addComponent(botonLimpiarFormulario))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Gestionar carro", jPanel2);

        jScrollPane1.setViewportView(jListCarrosVendidos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista carros vendidos", jPanel3);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        jLabel1.setText("El mejor concesionario");
        jLabel1.setToolTipText("Título");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Lista");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCarroActionPerformed

        try {
            String id = this.txtFieldId.getText();
            String marca = this.txtFieldMarca.getText();
            String modelo = this.txtFieldModelo.getText();

            if (id.equals("") || marca.equals("") || modelo.equals("")) {
                JOptionPane.showMessageDialog(this, "Faltan campos por digitar");
                return;
            }

            double precio = Double.parseDouble(this.txtFieldPrecio.getText());
            String color = this.comboColor.getSelectedItem().toString();

            ClsCarro carro = new ClsCarro(id, modelo, marca, color, precio);

            this.listaCarros.add(carro);
            this.ActualizarListaInventario();
            JOptionPane.showMessageDialog(this, "El carro ha sido agregado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El valor del precio debe ser un número");
        }


    }//GEN-LAST:event_botonAgregarCarroActionPerformed

    private void botonLimpiarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarFormularioActionPerformed

        this.txtFieldId.setText("");
        this.txtFieldMarca.setText("");
        this.txtFieldModelo.setText("");
        this.txtFieldPrecio.setText("");

    }//GEN-LAST:event_botonLimpiarFormularioActionPerformed

    private void botonVenderCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVenderCarroActionPerformed

        String id = JOptionPane.showInputDialog(this, "Ingrese el id del carro a vender");

        for (int i = 0; i < this.listaCarros.size(); i++) {
            if (id.equals(this.listaCarros.get(i).getId())) {
                ClsCarro carro = this.listaCarros.get(i);
                this.listaCarrosVendidos.add(carro);
                this.listaCarros.remove(i);
                this.ActualizarListaInventario();
                this.ActualizarListaCarrosVendidos();
                break;
            }
        }

    }//GEN-LAST:event_botonVenderCarroActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrameConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConcesionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCarro;
    private javax.swing.JButton botonLimpiarFormulario;
    private javax.swing.JButton botonVenderCarro;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListCarros;
    private javax.swing.JList<String> jListCarrosVendidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldMarca;
    private javax.swing.JTextField txtFieldModelo;
    private javax.swing.JTextField txtFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
