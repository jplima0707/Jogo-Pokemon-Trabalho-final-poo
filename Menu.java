/**
 *
 * @author JoÃ£o Pedro
 */
public class Menu extends javax.swing.JFrame {
    private Gerenciador gerenciador;

    public Menu() {
        this.setResizable(false);
        this.gerenciador = new Gerenciador();
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        BtmTreinador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btmAddPoke = new javax.swing.JButton();
        btmPokedex = new javax.swing.JButton();
        btmCriaBatalha = new javax.swing.JButton();
        btmStats = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtmTreinador.setText("ADICIONAR TREINADOR");
        BtmTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmTreinadorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("POOKEMON");

        btmAddPoke.setText("CRIAR POKEMON");
        btmAddPoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAddPokeActionPerformed(evt);
            }
        });

        btmPokedex.setText("POKEDEX");
        btmPokedex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmPokedexActionPerformed(evt);
            }
        });

        btmCriaBatalha.setText("BATALHAR!");
        btmCriaBatalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCriaBatalhaActionPerformed(evt);
            }
        });

        btmStats.setText("ESTATÍSTICAS");
        btmStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmStatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(110, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(150, 150, 150))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btmAddPoke,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 238,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(BtmTreinador,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 238,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btmPokedex,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 238,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btmCriaBatalha,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 238,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btmStats, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(108, 108, 108)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)
                                .addComponent(BtmTreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btmAddPoke, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btmPokedex, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btmCriaBatalha, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btmStats, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(103, Short.MAX_VALUE)));

        pack();
    }

    private void BtmTreinadorActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciador.abrirTela(this, new TelaTreinador(this));
    }

    private void btmCriaBatalhaActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciador.abrirTela(this, new TelaBatalha(this));
    }

    private void btmAddPokeActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciador.abrirTela(this, new TelaPokemon(this));
    }

    private void btmPokedexActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciador.abrirTela(this, new TelaPokedex(this));
    }

    private void btmStatsActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciador.abrirTela(this, new TelaEstatisticas(this));
    }

    public Gerenciador getGerenciador() {
        return gerenciador;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }

        });
    }

    private javax.swing.JButton BtmTreinador;
    private javax.swing.JButton btmAddPoke;
    private javax.swing.JButton btmCriaBatalha;
    private javax.swing.JButton btmPokedex;
    private javax.swing.JButton btmStats;
    private javax.swing.JLabel jLabel1;

}