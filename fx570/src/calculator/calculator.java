/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import java.awt.Toolkit;

/**
 *
 * @author Daniel Haqeem
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    
    public calculator() {
        initComponents();
        
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void EnterNumbers(String q){
        String Nums = kalkResult.getText()+q;
        kalkResult.setText(Nums);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kalkDivide = new javax.swing.JButton();
        kalkAdd = new javax.swing.JButton();
        kalkMinus = new javax.swing.JButton();
        kalkMultiple = new javax.swing.JButton();
        kalkResult = new javax.swing.JTextField();
        kalkButton7 = new javax.swing.JButton();
        kalkButton6 = new javax.swing.JButton();
        kalkButton8 = new javax.swing.JButton();
        kalkButton9 = new javax.swing.JButton();
        kalkButton3 = new javax.swing.JButton();
        kalkButton4 = new javax.swing.JButton();
        kalkButton5 = new javax.swing.JButton();
        kalkButton0 = new javax.swing.JButton();
        kalkButton1 = new javax.swing.JButton();
        kalkButton2 = new javax.swing.JButton();
        kalkEqual = new javax.swing.JButton();
        kalkClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChaewonCulator");
        setBackground(new java.awt.Color(255, 255, 255));

        kalkDivide.setBackground(new java.awt.Color(0, 102, 204));
        kalkDivide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkDivide.setText("÷");
        kalkDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkDivideActionPerformed(evt);
            }
        });

        kalkAdd.setBackground(new java.awt.Color(0, 102, 204));
        kalkAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkAdd.setText("+");
        kalkAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkAddActionPerformed(evt);
            }
        });

        kalkMinus.setBackground(new java.awt.Color(0, 102, 204));
        kalkMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkMinus.setText("-");
        kalkMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkMinusActionPerformed(evt);
            }
        });

        kalkMultiple.setBackground(new java.awt.Color(0, 102, 204));
        kalkMultiple.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkMultiple.setText("x");
        kalkMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkMultipleActionPerformed(evt);
            }
        });

        kalkResult.setBackground(new java.awt.Color(204, 204, 204));
        kalkResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        kalkButton7.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton7.setText("7");
        kalkButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton7ActionPerformed(evt);
            }
        });

        kalkButton6.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton6.setText("6");
        kalkButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton6ActionPerformed(evt);
            }
        });

        kalkButton8.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton8.setText("8");
        kalkButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton8ActionPerformed(evt);
            }
        });

        kalkButton9.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton9.setText("9");
        kalkButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton9ActionPerformed(evt);
            }
        });

        kalkButton3.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton3.setText("3");
        kalkButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton3ActionPerformed(evt);
            }
        });

        kalkButton4.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton4.setText("4");
        kalkButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton4ActionPerformed(evt);
            }
        });

        kalkButton5.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton5.setText("5");
        kalkButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton5ActionPerformed(evt);
            }
        });

        kalkButton0.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton0.setText("0");
        kalkButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton0ActionPerformed(evt);
            }
        });

        kalkButton1.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton1.setText("1");
        kalkButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton1ActionPerformed(evt);
            }
        });

        kalkButton2.setBackground(new java.awt.Color(153, 204, 255));
        kalkButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkButton2.setText("2");
        kalkButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkButton2ActionPerformed(evt);
            }
        });

        kalkEqual.setBackground(new java.awt.Color(0, 102, 204));
        kalkEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkEqual.setText("=");
        kalkEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkEqualActionPerformed(evt);
            }
        });

        kalkClear.setBackground(new java.awt.Color(0, 102, 204));
        kalkClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kalkClear.setText("CC");
        kalkClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kalkButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kalkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kalkButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kalkClear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kalkEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(kalkMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kalkResult)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(kalkResult, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(kalkAdd)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kalkButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kalkButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kalkButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kalkMinus)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kalkButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kalkButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kalkButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kalkButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kalkButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kalkButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kalkDivide)
                        .addGap(22, 22, 22)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kalkMultiple)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kalkButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kalkEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kalkClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kalkMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkMinusActionPerformed
       NumEnter1 = Double.parseDouble(kalkResult.getText());
       kalkResult.setText("");
       op ="-";
    }//GEN-LAST:event_kalkMinusActionPerformed

    private void kalkButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton9ActionPerformed
        EnterNumbers("9");
    }//GEN-LAST:event_kalkButton9ActionPerformed

    private void kalkEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkEqualActionPerformed
        NumEnter2 = Double.parseDouble(kalkResult.getText());
        //Changing the input into whole number
        String formattedNumEnter1 = (NumEnter1 % 1 == 0) ? String.format("%.0f", NumEnter1) : String.format("%.2f", NumEnter1);
        String formattedNumEnter2 = (NumEnter2 % 1 == 0) ? String.format("%.0f", NumEnter2) : String.format("%.2f", NumEnter2);
        
        //Declare expression for the output in sentence
        String expression = formattedNumEnter1 + " " + op + " " + formattedNumEnter2;
         
        
        
        if(op == "+"){
            Result = NumEnter1 + NumEnter2;
            kalkResult.setText(String.valueOf(Result));
        }
        
        else if(op == "-"){
            Result = NumEnter1 - NumEnter2;
            kalkResult.setText(String.valueOf(Result));
        }
        
        else if(op == "x"){
            Result = NumEnter1 * NumEnter2;
            kalkResult.setText(String.valueOf(Result));
        }
        
        else if(op == "÷"){
            Result = NumEnter1 / NumEnter2;
            kalkResult.setText(String.valueOf(Result));
        }
        
        // Prepare the final output string for Result
        String formattedResult = (Result % 1 == 0) ? String.format("%.0f", Result) : String.format("%.2f", Result);
        String output = expression + " = "+formattedResult;
        
        kalkResult.setText(String.valueOf(output));
    }//GEN-LAST:event_kalkEqualActionPerformed

    private void kalkMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkMultipleActionPerformed
        NumEnter1 = Double.parseDouble(kalkResult.getText());
       kalkResult.setText("");
       op ="x";
    }//GEN-LAST:event_kalkMultipleActionPerformed

    private void kalkButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_kalkButton7ActionPerformed

    private void kalkButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_kalkButton8ActionPerformed

    private void kalkButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton4ActionPerformed
        EnterNumbers("4");
    }//GEN-LAST:event_kalkButton4ActionPerformed

    private void kalkButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_kalkButton5ActionPerformed

    private void kalkButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton6ActionPerformed
        EnterNumbers("6");
    }//GEN-LAST:event_kalkButton6ActionPerformed

    private void kalkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton1ActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_kalkButton1ActionPerformed

    private void kalkButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_kalkButton2ActionPerformed

    private void kalkButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton3ActionPerformed
        EnterNumbers("3");
    }//GEN-LAST:event_kalkButton3ActionPerformed

    private void kalkButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkButton0ActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_kalkButton0ActionPerformed

    private void kalkAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkAddActionPerformed
       NumEnter1 = Double.parseDouble(kalkResult.getText());
       kalkResult.setText("");
       op ="+";        
    }//GEN-LAST:event_kalkAddActionPerformed

    private void kalkDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkDivideActionPerformed
       NumEnter1 = Double.parseDouble(kalkResult.getText());
       kalkResult.setText("");
       op ="÷"; 
    }//GEN-LAST:event_kalkDivideActionPerformed

    private void kalkClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkClearActionPerformed
        kalkResult.setText("");
    }//GEN-LAST:event_kalkClearActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton kalkAdd;
    private javax.swing.JButton kalkButton0;
    private javax.swing.JButton kalkButton1;
    private javax.swing.JButton kalkButton2;
    private javax.swing.JButton kalkButton3;
    private javax.swing.JButton kalkButton4;
    private javax.swing.JButton kalkButton5;
    private javax.swing.JButton kalkButton6;
    private javax.swing.JButton kalkButton7;
    private javax.swing.JButton kalkButton8;
    private javax.swing.JButton kalkButton9;
    private javax.swing.JButton kalkClear;
    private javax.swing.JButton kalkDivide;
    private javax.swing.JButton kalkEqual;
    private javax.swing.JButton kalkMinus;
    private javax.swing.JButton kalkMultiple;
    private javax.swing.JTextField kalkResult;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
