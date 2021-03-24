/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Júlio Evêncio
 */
public class Calculadora extends javax.swing.JFrame {
    
    private Double x;
    private Double y;
    private char operacao;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        operacao = 'N';
        initComponents();
    }
    
    private void alterarDisplay(String numero) {
        if((display.getText()).length() < 13) {
            if((display.getText()).equals("0")
                    || display.getText().contains("+")
                    || display.getText().contains("-")
                    || display.getText().contains("*")
                    || display.getText().contains("/")) {
                display.setText(numero);
            } else {
                display.setText(display.getText() + numero);
            }
        }
    }
    
    private void calcular() {
        String resposta = "ERROR";
        switch (operacao) {
            case '+':
                resposta = String.valueOf(x + y);
                break;
            case '-':
                resposta = String.valueOf(x - y);
                break;
            case '*':
                resposta = String.valueOf(x * y);
                break;
            case '/':
                resposta = String.valueOf(x / y);
                break;
        }
        display.setText(resposta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JLabel();
        botaoUm = new javax.swing.JButton();
        botaoDois = new javax.swing.JButton();
        botaoTres = new javax.swing.JButton();
        botaoQuatro = new javax.swing.JButton();
        botaoCinco = new javax.swing.JButton();
        botaoSeis = new javax.swing.JButton();
        botaoSete = new javax.swing.JButton();
        botaoOito = new javax.swing.JButton();
        botaoNove = new javax.swing.JButton();
        botaoZero = new javax.swing.JButton();
        botaoPonto = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botaoAdicao = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botaoMultiplicacao = new javax.swing.JButton();
        botaoDivisao = new javax.swing.JButton();
        resetar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        display.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setText("0");

        botaoUm.setText("1");
        botaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUmActionPerformed(evt);
            }
        });

        botaoDois.setText("2");
        botaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDoisActionPerformed(evt);
            }
        });

        botaoTres.setText("3");
        botaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTresActionPerformed(evt);
            }
        });

        botaoQuatro.setText("4");
        botaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuatroActionPerformed(evt);
            }
        });

        botaoCinco.setText("5");
        botaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCincoActionPerformed(evt);
            }
        });

        botaoSeis.setText("6");
        botaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeisActionPerformed(evt);
            }
        });

        botaoSete.setText("7");
        botaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeteActionPerformed(evt);
            }
        });

        botaoOito.setText("8");
        botaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOitoActionPerformed(evt);
            }
        });

        botaoNove.setText("9");
        botaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNoveActionPerformed(evt);
            }
        });

        botaoZero.setText("0");
        botaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZeroActionPerformed(evt);
            }
        });

        botaoPonto.setText(".");
        botaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontoActionPerformed(evt);
            }
        });

        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        botaoAdicao.setText("+");
        botaoAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicaoActionPerformed(evt);
            }
        });

        botaoSubtracao.setText("-");
        botaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtracaoActionPerformed(evt);
            }
        });

        botaoMultiplicacao.setText("*");
        botaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicacaoActionPerformed(evt);
            }
        });

        botaoDivisao.setText("/");
        botaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivisaoActionPerformed(evt);
            }
        });

        resetar.setText("Resetar");
        resetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoUm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoDois)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoTres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAdicao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoQuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCinco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSeis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoZero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoPonto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoSete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoOito)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoIgual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoNove)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoUm)
                    .addComponent(botaoDois)
                    .addComponent(botaoTres)
                    .addComponent(botaoAdicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoQuatro)
                    .addComponent(botaoCinco)
                    .addComponent(botaoSeis)
                    .addComponent(botaoSubtracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSete)
                    .addComponent(botaoOito)
                    .addComponent(botaoNove)
                    .addComponent(botaoMultiplicacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoZero)
                    .addComponent(botaoPonto)
                    .addComponent(botaoIgual)
                    .addComponent(botaoDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUmActionPerformed
        alterarDisplay(botaoUm.getText());
    }//GEN-LAST:event_botaoUmActionPerformed

    private void botaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDoisActionPerformed
        alterarDisplay(botaoDois.getText());
    }//GEN-LAST:event_botaoDoisActionPerformed

    private void botaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTresActionPerformed
        alterarDisplay(botaoTres.getText());
    }//GEN-LAST:event_botaoTresActionPerformed

    private void botaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuatroActionPerformed
        alterarDisplay(botaoQuatro.getText());
    }//GEN-LAST:event_botaoQuatroActionPerformed

    private void botaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCincoActionPerformed
        alterarDisplay(botaoCinco.getText());
    }//GEN-LAST:event_botaoCincoActionPerformed

    private void botaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeisActionPerformed
        alterarDisplay(botaoSeis.getText());
    }//GEN-LAST:event_botaoSeisActionPerformed

    private void botaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeteActionPerformed
        alterarDisplay(botaoSete.getText());
    }//GEN-LAST:event_botaoSeteActionPerformed

    private void botaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOitoActionPerformed
        alterarDisplay(botaoOito.getText());
    }//GEN-LAST:event_botaoOitoActionPerformed

    private void botaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNoveActionPerformed
        alterarDisplay(botaoNove.getText());
    }//GEN-LAST:event_botaoNoveActionPerformed

    private void botaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZeroActionPerformed
        alterarDisplay(botaoZero.getText());
    }//GEN-LAST:event_botaoZeroActionPerformed

    private void botaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontoActionPerformed
        if(!(display.getText()).contains(".")) {
            display.setText(display.getText() + botaoPonto.getText());
        }
    }//GEN-LAST:event_botaoPontoActionPerformed

    private void resetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarActionPerformed
        display.setText("0");
        operacao = 'N';
    }//GEN-LAST:event_resetarActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        if(operacao != 'N') {
            y = Double.parseDouble(display.getText());
            calcular();
            operacao = 'N';
        }
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void botaoAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicaoActionPerformed
        x = Double.parseDouble(display.getText());
        operacao = '+';
        display.setText(display.getText() + "+");
    }//GEN-LAST:event_botaoAdicaoActionPerformed

    private void botaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtracaoActionPerformed
        x = Double.parseDouble(display.getText());
        operacao = '-';
        display.setText(display.getText() + "-");
    }//GEN-LAST:event_botaoSubtracaoActionPerformed

    private void botaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicacaoActionPerformed
        x = Double.parseDouble(display.getText());
        operacao = '*';
        display.setText(display.getText() + "*");
    }//GEN-LAST:event_botaoMultiplicacaoActionPerformed

    private void botaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivisaoActionPerformed
        x = Double.parseDouble(display.getText());
        operacao = '/';
        display.setText(display.getText() + "/");
    }//GEN-LAST:event_botaoDivisaoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicao;
    private javax.swing.JButton botaoCinco;
    private javax.swing.JButton botaoDivisao;
    private javax.swing.JButton botaoDois;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMultiplicacao;
    private javax.swing.JButton botaoNove;
    private javax.swing.JButton botaoOito;
    private javax.swing.JButton botaoPonto;
    private javax.swing.JButton botaoQuatro;
    private javax.swing.JButton botaoSeis;
    private javax.swing.JButton botaoSete;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.JButton botaoTres;
    private javax.swing.JButton botaoUm;
    private javax.swing.JButton botaoZero;
    private javax.swing.JLabel display;
    private javax.swing.JButton resetar;
    // End of variables declaration//GEN-END:variables
}
