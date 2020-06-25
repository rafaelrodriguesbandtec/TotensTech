package view;

import Model.InformacaoTotem;
import com.mycompany.projeto.pi.MostrarTudo;
import java.awt.Color;
import javax.swing.JFrame;

public class InfoSistema extends javax.swing.JFrame {

    MostrarTudo registroSistema = new MostrarTudo();
    InformacaoTotem infoTotem = new InformacaoTotem();

    public InfoSistema() {
        initComponents();
        exibirInfoSistema();
        this.setLocationRelativeTo(null);
        

    }

    public void exibirInfoSistema() {
        
        registroSistema.infoHardware();             
        lblInfoProcessador.setText(infoTotem.getNomeCpu());
        lblInfoPlacaMae.setText(infoTotem.getModeloTotem());
        nomeComputador.setText(infoTotem.getProprietario());
        lblInfoSistema.setText(infoTotem.getSistemaOperacional());
        lblNumeroSerial.setText(infoTotem.getSerialToten());
        lblInfoSistemaArquivo.setText(infoTotem.getTipoDeDisco());
        lblModeloDisco.setText(infoTotem.getDiscoModelo());
        lblMarca.setText(infoTotem.getMarcaTotem());
        lblInfoRam.setText(infoTotem.memoriaTotalS());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo01 = new javax.swing.JPanel();
        fundo02 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblInfoProcessador = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblInfoPlacaMae = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblInfoSistema = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        nomeComputador = new javax.swing.JLabel();
        lblTitulo9 = new javax.swing.JLabel();
        lblInfoRam = new javax.swing.JLabel();
        lblMonitoramento = new javax.swing.JLabel();
        lblTitulo8 = new javax.swing.JLabel();
        lblNumeroSerial = new javax.swing.JLabel();
        lblTitulo10 = new javax.swing.JLabel();
        lblModeloDisco = new javax.swing.JLabel();
        lblTitulo11 = new javax.swing.JLabel();
        lblInfoSistemaArquivo = new javax.swing.JLabel();
        lblTitulo12 = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        lblTotensTech = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fundo01.setBackground(new java.awt.Color(39, 40, 51));

        fundo02.setBackground(new java.awt.Color(28, 29, 38));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Infomções do Sistema");
        lblTitulo.setAlignmentY(0.0F);

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo1.setText("_______________________________________________________________________________________________________________________________________________________________________________________________________________");
        lblTitulo1.setAlignmentY(0.0F);

        lblTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText("Processador:");
        lblTitulo2.setAlignmentY(0.0F);

        lblInfoProcessador.setBackground(new java.awt.Color(255, 255, 255));
        lblInfoProcessador.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblInfoProcessador.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoProcessador.setText("Informação sobre o processador.");
        lblInfoProcessador.setAlignmentY(0.0F);

        lblTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText("Memória (RAM):");
        lblTitulo3.setAlignmentY(0.0F);

        lblInfoPlacaMae.setBackground(new java.awt.Color(255, 255, 255));
        lblInfoPlacaMae.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblInfoPlacaMae.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoPlacaMae.setText("Informação sobre placa mãe.");
        lblInfoPlacaMae.setAlignmentY(0.0F);

        lblTitulo4.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo4.setText("Tipo de Sistema:");
        lblTitulo4.setAlignmentY(0.0F);

        lblInfoSistema.setBackground(new java.awt.Color(255, 255, 255));
        lblInfoSistema.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblInfoSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoSistema.setText("Sistema Operacional");
        lblInfoSistema.setAlignmentY(0.0F);

        lblTitulo5.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo5.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo5.setText("Informações de Hardware");
        lblTitulo5.setAlignmentY(0.0F);

        lblTitulo6.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo6.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo6.setText("________________________________________________________________________________________________________________________________________________________________________________________________________");
        lblTitulo6.setAlignmentY(0.0F);

        lblTitulo7.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo7.setText("Nome do Computador");
        lblTitulo7.setAlignmentY(0.0F);

        nomeComputador.setBackground(new java.awt.Color(255, 255, 255));
        nomeComputador.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        nomeComputador.setForeground(new java.awt.Color(255, 255, 255));
        nomeComputador.setText("Nome do Computador");
        nomeComputador.setAlignmentY(0.0F);

        lblTitulo9.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo9.setText("Modelo placa mãe:");
        lblTitulo9.setAlignmentY(0.0F);

        lblInfoRam.setBackground(new java.awt.Color(255, 255, 255));
        lblInfoRam.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblInfoRam.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoRam.setText("Informação sobre a RAM.");
        lblInfoRam.setAlignmentY(0.0F);

        lblMonitoramento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMonitoramento.setForeground(new java.awt.Color(255, 255, 255));
        lblMonitoramento.setText("Voltar ao monitoramento");
        lblMonitoramento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMonitoramentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMonitoramentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMonitoramentoMouseExited(evt);
            }
        });

        lblTitulo8.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo8.setText("Serial:");
        lblTitulo8.setAlignmentY(0.0F);

        lblNumeroSerial.setBackground(new java.awt.Color(255, 255, 255));
        lblNumeroSerial.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblNumeroSerial.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroSerial.setText("Número do Serial");
        lblNumeroSerial.setAlignmentY(0.0F);

        lblTitulo10.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo10.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo10.setText("Modelo do disco:");
        lblTitulo10.setAlignmentY(0.0F);

        lblModeloDisco.setBackground(new java.awt.Color(255, 255, 255));
        lblModeloDisco.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblModeloDisco.setForeground(new java.awt.Color(255, 255, 255));
        lblModeloDisco.setText("Modelo do disco");
        lblModeloDisco.setAlignmentY(0.0F);

        lblTitulo11.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo11.setText("Sistema de arquivos:");
        lblTitulo11.setAlignmentY(0.0F);

        lblInfoSistemaArquivo.setBackground(new java.awt.Color(255, 255, 255));
        lblInfoSistemaArquivo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblInfoSistemaArquivo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoSistemaArquivo.setText("Sistema de arquivos");
        lblInfoSistemaArquivo.setAlignmentY(0.0F);

        lblTitulo12.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo12.setText("Marca do Computador");
        lblTitulo12.setAlignmentY(0.0F);

        lblMarca.setBackground(new java.awt.Color(255, 255, 255));
        lblMarca.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca do Computador");
        lblMarca.setAlignmentY(0.0F);

        javax.swing.GroupLayout fundo02Layout = new javax.swing.GroupLayout(fundo02);
        fundo02.setLayout(fundo02Layout);
        fundo02Layout.setHorizontalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo2)
                    .addComponent(lblTitulo3)
                    .addComponent(lblTitulo9)
                    .addComponent(lblTitulo10))
                .addGap(322, 322, 322)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoPlacaMae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfoRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfoProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblModeloDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo02Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundo02Layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fundo02Layout.createSequentialGroup()
                                .addComponent(lblTitulo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fundo02Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundo02Layout.createSequentialGroup()
                                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo11)
                                    .addComponent(lblTitulo4)
                                    .addComponent(lblTitulo8))
                                .addGap(306, 306, 306)
                                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInfoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblInfoSistemaArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(fundo02Layout.createSequentialGroup()
                                        .addComponent(lblNumeroSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(fundo02Layout.createSequentialGroup()
                                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fundo02Layout.createSequentialGroup()
                                        .addComponent(lblTitulo7)
                                        .addGap(300, 300, 300)
                                        .addComponent(nomeComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fundo02Layout.createSequentialGroup()
                                        .addComponent(lblTitulo12)
                                        .addGap(300, 300, 300)
                                        .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMonitoramento)
                .addGap(14, 14, 14))
        );
        fundo02Layout.setVerticalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblTitulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo12)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo7)
                    .addComponent(nomeComputador))
                .addGap(12, 12, 12)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo4)
                    .addComponent(lblInfoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo11)
                    .addComponent(lblInfoSistemaArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo8)
                    .addComponent(lblNumeroSerial))
                .addGap(15, 15, 15)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo5)
                    .addComponent(lblTitulo6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo2)
                    .addComponent(lblInfoProcessador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoRam)
                    .addComponent(lblTitulo3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfoPlacaMae)
                    .addComponent(lblTitulo9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo10)
                    .addComponent(lblModeloDisco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblMonitoramento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnFechar.setBackground(new java.awt.Color(228, 76, 101));
        btnFechar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("X");
        btnFechar.setAlignmentY(0.0F);
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFechar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnFechar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnFecharMouseMoved(evt);
            }
        });
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
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

        btnMinimizar.setBackground(new java.awt.Color(228, 76, 101));
        btnMinimizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setText("_");
        btnMinimizar.setAlignmentY(0.0F);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMinimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseMoved(evt);
            }
        });
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundo01Layout = new javax.swing.GroupLayout(fundo01);
        fundo01.setLayout(fundo01Layout);
        fundo01Layout.setHorizontalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo01Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lblTotensTech)
                .addGap(901, 901, 901)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addGap(15, 15, 15))
            .addComponent(fundo02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fundo01Layout.setVerticalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo01Layout.createSequentialGroup()
                .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo01Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo01Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotensTech, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(fundo02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(fundo01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharMouseMoved

    private void lblTotensTechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTechMouseClicked
        InfoSistema infoSystem = new InfoSistema();

        infoSystem.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_lblTotensTechMouseClicked

    private void lblTotensTechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTechMouseEntered
        lblTotensTech.setForeground(new Color(228, 76, 101));
    }//GEN-LAST:event_lblTotensTechMouseEntered

    private void lblTotensTechMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTechMouseExited
        lblTotensTech.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblTotensTechMouseExited

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        this.setVisible(false);
        //System.exit(0);
    }//GEN-LAST:event_btnFecharMouseClicked

    private void lblMonitoramentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMonitoramentoMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_lblMonitoramentoMouseClicked

    private void lblMonitoramentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMonitoramentoMouseEntered
        lblMonitoramento.setForeground(new Color(228, 76, 101));
    }//GEN-LAST:event_lblMonitoramentoMouseEntered

    private void lblMonitoramentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMonitoramentoMouseExited
        lblMonitoramento.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblMonitoramentoMouseExited

    private void btnMinimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizarMouseMoved

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

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
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JPanel fundo01;
    private javax.swing.JPanel fundo02;
    private javax.swing.JLabel lblInfoPlacaMae;
    private javax.swing.JLabel lblInfoProcessador;
    private javax.swing.JLabel lblInfoRam;
    private javax.swing.JLabel lblInfoSistema;
    private javax.swing.JLabel lblInfoSistemaArquivo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModeloDisco;
    private javax.swing.JLabel lblMonitoramento;
    private javax.swing.JLabel lblNumeroSerial;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo10;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JLabel lblTitulo9;
    private javax.swing.JLabel lblTotensTech;
    private javax.swing.JLabel nomeComputador;
    // End of variables declaration//GEN-END:variables
}
