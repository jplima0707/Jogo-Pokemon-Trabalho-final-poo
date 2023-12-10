import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro
 */
public class TelaPokemon extends javax.swing.JFrame implements Limpavel {
        private static Menu menu;

        public TelaPokemon(Menu menu) {
                TelaPokemon.menu = menu;
                initComponents();
        }

        private void initComponents() {

                jButton3 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                txtNomePoke = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                comboTipos = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                txtVelocidade = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                txtHP = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                radioShiny = new javax.swing.JRadioButton();
                jLabel6 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox<>();
                btmMenu = new javax.swing.JButton();
                btmComum = new javax.swing.JButton();
                btmLendario = new javax.swing.JButton();
                btmMitico = new javax.swing.JButton();
                txtAtaque = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();

                jButton3.setText("CRIAR LENDÁRIO");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("NOME:");

                jLabel2.setText("TIPO:");

                comboTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUA", "FOGO", "INSETO",
                                "PLANTA", "FADA", "NORMAL", "DRAGAO", "FANTASMA", "TERRA", "METAL", "VOADOR",
                                "ELETRICO", "PEDRA", "SOMBRIO", "LUTADOR", "PSIQUICO" }));
                comboTipos.setToolTipText("");
                comboTipos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                comboTiposActionPerformed(evt);
                        }
                });

                jLabel3.setText("VELOCIDADE:");

                jLabel4.setText("HP:");

                jLabel5.setText("SHINY:");

                radioShiny.setText("SIM");

                jLabel6.setText("TREINADOR:");

                jComboBox1.setModel(
                                new javax.swing.DefaultComboBoxModel<>(menu.getGerenciador().getNomesTreinadores()));

                btmMenu.setText("VOLTAR");
                btmMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmMenuActionPerformed(evt);
                        }
                });

                btmComum.setText("CRIAR COMUM");
                btmComum.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmComumActionPerformed(evt);
                        }
                });

                btmLendario.setText("CRIAR LENDÁRIO");
                btmLendario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmLendarioActionPerformed(evt);
                        }
                });

                btmMitico.setText("CRIAR MÍTICO");
                btmMitico.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmMiticoActionPerformed(evt);
                        }
                });

                jLabel7.setText("ATAQUE:");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                81,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel6,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                49,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addComponent(jLabel2))
                                                                                                .addGap(12, 12, 12)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                                .addComponent(txtAtaque)
                                                                                                                .addComponent(txtVelocidade)
                                                                                                                .addComponent(txtHP)
                                                                                                                .addComponent(radioShiny,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                98,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jComboBox1,
                                                                                                                                0,
                                                                                                                                200,
                                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(comboTipos,
                                                                                                                0,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(txtNomePoke,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                200,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                                .addContainerGap(113, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addComponent(btmMenu)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(106, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btmMitico,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                262,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btmLendario,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                262,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btmComum,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                262,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(99, 99, 99)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(47, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtNomePoke,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel1))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(comboTipos,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel2))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtAtaque,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel7))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(txtVelocidade,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(txtHP,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(radioShiny))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jComboBox1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)
                                                                .addComponent(btmLendario,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btmMitico,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btmComum,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(btmMenu)
                                                                .addGap(20, 20, 20)));

                pack();
        }

        private void comboTiposActionPerformed(java.awt.event.ActionEvent evt) {
        }

        private void btmMenuActionPerformed(java.awt.event.ActionEvent evt) {
                this.dispose();
                menu.setVisible(true);
        }

        private void btmLendarioActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        String nome = txtNomePoke.getText();

                        int HP = Integer.parseInt(txtHP.getText());

                        int ataque = Integer.parseInt(txtAtaque.getText());

                        int velocidade = Integer.parseInt(txtVelocidade.getText());

                        if (menu.getGerenciador().verificarCriacao(nome, HP, ataque, velocidade) == false) {
                                LimparCampos();
                                return;
                        }

                        Pokemon p1 = new PokemonLendario(nome, HP, ataque, velocidade, radioShiny.isSelected(), null);

                        String tipoSelecionado = (String) comboTipos.getSelectedItem();
                        Pokemon.TIPOS tipo = Pokemon.TIPOS.valueOf(tipoSelecionado);
                        p1.setTipo(tipo);

                        String treinadorSelecionado = (String) jComboBox1.getSelectedItem();
                        Treinador treinadorEncontrado = menu.getGerenciador().achaTreinador(treinadorSelecionado);

                        if (treinadorEncontrado != null) {
                                if (treinadorEncontrado.adicionarPokemon(p1)) {
                                        menu.getGerenciador().adicionaPokemonNoGerenciador(p1);
                                        JOptionPane.showMessageDialog(null,
                                                        "POKEMON LENDÁRIO " + p1.getNome().toUpperCase()
                                                                        + " ADICIONADO COM SUCESSO!");
                                        LimparCampos();
                                } else {
                                        JOptionPane.showMessageDialog(null, "POKEMON JÁ EXISTENTE");
                                        LimparCampos();
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "POKEMON NÃO ADICIONADO");
                                LimparCampos();
                        }

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
        }

        private void btmMiticoActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        String nome = txtNomePoke.getText();

                        int HP = Integer.parseInt(txtHP.getText());

                        int ataque = Integer.parseInt(txtAtaque.getText());

                        int velocidade = Integer.parseInt(txtVelocidade.getText());

                        if (menu.getGerenciador().verificarCriacao(nome, HP, ataque, velocidade) == false) {
                                LimparCampos();
                                return;
                        }

                        Pokemon p1 = new PokemonMitico(nome, HP, ataque, velocidade, radioShiny.isSelected(), null);

                        String tipoSelecionado = (String) comboTipos.getSelectedItem();
                        Pokemon.TIPOS tipo = Pokemon.TIPOS.valueOf(tipoSelecionado);
                        p1.setTipo(tipo);

                        String treinadorSelecionado = (String) jComboBox1.getSelectedItem();
                        Treinador treinadorEncontrado = menu.getGerenciador().achaTreinador(treinadorSelecionado);

                        if (treinadorEncontrado != null) {
                                if (treinadorEncontrado.adicionarPokemon(p1)) {
                                        ;
                                        menu.getGerenciador().adicionaPokemonNoGerenciador(p1);
                                        JOptionPane.showMessageDialog(null,
                                                        "POKEMON MITICO " + p1.getNome().toUpperCase()
                                                                        + " ADICIONADO COM SUCESSO!");
                                        LimparCampos();
                                } else {
                                        JOptionPane.showMessageDialog(null, "POKEMON JÁ EXISTENTE");
                                        LimparCampos();
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "POKEMON NÃO ADICIONADO");
                                LimparCampos();
                        }

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
        }

        private void btmComumActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        String nome = txtNomePoke.getText();

                        int HP = Integer.parseInt(txtHP.getText());

                        int ataque = Integer.parseInt(txtAtaque.getText());

                        int velocidade = Integer.parseInt(txtVelocidade.getText());

                        if (menu.getGerenciador().verificarCriacao(nome, HP, ataque, velocidade) == false) {
                                LimparCampos();
                                return;
                        }

                        Pokemon p1 = new Pokemon(nome, HP, ataque, velocidade, radioShiny.isSelected(), null);

                        String tipoSelecionado = (String) comboTipos.getSelectedItem();
                        Pokemon.TIPOS tipo = Pokemon.TIPOS.valueOf(tipoSelecionado);
                        p1.setTipo(tipo);

                        String treinadorSelecionado = (String) jComboBox1.getSelectedItem();
                        Treinador treinadorEncontrado = menu.getGerenciador().achaTreinador(treinadorSelecionado);

                        if (treinadorEncontrado != null) {
                                if (treinadorEncontrado.adicionarPokemon(p1)) {
                                        menu.getGerenciador().adicionaPokemonNoGerenciador(p1);
                                        JOptionPane.showMessageDialog(null,
                                                        "POKEMON COMUM " + p1.getNome().toUpperCase()
                                                                        + " ADICIONADO COM SUCESSO!");
                                        LimparCampos();
                                } else {
                                        JOptionPane.showMessageDialog(null, "POKEMON JÁ EXISTENTE");
                                        LimparCampos();
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "POKEMON NÃO ADICIONADO");
                                LimparCampos();
                        }

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
        }

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(TelaPokemon.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TelaPokemon.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TelaPokemon.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TelaPokemon.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new TelaPokemon(menu).setVisible(true);
                        }
                });
        }

        private javax.swing.JButton btmComum;
        private javax.swing.JButton btmLendario;
        private javax.swing.JButton btmMenu;
        private javax.swing.JButton btmMitico;
        private javax.swing.JComboBox<String> comboTipos;
        private javax.swing.JButton jButton3;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JRadioButton radioShiny;
        private javax.swing.JTextField txtAtaque;
        private javax.swing.JTextField txtHP;
        private javax.swing.JTextField txtNomePoke;
        private javax.swing.JTextField txtVelocidade;

        @Override
        public void LimparCampos() {
                txtAtaque.setText("");
                txtHP.setText("");
                txtNomePoke.setText("");
                txtVelocidade.setText("");
        }
}
