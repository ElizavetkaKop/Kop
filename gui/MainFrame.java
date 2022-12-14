package gui;

import java.awt.event.*;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    void addRegButtonListener(ActionListener RegButtonListener){RegButton.addActionListener(RegButtonListener);}
    void addAvtButtonListener(ActionListener AvtButtonListener){avtButton.addActionListener(AvtButtonListener);}
    void addFindButtonListener(ActionListener FindButtonListener){findButton.addActionListener(FindButtonListener);}
    void addExitButtonListener(ActionListener ExitButtonListener){exitButton.addActionListener(ExitButtonListener);}
    void setUserLabel(String s){userLabel.setText(s);};
    void disableExitButton(){exitButton.setVisible(false);};
    void disableRegButton(){RegButton.setVisible(false);};
    void disableAvtButton(){avtButton.setVisible(false);};
    void disableTrashButton(){trashButton.setVisible(false);};
    void enableExitButton(){exitButton.setVisible(true);};
    void enableAvtButton(){avtButton.setVisible(true);};
    void enableRegButton(){RegButton.setVisible(true);};
    void enableTrashButton(){trashButton.setVisible(true);};
//    String getFindText(){return(findText.getText());};


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegButton = new javax.swing.JButton();
        avtButton = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        trashButton = new javax.swing.JButton();
        surprise = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        RegButton.setBackground(new java.awt.Color(51, 153, 255));
        RegButton.setForeground(new java.awt.Color(255, 255, 255));
        RegButton.setText("??????????????????????");

        avtButton.setBackground(new java.awt.Color(51, 153, 255));
        avtButton.setForeground(new java.awt.Color(255, 255, 255));
        avtButton.setText("??????????????????????");
        avtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avtButtonActionPerformed(evt);
            }
        });

        findButton.setBackground(new java.awt.Color(51, 153, 255));
        findButton.setForeground(new java.awt.Color(255, 255, 255));
        findButton.setText("??????????");

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/211991.jpg"))); // NOI18N


        exitButton.setBackground(new java.awt.Color(51, 153, 255));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("??????????");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(surprise)
                                                .addGap(57, 57, 57))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(RegButton)
                                                                .addGap(38, 38, 38)
                                                                .addComponent(avtButton)
                                                                .addGap(47, 47, 47)
                                                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(45, 45, 45)
                                                                .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(42, 42, 42)
                                                                .addComponent(trashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(74, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(avtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exitButton)
                                        .addComponent(findButton)
                                        .addComponent(trashButton))
                                .addGap(39, 39, 39)
                                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(surprise)
                                .addGap(0, 120, Short.MAX_VALUE))
        );

        jMenu1.setText("??????????????");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setText("?????????? ???? ??????????????");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton RegButton;
    private JButton avtButton;
    private JButton exitButton;
    private JButton findButton;
    private JLabel imgLabel;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JPanel jPanel1;
    private JLabel surprise;
    private JButton trashButton;
    private JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
