
package com.mycompany.impuesto;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Formulario extends javax.swing.JFrame implements ItemListener{

    private final Lineas lineas = new Lineas();
   
    public Formulario() {
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        comboMarca.addItemListener(this);
        
        for (int i = 2021; i > 2014; i++) {
        
            comboModelo.addItem(String.valueOf(i));
            
        }
        
    }

    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == comboMarca) {

            comboLinea.removeAllItems();

            if (comboMarca.getSelectedItem().equals("Toyota")) {

                for (String i : lineas.toyota) {

                    comboLinea.addItem(i);

                }

            } else if (comboMarca.getSelectedItem().equals("Chevrolet")) {

                for (String i : lineas.chevrolet) {

                    comboLinea.addItem(i);

                }

            } else if (comboMarca.getSelectedItem().equals("Audi")) {

                for (String i : lineas.audi) {

                    comboLinea.addItem(i);

                }

            } else if (comboMarca.getSelectedItem().equals("Mercedes")) {

                for (String i : lineas.mercedes) {

                    comboLinea.addItem(i);

                }

            } else if (comboMarca.getSelectedItem().equals("Nissan")) {

                for (String i : lineas.nissan) {

                    comboLinea.addItem(i);

                }

            } else if (comboMarca.getSelectedItem().equals("Volkswagen")) {

                for (String i : lineas.volks) {

                    comboLinea.addItem(i);

                }

            } else if (comboMarca.getSelectedItem().equals("Renault")) {

                for (String i : lineas.renault) {

                    comboLinea.addItem(i);

                }

            } 

        }

    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboMarca = new javax.swing.JComboBox<>();
        comboLinea = new javax.swing.JComboBox<>();
        comboModelo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkPublico = new javax.swing.JCheckBox();
        checkPago = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        checkTraslado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "Chevrolet", "Mercedes", "Nissan", "Renault", "Toyota", "Volkswagen" }));
        comboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcaActionPerformed(evt);
            }
        });

        comboLinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A4", "A5", "Q5", "Q7", "TT" }));
        comboLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLineaActionPerformed(evt);
            }
        });

        jLabel1.setText("Favor seleccione:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Línea:");

        jLabel4.setText("Modelo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("INGRESO DE DATOS");

        checkPublico.setText("Pertenece a servicio público");
        checkPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPublicoActionPerformed(evt);
            }
        });

        checkPago.setText("Pago oportuno");
        checkPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPagoActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        checkTraslado.setText("Traslado de cuenta");
        checkTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTrasladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkPublico)
                            .addComponent(checkPago)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(69, 69, 69)
                                .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkTraslado))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(checkPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkPublico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkTraslado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMarcaActionPerformed

    private void comboLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLineaActionPerformed

    private void checkPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPublicoActionPerformed

    private void checkPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPagoActionPerformed

    @SuppressWarnings("static-access")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       String marca = comboMarca.getSelectedItem().toString();
       
       int precio = 0;
       
        switch (marca) {
            case "Audi":
                precio = lineas.audi_precios.get(lineas.audi.indexOf(comboLinea.getSelectedItem().toString()));
                break;
            case "Toyota":
                precio = lineas.toyota_precios.get(lineas.toyota.indexOf(comboLinea.getSelectedItem().toString()));
                break;
            case "Chevrolet":
                precio = lineas.chevrolet_precios.get(lineas.chevrolet.indexOf(comboLinea.getSelectedItem().toString()));
                break;
            case "Mercedes":
                precio = lineas.mercedes_precios.get(lineas.mercedes.indexOf(comboLinea.getSelectedItem().toString()));
                break;
            case "Nissan":
                precio = lineas.nissan_precios.get(lineas.nissan.indexOf(comboLinea.getSelectedItem().toString()));
                break;
            case "Volkswagen":
                precio = lineas.volks_precios.get(lineas.volks.indexOf(comboLinea.getSelectedItem().toString()));
                break;
            case "Renault":
                precio = lineas.renault_precios.get(lineas.renault.indexOf(comboLinea.getSelectedItem().toString()));
                break;
            default:
                break;
        }
        
        precio = precio*((comboModelo.getSelectedIndex()+1)/100);
        
        precio = precio*1000000;
        
        double impuesto = precio*0.015;
        
        String a = "";
        
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        
        if(checkPago.isSelected()){a = a + "\nDescuento por pago oportuno: $" + formatea.format(impuesto*0.03); impuesto = impuesto*0.97; }
        
        if (checkPublico.isSelected()) {a = a + "\nDescuento por prestar servicio público: $" + formatea.format(impuesto*0.08); impuesto = impuesto*0.92; }
        
        if (checkTraslado.isSelected()) {a = a + "\nDescuento por traslado de cuenta: $" + formatea.format(impuesto*0.05); impuesto = impuesto*0.95;}
        
        
        
        String mensaje = "Resumen De Pago\n"
                + "\nMarca del automóvil: " + marca
                + "\nLínea: " + comboLinea.getSelectedItem()
                + "\nModelo: " + comboModelo.getSelectedItem()
                + "\n\nPrecio del automovil: $" + formatea.format(precio) 
                + "\nImpuesto inicial: $" + formatea.format(precio*0.015)
                + "\n\nDescuentos:\n" + a
                + "\n\n Total a pagar: " + formatea.format(impuesto);
        
        
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTrasladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTrasladoActionPerformed

    
    public static void main(String args[]) {
        
        Formulario a = new Formulario();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkPago;
    private javax.swing.JCheckBox checkPublico;
    private javax.swing.JCheckBox checkTraslado;
    private javax.swing.JComboBox<String> comboLinea;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JComboBox<String> comboModelo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
