package view;

public class InfoSistema extends javax.swing.JFrame {

    /**
     * Creates new form InfoSistema
     */
    public InfoSistema() {
        initComponents();
        exibirInfoSistema();
        this.setLocationRelativeTo(null);
        
    }
    
    public void exibirInfoSistema(){
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo01 = new javax.swing.JPanel();
        fundo2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        fundo02 = new javax.swing.JPanel();
        lblCpu = new javax.swing.JLabel();
        lblCpu1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo01.setBackground(new java.awt.Color(39, 40, 51));

        fundo2.setBackground(new java.awt.Color(39, 40, 51));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Informações do sistema");
        lblTitulo.setAlignmentY(0.0F);

        javax.swing.GroupLayout fundo2Layout = new javax.swing.GroupLayout(fundo2);
        fundo2.setLayout(fundo2Layout);
        fundo2Layout.setHorizontalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitulo)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        fundo2Layout.setVerticalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        fundo02.setBackground(new java.awt.Color(28, 29, 38));

        lblCpu.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCpu.setForeground(new java.awt.Color(255, 255, 255));
        lblCpu.setText("Dispositivo:");

        lblCpu1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCpu1.setForeground(new java.awt.Color(255, 255, 255));
        lblCpu1.setText("Dispositivo:");

        javax.swing.GroupLayout fundo02Layout = new javax.swing.GroupLayout(fundo02);
        fundo02.setLayout(fundo02Layout);
        fundo02Layout.setHorizontalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpu1)
                    .addComponent(lblCpu))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        fundo02Layout.setVerticalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblCpu)
                .addGap(18, 18, 18)
                .addComponent(lblCpu1)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fundo01Layout = new javax.swing.GroupLayout(fundo01);
        fundo01.setLayout(fundo01Layout);
        fundo01Layout.setHorizontalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fundo01Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(fundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        fundo01Layout.setVerticalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo01Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(fundo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fundo01Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(InfoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fundo01;
    private javax.swing.JPanel fundo02;
    private javax.swing.JPanel fundo2;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblCpu1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
