import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;

public class TelaEstatisticas extends javax.swing.JFrame {
        private static Menu menu;

        public TelaEstatisticas(Menu menu) {
                TelaEstatisticas.menu = menu;
                initComponents();
        }

        private void initComponents() {

                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                txtNumPokes = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea1 = new javax.swing.JTextArea();
                txtNumTrei = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane3 = new javax.swing.JScrollPane();
                tableRank = new javax.swing.JTable();
                btmVoltar = new javax.swing.JButton();
                jLabel6 = new javax.swing.JLabel();
                txtMedia = new javax.swing.JTextField();

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                jScrollPane2.setViewportView(jTable1);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("NUMERO DE POKEMONS TOTAIS:");
                txtNumPokes.setText(Integer.toString(menu.getGerenciador().getCountPoke()));
                txtNumPokes.setEditable(false);

                jTextArea1.setText(menu.getGerenciador().imprimeListaPoke());
                DefaultCaret caret = (DefaultCaret) jTextArea1.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                caret.setDot(0);

                jLabel2.setText("NUMERO DE TREINADORES TOTAIS:");
                txtNumTrei.setText(Integer.toString(menu.getGerenciador().getCountTreinador()));
                txtNumTrei.setEditable(false);

                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane1.setViewportView(jTextArea1);
                jLabel3.setText("RANKING TREINADORES:");

                tableRank.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null },
                                                { null, null },
                                                { null, null },
                                                { null, null }
                                },
                                new String[] {
                                                "Nome", "Vitórias"
                                }) {
                        boolean[] canEdit = new boolean[] {
                                        false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                DefaultTableModel model = (DefaultTableModel) tableRank.getModel();
                model.setRowCount(0);
                List<Treinador> ranking = menu.getGerenciador().mostrarRankingVitorias();

                for (int i = 0; i < ranking.size(); i++) {
                        Treinador treinador = ranking.get(i);
                        model.addRow(new Object[] { treinador.getNome(), treinador.getVitorias() });
                }

                jScrollPane3.setViewportView(tableRank);
                if (tableRank.getColumnModel().getColumnCount() > 0) {
                        tableRank.getColumnModel().getColumn(0).setResizable(false);
                }

                btmVoltar.setText("VOLTAR");
                btmVoltar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btmVoltarActionPerformed(evt);
                        }
                });

                jLabel6.setText("MÉDIA DE ATAQUE:");
                txtMedia.setText(menu.getGerenciador().getMediaAtaque());
                txtMedia.setEditable(false);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addContainerGap(
                                                                                                                                19,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(btmVoltar)
                                                                                                                .addGap(309, 309,
                                                                                                                                309))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jScrollPane1)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel2)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(txtNumTrei))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel1)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(txtNumPokes))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jScrollPane3,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                387,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))))
                                                                .addContainerGap())
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(txtMedia,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                387,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(txtNumPokes,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                121,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(txtNumTrei,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                91,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtMedia,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                18,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btmVoltar)
                                                                .addGap(17, 17, 17)));

                pack();
        }

        private void btmVoltarActionPerformed(java.awt.event.ActionEvent evt) {
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
                        java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new TelaEstatisticas(menu).setVisible(true);
                        }
                });
        }

        private javax.swing.JButton btmVoltar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextArea jTextArea1;
        private javax.swing.JTable tableRank;
        private javax.swing.JTextField txtMedia;
        private javax.swing.JTextField txtNumPokes;
        private javax.swing.JTextField txtNumTrei;

}
