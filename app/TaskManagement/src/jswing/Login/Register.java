
package jswing.Login;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import serverside.*;
import jswing.*;
import serverside.Exceptions.*;

/**
 *
 * @author Kyle Lo
 */
public class Register extends PanelCustom {

        public Register() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                textField1 = new TextField();
                textField2 = new TextField();
                textField3 = new TextField();
                textField4 = new TextField();
                password1 = new Password();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                button1 = new Button();
                jTextField1 = new javax.swing.JTextField();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                password2 = new Password();
                jLabel5 = new javax.swing.JLabel();
                jCheckBox1 = new javax.swing.JCheckBox();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                textFieldsList = new ArrayList<JTextField>();

                setBackground(new java.awt.Color(102, 102, 102));
                setPreferredSize(new java.awt.Dimension(600, 800));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24));
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Don't have an account?");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36));
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Create Account");

                textField1.setForeground(new java.awt.Color(255, 255, 255));
                textField1.setText("First Name");
                textField2.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                textField1KeyReleased(evt);
                        }
                });

                textField2.setForeground(new java.awt.Color(255, 255, 255));
                textField2.setText("Last Name");
                textField2.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                textField2KeyReleased(evt);
                        }
                });

                textField3.setForeground(new java.awt.Color(255, 255, 255));
                textField3.setText("Username");
                textField3.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                textField3KeyReleased(evt);
                        }
                });

                textField4.setForeground(new java.awt.Color(255, 255, 255));
                textField4.setText("Email");
                textField4.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                textField4KeyReleased(evt);
                        }
                });

                password1.setForeground(new java.awt.Color(255, 255, 255));
                password1.setToolTipText(
                                "Password must contain at least 1 capital letter, 1 special character !$^*(+:,>|, 1 numerical number, and no whitespaces. Minimum length 8");
                password1.setEchoChar('\u25cf');
                password1.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                password1KeyReleased(evt);
                        }
                });

                setButtonFalse();
                button1.setText("Register");
                button1.setFont(new java.awt.Font("Segoe UI", 0, 18));
                button1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button1ActionPerformed(evt);
                        }
                });

                jTextField1.setBackground(new java.awt.Color(102, 102, 102));
                jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jTextField1.setForeground(new java.awt.Color(255, 255, 255));
                jTextField1.setText("Or register with");
                jTextField1.setBorder(null);

                jButton1.setBackground(new java.awt.Color(102, 102, 102));

                jButton1.setContentAreaFilled(false);
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                jButton2.setContentAreaFilled(false);
                jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                jButton3.setContentAreaFilled(false);
                jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                password2.setForeground(new java.awt.Color(255, 255, 255));
                password2.setToolTipText("Confirm your password");
                password2.setEchoChar('\u25cf');
                password2.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                password2KeyReleased(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Confirm Password");

                jCheckBox1.setToolTipText("Show Password");

                jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                jCheckBox1MouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                jCheckBox1MouseExited(evt);
                        }
                });
                jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox1ActionPerformed(evt);
                        }
                });
                // try catch for setting icons
                try {
                        jCheckBox1.setIcon(new javax.swing.ImageIcon(
                                        getClass().getResource("/icons/anz6u-19e8e-001.png")));
                        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(
                                        getClass().getResource("/icons/a5e4g-5jzpu-001.png")));
                        jButton3.setIcon(new javax.swing.ImageIcon(
                                        getClass().getResource("/icons/aahm6-0kfcy-001.png")));
                        jButton2.setIcon(new javax.swing.ImageIcon(
                                        getClass().getResource("/icons/a26mm-y5gra-001.png")));
                        jButton1.setIcon(new javax.swing.ImageIcon(
                                        getClass().getResource("/icons/a09eb-8nsbj-001.png")));

                        jLabel3.setIcon(new javax.swing.ImageIcon(
                                        getClass().getResource("/icons/icons8-padlock-32.png")));

                        jLabel4.setIcon(new javax.swing.ImageIcon(
                                        getClass().getResource("/icons/icons8-user-32.png")));
                } catch (NullPointerException e) {
                        System.out.println("Image path does not exist: " + e);
                }

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));

                jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));

                jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14));
                jLabel9.setForeground(new java.awt.Color(255, 255, 255));

                // Add all of the textfieldsd into list
                Collections.addAll(textFieldsList, textField1, textField2, textField3, textField4);
                // Document Listener for Entire Panel
                // https://stackoverflow.com/questions/35973037/disable-button-in-java-until-all-fields-filled
                DocumentListener listener = new DocumentListener() {
                        @Override
                        public void removeUpdate(DocumentEvent e) {
                                validateTextField(e);
                        }

                        @Override
                        public void insertUpdate(DocumentEvent e) {
                                validateTextField(e);
                        }

                        @Override
                        public void changedUpdate(DocumentEvent e) {
                                validateTextField(e);
                        }

                        private void validateTextField(DocumentEvent e) {
                                for (JTextField tf : textFieldsList) {
                                        boolean canEnable = true;
                                        if (tf.getText().isEmpty()
                                                        || (!Arrays.equals(password1.getPassword(),
                                                                        password2.getPassword()))
                                                        || (password1.getPassword().length == 0)
                                                        || (jLabel8.getText().isEmpty())
                                                        || jLabel9.getText().isEmpty()
                                                        || !validateAllFields()) {
                                                canEnable = false;
                                                button1.setBackground(new java.awt.Color(204, 204, 204));
                                                button1.setForeground(new java.awt.Color(102, 102, 102));

                                        } else {
                                                button1.setBackground(new java.awt.Color(51, 153, 255));
                                                button1.setForeground(new java.awt.Color(255, 255, 255));
                                        }

                                        button1.setEnabled(canEnable);

                                }
                        }

                };
                for (JTextField tf : textFieldsList) {
                        tf.getDocument().addDocumentListener(listener);
                }

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(94, 94, 94)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(126, 126, 126)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(95, 95, 95)
                                                                                                                                .addComponent(button1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                151,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jSeparator2,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                100,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGroup(layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(35, 35, 35)
                                                                                                                                                                .addComponent(jButton1)))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jButton2)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(jButton3))
                                                                                                                                                .addGroup(layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(jSeparator1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                100,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(104, 104,
                                                                                                                                                104)
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jLabel3)
                                                                                                                                                .addComponent(jLabel4))
                                                                                                                                .addGap(25, 25, 25))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                .addContainerGap()
                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(textField4,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(textField1,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(textField2,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(textField3,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addGroup(layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(15, 15, 15)
                                                                                                                                                                .addComponent(jLabel2))
                                                                                                                                                .addComponent(password1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                278,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(password2,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                278,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jCheckBox1)
                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                .addComponent(jLabel9)))
                                                                                                                .addComponent(jLabel6))))
                                                                .addContainerGap(119, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel1)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel2)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(textField1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(textField2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(12, 12, 12)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(textField3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel9)))
                                                                                .addComponent(jLabel4))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(textField4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel8))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(password1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jCheckBox1))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(password2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel7)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(button1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(35, 35, 35)
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jSeparator2,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jSeparator1,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(27, 27, 27)
                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton2)
                                                                                                                .addComponent(jButton3)))
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(76, 76, 76)
                                                                                                .addComponent(jButton1)))
                                                                .addContainerGap(128, Short.MAX_VALUE)));

        }// </editor-fold>

        private void textField1KeyReleased(java.awt.event.KeyEvent evt) {
                if (textField1.getText().isEmpty()) {
                        setButtonFalse();
                }
                // TODO add your handling code here:
                if (Arrays.equals(password1.getPassword(), password2.getPassword()) && validateAllFields()) {
                        setButtonTrue();
                } else {
                        setButtonFalse();
                }
        }

        private void textField2KeyReleased(java.awt.event.KeyEvent evt) {
                if (textField2.getText().isEmpty()) {
                        setButtonFalse();
                }
                // TODO add your handling code here:
                if (Arrays.equals(password1.getPassword(), password2.getPassword()) && validateAllFields()) {
                        setButtonTrue();
                } else {
                        setButtonFalse();
                }
        }

        private void password2KeyReleased(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                char[] p = password1.getPassword();
                char[] cp = password2.getPassword();
                if (!(Arrays.equals(p, cp))) {
                        jLabel6.setText("Passwords do not match");
                        setButtonFalse();
                } else {
                        jLabel6.setText("");
                }
                if (Arrays.equals(p, cp) && validateAllFields()) {
                        setButtonTrue();
                }
        }

        private void password1KeyReleased(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                PasswordValidation pvalid = new PasswordValidation();
                char[] p = password1.getPassword();
                if (p.length == 0) {
                        jLabel6.setText("");
                        jLabel7.setText("");
                } else if (p.length != 0 && password2.getPassword().length != 0
                                && Arrays.equals(p, password2.getPassword())) {
                        jLabel6.setText("Passwords do not match");
                        setButtonFalse();
                }
                try {
                        pvalid.validate(p);
                        jLabel6.setText("Valid Password");
                        jLabel7.setText("");
                        if (jLabel8.getText().equals("Valid Email") && (jLabel9.getText().equals("Valid Username")
                                        && password2.getPassword().length != 0
                                        && Arrays.equals(p, password2.getPassword()))) {
                                setButtonTrue();
                        }
                } catch (PasswordException e) {
                        jLabel6.setText(e.getMessage());
                        jLabel7.setText(e.printMessage());
                        setButtonFalse();
                }

        }

        private void jCheckBox1MouseEntered(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
                // password1.setEchoChar('\u0000');
                // password2.setEchoChar('\u0000');
        }

        private void jCheckBox1MouseExited(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
                // password1.setEchoChar('\u25cf');
                // password2.setEchoChar('\u25cf');
        }

        private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                if (jCheckBox1.isSelected()) {
                        password1.setEchoChar('\u0000');
                        password2.setEchoChar('\u0000');
                } else {
                        password1.setEchoChar('\u25cf');
                        password2.setEchoChar('\u25cf');
                }
        }

        private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                String firstName = textField1.getText();
                String lastName = textField2.getText();
                String username = textField3.getText();
                String email = textField4.getText();
                UserDatabase database = UserDatabase.getInstance();
                User newUser = new User(firstName, lastName, username, email, password2.getPassword());
                UserDatabase.saveUser(email, newUser);
                UserDatabase.saveUsername(username);

                clearPanelValues();
                jLabel6.setText("Account Successfully Created");
                jLabel7.setText("You can Log in");
                setButtonFalse();
        }

        private void textField4KeyReleased(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                UserDatabase database = UserDatabase.getInstance();
                // EmailValidation emailEx = new EmailValidation();
                String emailStr = textField4.getText();
                if (emailStr.isEmpty()) {
                        jLabel8.setText("");
                        jLabel7.setText("");
                } else {
                        try {
                                EmailValidation.validate(emailStr);
                                jLabel8.setForeground(new java.awt.Color(102, 255, 102));
                                jLabel8.setText("Valid Email");
                                jLabel7.setText("");
                        } catch (EmailException e) {
                                jLabel8.setForeground(new java.awt.Color(255, 102, 102));
                                jLabel8.setText("Invalid Email");
                                jLabel7.setText(e.getMessage());
                        }
                        if (UserDatabase.checkEmailExist(emailStr)) {
                                jLabel8.setForeground(new java.awt.Color(255, 102, 102));
                                jLabel8.setText("Invalid Email");
                                jLabel7.setText("Email already exsists");
                        }
                }
        }

        private void textField3KeyReleased(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                UsernameValidation usrValid = new UsernameValidation();
                UserDatabase database = UserDatabase.getInstance();
                String usernameField = textField3.getText();
                if (usernameField.isEmpty()) {
                        jLabel9.setText("");
                        jLabel6.setText("");
                }
                try {
                        usrValid.validate(usernameField);
                        jLabel9.setForeground(new java.awt.Color(102, 255, 102));
                        jLabel9.setText("Valid Username");
                        jLabel6.setText("");
                        if (Arrays.equals(password1.getPassword(), password2.getPassword()) && validateAllFields()) {
                                setButtonTrue();
                        }
                } catch (UsernameException e) {
                        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
                        jLabel9.setText("Invalid Username");
                        jLabel6.setText(e.printMessage());
                        setButtonFalse();
                }
        }

        // clears the form
        private void clearPanelValues() {
                jCheckBox1.setSelected(false);
                textField1.setText("First Name");
                textField2.setText("Last Name");
                textField3.setText("Username");
                textField4.setText("Email");
                password1.setText("");
                password2.setText("");
                jLabel6.setText("");
                jLabel7.setText("");
                jLabel8.setText("");
                jLabel9.setText("");
        }

        // registerfield validation
        private boolean validateAllFields() {
                if (!textField1.getText().isEmpty() && !textField2.getText().isEmpty()
                                && jLabel8.getText().equals("Valid Email")
                                && jLabel9.getText().equals("Valid Username")) {
                        return true;
                }
                return false;
        }

        // Set button false
        private void setButtonFalse() {
                button1.setEnabled(false);
                button1.setBackground(new java.awt.Color(204, 204, 204));
                button1.setForeground(new java.awt.Color(102, 102, 102));
        }

        // set button true
        private void setButtonTrue() {
                button1.setEnabled(true);
                button1.setBackground(new java.awt.Color(51, 153, 255));
                button1.setForeground(new java.awt.Color(255, 255, 255));

        }

        // Variables declaration - do not modify
        private Button button1;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JTextField jTextField1;
        private Password password1;
        private Password password2;
        private TextField textField1;
        private TextField textField2;
        private TextField textField3;
        private TextField textField4;
        private List<JTextField> textFieldsList;
        // End of variables declaration
}
