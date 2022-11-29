package jswing.component;

import javax.swing.ImageIcon;

public class Brand extends javax.swing.JPanel {

        public Brand() {
                initComponents();
                setOpaque(false);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(102, 102, 102));

                jLabel1.setBackground(new java.awt.Color(102, 102, 102));
                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setIcon(createImageIcon(
                                "/icons/icons8-hierarchy-48.png")); // NOI18N
                jLabel1.setText("  Radix");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                342,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(10, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup()
                                                                                .addContainerGap(16, Short.MAX_VALUE)
                                                                                .addComponent(jLabel1)
                                                                                .addGap(10, 10, 10)));
        }// </editor-fold>

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

        // Variables declaration - do not modify
        private javax.swing.JLabel jLabel1;
        // End of variables declaration
}
