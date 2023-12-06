package interfaz;

import clases.ClsCalculadora;

public class CalculadoraInterfaz extends javax.swing.JFrame 
{
    ClsCalculadora calcular = new ClsCalculadora();
    String memoria1;
    String memoria2;
    String signo;

    public CalculadoraInterfaz() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BtnCe = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        BtnPorcentaje = new javax.swing.JButton();
        BtnP = new javax.swing.JButton();
        BtnR = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnSiete = new javax.swing.JButton();
        BtnOcho = new javax.swing.JButton();
        BtnNueve = new javax.swing.JButton();
        BtnMultiplicacion = new javax.swing.JButton();
        BtnCuatro = new javax.swing.JButton();
        BtnCinco = new javax.swing.JButton();
        BtnSeis = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnUno = new javax.swing.JButton();
        BtnDos = new javax.swing.JButton();
        BtnTres = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnCero = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        BtnCe.setText("CE");
        BtnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeActionPerformed(evt);
            }
        });

        BtnC.setText("C");
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });

        BtnPorcentaje.setText("%");
        BtnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPorcentajeActionPerformed(evt);
            }
        });

        BtnP.setText("P");

        BtnR.setText("R");

        BtnDivision.setText("/");
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnSiete.setText("7");
        BtnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSieteActionPerformed(evt);
            }
        });

        BtnOcho.setText("8");
        BtnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOchoActionPerformed(evt);
            }
        });

        BtnNueve.setText("9");
        BtnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNueveActionPerformed(evt);
            }
        });

        BtnMultiplicacion.setText("X");
        BtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionActionPerformed(evt);
            }
        });

        BtnCuatro.setText("4");
        BtnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuatroActionPerformed(evt);
            }
        });

        BtnCinco.setText("5");
        BtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCincoActionPerformed(evt);
            }
        });

        BtnSeis.setText("6");
        BtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeisActionPerformed(evt);
            }
        });

        BtnResta.setText("-");
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnUno.setText("1");
        BtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnoActionPerformed(evt);
            }
        });

        BtnDos.setText("2");
        BtnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDosActionPerformed(evt);
            }
        });

        BtnTres.setText("3");
        BtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTresActionPerformed(evt);
            }
        });

        BtnSuma.setText("+");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnCero.setText("0");
        BtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeroActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPrincipalLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPantalla, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnCe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnPorcentaje)
                                            .addComponent(BtnSiete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnCuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnCero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnOcho)
                                            .addComponent(BtnP)
                                            .addComponent(BtnDos)
                                            .addComponent(BtnCinco))))
                                .addGap(31, 31, 31)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(BtnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BtnSeis))
                                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(BtnNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BtnR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(BtnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(40, 40, 40))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnC))
                .addGap(30, 30, 30)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPorcentaje)
                    .addComponent(BtnP)
                    .addComponent(BtnR)
                    .addComponent(BtnDivision))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiete)
                    .addComponent(BtnOcho)
                    .addComponent(BtnNueve)
                    .addComponent(BtnMultiplicacion))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCuatro)
                    .addComponent(BtnCinco)
                    .addComponent(BtnSeis)
                    .addComponent(BtnResta))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUno)
                    .addComponent(BtnDos)
                    .addComponent(BtnTres)
                    .addComponent(BtnSuma))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCero)
                    .addComponent(BtnIgual))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCeActionPerformed

    private void BtnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCeroActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"0"); 
    }//GEN-LAST:event_BtnCeroActionPerformed

    private void BtnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnoActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"1");
    }//GEN-LAST:event_BtnUnoActionPerformed

    private void BtnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDosActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"2");
    }//GEN-LAST:event_BtnDosActionPerformed

    private void BtnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTresActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"3");
    }//GEN-LAST:event_BtnTresActionPerformed

    private void BtnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuatroActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"4");
    }//GEN-LAST:event_BtnCuatroActionPerformed

    private void BtnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCincoActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"5");
    }//GEN-LAST:event_BtnCincoActionPerformed

    private void BtnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeisActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"6");
    }//GEN-LAST:event_BtnSeisActionPerformed

    private void BtnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSieteActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"7");
    }//GEN-LAST:event_BtnSieteActionPerformed

    private void BtnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOchoActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"8");
    }//GEN-LAST:event_BtnOchoActionPerformed

    private void BtnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNueveActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"9");
    }//GEN-LAST:event_BtnNueveActionPerformed

    private void BtnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPorcentajeActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"%");
    }//GEN-LAST:event_BtnPorcentajeActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        // TODO add your handling code here:
        String resultado;
        memoria2=txtPantalla.getText();
        if (!memoria2.equals(""))
        {
         resultado=calculadora(memoria1,memoria2,signo);
         txtPantalla.setText(resultado);
        }
        
    }//GEN-LAST:event_BtnIgualActionPerformed
 public static String calculadora (String memoria1, String memoria2, String signo)
 {
     Double resultado=0.0;
     String respuesta;
     if (signo.equals("+"))
     {
      resultado=Double.parseDouble(memoria1)+ Double.parseDouble(memoria2);
     }
     respuesta=resultado.toString();
     return respuesta;
     
 }
    
    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        // TODO add your handling code here:
        //txtPantalla.setText(txtPantalla.getText()+"+");
        if (!txtPantalla.getText().equals(""))
        {
         memoria1=txtPantalla.getText();
         signo="+";
         txtPantalla.setText("");
        }
        
        
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"-");
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicacionActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"*");
    }//GEN-LAST:event_BtnMultiplicacionActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText()+"/");
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText("");
    }//GEN-LAST:event_BtnCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(CalculadoraInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CalculadoraInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnC;
    private javax.swing.JButton BtnCe;
    private javax.swing.JButton BtnCero;
    private javax.swing.JButton BtnCinco;
    private javax.swing.JButton BtnCuatro;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnDos;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnMultiplicacion;
    private javax.swing.JButton BtnNueve;
    private javax.swing.JButton BtnOcho;
    private javax.swing.JButton BtnP;
    private javax.swing.JButton BtnPorcentaje;
    private javax.swing.JButton BtnR;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSeis;
    private javax.swing.JButton BtnSiete;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtnTres;
    private javax.swing.JButton BtnUno;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
