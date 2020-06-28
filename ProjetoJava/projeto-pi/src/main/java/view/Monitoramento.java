
package view;

import Conexao.Logs;
import Controller.Conexao;
import Controller.EmpresaRowMapper;
import Controller.TotensRowMapper;
import Controller.UsuarioRowMapper;
import DAO.LeituraDAO;
import DAO.TotenDAO;
import Model.Empresa;
import Model.InformacaoTotem;
import Model.Totens;
import Model.Usuario;
import Slack.SlackMain;
import com.mycompany.projeto.pi.MostrarTudo;
import java.awt.Color;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.PreparedStatement;
import java.util.Map;
import javax.swing.JOptionPane;



public class Monitoramento extends javax.swing.JFrame {
   MostrarTudo leitura = new MostrarTudo();
   InformacaoTotem totem = new InformacaoTotem();
   Conexao con = new Conexao();          
   JdbcTemplate template = new JdbcTemplate(con.getDataSource());
   LeituraDAO cadastrarTotem = new LeituraDAO();
    PreparedStatement pstm = null;
    String fkEmpresa = null;
    Integer fkToten = null;
    Logs log = new Logs();
    TotenDAO novoTotem = new TotenDAO();
   
    public Monitoramento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void abrirTela(String email, String senha, Logs log){
        this.log = log;
        JOptionPane.showMessageDialog(null, "Estamos carregando suas informações, isso pode levar alguns segundos");     
        try {          
            List<Empresa> empresas = template.query("select * from Empresa where Email = ? and Senha = ?", new EmpresaRowMapper(), email, senha);
            if(empresas.isEmpty()){
                List<Usuario> usuario = template.query("select * from Usuario where Email = ? and Senha = ?", new UsuarioRowMapper(), email, senha);
                for(Usuario listaUsuarios : usuario){
                    fkEmpresa = String.format("%s", listaUsuarios.getFkEmpresa());
                }  
            }else{
               for(Empresa listaEmpresas : empresas){
                    fkEmpresa = String.format("%s", listaEmpresas.getIdEmpresa());
                }                 
            }           
            
            List<Totens> totens = template.query("select * from Totens where fkEmpresa = ? and SerialNumber = ? and Modelo = ? and CpuToten = ? and Fabricante = ?", new TotensRowMapper(), fkEmpresa, totem.getSerialToten(), totem.getModeloTotem(), totem.getNomeCpu(), totem.getMarcaTotem());
            
            if(totens.isEmpty()){
                
                novoTotem.cadastrarTotem(totem, fkEmpresa);
                totens = template.query("select * from Totens where fkEmpresa = ? and SerialNumber = ? and Modelo = ? and CpuToten = ? and Fabricante = ?", new TotensRowMapper(), fkEmpresa, totem.getSerialToten(), totem.getModeloTotem(), totem.getNomeCpu(), totem.getMarcaTotem());
            }
            
            for(Totens listaTotens : totens){
                fkToten = listaTotens.getIdTotens();  
            }
            
        } catch (Exception e) {
            this.log.gravarLog(e.toString(), "Erro de conexão");
        }
        novoTotem.alterarStatus("A", this.fkEmpresa, totem.getSerialToten());
        this.exibirRAM();
              
    }
    
    public void exibirRAM(){
    long TEMPO = (10000 * 1);
    Timer timer = null;
    
    leitura.registrarInfoCpu();
    leitura.registrarInfoMemoria();
        
        if(timer == null){
            timer = new Timer();
            
            TimerTask tarefa = new TimerTask(){
                public void run(){
                    SlackMain.registrarSlack(log);
                    lblValorCpu.setText(String.format("%.2f %s", totem.getCpu(), "%"));
                    lblValorDisco.setText(String.format("%s", totem.getDiscoEspacoLivreString()));
                    lblValorMemoria.setText(String.format("%.2f %s", totem.getMemoria(), "%"));
                    lblCpuTemp.setText(String.format("%.2f ºC", leitura.getTemperaturaCpu()));
                    lblMemoriaTotal.setText(String.format("%.2f GB",leitura.getMemoriaTotal()));
                    lvlValorDiscoTotal.setText(String.format("%s", totem.getDiscoEspacoTotalString()));
                    
                    cadastrarTotem.lerDados(totem, fkToten);
                }
            };
                    
           timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
        }
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
        lvlValorDiscoTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCpuTemp1 = new javax.swing.JLabel();
        lblCpuTemp2 = new javax.swing.JLabel();
        lblCpuTemp3 = new javax.swing.JLabel();
        lblInformacaoSistema = new javax.swing.JLabel();
        lblTotensTech1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        lblValorCpu.setText("0,0 %");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCpu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValorCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        lblMemoria.setText("MEMÓRIA EM USO:");

        lblValorMemoria.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblValorMemoria.setForeground(new java.awt.Color(255, 255, 255));
        lblValorMemoria.setText("0,0 %");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblMemoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValorMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        lblValorDisco.setText("0,0 %");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValorDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        lvlValorDiscoTotal.setForeground(new java.awt.Color(255, 255, 255));
        lvlValorDiscoTotal.setText("0GB");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-disco-frisbee-16.png"))); // NOI18N
        jLabel4.setText("HD:");

        lblCpuTemp1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCpuTemp1.setForeground(new java.awt.Color(102, 102, 102));
        lblCpuTemp1.setText("Temperatura");

        lblCpuTemp2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCpuTemp2.setForeground(new java.awt.Color(102, 102, 102));
        lblCpuTemp2.setText("Memória Total");

        lblCpuTemp3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCpuTemp3.setForeground(new java.awt.Color(102, 102, 102));
        lblCpuTemp3.setText("Memória Total");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCpuTempTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpuTemp))
                    .addComponent(lblCpuTemp1))
                .addGap(72, 72, 72)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemoriaTotal))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCpuTemp3)
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvlValorDiscoTotal))
                    .addComponent(lblCpuTemp2))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCpuTemp3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblMemoriaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCpuTemp2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lvlValorDiscoTotal)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCpuTemp1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCpuTempTexto)
                                    .addComponent(lblCpuTemp))))))
                .addContainerGap())
        );

        lblInformacaoSistema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInformacaoSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacaoSistema.setText("Informações do Sistema");
        lblInformacaoSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInformacaoSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInformacaoSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInformacaoSistemaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fundo02Layout = new javax.swing.GroupLayout(fundo02);
        fundo02.setLayout(fundo02Layout);
        fundo02Layout.setHorizontalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo02Layout.createSequentialGroup()
                        .addComponent(lblInformacaoSistema)
                        .addContainerGap())))
        );
        fundo02Layout.setVerticalGroup(
            fundo02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo02Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblInformacaoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTotensTech1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotensTech1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotensTech1.setText("TotensTech");
        lblTotensTech1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTotensTech1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTotensTech1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTotensTech1MouseExited(evt);
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

        btnFechar.setBackground(new java.awt.Color(228, 76, 101));
        btnFechar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("X");
        btnFechar.setAlignmentY(0.0F);
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFechar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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

        javax.swing.GroupLayout fundo01Layout = new javax.swing.GroupLayout(fundo01);
        fundo01.setLayout(fundo01Layout);
        fundo01Layout.setHorizontalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo01Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTotensTech1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addGap(18, 18, 18))
            .addComponent(fundo02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fundo01Layout.setVerticalGroup(
            fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo01Layout.createSequentialGroup()
                .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo01Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(fundo01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo01Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotensTech1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(fundo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo01, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTotensTech1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTech1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotensTech1MouseClicked

    private void lblTotensTech1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTech1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotensTech1MouseEntered

    private void lblTotensTech1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTotensTech1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotensTech1MouseExited

    private void lblInformacaoSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacaoSistemaMouseClicked
        InfoSistema is = new InfoSistema();

        is.setVisible(true);
    }//GEN-LAST:event_lblInformacaoSistemaMouseClicked

    private void lblInformacaoSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacaoSistemaMouseEntered
        lblInformacaoSistema.setForeground(new Color(228, 76, 101));
    }//GEN-LAST:event_lblInformacaoSistemaMouseEntered

    private void lblInformacaoSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInformacaoSistemaMouseExited
        lblInformacaoSistema.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblInformacaoSistemaMouseExited

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

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        JOptionPane.showMessageDialog(null, "Fechando o aplicativo!");  
        novoTotem.alterarStatus("I", this.fkEmpresa, totem.getSerialToten());
        System.exit(0);
    }//GEN-LAST:event_btnFecharMouseClicked

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
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JPanel fundo01;
    private javax.swing.JPanel fundo02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblCpuTemp;
    private javax.swing.JLabel lblCpuTemp1;
    private javax.swing.JLabel lblCpuTemp2;
    private javax.swing.JLabel lblCpuTemp3;
    private javax.swing.JLabel lblCpuTempTexto;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblInformacaoSistema;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMemoriaTotal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotensTech1;
    private javax.swing.JLabel lblValorCpu;
    private javax.swing.JLabel lblValorDisco;
    private javax.swing.JLabel lblValorMemoria;
    private javax.swing.JLabel lvlValorDiscoTotal;
    // End of variables declaration//GEN-END:variables

}
