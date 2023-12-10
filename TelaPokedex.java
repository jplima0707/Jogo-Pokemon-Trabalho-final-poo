/**
 *
 * @author João Pedro
 */
public class TelaPokedex extends javax.swing.JFrame implements Limpavel {
        private static Menu menu;

        public TelaPokedex(Menu menu) {
                TelaPokedex.menu = menu;
                initComponents();
        }

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                ComboNomeTreinadores = new javax.swing.JComboBox<>();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtAreaPokedex = new javax.swing.JTextArea();
                jLabel2 = new javax.swing.JLabel();
                txtPokeMaisForte = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                txtAreaListaShiny = new javax.swing.JTextArea();
                btmMenu = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                txtPesquisa = new javax.swing.JTextField();
                btmPesquisar = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("ESCOLHA O TREINADOR:");

                ComboNomeTreinadores.setModel(
                                new javax.swing.DefaultComboBoxModel<>(menu.getGerenciador().getNomesTreinadores()));
                ComboNomeTreinadores.addActionListener(e -> {
                        String selectedItem = (String) ComboNomeTreinadores.getSelectedItem();

                        if (selectedItem != null) {
                                LimparCampos();
                                Treinador t = menu.getGerenciador().achaTreinador(selectedItem);

                                if (t != null) {
                                        txtAreaPokedex.setText(t.listaPokemons());
                                        txtPokeMaisForte.setText(t.pokeMaisForte());
                                        txtAreaListaShiny.setText(t.verShinys());
                                        txtAreaPokedex.setEditable(false);
                                        txtPokeMaisForte.setEditable(false);
                                        txtAreaListaShiny.setEditable(false);

                                        txtPokeMaisForte.setCaretPosition(0);
                                } else {
                                        LimparCampos();
                                }
                        }
                });

                txtAreaPokedex.setColumns(20);
                txtAreaPokedex.setRows(5);
                jScrollPane1.setViewportView(txtAreaPokedex);

                jLabel2.setText("POKEMON MAIS FORTE:");

                jLabel3.setText("LISTA DE SHINYS:");

                txtAreaListaShiny.setColumns(20);
                txtAreaListaShiny.setRows(5);
                jScrollPane2.setViewportView(txtAreaListaShiny);

                btmMenu.setText("VOLTAR");
                btmMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmMenuActionPerformed(evt);
                        }
                });

                jLabel4.setText("PESQUISAR POKEMON:");

                btmPesquisar.setText("Pesquisar");
                btmPesquisar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmPesquisarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(15, 15, 15)
                                                                                                .addComponent(btmMenu))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(40, 40, 40)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                415,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel1)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(ComboNomeTreinadores,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                168,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                136,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtPokeMaisForte)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jScrollPane2)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(txtPesquisa,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                290,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(btmPesquisar,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)))))
                                                                .addContainerGap(45, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(ComboNomeTreinadores,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtPesquisa,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btmPesquisar))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                174,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtPokeMaisForte,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                103,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                27, Short.MAX_VALUE)
                                                                .addComponent(btmMenu)
                                                                .addGap(14, 14, 14)));

                pack();
        }

        private void btmMenuActionPerformed(java.awt.event.ActionEvent evt) {
                this.dispose();
                menu.setVisible(true);
        }

        private void btmPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
                LimparCampos();
                String selectedItem = (String) ComboNomeTreinadores.getSelectedItem();
                Treinador t = menu.getGerenciador().achaTreinador(selectedItem);
                txtAreaPokedex.setText(menu.getGerenciador().pesquisaPoke(txtPesquisa.getText().toLowerCase(), t));
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
                        java.util.logging.Logger.getLogger(TelaPokedex.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TelaPokedex.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TelaPokedex.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TelaPokedex.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new TelaPokedex(menu).setVisible(true);
                        }
                });
        }

        private javax.swing.JComboBox<String> ComboNomeTreinadores;
        private javax.swing.JButton btmMenu;
        private javax.swing.JButton btmPesquisar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTextArea txtAreaListaShiny;
        private javax.swing.JTextArea txtAreaPokedex;
        private javax.swing.JTextField txtPesquisa;
        private javax.swing.JTextField txtPokeMaisForte;

        @Override
        public void LimparCampos() {
                txtAreaListaShiny.setText("");
                txtAreaPokedex.setText("");
                txtPokeMaisForte.setText("");
        }
}