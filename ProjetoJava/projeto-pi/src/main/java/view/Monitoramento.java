
package view;

import com.mycompany.projeto.pi.MostrarTudo;


public class Monitoramento extends javax.swing.JFrame {

    /**
     * Creates new form Monitoramento
     */
    public Monitoramento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo01 = new javax.swing.JPanel();
        lblTotensTech = new javax.swing.JLabel();
        fundo02 = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblCpu = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        lblCpuTemp = new javax.swing.JLabel();
        lblValorMemoria = new javax.swing.JLabel();
        lblValorCpu = new javax.swing.JLabel();
        lblValorDisco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo01.setBackground(new java.awt.Color(39, 40, 51));

        lblTotensTech.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotensTech.setForeground(new java.awt.Color(255, 255, 255));
        lblTotensTech.setText("TotensTech");

        fundo02.setBackground(new java.awt.Color(28, 29, 38));

        btnAtualizar.setBackground(new java.awt.Color(228, 76, 101));
        btnAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setAlignmentY(0.0F);
        btnAtualizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseMoved(evt);
            }
        });
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Monitoramento");
        lblTitulo.setAlignmentY(0.0F);

        lblCpu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCpu.setForeground(new java.awt.Color(255, 255, 255));
        lblCpu.setText("CPU");

        lblMemoria.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblMemoria.setText("MEMÓRIA");

        lblDisco.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblDisco.setText("DISCO");

        lblCpuTemp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCpuTemp.setForeground(new java.awt.Color(255, 255, 255));
        lblCpuTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-temperatura-16.png"))); // NOI18N
        lblCpuTemp.setText("CPU");

        lblValorMemoria.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblValorMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblValorMemoria.setText("00.0");

        lblValorCpu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblValorCpu.setForeground(new java.awt.Color(255, 255, 255));
        lblValorCpu.setText("00.0");

        lblValorDisco.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblValorDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblValorDisco.setText("00.0");

        javax.swing.GroupLayout fundo02Layout = new javax.swing.GroupLayout(fundo02);
        fundo02.setLayout(fundo02Layout);
        fundo02Layout.setHorizontalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo02Layout.createSequentialGroup()
                        .addComponent(lblCpuTemp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(fundo02Layout.createSequentialGroup()
                                        .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMemoria)
                                            .addComponent(lblDisco))
                                        .addGap(135, 135, 135)
                                        .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblValorMemoria)
                                            .addComponent(lblValorDisco)))
                                    .addGroup(fundo02Layout.createSequentialGroup()
                                        .addComponent(lblCpu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblValorCpu)))
                                .addGap(20, 20, 20))
                            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizar)
                .addGap(147, 147, 147))
        );
        fundo02Layout.setVerticalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(24, 24, 24)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpu)
                    .addComponent(lblValorCpu))
                .addGap(32, 32, 32)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMemoria)
                    .addComponent(lblValorMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisco)
                    .addComponent(lblValorDisco))
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar)
                .addGap(13, 13, 13)
                .addComponent(lblCpuTemp)
                .addContainerGap())
        );

        javax.swing.GroupLayout fundo01Layout = new javax.swing.GroupLayout(fundo01);
        fundo01.setLayout(fundo01Layout);
        fundo01Layout.setHorizontalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(fundo01Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTotensTech)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        fundo01Layout.setVerticalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo01Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotensTech, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fundo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarMouseMoved

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       MostrarTudo leitura = new MostrarTudo();
       leitura.verificarMemoriaDisponivel();
       
       
       lblValorMemoria.setText(String.format("%.2f GB", leitura.getMemoriaDisponivel()));
       
       lblCpuTemp.setText(String.format("Cpu: %.2f °C", leitura.getTemperaturaCpu()));
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitoramento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JPanel fundo01;
    private javax.swing.JPanel fundo02;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblCpuTemp;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotensTech;
    private javax.swing.JLabel lblValorCpu;
    private javax.swing.JLabel lblValorDisco;
    private javax.swing.JLabel lblValorMemoria;
    // End of variables declaration//GEN-END:variables
}
