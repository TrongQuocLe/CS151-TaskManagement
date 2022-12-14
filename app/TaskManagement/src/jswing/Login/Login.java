package jswing.Login;

import java.util.Arrays;
import jswing.Button;
import jswing.Password;
import jswing.TextField;
import jswing.event.EventLogin;
import serverside.User;
import serverside.UserDatabase;

/**
 *
 * @author Kyle Lo
 */
public class Login extends PanelCustom {

        private EventLogin event;
        private User user;

        public Login() {
                initComponents();
                setAlpha(1);
        }

        public User getUser() {
                return this.user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        public void setEventLogin(EventLogin event) {
                this.event = event;
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jCheckBox1 = new javax.swing.JCheckBox();
                textField2 = new TextField();
                password1 = new Password();
                button1 = new Button();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(76, 76, 76));
                setPreferredSize(new java.awt.Dimension(600, 800));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Log in to your Workspace");

                jButton1.setBackground(new java.awt.Color(76, 76, 76));
                jButton1.setForeground(new java.awt.Color(76, 76, 76));

                jButton1.setBorder(null);
                jButton1.setContentAreaFilled(false);
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                jButton2.setBackground(new java.awt.Color(76, 76, 76));
                jButton2.setForeground(new java.awt.Color(76, 76, 76));

                jButton2.setBorder(null);
                jButton2.setContentAreaFilled(false);
                jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                jButton3.setBackground(new java.awt.Color(76, 76, 76));
                jButton3.setForeground(new java.awt.Color(76, 76, 76));

                jButton3.setBorder(null);
                jButton3.setContentAreaFilled(false);
                jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                jCheckBox1.setToolTipText("Show Password");

                jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox1ActionPerformed(evt);
                        }
                });

                textField2.setForeground(new java.awt.Color(255, 255, 255));
                textField2.setText("Email");
                textField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                textField2ActionPerformed(evt);
                        }
                });
                textField2.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                textField2KeyReleased(evt);
                        }
                });

                password1.setForeground(new java.awt.Color(255, 255, 255));
                password1.setEchoChar('\u25cf');
                password1.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                password1KeyReleased(evt);
                        }
                });

                button1.setBackground(new java.awt.Color(204, 204, 204));
                button1.setForeground(new java.awt.Color(102, 102, 102));
                button1.setText("Sign In");
                button1.setEnabled(false);
                button1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                button1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button1ActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Radix");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setText("Forgot Password?");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                // Try-Catch on all of the setting icons
                try {
                        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/icons8-user-64.png"))); // NOI18N

                        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/icons8-padlock-64.png"))); // NOI18N
                        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/icons8-tree-structure-64.png"))); // NOI18N
                        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/a09eb-8nsbj-001.png"))); // NOI18N
                        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/a26mm-y5gra-001.png"))); // NOI18N
                        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/anz6u-19e8e-001.png"))); // NOI18N
                        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/a5e4g-5jzpu-001.png"))); // NOI18N
                        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                        "/icons/aahm6-0kfcy-001.png"))); // NOI18N

                } catch (NullPointerException e) {
                        System.out.println("Image path does not exist: " + e);
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
                                                                                                .addGap(78, 78, 78)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(80, 80, 80)
                                                                                                                                .addComponent(jLabel4)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jLabel5))
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jLabel3)
                                                                                                                                                .addComponent(jLabel2))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel1)
                                                                                                                                                .addComponent(textField2,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                266,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGroup(layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(password1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                266,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jCheckBox1))))))
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(231, 231, 231)
                                                                                                .addComponent(jLabel6))
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(195, 195, 195)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jButton1)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jButton2)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jButton3))
                                                                                                                .addComponent(button1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                175,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel7))))
                                                                .addContainerGap(143, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(61, 61, 61)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5))
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(textField2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                44,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jCheckBox1)
                                                                                .addComponent(password1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(button1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jButton2)
                                                                                .addComponent(jButton1)
                                                                                .addComponent(jButton3))
                                                                .addGap(41, 41, 41)
                                                                .addComponent(jLabel7)
                                                                .addGap(298, 298, 298)));

        }// </editor-fold>

        private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                if (jCheckBox1.isSelected()) {
                        password1.setEchoChar('\u0000');
                } else {
                        password1.setEchoChar('\u25cf');

                }
        }

        private void textField2KeyReleased(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                jLabel7.setText("");
                if (textField2.getText().isEmpty() || password1.getPassword().length == 0) {
                        setButtonFalse();
                } else {
                        setButtonTrue();
                }
        }

        private void password1KeyReleased(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                jLabel7.setText("");
                if (password1.getPassword().length == 0 || textField2.getText().isEmpty()) {
                        setButtonFalse();
                } else {
                        setButtonTrue();
                }
        }

        private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                // Create a counter to prevent log in spam
                String email = textField2.getText();
                char[] password = password1.getPassword();
                UserDatabase database = UserDatabase.getInstance();
                if (database.checkEmailExist(email)) {
                        // Grab user then compare the password field that was inputted with the saved
                        // userPassword
                        User returningUser = database.getUser(email);
                        passwordCheck(returningUser, returningUser.getPassword(), password);
                } else {
                        // Say something like wrong email
                        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
                        jLabel7.setText("Email/User does not exist");
                }
        }

        private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
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

        private void passwordCheck(User returningUser, char[] up, char[] ip) {
                if (Arrays.equals(up, ip)) {
                        jLabel7.setForeground(new java.awt.Color(102, 255, 102));
                        jLabel7.setText("Login Successful");
                        setUser(returningUser);
                        button1.setEnabled(false);
                        event.loginDone();
                        textField2.setText("");
                        password1.setText("");

                } else {
                        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
                        jLabel7.setText("Login Failed: Wrong Password");
                }
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
        private Password password1;
        private TextField textField2;
        // End of variables declaration
}
