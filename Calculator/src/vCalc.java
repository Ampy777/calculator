
public class vCalc extends javax.swing.JFrame {

    int primero;
    int segundo;
    int resultado;
    String operaciones;

    public vCalc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btn_cero = new javax.swing.JButton();
        btn_uno = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        txt_pantalla = new javax.swing.JTextField();
        btn_suma = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        creditos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setText("Calculadora");

        btn_cero.setText("0");
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });
        btn_cero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_ceroKeyPressed(evt);
            }
        });

        btn_uno.setText("1");
        btn_uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_unoMouseClicked(evt);
            }
        });
        btn_uno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_unoKeyPressed(evt);
            }
        });

        btn_dos.setText("2");
        btn_dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dosMouseClicked(evt);
            }
        });
        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_tres.setText("3");
        btn_tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tresMouseClicked(evt);
            }
        });

        btn_cuatro.setText("4");
        btn_cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cuatroMouseClicked(evt);
            }
        });

        btn_cinco.setText("5");
        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_seis.setText("6");
        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_siete.setText("7");
        btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sieteActionPerformed(evt);
            }
        });

        btn_ocho.setText("8");
        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_nueve.setText("9");
        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_Borrar.setText("C");
        btn_Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BorrarMouseClicked(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_igualMouseClicked(evt);
            }
        });
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        txt_pantalla.setText("Resultado...");
        txt_pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pantallaActionPerformed(evt);
            }
        });

        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        btn_suma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_sumaKeyPressed(evt);
            }
        });

        btn_resta.setText("-");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multiplicacion.setText("*");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        creditos.setText("Developed by: Ampy_cj");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditos))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_siete)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ocho)
                                .addGap(18, 18, 18)
                                .addComponent(btn_nueve)
                                .addGap(18, 18, 18)
                                .addComponent(btn_division))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_cuatro)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cinco)
                                .addGap(18, 18, 18)
                                .addComponent(btn_seis)
                                .addGap(18, 18, 18)
                                .addComponent(btn_multiplicacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_uno)
                                .addGap(18, 18, 18)
                                .addComponent(btn_dos)
                                .addGap(18, 18, 18)
                                .addComponent(btn_tres)
                                .addGap(18, 18, 18)
                                .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Borrar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cero)
                                .addGap(18, 18, 18)
                                .addComponent(btn_igual)
                                .addGap(18, 18, 18)
                                .addComponent(btn_suma)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addGap(12, 12, 12)
                .addComponent(txt_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_siete)
                    .addComponent(btn_ocho)
                    .addComponent(btn_nueve)
                    .addComponent(btn_division))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cuatro)
                    .addComponent(btn_cinco)
                    .addComponent(btn_seis)
                    .addComponent(btn_multiplicacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_uno)
                    .addComponent(btn_dos)
                    .addComponent(btn_tres)
                    .addComponent(btn_resta))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Borrar)
                    .addComponent(btn_cero)
                    .addComponent(btn_igual)
                    .addComponent(btn_suma))
                .addGap(14, 14, 14)
                .addComponent(creditos))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        String numero_Ingresado = txt_pantalla.getText() + btn_seis.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_seisActionPerformed

    private void txt_pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pantallaActionPerformed

    private void btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sieteActionPerformed
        String numero_Ingresado = txt_pantalla.getText() + btn_siete.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_sieteActionPerformed

    private void btn_BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BorrarMouseClicked
        segundo = 0;
        txt_pantalla.setText("");
    }//GEN-LAST:event_btn_BorrarMouseClicked

    private void btn_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_igualMouseClicked

    }//GEN-LAST:event_btn_igualMouseClicked

    private void btn_unoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_unoMouseClicked
        String numero_Ingresado = txt_pantalla.getText() + btn_uno.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_unoMouseClicked

    private void btn_dosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dosMouseClicked

    }//GEN-LAST:event_btn_dosMouseClicked

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        String numero_Ingresado = txt_pantalla.getText() + btn_dos.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tresMouseClicked
        String numero_Ingresado = txt_pantalla.getText() + btn_tres.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_tresMouseClicked

    private void btn_cuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cuatroMouseClicked
        String numero_Ingresado = txt_pantalla.getText() + btn_cuatro.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_cuatroMouseClicked

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        String numero_Ingresado = txt_pantalla.getText() + btn_cinco.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        String numero_Ingresado = txt_pantalla.getText() + btn_ocho.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        String numero_Ingresado = txt_pantalla.getText() + btn_nueve.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_nueveActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        primero = Integer.parseInt(txt_pantalla.getText());
        txt_pantalla.setText("");
        operaciones = "+";
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
        String numero_Ingresado = txt_pantalla.getText() + btn_cero.getText();
        txt_pantalla.setText(numero_Ingresado);
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        primero = Integer.parseInt(txt_pantalla.getText());
        txt_pantalla.setText("");
        operaciones = "-";
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        primero = Integer.parseInt(txt_pantalla.getText());
        txt_pantalla.setText("");
        operaciones = "*";
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        primero = Integer.parseInt(txt_pantalla.getText());
        txt_pantalla.setText("");
        operaciones = "/";
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        segundo = Integer.parseInt(txt_pantalla.getText());
        if (operaciones.equals("+")) {
            resultado = primero + segundo;
        }
        if (operaciones.equals("-")) {
            resultado = primero - segundo;
        }
        if (operaciones.equals("*")) {
            resultado = primero * segundo;
        }
        if (operaciones.equals("/")) {
            resultado = primero / segundo;
        }
        txt_pantalla.setText("El resultado es:    " + resultado);
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_ceroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ceroKeyPressed

    }//GEN-LAST:event_btn_ceroKeyPressed

    private void btn_unoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_unoKeyPressed

    }//GEN-LAST:event_btn_unoKeyPressed

    private void btn_sumaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_sumaKeyPressed

    }//GEN-LAST:event_btn_sumaKeyPressed

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
            java.util.logging.Logger.getLogger(vCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    private javax.swing.JLabel creditos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txt_pantalla;
    // End of variables declaration//GEN-END:variables
}
