
package view;

import com.mycompany.projeto.pi.MostrarTudo;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;



public class Monitoramento extends javax.swing.JFrame {
   MostrarTudo leitura = new MostrarTudo();

    public Monitoramento() {
        initComponents();
        this.setLocationRelativeTo(null);
        long TEMPO = (1000 * 1);
        
        Timer timer = null;
        
        if(timer == null){
            timer = new Timer();
            
            TimerTask tarefa = new TimerTask(){
                public void run(){
                   exibirRAM();
                }
            };
                    
           timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
        }
        
    }
    
    public void exibirRAM(){
    leitura.registrarInfoCpu();
    leitura.registrarInfoMemoria();
    
           
    lblValorMemoria.setText(String.format("%.2f GB", leitura.getMemoriaDisponivel()));
    lblMemoriaTotal.setText(String.format("%.2f GB", leitura.getMemoriaTotal()));
    lblCpuTemp.setText(String.format("%.2f °C", leitura.getTemperaturaCpu()));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo01 = new javax.swing.JPanel();
        fundo02 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCpu = new javax.swing.JLabel();
        lblValorCpu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMemoria = new javax.swing.JLabel();
        lblValorMemoria = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblValorDisco = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCpuTemp = new javax.swing.JLabel();
        lblCpuTempTexto = new javax.swing.JLabel();
        lblMemoriaTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        lblTotensTech = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo01.setBackground(new java.awt.Color(39, 40, 51));

        fundo02.setBackground(new java.awt.Color(28, 29, 38));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Monitoramento");
        lblTitulo.setAlignmentY(0.0F);

        jPanel1.setBackground(new java.awt.Color(39, 40, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCpu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCpu.setForeground(new java.awt.Color(255, 255, 255));
        lblCpu.setText("CPU");

        lblValorCpu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblValorCpu.setForeground(new java.awt.Color(255, 255, 255));
        lblValorCpu.setText("0,00 %");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCpu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(lblValorCpu)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpu)
                    .addComponent(lblValorCpu))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(39, 40, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMemoria.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblMemoria.setText("MEMÓRIA DISPONÍVEL:");

        lblValorMemoria.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblValorMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblValorMemoria.setText("0,00 GB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblMemoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValorMemoria)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMemoria)
                    .addComponent(lblValorMemoria))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(39, 40, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblValorDisco.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblValorDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblValorDisco.setText("0,00 %");

        lblDisco.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblDisco.setText("DISCO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblDisco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(lblValorDisco)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorDisco)
                    .addComponent(lblDisco))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(28, 29, 38));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCpuTemp.setForeground(new java.awt.Color(255, 255, 255));
        lblCpuTemp.setText("00.0 Cº");

        lblCpuTempTexto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblCpuTempTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblCpuTempTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-temperatura-16.png"))); // NOI18N
        lblCpuTempTexto.setText("CPU");

        lblMemoriaTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblMemoriaTotal.setText("0,00GB");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ram-de-smartphone-16.png"))); // NOI18N
        jLabel1.setText("Ram:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("0,00GB");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-disco-frisbee-16.png"))); // NOI18N
        jLabel4.setText("HD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCpuTempTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpuTemp))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemoriaTotal)
                        .addGap(48, 48, 48))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpuTempTexto)
                    .addComponent(lblCpuTemp))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMemoriaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout fundo02Layout = new javax.swing.GroupLayout(fundo02);
        fundo02.setLayout(fundo02Layout);
        fundo02Layout.setHorizontalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(161, 161, 161))
        );
        fundo02Layout.setVerticalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fundo02Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnFechar.setBackground(new java.awt.Color(228, 76, 101));
        btnFechar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("X");
        btnFechar.setAlignmentY(0.0F);
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnFechar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnFecharMouseMoved(evt);
            }
        });
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblTotensTech.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotensTech.setForeground(new java.awt.Color(255, 255, 255));
        lblTotensTech.setText("TotensTech");
        lblTotensTech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTotensTechMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTotensTechMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTotensTechMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fundo01Layout = new javax.swing.GroupLayout(fundo01);
        fundo01.setLayout(fundo01Layout);
        fundo01Layout.setHorizontalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo01Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblTotensTech)
                        .addGap(359, 359, 359)
                        .addComponent(btnFechar))
                    .addComponent(fundo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundo01Layout.setVerticalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotensTech, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(fundo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharMouseMoved

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void lblTotensTechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTechMouseClicked
       InfoSistema infoSystem = new InfoSistema();
       
       
       infoSystem.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_lblTotensTechMouseClicked

    private void lblTotensTechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTechMouseEntered
         lblTotensTech.setForeground(new Color(228,76,101));
    }//GEN-LAST:event_lblTotensTechMouseEntered

    private void lblTotensTechMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTechMouseExited
         lblTotensTech.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblTotensTechMouseExited

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
    private javax.swing.JButton btnFechar;
    private javax.swing.JPanel fundo01;
    private javax.swing.JPanel fundo02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblCpuTemp;
    private javax.swing.JLabel lblCpuTempTexto;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMemoriaTotal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotensTech;
    private javax.swing.JLabel lblValorCpu;
    private javax.swing.JLabel lblValorDisco;
    private javax.swing.JLabel lblValorMemoria;
    // End of variables declaration//GEN-END:variables
}
