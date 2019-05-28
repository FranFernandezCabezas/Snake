/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu53727611w
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainFrame() {
        initComponents();
        board.setGameOverDialog(gameOverDialog);
        gameOverDialog.setVisible(false);
        board.setScoreLabel(scoreLabel1);
        board.setScoreLabel2(scoreLabel2);
        board.setWinnerLabel(winnerPlayerLabel);
        board.setNextLevelLabel(nextLevelLabel);
        board.setLevelLabels(easyLabel, mediumLabel, HardLabel);
        board.setVisible(false);
        setLocationRelativeTo(null);
        gameOverDialog.setLocationRelativeTo(null);
        initialWindow.setLocationRelativeTo(null);
        initialWindow.setVisible(true);
        nextLevelLabel.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        gameOverDialog = new javax.swing.JDialog();
        gameOverLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        winnerPlayerLabel = new javax.swing.JLabel();
        initialWindow = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        player1Button = new javax.swing.JButton();
        player2Button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        score1Label = new javax.swing.JLabel();
        scoreLabel1 = new javax.swing.JLabel();
        player1Label = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        score2Label = new javax.swing.JLabel();
        scoreLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        easyLabel = new javax.swing.JLabel();
        mediumLabel = new javax.swing.JLabel();
        HardLabel = new javax.swing.JLabel();
        board = new Board();
        nextLevelLabel = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        gameOverDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        gameOverDialog.setTitle("Game Over");
        gameOverDialog.setResizable(false);
        gameOverDialog.setSize(new java.awt.Dimension(439, 242));

        gameOverLabel.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setText("Game over");
        gameOverLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Play again?");

        yesButton.setBackground(new java.awt.Color(51, 255, 51));
        yesButton.setForeground(new java.awt.Color(0, 0, 0));
        yesButton.setText("Yes!");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setBackground(new java.awt.Color(255, 51, 51));
        noButton.setForeground(new java.awt.Color(255, 255, 255));
        noButton.setText("No...");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        winnerPlayerLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        winnerPlayerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winnerPlayerLabel.setText("player2 wins");

        javax.swing.GroupLayout gameOverDialogLayout = new javax.swing.GroupLayout(gameOverDialog.getContentPane());
        gameOverDialog.getContentPane().setLayout(gameOverDialogLayout);
        gameOverDialogLayout.setHorizontalGroup(
            gameOverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(yesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(noButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gameOverDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameOverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(winnerPlayerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gameOverDialogLayout.setVerticalGroup(
            gameOverDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameOverDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameOverLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(winnerPlayerLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(yesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noButton)
                .addGap(18, 18, 18))
        );

        initialWindow.setModal(true);
        initialWindow.setResizable(false);
        initialWindow.setSize(new java.awt.Dimension(587, 200));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SNAKE");

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel5.setText("Classic");

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel6.setText("Versus");

        player1Button.setText("1 player");
        player1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ButtonActionPerformed(evt);
            }
        });

        player2Button.setText("2 players");
        player2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout initialWindowLayout = new javax.swing.GroupLayout(initialWindow.getContentPane());
        initialWindow.getContentPane().setLayout(initialWindowLayout);
        initialWindowLayout.setHorizontalGroup(
            initialWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(initialWindowLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(71, 71, 71))
            .addGroup(initialWindowLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(player1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(player2Button)
                .addGap(46, 46, 46))
        );
        initialWindowLayout.setVerticalGroup(
            initialWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initialWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(initialWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(initialWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1Button)
                    .addComponent(player2Button))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(638, 480));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        score1Label.setForeground(new java.awt.Color(255, 255, 255));
        score1Label.setText("Score:");

        scoreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel1.setText("0000 pts");

        player1Label.setBackground(new java.awt.Color(51, 255, 0));
        player1Label.setForeground(new java.awt.Color(51, 255, 0));
        player1Label.setText("Player 1");

        player2Label.setForeground(new java.awt.Color(204, 0, 102));
        player2Label.setText("Player 2");

        score2Label.setForeground(new java.awt.Color(255, 255, 255));
        score2Label.setText("Score:");

        scoreLabel2.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel2.setText("0000 pts");

        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dificulty Level");

        easyLabel.setBackground(new java.awt.Color(102, 102, 102));
        easyLabel.setForeground(new java.awt.Color(204, 255, 204));
        easyLabel.setText("Easy level");

        mediumLabel.setForeground(new java.awt.Color(204, 204, 255));
        mediumLabel.setText("Medium Level");

        HardLabel.setForeground(new java.awt.Color(255, 51, 51));
        HardLabel.setText("Hard Level");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(score1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(scoreLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(scoreLabel2)))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(player2Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(score2Label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1Label, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(easyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(HardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mediumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(player1Label)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score1Label)
                    .addComponent(scoreLabel1))
                .addGap(47, 47, 47)
                .addComponent(player2Label)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score2Label)
                    .addComponent(scoreLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(easyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        board.setBackground(new java.awt.Color(51, 51, 51));
        board.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextLevelLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nextLevelLabel.setForeground(new java.awt.Color(255, 255, 255));
        nextLevelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextLevelLabel.setText("Next Level");
        board.add(nextLevelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 410, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        board.initGame();
        gameOverDialog.setVisible(false);
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_noButtonActionPerformed

    private void player1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ButtonActionPerformed
        board.setVersus(false);
        board.setVisible(true);
        board.initGame();
        player2Label.setVisible(false);
        score2Label.setVisible(false);
        scoreLabel2.setVisible(false);
        initialWindow.setVisible(false);
    }//GEN-LAST:event_player1ButtonActionPerformed

    private void player2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ButtonActionPerformed
        board.setVersus(true);
        board.setVisible(true);
        board.initGame();
        initialWindow.setVisible(false);
    }//GEN-LAST:event_player2ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HardLabel;
    private Board board;
    private javax.swing.JLabel easyLabel;
    private javax.swing.JDialog gameOverDialog;
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JDialog initialWindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mediumLabel;
    private javax.swing.JLabel nextLevelLabel;
    private javax.swing.JButton noButton;
    private javax.swing.JButton player1Button;
    private javax.swing.JLabel player1Label;
    private javax.swing.JButton player2Button;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel score1Label;
    private javax.swing.JLabel score2Label;
    private javax.swing.JLabel scoreLabel1;
    private javax.swing.JLabel scoreLabel2;
    private javax.swing.JLabel winnerPlayerLabel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
