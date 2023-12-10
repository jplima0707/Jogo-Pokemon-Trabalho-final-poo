import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro
 */
public class TelaTreinador extends javax.swing.JFrame implements Limpavel {
    private static Menu menu;

    public TelaTreinador(Menu menu) {
        TelaTreinador.menu = menu;
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeTre = new javax.swing.JTextField();
        VoltarMenu = new javax.swing.JButton();
        AdicionaTreinador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        VoltarMenu.setText("VOLTAR");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });

        AdicionaTreinador.setText("Adicionar!");
        AdicionaTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    String nomeTreinador = txtNomeTre.getText();

                    if (nomeTreinador.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "TREINADOR NECESSITA DE UM NOME.");
                    } else if (!nomeTreinador.matches("^[a-zA-Z]+$")) {
                        JOptionPane.showMessageDialog(null, "NOME NÃO PODE CONTER NÚMEROS OU CARACTERES ESPECIAIS");
                        LimparCampos();
                    } else if (menu.getGerenciador().treinadorExistente(nomeTreinador) == true) {
                        JOptionPane.showMessageDialog(null, "UM TREINADOR COM ESSE NOME JÁ EXISTE.");
                        LimparCampos();
                    } else {
                        Treinador t = new Treinador(null);
                        t.setNome(nomeTreinador);
                        menu.getGerenciador().adicionaTreinadorNoGerenciador(t);
                        LimparCampos();
                        AdicionaTreinadorActionPerformed(evt);
                        JOptionPane.showMessageDialog(null, "TREINADOR ADICIONADO.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNomeTre, javax.swing.GroupLayout.PREFERRED_SIZE, 234,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(VoltarMenu))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(157, 157, 157)
                                                .addComponent(AdicionaTreinador)))
                                .addContainerGap(66, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtNomeTre, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AdicionaTreinador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158,
                                        Short.MAX_VALUE)
                                .addComponent(VoltarMenu)
                                .addGap(22, 22, 22)));

        pack();
    }

    private void AdicionaTreinadorActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTreinador(menu).setVisible(true);
            }
        });

    }

    private javax.swing.JButton AdicionaTreinador;
    private javax.swing.JButton VoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNomeTre;

    @Override
    public void LimparCampos() {
        txtNomeTre.setText("");
    }
}
