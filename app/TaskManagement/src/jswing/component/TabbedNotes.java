package jswing.component;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import jswing.ButtonEffect;
import jswing.TabbedPane;
import jswing.component.PanelNotesComponent;

public class TabbedNotes extends javax.swing.JPanel {

    public TabbedNotes() {
        initComponents();
        tabbedPane1.fixTabbedPane(jScrollPane);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonEffect1 = new ButtonEffect();
        buttonEffect2 = new ButtonEffect();
        buttonEffect3 = new ButtonEffect();
        tabbedPane1 = new TabbedPane();
        panelNotesComponent1 = new PanelNotesComponent();
        jScrollPane = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quick Notes");

        buttonEffect1.setBackground(new java.awt.Color(0, 153, 255));
        buttonEffect1.setForeground(new java.awt.Color(255, 255, 255));
        buttonEffect1.setText("Add Tab: Notes");
        buttonEffect1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        buttonEffect1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonEffect1MouseReleased(evt);
            }
        });

        buttonEffect2.setBackground(new java.awt.Color(0, 153, 255));
        buttonEffect2.setForeground(new java.awt.Color(255, 255, 255));
        buttonEffect2.setText("Add Tab: Panel Notes");
        buttonEffect2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        buttonEffect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEffect2ActionPerformed(evt);
            }
        });

        buttonEffect3.setBackground(new java.awt.Color(255, 51, 51));
        buttonEffect3.setForeground(new java.awt.Color(255, 255, 255));
        buttonEffect3.setText("Remove Tab");
        buttonEffect3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        buttonEffect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEffect3ActionPerformed(evt);
            }
        });

        tabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        tabbedPane1.addTab("tab2", panelNotesComponent1);

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setViewportView(jTextPane1);

        tabbedPane1.addTab("tab1", jScrollPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801,
                                                Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(buttonEffect1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonEffect2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 142,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(buttonEffect3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 142,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(25, 25, 25)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonEffect2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonEffect3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                                .addGap(25, 25, 25)));
    }// </editor-fold>

    private void buttonEffect1MouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        addTextPane(tabbedPane1);
    }

    private void buttonEffect2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        addTable(tabbedPane1);
    }

    private void buttonEffect3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int index = tabbedPane1.getSelectedIndex();
        tabbedPane1.remove(index);
    }

    // Method for adding a Text Panel to the tab pane
    private void addTextPane(JTabbedPane tabbedPane) {
        JTextPane newPane = new JTextPane();
        JScrollPane newScrollPane = new JScrollPane();
        newScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        newScrollPane.setViewportView(newPane);
        String tabCount = "tab" + String.valueOf(tabbedPane.getTabCount() + 1);
        tabbedPane.addTab(tabCount, newScrollPane);
    }

    private void addTable(JTabbedPane tabbedPane) {
        String tabCount = "tab" + String.valueOf(tabbedPane.getTabCount() + 1);
        tabbedPane.addTab(tabCount, new PanelNotesComponent());
    }

    // Variables declaration - do not modify
    private ButtonEffect buttonEffect1;
    private ButtonEffect buttonEffect2;
    private ButtonEffect buttonEffect3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextPane jTextPane1;
    private PanelNotesComponent panelNotesComponent1;
    private TabbedPane tabbedPane1;
    // End of variables declaration
}
