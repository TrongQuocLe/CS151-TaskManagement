package jswing.form;

import jswing.component.Card;

import jswing.GoogleMaterialDesignIcons;
import jswing.model.ModelCard;
import jswing.GoogleMaterialDesignIcons;
import jswing.IconFontSwing;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.Icon;

public class HomeForm extends javax.swing.JPanel {

    public HomeForm() {
        initComponents();
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
    }

    private void initCardData() {
        Icon dashboard = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.DASHBOARD, 60, new Color(200, 162,
                200),
                new Color(162, 200, 162));
        Icon edit = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.EDIT, 60, new Color(200, 162,
                200),
                new Color(162, 200, 162));
        Icon android = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ANDROID, 60, new Color(200, 162,
                200),
                new Color(162, 200, 162));
        card1.setData(new ModelCard("Weekly", "Completed Tasks", 0, 0, edit));
        card2.setData(new ModelCard("Labs", "Dashboard Project", 0, 0, dashboard));
        card3.setData(new ModelCard("Homework", "This Week", 0, 0, android));
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        card1 = new Card();
        card2 = new Card();
        card3 = new Card();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("HOME/DASHBOARD");

        card1.setBackground(new java.awt.Color(204, 255, 204));
        card1.setColorGradient(new java.awt.Color(0, 204, 204));

        card2.setBackground(new java.awt.Color(204, 255, 255));
        card2.setColorGradient(new java.awt.Color(0, 204, 204));

        card3.setBackground(new java.awt.Color(102, 255, 255));
        card3.setColorGradient(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(531, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Card card1;
    private Card card2;
    private Card card3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
