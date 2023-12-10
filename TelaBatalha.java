import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author JoÃ£o Pedro
 */
public class TelaBatalha extends javax.swing.JFrame implements Limpavel {
        private static Menu menu;

        public TelaBatalha(Menu menu) {
                TelaBatalha.menu = menu;
                initComponents();
        }

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                comboTre1 = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                comboTre2 = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtAreaLegenda = new javax.swing.JTextArea();
                btmMenu = new javax.swing.JButton();
                btmFight = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Treinador 1");

                comboTre1.setModel(
                                new javax.swing.DefaultComboBoxModel<>(menu.getGerenciador().getNomesTreinadores()));

                comboTre1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                comboTre1ActionPerformed(evt);
                                String treinadorSelecionado = (String) comboTre1.getSelectedItem();
                                Treinador treinadorEncontrado = menu.getGerenciador()
                                                .achaTreinador(treinadorSelecionado);

                                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(
                                                menu.getGerenciador().getNomesAdversarios(treinadorEncontrado));
                                comboTre2.setModel(model);
                        }
                });

                jLabel2.setText("Treinador 2");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jLabel3.setText("VS");

                txtAreaLegenda.setColumns(20);
                txtAreaLegenda.setRows(5);
                jScrollPane1.setViewportView(txtAreaLegenda);

                btmMenu.setText("VOLTAR");
                btmMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmMenuActionPerformed(evt);
                        }
                });

                btmFight.setText("SIMULAR BATALHA!");
                btmFight.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                                Batalha batalha = new Batalha();
                                String nome1 = (String) comboTre1.getSelectedItem();
                                Treinador treinador1 = menu.getGerenciador().achaTreinador(nome1);
                                String nome2 = (String) comboTre2.getSelectedItem();
                                Treinador treinador2 = menu.getGerenciador().achaTreinador(nome2);
                                if (treinador1 == null || treinador2 == null) {
                                        StringBuilder mensagem = new StringBuilder();
                                        mensagem.append("Selecione os 2 treinadores.");
                                        JOptionPane.showMessageDialog(null, mensagem);
                                } else {

                                        txtAreaLegenda.setText(batalha.batalhar(treinador1, treinador2,
                                                        menu.getGerenciador()));
                                        DefaultCaret caret = (DefaultCaret) txtAreaLegenda.getCaret();
                                        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                                        caret.setDot(0);
                                        txtAreaLegenda.setEditable(false);
                                }
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(81, 81, 81)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(14, 14, 14)
                                                                                                .addComponent(jLabel1))
                                                                                .addComponent(comboTre1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                91,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                72,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(53, 53, 53)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addGap(19, 19, 19))
                                                                                .addComponent(comboTre2,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                94,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(107, 107, 107))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jScrollPane1)
                                                                                .addContainerGap())
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(26, 26, 26)
                                                                                                .addComponent(btmMenu))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(180, 180, 180)
                                                                                                .addComponent(btmFight)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(33, 33, 33)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel1)
                                                                                                                .addComponent(jLabel2))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(comboTre1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(comboTre2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(43, 43, 43)
                                                                                                .addComponent(jLabel3)))
                                                                .addGap(26, 26, 26)
                                                                .addComponent(btmFight)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                191,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btmMenu)
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                pack();
        }

        private void comboTre1ActionPerformed(java.awt.event.ActionEvent evt) {
        }

        private void btmMenuActionPerformed(java.awt.event.ActionEvent evt) {
                this.dispose();
                menu.setVisible(true);
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
                        java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new TelaBatalha(menu).setVisible(true);
                        }
                });
        }

        private javax.swing.JButton btmFight;
        private javax.swing.JButton btmMenu;
        private javax.swing.JComboBox<String> comboTre1;
        private javax.swing.JComboBox<String> comboTre2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea txtAreaLegenda;

        public void LimparCampos() {
                txtAreaLegenda.setText("");
                throw new UnsupportedOperationException("Unimplemented method 'LimparCampos'");
        }
}