/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author usuário
 */
public class PrincipalCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalCalculadora
     */
    public PrincipalCalculadora() {
        initComponents();
    }

    double Num1;
    double Num2;
    String Operator;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton15 = new javax.swing.JButton();
        edtResultado = new javax.swing.JTextField();
        BntN7 = new javax.swing.JButton();
        BtnN8 = new javax.swing.JButton();
        BtnN9 = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        BtnN4 = new javax.swing.JButton();
        BtnN5 = new javax.swing.JButton();
        BtnN6 = new javax.swing.JButton();
        BtnMult = new javax.swing.JButton();
        BtnN1 = new javax.swing.JButton();
        BtnN2 = new javax.swing.JButton();
        BtnN3 = new javax.swing.JButton();
        BtnSub = new javax.swing.JButton();
        BtnN0 = new javax.swing.JButton();
        BtnIigual = new javax.swing.JButton();
        BtnSoma = new javax.swing.JButton();

        jButton15.setText("jButton15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        edtResultado.setEditable(false);
        edtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtResultadoActionPerformed(evt);
            }
        });

        BntN7.setText("7");
        BntN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntN7ActionPerformed(evt);
            }
        });

        BtnN8.setText("8");
        BtnN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN8ActionPerformed(evt);
            }
        });

        BtnN9.setText("9");
        BtnN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN9ActionPerformed(evt);
            }
        });

        BtnDiv.setText("/");
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivActionPerformed(evt);
            }
        });

        BtnN4.setText("4");
        BtnN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN4ActionPerformed(evt);
            }
        });

        BtnN5.setText("5");
        BtnN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN5ActionPerformed(evt);
            }
        });

        BtnN6.setText("6");
        BtnN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN6ActionPerformed(evt);
            }
        });

        BtnMult.setText("*");
        BtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultActionPerformed(evt);
            }
        });

        BtnN1.setText("1");
        BtnN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN1ActionPerformed(evt);
            }
        });

        BtnN2.setText("2");
        BtnN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN2ActionPerformed(evt);
            }
        });

        BtnN3.setText("3");
        BtnN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN3ActionPerformed(evt);
            }
        });

        BtnSub.setText("-");
        BtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubActionPerformed(evt);
            }
        });

        BtnN0.setText("0");
        BtnN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnN0ActionPerformed(evt);
            }
        });

        BtnIigual.setText("=");
        BtnIigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIigualActionPerformed(evt);
            }
        });

        BtnSoma.setText("+");
        BtnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtResultado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnN0, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(BtnN1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnN4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BntN7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnN2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnN8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnN9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnN5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnN6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(BtnIigual, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnDiv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(BtnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnN9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BntN7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnN8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnN4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnN5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnN6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnN3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnN0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnIigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtResultadoActionPerformed

    private void BtnN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN4ActionPerformed
        edtResultado.setText("4");
        Num1 = 4;
    }//GEN-LAST:event_BtnN4ActionPerformed

    private void BtnN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN8ActionPerformed
        edtResultado.setText("8");
        Num1 = 8;
    }//GEN-LAST:event_BtnN8ActionPerformed

    private void BtnN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN1ActionPerformed
      edtResultado.setText("1");
      Num1 = 1;
    }//GEN-LAST:event_BtnN1ActionPerformed

    private void BntN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntN7ActionPerformed
      edtResultado.setText("7");
      Num1 = 7;
    }//GEN-LAST:event_BntN7ActionPerformed

    private void BtnN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN9ActionPerformed
      edtResultado.setText("9");
      Num1 = 9;
    }//GEN-LAST:event_BtnN9ActionPerformed

    private void BtnN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN5ActionPerformed
      edtResultado.setText("5");
      Num1 = 5;
    }//GEN-LAST:event_BtnN5ActionPerformed

    private void BtnN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN6ActionPerformed
      edtResultado.setText("6");
      Num1 = 6;
    }//GEN-LAST:event_BtnN6ActionPerformed

    private void BtnN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN2ActionPerformed
      edtResultado.setText("2");
      Num1 = 2;
    }//GEN-LAST:event_BtnN2ActionPerformed

    private void BtnN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN3ActionPerformed
      edtResultado.setText("3");
      Num1 = 3;
    }//GEN-LAST:event_BtnN3ActionPerformed

    private void BtnN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnN0ActionPerformed
      edtResultado.setText("0");
      Num1 = 0;
    }//GEN-LAST:event_BtnN0ActionPerformed

    private void BtnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSomaActionPerformed
        Operator = "+";
        Num2 = Num1;
        edtResultado.setText("");
    }//GEN-LAST:event_BtnSomaActionPerformed

    private void BtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubActionPerformed
        Operator = "-";
        Num2 = Num1;
        edtResultado.setText("");
    }//GEN-LAST:event_BtnSubActionPerformed

    private void BtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultActionPerformed
        Operator = "*";
        Num2 = Num1;
        edtResultado.setText("");
    }//GEN-LAST:event_BtnMultActionPerformed

    private void BtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivActionPerformed
        Operator = "/";
        Num2 = Num1;
        edtResultado.setText("");
    }//GEN-LAST:event_BtnDivActionPerformed

    private void BtnIigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIigualActionPerformed
        if(Operator == "+"){
            edtResultado.setText(String.valueOf(Num2+Num1));
        }else if(Operator == "-"){
            edtResultado.setText(String.valueOf(Num2-Num1));
        }else if(Operator == "*"){
            edtResultado.setText(String.valueOf(Num2*Num1));
        }else if(Operator == "/"){
               if(Num1 == 0 && Num2 == 0){
                   edtResultado.setText("Resultado Indefinido");
               }else if(Num1 == 0){
                   JOptionPane.showMessageDialog(this,"Impossivel dividir por zero!","Erro",JOptionPane.WARNING_MESSAGE);
               }else{
                   edtResultado.setText(String.valueOf(Num2/Num1));
               }
            
        }
    }//GEN-LAST:event_BtnIigualActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntN7;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnIigual;
    private javax.swing.JButton BtnMult;
    private javax.swing.JButton BtnN0;
    private javax.swing.JButton BtnN1;
    private javax.swing.JButton BtnN2;
    private javax.swing.JButton BtnN3;
    private javax.swing.JButton BtnN4;
    private javax.swing.JButton BtnN5;
    private javax.swing.JButton BtnN6;
    private javax.swing.JButton BtnN8;
    private javax.swing.JButton BtnN9;
    private javax.swing.JButton BtnSoma;
    private javax.swing.JButton BtnSub;
    private javax.swing.JTextField edtResultado;
    private javax.swing.JButton jButton15;
    // End of variables declaration//GEN-END:variables
}
