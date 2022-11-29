/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jswing.component;

import jswing.event.EventMenuSelected;
import jswing.event.EventLogin;
import jswing.Login.LoginAndRegister;
import jswing.ButtonBadges;
import jswing.HamburgerButton;
import jswing.component.AccountMenu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Header extends javax.swing.JPanel {
    private EventLogin eventLogin;
    private LoginAndRegister loginRegister;

    public Header() {
        initComponents();
        init();
    }

    public void addMenuEvent(ActionListener event) {
        cmdMenu.addActionListener(event);
    }

    public void setEventLogin(EventLogin event) {
        accountMenu2.setEventLogin(event);
    }

    public void init() {
        accountMenu2.setEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
                if (menuIndex == 2) {
                    if (subMenuIndex == -1) {
                        accountMenu2.setEventLogout();
                    }
                }
            }
        });
        accountMenu2.initMenuItem();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        accountMenu1 = new AccountMenu();
        buttonBadges1 = new ButtonBadges();
        buttonBadges2 = new ButtonBadges();
        cmdMenu = new HamburgerButton();
        accountMenu2 = new AccountMenu();

        setBackground(new java.awt.Color(53, 69, 80));
        setOpaque(false);

        buttonBadges1.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\Admin\\OneDrive\\SJSU M.S. Data Science Road Map\\SJSU\\CS 151 - Object Oriented Design\\CS151-TaskManagement\\app\\TaskManagement\\src\\icons\\icons8-messages-20.png")); // NOI18N

        buttonBadges2.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\Admin\\OneDrive\\SJSU M.S. Data Science Road Map\\SJSU\\CS 151 - Object Oriented Design\\CS151-TaskManagement\\app\\TaskManagement\\src\\icons\\icons8-notification-20.png")); // NOI18N
        buttonBadges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges2ActionPerformed(evt);
            }
        });

        cmdMenu.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\Admin\\OneDrive\\SJSU M.S. Data Science Road Map\\SJSU\\CS 151 - Object Oriented Design\\CS151-TaskManagement\\app\\TaskManagement\\src\\icons\\icons8-menu-30.png")); // NOI18N
        cmdMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400,
                                        Short.MAX_VALUE)
                                .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountMenu2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(accountMenu2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 182, Short.MAX_VALUE)));
    }// </editor-fold>

    private void buttonBadges2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cmdMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(40, 40, 40));
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify
    private AccountMenu accountMenu1;
    private AccountMenu accountMenu2;
    private ButtonBadges buttonBadges1;
    private ButtonBadges buttonBadges2;
    private HamburgerButton cmdMenu;
    // End of variables declaration
}
